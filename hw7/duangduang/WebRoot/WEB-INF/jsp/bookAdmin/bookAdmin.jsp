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

  <title>欢迎图书管理员</title>

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
                 <li><a href="order_del">删除订单</a></li>
              </ul>
            </li>
            <li class="stockmanage"><a href="bookupload">库存管理</a>
                <ul class="sub">
                 <li><a href="stock_add">库存添加</a></li>
                 <li><a href="stock_search">出入库查询</a></li>
              </ul>
            </li>
            <li class="accountmanage"><a href="passwordChange">更改密码</a></li>
          </ul>
        </nav><!-- .primary -->
      </div><!-- .grid_12 -->
    </div><!-- .container_12 -->
  </div><!-- .block_nav_primary -->
  
  <div class="clear"></div>
  
	   <section id="main" class="entire_width">
       <div class="container_12">      
       <div id="content">
		
		
         <div id="sidebar" class="grid_3">
	      <aside id="categories_nav"> 
	      
            <!-- 左边添加内容-->
		<!--     <h3>个人信息</h3>
		     
		     <nav class="left_menu">
			    <ul>
				   <li><a href="#">修改登录密码</a></li>
				   <li><a href="#">修改收获地址</a></li>
				   <li><a href="#">修改个人信息</a></li>
			    </ul>
		     </nav><!-- .left_menu -->
	      </aside><!-- #categories_nav -->
		 </div>
		
		<div class="grid_66"  style="width:600px;float:left">
			 <!--右边显示内容 -->
        </div><!-- .grid_66 -->
       </div><!-- #content -->
         
      <div class="clear"></div>
    </div><!-- .container_12 -->
  </section><!-- #main -->
      
       
  <div class="clear"></div>
    
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