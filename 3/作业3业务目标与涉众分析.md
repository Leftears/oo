# 作业3: 业务目标与涉众分析: 图书交易平台
姓名：昝妍<br>
学号：1601214481<br>
日期：2017/03/22<br><br>

[图书交易平台功能需求](https://github.com/liberion1994/oo/blob/master/%E4%BD%9C%E4%B8%9A2-%E5%9B%BE%E4%B9%A6%E4%BA%A4%E6%98%93%E5%B9%B3%E5%8F%B0%E7%9A%84%E5%8A%9F%E8%83%BD%E9%9C%80%E6%B1%82.md)(editor:李博远)<br>
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
            <td>作为商品买家的使用者群体</td>
            <td  align="left">1.    用户系统：注册、登陆、设置用戶个人信息。<br>
                            (个人信息包括头像、用户名、邮箱等)<br>
                            2.	浏览商品：搜索/排序/購買/收藏商品。<br>
                            <PRE>o	浏览商品：不須登录浏览商品
                            <br>o	搜索商品：用关键字对图书进行检索
                            <br>o	排序商品：支持按价格、上架时间、购买量排序
                            <br>o	购买商品：需要先登录，购买书籍，在线支付
                            <br>o	收藏商品：需要先登录，收藏书籍<br></PRE>
                            3.	向卖家留言。<br>
                            4.	订单管理：查看历史订单、当前交易订单状态、取消当前订单、确认收货、评价订单。</td>
        </tr>
        <tr>
            <td>SH002</td>
            <td>卖家</td>
            <td>作为商品卖家的使用者群体</td>
            <td align="left">1.    用户系统：注册、登陆、设置个人信息、提交成为卖家的申请。(个人信息包括头像、用户名、邮箱等)<br>
                            2.	发布/编辑书籍出售信息：出售信息包括图书共有的信息：书名、作者、出版社、ISBN编号、封一封二与商品信息包括出售的价格、存货、书是否为全新、书的其他描述。
                            3.	浏览商品：不須登录浏览商品。<br>
                            4.	查看订单：查看买方用户已经确认的订单，订单中包括订单号、地址、联系方式、评价订单。<br>
                            5.	发货：对某一订单进行线下发货后，在线上进行发货操作，这会使得存货自动减去订单中相应的数量。<br>
                            6.	回复用户留言。</td>
        </tr>
        <tr>
            <td>SH003</td>
            <td>管理员</td>
            <td>卖家、商品与平台的管理者</td>
            <td align="left">1.系统维护。<br>
                              2.管理卖家：审核卖家资格、吊销违反规定的卖家资格。<br>
                              3.删除商品：删除违反规定的在售图书。<br></td>
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
        <td align="left">从图书交易平台浏览商品信息，向图书交易平台提交购买图书服务，对订单提供平评价</td>
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
        <td align="left">从图书交易平台浏览商品信息，向交易平台提交售卖图书服务，对订单提供平评价</td>
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
        <td align="left">平台与系统维护，审核卖家资格、吊销违反规定的卖家资格，删除违反规定的在售图书商品</td>
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
        <td align="left">从图书交易平台浏览商品信息，向图书交易平台提交购买图书服务，对订单提供平评价</td>
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
        <td align="left">从图书交易平台浏览商品信息，向交易平台提交售卖图书服务，对订单提供平评价</td>
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
        <td align="left">系统维护，审核卖家资格、吊销违反规定的卖家资格，删除违反规定的在售图书商品</td>
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





