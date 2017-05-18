<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>

 <%@page language="java" import="com.duang.pojo.Managerinfo"%>
 <%@page language="java" import="com.duang.servlet.Bookmanager"%>
 <%@page language="java" import="java.util.List"%>
 <%@page language="java" import="java.util.ArrayList"%>
 

 
 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<!-- Added by HTTrack --><meta http-equiv="content-type" content="text/html;charset=utf-8" /><!-- /Added by HTTrack -->
<head>
  <meta charset="UTF-8">

  <meta name="description" content="">
  <meta name="keywords" content="">

  <title>sysmanager</title>

  <link rel="shortcut icon" href="favicon.ico">
  <link href="css/style.css" media="screen" rel="stylesheet" type="text/css">
  <link href="css/grid.css" media="screen" rel="stylesheet" type="text/css">
<link href="css/jquery.jqzoom.css" media="screen" rel="stylesheet" type="text/css">
  <script src="js/datepicker.js"></script>
  <script src="js/jquery-1.7.2.min.js" ></script>
  <script src="js/html5.js" ></script>
  <script src="js/jflow.plus.js" ></script>
  <script src="js/jquery.carouFredSel-5.2.2-packed.js"></script>
  <script src="js/checkbox.js"></script>
  <script src="js/radio.js"></script>
  <script src="js/selectBox.js"></script>
	<script type="text/javascript" src="js.jquery-1.7.2.min.js"></script>
  <script type="text/javascript">
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
   
 
     
       <div class="clear"></div>  
 
   

    <header id="branding">
       
    
      <div class="grid_3" style="float:right">
        <hgroup>
          <h1 id="site_logo"><a href="index.html" title=""><img src="img/logo.png" alt="Online Store Theme Logo"/></a></h1>
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
            <li class="curent"><a href="Bookmanager">书店管理员管理</a></li>
	        <li><a href="Usermanager">用户管理</a></li>
          </ul>
        </nav><!-- .primary -->
      </div><!-- .grid_12 -->
    </div><!-- .container_12 -->
  </div><!-- .block_nav_primary -->
  
  <div class="clear"></div>
  <form id="mform" action="BookmanagerAdd" method="post">
  <table>
      <tr>
	     <td>书店管理员账号</td>
	  </tr>
	  <tr>
	     <td align="center"><input type="submit" id="delete" name="delete"value="删除"style="width:100px;"/></td>
	     <td align="center"><input type="text" id="delete_account"name="delete_account" ></td>
	  </tr>
	  <tr>
	     <td align="center"><input type="submit" id="add"value="增加"name="add"style="width:100px;" onclick="addop();"/></td>
	     <td align="center"><input type="text" id="add_account"name="add_account" ></td>
	  </tr>
	  
  </table>
  </form>
  <%Object obj=request.getAttribute("html");
String html="";
if(obj!=null){
  html=obj.toString();
} %>
<%=html %>
	      

      
       
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