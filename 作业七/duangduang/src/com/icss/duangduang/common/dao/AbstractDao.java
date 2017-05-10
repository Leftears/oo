package com.icss.duangduang.common.dao;


import com.icss.duangduang.common.exception.DuangDuangException;
import com.icss.duangduang.util.DbUtils;
import org.apache.commons.collections.MapUtils;
import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.StringUtils;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;


public abstract class AbstractDao {

    /**
     * 封装了增删改的操作
     *
     * @param sql
     * @param params
     */
	public void execute(String sql, Object[] params) {
        Connection conn = null;
        PreparedStatement pstmt = null;

        if (StringUtils.isBlank(sql)) {
            throw new DuangDuangException("SQL语句为空，无法完成操作");
        }

        if (ArrayUtils.isEmpty(params)) {
            throw new DuangDuangException("参数为空，无法完成操作");
        }

        try {
            conn = DbUtils.getConnection();

            // 手动管理事务（开启事务）
         //   conn.setAutoCommit(false);

            pstmt = DbUtils.getpreparedStatement(conn, sql);

            for (int i = 0; i < params.length; i++) {
                pstmt.setObject(i + 1, params[i]);
            }

            pstmt.executeUpdate();

            // 手动提交事务
          //  conn.commit();

        } catch (Exception e) {
        	e.printStackTrace();
            try {
                // 回滚事务
                conn.rollback();
            } catch (SQLException e1) {
                throw new DuangDuangException("操作失败！");
            }
        } finally {
            DbUtils.closeStatement(pstmt);
            DbUtils.closeConnection(conn);
        }
    }

    /**
     * ֻ只做添加，并返回其主键
     *
     * @param sql
     * @param params
     * @return
     */
    public Long add(String sql, Object[] params) {
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        Long generatedKey = null;

        if (StringUtils.isBlank(sql)) {
            throw new DuangDuangException("SQL语句为空，无法完成操作");
        }

        if (ArrayUtils.isEmpty(params)) {
            throw new DuangDuangException("参数为空，无法完成操作");
        }

        try {
            conn = DbUtils.getConnection();
            conn.setAutoCommit(false);
            pstmt = DbUtils.getPreparedStatement(conn, sql, true);

            for (int i = 0; i < params.length; i++) {
                pstmt.setObject(i + 1, params[i]);
            }

            pstmt.executeUpdate();
            conn.commit();

            rs = pstmt.getGeneratedKeys();

            if (rs.next()) {
                generatedKey = rs.getLong(1);
            }

        } catch (SQLException e) {
            try {
                conn.rollback();
            } catch (SQLException e1) {
                throw new DuangDuangException("操作失败!");
            }
        } finally {
            DbUtils.closeStatement(pstmt);
            DbUtils.closeConnection(conn);
        }
        return generatedKey;
    }


    /**
     * 查询
     *
     * @param sql
     * @param id
     * @return
     */
    public Object load(String sql, Serializable id) {
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        Object obj = null;

        if (StringUtils.isBlank(sql)) {
            throw new DuangDuangException("SQL语句为空，无法完成操作");
        }

        if (id == null) {
            throw new DuangDuangException("id为空，无法完成操作");
        }

        try {
            conn = DbUtils.getConnection();
            pstmt = DbUtils.getCallableStatement(conn, sql);
            pstmt.setObject(1, id);

            rs = pstmt.executeQuery();

            if (rs.next()) {
                obj = rowMap(rs);
            }
        } catch (SQLException e) {
            throw new DuangDuangException("操作失败!");
        } finally {
            DbUtils.closeResultSet(rs);
            DbUtils.closeStatement(pstmt);
            DbUtils.closeConnection(conn);
        }

        return obj;
    }

    /**
     * 查询所有
     *
     * @param sql
     * @return
     */
    public List list(String sql) {
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        List list = new ArrayList();
        Object obj = null;

        if (StringUtils.isBlank(sql)) {
            throw new DuangDuangException("SQL语句为空，无法完成操作");
        }

        try {
            conn = DbUtils.getConnection();
            pstmt = DbUtils.getCallableStatement(conn, sql);

            rs = pstmt.executeQuery();

            while (rs.next()) {
                obj = rowMap(rs);
                list.add(obj);
            }
        } catch (SQLException e) {
            throw new DuangDuangException("操作失败！");
        } finally {
            DbUtils.closeResultSet(rs);
            DbUtils.closeStatement(pstmt);
            DbUtils.closeConnection(conn);
        }

        return list;
    }

    /**
     * 有条件的排序查询
     *
     * @param sql
     * @param params
     * @param orderByMap
     * @return
     */
    public List list(String sql, Object[] params, LinkedHashMap<String, String> orderByMap) {
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        Object obj = null;
        List list = new ArrayList();

        StringBuilder sb = new StringBuilder();

        if (StringUtils.isBlank(sql)) {
            throw new DuangDuangException("SQL语句为空，无法完成操作");
        }

        try {
            conn = DbUtils.getConnection();

            sb.append(sql);

            if (MapUtils.isNotEmpty(orderByMap)) {
                buildOrderBy(sb, orderByMap);
            }

            pstmt = DbUtils.getpreparedStatement(conn, sb.toString());
            for (int i = 0; i < params.length; i++) {
                pstmt.setObject(i + 1, params[i]);
            }

            rs = pstmt.executeQuery();

            while (rs.next()) {
                obj = rowMap(rs);
                list.add(obj);
            }
        } catch (SQLException e) {
            throw new DuangDuangException("操作失败");
        } finally {
            DbUtils.closeResultSet(rs);
            DbUtils.closeStatement(pstmt);
            DbUtils.closeConnection(conn);
        }
        return list;

    }

    private void buildOrderBy(StringBuilder sql, LinkedHashMap<String, String> orderByMap) {
        sql.append(" order by ");
        for (Iterator<Map.Entry<String, String>> iterator = orderByMap.entrySet().iterator();
             iterator.hasNext(); ) {
            Map.Entry<String, String> entry = iterator.next();
            String fieldName = entry.getKey();
            String orderByValue = entry.getValue();

            sql.append(fieldName).append(" ").append(orderByValue).append(" , ");
        }
        sql.deleteCharAt(sql.lastIndexOf(","));
    }

    /**
     * 分页查询
     *
     * @param sql
     * @param pageNo
     * @param pageSize
     * @return
     */
//    public PaginationDto list(String sql, Integer pageNo, Integer pageSize) {
//        Connection conn = null;
//        PreparedStatement pstmt = null;
//        ResultSet rs = null;
//        List list = new ArrayList();
//        Object obj = null;
//        StringBuilder sb = new StringBuilder();
//
//        PaginationDto paginationDto = new PaginationDto();
//
//        if (StringUtils.isBlank(sql)) {
//            throw new DaTangException("SQL���Ϊ�գ��޷���ɲ���");
//        }
//
//        try {
//            sb.append(sql).append(" limit ?,? ");
//
//            conn = DbUtils.getConnection();
//            pstmt = DbUtils.getpreparedStatement(conn, sb.toString());
//
//            pstmt.setInt(1, (pageNo - 1) * pageSize);
//            pstmt.setInt(2, pageSize);
//
//            rs = pstmt.executeQuery();
//
//            while (rs.next()) {
//                obj = rowMap(rs);
//                list.add(obj);
//            }
//
//            paginationDto.setPageNo(pageNo);
//            paginationDto.setPageSize(pageSize);
//            paginationDto.setList(list);
//            paginationDto.setTotalRecords(getTotalRecords(sql));
//        } catch (SQLException e) {
//            throw new DaTangException("��ҳ��ѯʧ��");
//        } finally {
//            DbUtils.closeResultSet(rs);
//            DbUtils.closeStatement(pstmt);
//            DbUtils.closeConnection(conn);
//        }
//        return paginationDto;
//
//    }

    /**
     * select count(*) from xxx
     * @param sql select * from xxx
     * @return
     */
//    private Integer getTotalRecords(String sql) {
//        Connection conn = null;
//        PreparedStatement pstmt = null;
//        ResultSet rs = null;
//        Long result =  null;
//
//        if (StringUtils.isBlank(sql)) {
//            throw new DaTangException("SQL���Ϊ�գ��޷���ɲ���");
//        }
//
//        try {
//            conn = DbUtils.getConnection();
//            pstmt = DbUtils.getpreparedStatement(conn, sql.replace("*","count(*)"));
//
//            rs = pstmt.executeQuery();
//            if(rs.next()) {
//                result = rs.getLong(1);
//            }
//        } catch (SQLException e) {
//            throw new DaTangException("��ȡ�ܼ�¼��ʧ�ܣ�");
//        } finally {
//            DbUtils.closeResultSet(rs);
//            DbUtils.closeStatement(pstmt);
//            DbUtils.closeConnection(conn);
//        }
//
//        return result.intValue();
//
//    }

    /**
     * �������ķ�ҳ��ѯ
     * @param sql
     * @param params
     * @param pageNo
     * @param pageSize
     * @return
     */
//    public PaginationDto list(String sql, Object[] params, Integer pageNo, Integer pageSize) {
//        Connection conn = null;
//        PreparedStatement pstmt = null;
//        ResultSet rs = null;
//        List list = new ArrayList();
//        List<Object> paramList = new ArrayList<Object>();
//
//        Object obj = null;
//        StringBuilder sb = new StringBuilder();
//
//        PaginationDto paginationDto = new PaginationDto();
//
//        if (StringUtils.isBlank(sql)) {
//            throw new DaTangException("SQL���Ϊ�գ��޷���ɲ���");
//        }
//
//        if(ArrayUtils.isEmpty(params)) {
//            throw new DaTangException("����Ϊ�գ��޷���ɲ���");
//        }
//
//        try {
//            sb.append(sql).append(" limit ?,? ");
//
//            conn = DbUtils.getConnection();
//            pstmt = DbUtils.getpreparedStatement(conn, sb.toString());
//
//            paramList = Arrays.asList(params);
//            paramList.add(pageNo);
//            paramList.add(pageSize);
//
//            for(int i = 0 ; i < paramList.size(); i ++) {
//                pstmt.setObject(i + 1,paramList.get(i));
//            }
//
//            rs = pstmt.executeQuery();
//
//            while (rs.next()) {
//                obj = rowMap(rs);
//                list.add(obj);
//            }
//
//            paginationDto.setPageNo(pageNo);
//            paginationDto.setPageSize(pageSize);
//            paginationDto.setList(list);
//            paginationDto.setTotalRecords(getTotalRecords(sql));
//        } catch (SQLException e) {
//            throw new DaTangException("��ҳ��ѯʧ��");
//        } finally {
//            DbUtils.closeResultSet(rs);
//            DbUtils.closeStatement(pstmt);
//            DbUtils.closeConnection(conn);
//        }
//        return paginationDto;
//    }

 //   public PaginationDto list(String sql, Object[] params, LinkedHashMap<String, String> orderByMap, Integer pageNo,
//                             Integer pageSize) {
//        Connection conn = null;
//        PreparedStatement pstmt = null;
//        ResultSet rs = null;
//        List list = new ArrayList();
//        Object obj = null;
//
//        if (StringUtils.isNotBlank(sql)) {
//            throw new DatangException("SQL���Ϊ�գ��޷���ɲ���");
//        }
//
//        if (!ArrayUtils.isEmpty(params)) {
//            // ��������ѯ
//        }
//        return null;
//    }

    public abstract Object rowMap(ResultSet rs);
}
