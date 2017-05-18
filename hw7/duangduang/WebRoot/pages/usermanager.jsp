<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
 
<!DOCTYPE HTML>
<html>
<!-- Added by HTTrack --><meta http-equiv="content-type" content="text/html;charset=utf-8" /><!-- /Added by HTTrack -->
<head>
  <meta charset="UTF-8">

  <meta name="description" content="">
  <meta name="keywords" content="">

  <title>usermanager</title>

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
            <li><a href="Bookmanager">书店管理员管理</a></li>
	        <li class="curent"><a href="Usermanager">用户管理</a></li>
          </ul>
        </nav><!-- .primary -->
      </div><!-- .grid_12 -->
    </div><!-- .container_12 -->
  </div><!-- .block_nav_primary -->
  
  <div class="clear"></div>
  
  <form id="sform" action="UsernameSearch" method="post">
  <div style="display:inline">
   <div align="center">
	  <div class="grid_3">
           <form class="search" >
                <input type="text" id="t_search"name="t_search" class="entry_form" value="" placeholder="查找相关用户..." />
               </div>
	       </form>
      </div><!-- .grid_3 -->
      <input type="submit" id="s_select"name="s_select"value="搜索" style="width:100px;"/>
      </div>
</div>
  <form id="uform" action="UsermanagerAdd" method="post">
  <table style="width:950px;margin-left:150px;">
      
      <tr>
	     <td>用户账号</td>
		 <td>姓名</td>
		 <td>注册邮箱</td>
		 <td>性别</td>
		 <td>生日</td>
	  </tr>
			<%
				Object obj = request.getAttribute("html");
				String html = "";
				if (obj != null) {
					html = obj.toString();
				}
			%>
			<%=html%>
			<tr>
	     <td align="center"><input type="submit"id="delete" name="delete" value="删除"style="width:100px;"/></td>
	     <td align="center"><input type="text" id="delete_account"name="delete_account"></td>
	  </tr>
	  <tr>
	     <td align="center"><input type="submit" id="add"name="add"value="增加"style="width:100px;"/></td>
	     <td align="center"><input type="text" id="add_account"name="add_account"></td>
	  </tr>
	  
  </table>
  </form>
 
	      

      
       
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