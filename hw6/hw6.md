
# 作业6: 系统设计 <br>

姓名：昝妍<br>
学号：1601214481 <br>
日期：2017/04/25 <br>
<br>
>内容:<br>
>基于 作业4的需求分析结果 和 作业5 的系统分析结果，进行系统设计。请和甲方确认系统的实现方案约束，如操作系统、网络环境、数据库等，然后基于这些特性进行面向对象的设计。<br>
>系统设计可运用设计模式。<br>
>任务: <br>
>Github课程库中一份系统设计文档，应包括若干设计模式的应用。<br>
>提交截止: 2017年4月26日23:55

<br>
## 系统设计文件目的： <br>
文件目的：
客户: 系统建构前提供甲方系统设计，系统规格以及计算机配置文件作为验收依据。
系统开发人员: 参考系统设计文件对系统进行建模，代码参考以及规格设定。<br>
预期的参与者：客户，开发方以及系统开发人员。

## 系统设计<br>
**系统功能结构图**<br>
![Imgur](http://i.imgur.com/V0aZI34.png)
<br>
**类图设计**<br>
![Imgur](http://i.imgur.com/ZDw1Dci.png)
<br>
类图说明：<br>
类图为数据库表格基础。<br>
+ Seller为卖家类: id,帐号,密码,邮箱,姓名。 <br>
+ Buyer为买家类: id,帐号,密码,邮箱,姓名,店铺号码。 <br>
+ sysadmin为管理员类: id,帐号,密码,角色。 <br>
+ MessageBoard为留言类: 姓名,留言内容。 <br>
+ Books为图书类: id,类型号,书名,价格,说明,作者,出版商,ISBN。 <br>
+ Order为订单类: 店铺号码,图书id,数量,买家姓名,订单号码,订单状态。 <br>

**数据库表结构设计**<br>
买家信息表
<table>
    <tr>
        <th>字段</th>
        <th>类型</th>
        <th>长度</th>
        <th>含意</th>
    </tr>
    <tr>
        <td>user_id</td>
        <td>int</td>
        <td>11</td>
        <td>主键，买家标示</td>
    </tr>
    <tr>
        <td>user_account</td>
        <td>char</td>
        <td>30</td>
        <td>帐号名</td>
    </tr>
    <tr>
        <td>user_pwd</td>
        <td>char</td>
        <td>20</td>
        <td>密码</td>
    </tr>
    <tr>
        <td>user_mail</td>
        <td>char</td>
        <td>30</td>
        <td>邮箱</td>
    </tr>
    <tr>
        <td>user_name</td>
        <td>char</td>
        <td>30</td>
        <td>姓名</td>
    </tr>
</table><br>
卖家信息表<br>
<table>
    <tr>
        <th>字段</th>
        <th>类型</th>
        <th>长度</th>
        <th>含意</th>
    </tr>
    <tr>
        <td>user_id</td>
        <td>int</td>
        <td>11</td>
        <td>主键，卖家标示</td>
    </tr>
    <tr>
        <td>user_account</td>
        <td>char</td>
        <td>30</td>
        <td>帐号名</td>
    </tr>
    <tr>
        <td>user_pwd</td>
        <td>char</td>
        <td>20</td>
        <td>密码</td>
    </tr>
    <tr>
        <td>user_mail</td>
        <td>char</td>
        <td>30</td>
        <td>邮箱</td>
    </tr>
    <tr>
        <td>user_name</td>
        <td>char</td>
        <td>30</td>
        <td>姓名</td>
    </tr>
    <tr>
        <td>shop_no</td>
        <td>int</td>
        <td>10</td>
        <td>店铺号码</td>
    </tr>    
</table><br>
管理员信息表<br>
<table>
    <tr>
        <th>字段</th>
        <th>类型</th>
        <th>长度</th>
        <th>含意</th>
    </tr>
    <tr>
        <td>id</td>
        <td>int</td>
        <td>11</td>
        <td>主键，管理员标示</td>
    </tr>
    <tr>
        <td>account</td>
        <td>char</td>
        <td>30</td>
        <td>帐号名</td>
    </tr>
    <tr>
        <td>pwd</td>
        <td>char</td>
        <td>20</td>
        <td>密码</td>
    </tr>
    <tr>
        <td>role</td>
        <td>int</td>
        <td>11</td>
        <td>管理员角色</td>
    </tr>
</table><br>
图书信息表<br>
<table>
    <tr>
        <th>字段</th>
        <th>类型</th>
        <th>长度</th>
        <th>含意</th>
    </tr>
    <tr>
        <td>book_id</td>
        <td>int</td>
        <td>6</td>
        <td>主键，图书标示</td>
    </tr>
    <tr>
        <td>typenum</td>
        <td>char</td>
        <td>6</td>
        <td>类型</td>
    </tr>
    <tr>
        <td>book_name</td>
        <td>char</td>
        <td>20</td>
        <td>书名</td>
    </tr>
    <tr>
        <td>book_price</td>
        <td>float</td>
        <td>(6,2)</td>
        <td>价格</td>
    </tr>
    <tr>
        <td>book_explain</td>
        <td>char</td>
        <td>100</td>
        <td>简介</td>
    </tr>
    <tr>
        <td>book_author</td>
        <td>char</td>
        <td>30</td>
        <td>作者</td>
    </tr>
    <tr>
        <td>book_press</td>
        <td>char</td>
        <td>20</td>
        <td>出版商</td>
    </tr>    
    <tr>
        <td>book_isbn</td>
        <td>char</td>
        <td>20</td>
        <td>ISBN码</td>
    </tr>    
    <tr>
        <td>book_src</td>
        <td>char</td>
        <td>30</td>
        <td>图书图片格式</td>
    </tr>    
</table><br>
订单信息表<br>
<table>
    <tr>
        <th>字段</th>
        <th>类型</th>
        <th>长度</th>
        <th>含意</th>
    </tr>
    <tr>
        <td>order_num</td>
        <td>char</td>
        <td>11</td>
        <td>主键，订单号码</td>
    </tr>
    <tr>
        <td>shop_no</td>
        <td>int</td>
        <td>10</td>
        <td>店铺号码</td>
    </tr>
    <tr>
        <td>book_id</td>
        <td>int</td>
        <td>6</td>
        <td>图书ID</td>
    </tr>
    <tr>
        <td>book_num</td>
        <td>int</td>
        <td>10</td>
        <td>图书数量</td>
    </tr>
    <tr>
        <td>user_account</td>
        <td>char</td>
        <td>30</td>
        <td>卖家帐号</td>
    </tr>
    <tr>
        <td>order_buy</td>
        <td>char</td>
        <td>30</td>
        <td>买家帐号</td>
    </tr> 
    <tr>
        <td>order_status</td>
        <td>char</td>
        <td>6</td>
        <td>订单状态</td>
    </tr>    
</table><br>
留言信息表<br>
<table>
    <tr>
        <th>字段</th>
        <th>类型</th>
        <th>长度</th>
        <th>含意</th>
    </tr>
    <tr>
        <td>message_id</td>
        <td>char</td>
        <td>30</td>
        <td>主键，留言标示</td>
    </tr>
    <tr>
        <td>user_name</td>
        <td>char</td>
        <td>30</td>
        <td>留言者帐号名</td>
    </tr>
    <tr>
        <td>message</td>
        <td>string</td>
        <td>500</td>
        <td>留言信息</td>
    </tr>
</table><br>



## 系统配置<br>

本图书交易平台採用配置如下：<br>
使用语言：Java<br>
数据库：MySQL<br>
运行环境：Windows8企业版,Chrome&IE。<br>


## 系统运行环境<br>
服务端<br>
+ 处理器(CPU)：需Intel(R)Core i5,AMD K8(含)以上或具有同等能力的其他处理器。<br>
+ 内存(RAM)：2G(含)以上。<br>
+ 硬盘容量：40G(含)以上。<br>

客户端<br>
具有网络连接并可使用浏览器的计算机。<br>