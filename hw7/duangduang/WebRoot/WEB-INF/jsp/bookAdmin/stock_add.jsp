<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML>
<html>
<!-- Added by HTTrack --><meta http-equiv="content-type" content="text/html;charset=utf-8" /><!-- /Added by HTTrack -->
<head>
  <meta charset="UTF-8">

  <meta name="description" content="">
  <meta name="keywords" content="">

  <title>stock_add</title>

  <link rel="shortcut icon" href="favicon.ico">
  <link href="css/style.css" media="screen" rel="stylesheet" type="text/css">
  <link href="css/grid.css" media="screen" rel="stylesheet" type="text/css">

  <script src="js/datepicker.js"></script>
  <script src="js/jquery-1.7.2.min.js" ></script>
  <script src="js/html5.js" ></script>
  <script src="js/jflow.plus.js" ></script>
  <script src="js/jquery.carouFredSel-5.2.2-packed.js"></script>
  <script src="js/checkbox.js"></script>
  <script src="js/radio.js"></script>
  <script src="js/selectBox.js"></script>

  <script>

  </script>
    
</head>
<body>
  <body>
  <div class="container_12">
    <div id="top">
      <div class="grid_3">
        <div class="phone_top">
          联系电话 +8888888
        </div><!-- .phone_top -->
      </div><!-- .grid_3 -->
   
      <div class="grid_6">
        <div class="welcome">
          欢迎光临DuangDuang网
        </div><!-- .welcome -->
      </div><!-- .grid_6 -->
     
       <div class="clear"></div>  
 
   

    <header id="branding">
      <div class="grid_3" style="float:right">
        <hgroup>
          <h1 id="site_logo"><a href="index.html" title=""><img src="images/logo.png" alt="Online Store Theme Logo"/></a></h1>
          <h2 id="site_description">DuangDuang图书网</h2>
        </hgroup>
      </div><!-- .grid_3 -->
    </header><!-- #branding -->
  </div><!-- .container_12 -->
  
  <div class="clear"></div>
  
  <div id="block_nav_primary">
    <div class="container_12">
      <div class="grid_12">
        <nav class="primary">
          <ul>
            <li class="bookmanage"><a href="bookupload">图书管理</a>       
              <ul class="sub">
                <li class="book1"><a href="bookupload">上传图书</a></li>
                <li class="book2"><a href="bookdel">删除图书</a></li>
                <li class="book3"><a href="bookchange">更改图书信息</a></li>
                <li class="book4"><a href="numSearch">按编号查询图书</a></li>
                <li class="book5"><a href="typeSearch">按类别查询</a></li>
              </ul>
            </li>
            <li class="ordermanage"><a href="bookupload">订单管理</a>
              <ul class="sub">
                 <li><a href="order_select">查询全部订单</a></li>
                 <li><a href="order_select2">查询部分订单</a></li>
                 <li><a href=" order_del">删除订单</a></li>
              </ul>
            </li>
            <li class="stockmanage"><a href="bookupload">库存管理</a>
			<ul class="sub">
                 <li><a href="stock_add">库存添加</a></li>
                 <li><a href="stock_search">出入库查询</a></li>
              </ul></li>
            <li class="accountmanage"><a href="passwordChange">账号管理</a></li>
          </ul>
        </nav><!-- .primary -->
      </div><!-- .grid_12 -->
    </div><!-- .container_12 -->
  </div><!-- .block_nav_primary -->
    <div class="clear"></div>
    <div class="clear"></div>
    <div class="clear"></div>
    
  <div class="container_12">
    <div class="grid_12">
	 <div class="slider" style="width:33%; margin:80px 0;">
	 <form id="stock_add" action="Stock_addData" method="post">
     <table>
	    <tr>
           <td>请输入添加的图书编号：</td>
           <td><input type="text" name="stock_bookid" /></td>
        </tr>
        <tr>
            <td>图书入库数量:</td>
            <td><input type="text" name="stock_booknum" /></td>
        </tr>
        <tr>
           <td><input type="submit" name="delsure" value="确定" style="margin:30px 0;width:80px;height:50px"/> </td>
           <td><input type="reset" name="delCancel" value="取消" style="margin:30px 0;width:50px;border:display;background:#2ab4c4;box-shadow:0 0 2px #2ab4c4;width:80px;height:50px"/></td>
       </tr>
     </table>
	 </form>
	 
        </div><!-- .slider -->
	</div><!-- .grid_12 -->
  </div><!-- .container_12 -->
  <div class="clear"></div>
  <div class="grid_66"  style="width:600px;float:left">
			 <!-- 将添加成功或者失败的信息返回在该界面-->
			 <div class="clear"></div>
			 <div class="clear"></div>
         <%
		 String str= (String)request.getAttribute("message1");
		 if("添加成功".equals(str)){
		 	%><span style="color:red"><%=str %></span><% 
		 }
		  %>
	        <%
		 String sstr= (String)request.getAttribute("message2");
		 if("添加失败或还没有改图书编号".equals(sstr)){
		 	%><span style="color:red"><%=sstr %></span><% 
		 }
		  %>
             
        </div><!-- .grid_66 -->
  
    
 <footer>
    <div class="f_navigation">
      <div class="container_12">
        <div class="grid_3">
          <h3>联系电话</h3>
          <ul class="f_contact">
            <li>湖南长沙中软国际</li>
            <li>+8888888</li>
            <li>8888888@163.com</li>
          </ul><!-- .f_contact -->
        </div><!-- .grid_3 -->

        <div class="grid_3">
          <h3>相关信息</h3>
          <nav class="f_menu">
            <ul>
              <li><a href="#">关于我们</a></li>
              <li><a href="#">法律声明</a></li>
              <li><a href="#">安全支付</a></li>
            </ul>
          </nav><!-- .private -->
        </div><!-- .grid_3 -->
        
        <div class="grid_3">
          <h3>客户服务</h3>
          <nav class="f_menu">
            <ul>
              <li><a href="#">退货申请</a></li>
              <li><a href="#">诚招英才</a></li>
              <li><a href="#">客服咨询</a></li>
            </ul>
          </nav><!-- .private -->
        </div><!-- .grid_3 -->

        <div class="clear"></div>
      </div><!-- .container_12 -->
    </div><!-- .f_info -->
  </footer>

</body>
<!-- Added by HTTrack --><meta http-equiv="content-type" content="text/html;charset=utf-8" /><!-- /Added by HTTrack -->
</html>
