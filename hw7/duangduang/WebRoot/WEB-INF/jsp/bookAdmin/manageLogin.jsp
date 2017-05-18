<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<html>
<!-- Added by HTTrack --><meta http-equiv="content-type" content="text/html;charset=utf-8" /><!-- /Added by HTTrack -->
<head>
  <meta charset="UTF-8">

  <meta name="description" content="">
  <meta name="keywords" content="">

  <title> managers Login</title>

  <link rel="shortcut icon" href="favicon.ico">
  <link href="css/style.css" media="screen" rel="stylesheet" type="text/css">
  <link href="css/grid.css" media="screen" rel="stylesheet" type="text/css">
 
  <script src="js/jquery-1.7.2.min.js" ></script>
  <script src="js/html5.js" ></script>
  <script src="js/jflow.plus.js"></script>
  <script src="js/jquery.carouFredSel-5.2.2-packed.js"></script>
  <script src="js/checkbox.js"></script>
  <script src="js/radio.js"></script>
  <script src="js/selectBox.js"></script>

  <script>
	
  </script>
    
</head>
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
      <div class="grid_3">
        <hgroup>
          <h1 id="site_logo"><a href="index.html" title=""><img src="images/logo.png" alt="Online Store Theme Logo"/></a></h1>
          <h2 id="site_description">DuangDuang图书网</h2>
        </hgroup>
      </div><!-- .grid_3 -->
  
  <section id="main" class="entire_width">
    <div class="container_12">      
       <div id="content">
		<div class="grid_12">
			<h1 class="page_title">管理员登录</h1>
		</div><!-- .grid_12 -->
<!--		<div class="grid_6 new_customers">
			<h2>新用户</h2>
			<p>你居然没有DuangDuang网账号，快点加入当下最火的网上图书商城吧！</p>
			<div class="clear"></div>
			<button class="account">注册</button>
                </div><!-- .grid_6 -->
		
		<div class="grid_6 new_customers" style="height:400px">
		 
		 <%
		 String str= (String)request.getAttribute("message");
		 if("账号或密码不正确".equals(str)){
		 	%><span style="color:red"><%=str %></span><% 
		 }
		  %>
		 
		 
			<form id="manageLogin" method="post" action="manageLogin">	
				<div class="email">
					<strong>账号:</strong><sup class="surely">*</sup><br/>
					<input type="text" id="account" class="account" name="account"/>
				</div><!-- .email -->
							
				<div class="password">
					<strong>密码:</strong><sup class="surely">*</sup><br/>
					<input type="password" id="pwd" class="pwd" name="pwd" />
				</div><!-- .password -->
				 <table>
                    <tr align="left"> 
                        <td>
                           <strong><input type="radio" id="rolechoose"  name="rolechoose" value="1"/>系统管理员</strong>
                           <strong><input type="radio" id="rolechoose"  name="rolechoose" value="2"/>书店管理员</strong>
                        </td>
                    </tr>
                 </table>
				
				<div class="submit">							
					  <input type="submit" value="登录" style="width:100px;height:50px;font-size:18px" />
				</div><!-- .submit -->
			</form><!-- .registed -->
                </div><!-- .grid_6 -->
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