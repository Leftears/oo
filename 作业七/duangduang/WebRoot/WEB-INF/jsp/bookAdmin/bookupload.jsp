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

  <title>图书上传</title>

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
     $(document).ready(function() {
        $('#uploadSure').click(function(){
			var a=$('#book_id').val();
	//		var b=$('#type_num').val();
			if(a==null){
				alert("新书编号不能为空！");
			}
	//		else if(b==0){
		//		alert("请选择类别");
			//}
			});
    });
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
		     <h3>上传图书</h3>
	      </aside><!-- #categories_nav -->
	       <%
		 String str= (String)request.getAttribute("message1");
		 if("上传成功".equals(str)){
		 	%><span style="color:red"><%=str %></span><% 
		 }
		  %>
	        <%
		 String sstr= (String)request.getAttribute("message2");
		 if("上传失败或图书编号重复".equals(sstr)){
		 	%><span style="color:red"><%=sstr %></span><% 
		 }
		  %>
		 </div>
	<!-- 	 <form action="uploadImage.jsp" id="phoUpload" enctype="multipart/form-data">
		    <table>
		       <tr>
                  <td>图片</td>
                  <td><input type="file" name="upfile" id="upfile"/></td>
                  <td><input type="submit" name="upsure" id="upsure" value="确定上传"/> 
               </tr>
		    </table>
		 </form>  -->
		<div class="grid_66"  style="width:900px;float:left">
		  <form id="uploadinfo" enctype="multipart/form-data" action="Upload">
            <div class="bookleft" style="width:260px;float:left;margin:0 30px 0 30px;">
              <table>
               <tr>
                 <td>新书编号</td>  <!--不能为空 -->
                 <td><input type="text" name="book_id" id="book_id"/></td>
               </tr>
               <tr>
                 <td>价格</td>
                 <td><input type="text" name="book_price"/></td>
               </tr>
               <tr>
                 <td>出版时间</td>
                 <td><input type="text"  name="book_time"
					  onclick="new Calendar().show(this);" readonly /></td>
               </tr>
               <tr>
                 <td>页数</td>
                 <td><input type="text" name="book_page"/></td>
               </tr>
               <tr>
                 <td>印刷次数</td>
                 <td><input type="text" name="book_presscount"/></td>
               </tr>
               <tr>
                 <td>包装</td>
                 <td><input type="text" name="book_package"/></td>
               </tr>
               <tr>
                 <td>内容摘要</td>
                 <td>
                    <textarea name="book_synopsis" rows="15"></textarea>
                 </td>
               </tr>
                <tr style="height:80px;"> 
                  <td><input type="submit" id="uploadSure" value="上传" style="color:#121212;width:60px;                         height:50px;"/></td>
                  <td><input type="reset"  id="uploadReset" value="重置"  style="color:#121212;width:60px;                         height:50px;"/></td>
                </tr>
              </table>
            </div>
            <div class="bookcenter" style="width:240px;float:left;margin:0 30px 0 30px;">
              <table>
                <tr>
                  <td>类别</td>
                  <td>
                     <select name="type_num">
                       <option value="0">请选择</option>
                       <option value="电子书">电子书</option>
                       <option value="小说">小说</option>
                       <option value="文艺">文艺</option>
                       <option value="童书">童书</option>
                       <option value="生活">生活</option>
                       <option value="科技">科技</option>
                       <option value="其他">其他</option>
                     </select>
                  </td>
                </tr>
                <tr>
                  <td>作者</td>
                  <td><input type="text" name="book_aurthor"/></td>
                </tr>
                <tr> 
                  <td>国际标准书号</td>
                  <td><input type="text" name="book_isbn"/></td>
                </tr>
                <tr>
                  <td>字数</td>
                  <td><input type="text" name="book_wordnum"/></td>
                </tr>
                <tr>
                  <td>开本</td>
                  <td><input type="text" name="book_size"/></td>
                </tr>
                <tr> 
                  <td>库存</td>
                  <td><input type="text" name="book_stock"/></td>
                </tr>
                <tr>
                   <td>目录</td>
                   <td>
                      <textarea name="book_catalogue" rows="15"></textarea>
                   </td>
                </tr>
              </table>
            </div>
            <div class="bookright" style="width:240px;float:left;margin:0 0 0 30px;">
              <table>
               <tr> 
                  <td>书名</td>
                  <td><input type="text" name="book_name"/></td>
               </tr>
               <tr>
                  <td>出版社</td>
                  <td><input type="text" name="book_press"/></td>
               </tr>
               <tr>
                  <td>版次</td>
                  <td><input type="text" name="book_edit"/></td>
               </tr>
               <tr>
                  <td>印刷时间</td>
                  <td><input type="text" name="book_presstime"
                         onClick="new Calendar().show(this);" readonly/></td>
               </tr>
               <tr>
                  <td>纸张</td>
                  <td><input type="text" name="book_capacitor"/></td>
               </tr>
               <tr>
                 <td>描述</td>
                 <td><input type="text" name="book_explain"/></td>
               </tr>
               <tr>
                  <td>图片地址</td>
                  <td><input type="text" name="book_src" id="book_src"/></td>
               </tr>
              </table>
            </div>
           </form>
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