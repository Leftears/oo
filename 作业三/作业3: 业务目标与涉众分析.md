# 作业3: 业务目标与涉众分析: 图书交易平台
姓名：昝妍<br>
学号：1601214481<br>
日期：2017/03/22<br><br>

> 内容:<br>
> 作业2[甲方](https://github.com/liberion1994/oo/blob/master/%E4%BD%9C%E4%B8%9A2-%E5%9B%BE%E4%B9%A6%E4%BA%A4%E6%98%93%E5%B9%B3%E5%8F%B0%E7%9A%84%E5%8A%9F%E8%83%BD%E9%9C%80%E6%B1%82.md)(editor:李博远)的案例第二轮发布后, 每个甲方小组将作为乙方小组, 选择另一个甲方小组发布的系统, 乙方小组的每个同学单独进行进行分析、设计、开发.<br>
> 在本次作业中, 乙方将对甲方的案例进行调研, 进行业务目标分析, 提交一份涉众分析报告.<br>
> 任务:Github 课程库中一份涉众分析报告.<br>

## 涉众概要

<table>
        <tr>
            <th>编号</th>
            <th >部门名称</th>
            <th>涉众说明</th>
            <th>期望</th>
        </tr>
        <tr>
            <td>SH001</td>
            <td>买家</td>
            <td>作为图书买家的使用者群体</td>
            <td  align="left">1.    帐户管理：创建帐户/帐户设置。<br>
                            (个人信息包括头像、用户名、邮箱等)<br>
                            2.	浏览图书：搜索/排序/收藏图书。<br>
                            <PRE>o	浏览图书：不須登录浏览图书
                            <br>o	搜索图书：用关键字对图书进行检索
                            <br>o	排序图书：支持按价格、上架时间、购买量排序<br></PRE>
                            3. 购买图书：需要先登录，购买书籍，在线支付。<br>
                            4.	留言管理：创建留言/删除留言。<br>
                            5.	订单管理：查看历史订单、当前交易订单状态、取消当前订单、确认收货、评价订单。</td>
        </tr>
        <tr>
            <td>SH002</td>
            <td>卖家</td>
            <td>作为图书卖家的使用者群体</td>
            <td align="left">1.    帐户管理：创建帐户/帐户设置/卖家帐户申请。<br>(个人信息包括头像、用户名、邮箱等)<br>
                            2.	管理图书：创建图书/收藏图书/修改图书/删除图书。<br>(出售信息包括图书共有的信息：书名、作者、出版社、ISBN编号、封一封二与图书信息包括出售的价格、存货、书是否为全新、书的其他描述。)<br>
                            3.	浏览图书：不須登录浏览图书。<br>
                            4.	查看订单：查看买方用户已经确认的订单。<br>(订单中包括订单号、地址、联系方式、评价订单。)<br>
                            5.	发货：对某一订单进行线下发货后，在线上进行发货操作，这会使得图书存货自动减去订单中相应的数量。<br>
                            6.	留言管理：创建留言/删除留言。</td>
        </tr>
        <tr>
            <td>SH003</td>
            <td>管理员</td>
            <td>买家卖家、图书与平台的管理者</td>
            <td align="left">
					          1. 系统维护。<br>
                              2. 管理买家卖家：审核卖家资格、吊销违反规定的买家卖家资格。<br>
                              3. 删除图书：删除违反规定的在售图书。<br>
                              4. 修改订单：买/卖家对订单有问题，经过留言协商通知管理员修改订单资讯。<br>
</td>
        </tr>
</table>
<br>
## 涉众简档

<table>
    <tr>
        <th align="left">涉众</th>
        <td align="left">SH001买家</td>
    </tr>
     <tr>
        <th align="left">涉众代表</th>
        <td align="left">社会中任何可能购买图书的人员</td>
    </tr>
     <tr>
        <th align="left">特点</th>
        <td align="left">系统的主要使用者，不可预计计算机应用水平的使用者</td>
    </tr> 
    <tr>
        <th align="left">职责</th>
        <td align="left">从图书交易平台浏览图书信息，向图书交易平台提交购买图书服务，对订单提供平评价</td>
    </tr> 
    <tr>
        <th align="left">成功标准</th>
        <td align="left">正常通过图书交易平台购买图书，使用图书交易平台无疑义</td>
    </tr> <tr>
        <th align="left">参与</th>
        <td align="left">不参与系统建设</td>
    </tr> <tr>
        <th align="left">可交付工作</th>
        <td align="left">平台中Q&A文档阅读，确认收到书籍的状况，评价订单</td>
    </tr> <tr>
        <th align="left">意见/建议</th>
        <td align="left">无</td>
    </tr>
</table>
<br>
<table>
    <tr>
        <th align="left">涉众</th>
        <td align="left">SH002卖家</td>
    </tr>
     <tr>
        <th align="left">涉众代表</th>
        <td align="left">社会中任何可能贩售图书的人员或商户</td>
    </tr>
     <tr>
        <th align="left">特点</th>
        <td align="left">系统的主要使用者，不可预计计算机应用水平的使用者</td>
    </tr> <tr>
        <th align="left">职责</th>
        <td align="left">从图书交易平台浏览图书信息，向交易平台提交售卖图书服务，对订单提供平评价</td>
    </tr> <tr>
        <th align="left">成功标准</th>
        <td align="left">正常通过图书交易平台售卖图书，使用图书交易平台无疑义</td>
    </tr> <tr>
        <th align="left">参与</th>
        <td align="left">不参与系统建设</td>
    </tr> <tr>
        <th align="left">可交付工作</th>
        <td align="left">平台中Q&A文档阅读，确认收到金额的状况，评价订单</td>
    </tr> <tr>
        <th align="left">意见/建议</th>
        <td align="left">无</td>
    </tr>
</table>
<br>
<table>
    <tr>
        <th align="left">涉众</th>
        <td align="left">SH003 管理者</td>
    </tr>
     <tr>
        <th align="left">涉众代表</th>
        <td align="left">平台管理人员，系统管理人员</td>
    </tr>
     <tr>
        <th align="left">特点</th>
        <td align="left">系统预期使用者，对平台系统使用可预知</td>
    </tr> <tr>
        <th align="left">职责</th>
        <td align="left">平台与系统维护，审核卖家资格、吊销违反规定的卖家资格，删除违反规定的在售图书图书</td>
    </tr> <tr>
        <th align="left">成功标准</th>
        <td align="left">图书交易系统正常运行，图书与卖家无违规情况</td>
    </tr> <tr>
        <th align="left">参与</th>
        <td align="left">参与系统建设</td>
    </tr> <tr>
        <th align="left">可交付工作</th>
        <td align="left">给与系统权限维护系统</td>
    </tr> <tr>
        <th align="left">意见/建议</th>
        <td align="left">无</td>
    </tr>
</table>

<br>
## 用戶概要

<table>
    <tr>
        <th align="left">编号
        </th>
         <th align="left">用户名称
        </th>
         <th align="left">用户概况和特点
        </th>
         <th align="left">使用系统方式
        </th>
         <th align="left">代表涉众
        </th>
    </tr>
      <tr>
        <td align="left">US001
        </td>
         <td align="left">买家
        </td>
         <td align="left">通过图书交易平台的交易系统来购买图书，用户对系统的使用能力是无法估量的。
        </td>
         <td align="left">通过计算机上网来使用交易系统
        </td>
         <td align="left">SH001
        </td>
    </tr>
      <tr>
        <td align="left">US002
        </td>
         <td align="left">卖家
        </td>
         <td align="left">通过图书交易平台的交易系统来贩售图书，用户对系统的使用能力是无法估量的。
        </td>
         <td align="left">通过计算机上网来使用交易系统
        </td>
         <td align="left">SH002
        </td>
    </tr>
    <tr>
        <td align="left">US003
        </td>
         <td align="left">管理者
        </td>
         <td align="left">图书交易平台与系统的管理者，系统预期使用者，对系统的使用是可预知的。
         </td>
         <td align="left">参与系统使用
        </td>
         <td align="left">SH003
        </td>
    </tr>
</table>
<br>
  ## 用户简档
<table>
    <tr>
        <th align="left">用戶</th>
        <td align="left">US001买家</td>
    </tr>
     <tr>
        <th align="left">用戶代表</th>
        <td align="left">图书买家与一般使用者</td>
    </tr>
     <tr>
        <th align="left">特点</th>
        <td align="left">系统的主要使用者，不可预计计算机应用水平的使用者</td>
    </tr> 
    <tr>
        <th align="left">职责</th>
        <td align="left">从图书交易平台浏览图书信息，向图书交易平台提交购买图书服务，对订单提供平评价</td>
    </tr> 
    <tr>
        <th align="left">成功标准</th>
        <td align="left">正常通过图书交易平台购买图书</td>
    </tr> <tr>
        <th align="left">参与</th>
        <td align="left">不参与系统建设</td>
    </tr> <tr>
        <th align="left">可交付工作</th>
        <td align="left">平台中Q&A文档阅读，确认收到书籍的状况，评价订单</td>
    </tr> <tr>
        <th align="left">意见/建议</th>
        <td align="left">无</td>
    </tr>
</table>
<br>
<table>
    <tr>
        <th align="left">用戶</th>
        <td align="left">US002卖家</td>
    </tr>
     <tr>
        <th align="left">用戶代表</th>
        <td align="left">卖家与商户</td>
    </tr>
     <tr>
        <th align="left">特点</th>
        <td align="left">系统的主要使用者，不可预计计算机应用水平的使用者</td>
    </tr> <tr>
        <th align="left">职责</th>
        <td align="left">从图书交易平台浏览图书信息，向交易平台提交售卖图书服务，对订单提供平评价</td>
    </tr> <tr>
        <th align="left">成功标准</th>
        <td align="left">正常通过图书交易平台售卖图书，使用图书交易平台无疑义</td>
    </tr> <tr>
        <th align="left">参与</th>
        <td align="left">不参与系统建设</td>
    </tr> <tr>
        <th align="left">可交付工作</th>
        <td align="left">平台中Q&A文档阅读，确认收到金额的状况，评价订单</td>
    </tr> <tr>
        <th align="left">意见/建议</th>
        <td align="left">无</td>
    </tr>
</table>
<br>
<table>
    <tr>
        <th align="left">用戶</th>
        <td align="left">US003 管理者</td>
    </tr>
     <tr>
        <th align="left">用戶代表</th>
        <td align="left">平台管理人员，系统管理人员</td>
    </tr>
     <tr>
        <th align="left">特点</th>
        <td align="left">系统预期使用者，对平台系统使用可预知</td>
    </tr> <tr>
        <th align="left">职责</th>
        <td align="left">系统维护，审核卖家资格、吊销违反规定的卖家资格，删除违反规定的在售图书图书</td>
    </tr> <tr>
        <th align="left">成功标准</th>
        <td align="left">图书交易系统正常运行，图书与卖家无违规情况</td>
    </tr> <tr>
        <th align="left">参与</th>
        <td align="left">参与系统建设</td>
    </tr> <tr>
        <th align="left">可交付工作</th>
        <td align="left">给与系统权限维护系统</td>
    </tr> <tr>
        <th align="left">意见/建议</th>
        <td align="left">无</td>
    </tr>
</table>





