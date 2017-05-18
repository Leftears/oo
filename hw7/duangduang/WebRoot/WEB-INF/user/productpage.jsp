<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE HTML>
<html>
<!-- Added by HTTrack --><meta http-equiv="content-type" content="text/html;charset=utf-8" /><!-- /Added by HTTrack -->
<head>
<base href="<%=basePath%>>">
  <meta charset="UTF-8">

  <meta name="description" content="">
  <meta name="keywords" content="">

  <title>Product view</title>

  <link rel="shortcut icon" href="favicon.ico">
  <link href="css/style.css" media="screen" rel="stylesheet" type="text/css">
  <link href="css/grid.css" media="screen" rel="stylesheet" type="text/css">
  <link rel="stylesheet" href="css/jquery.jqzoom.css" type="text/css">

  <script src="js/jquery-1.7.2.min.js" ></script>
  <script src="js/html5.js" ></script>
  <script src="js/jflow.plus.js" ></script>
  <script src="js/jquery.carouFredSel-5.2.2-packed.js"></script>
  <script src="js/checkbox.js"></script>
  <script src="js/radio.js"></script>
  <script src="js/selectBox.js"></script>
  <script src="js/jquery.jqzoom-core.js" ></script>

  <script>
	$(document).ready(function() {
		$('.jqzoom').jqzoom({
			zoomType: 'standard',
			lens:true,
			preloadImages: true,
			alwaysOn:false
		});
	});
	function doShopping() { 
	    var bookid = document.getElementById("002").value;
	    var num = document.getElementById("001").value;
	    var url = 'shoppingcar1_shoppingcar1.action?bookid=' + bookid + '&booknum=' + num;
	    document.location.href = url;
	}
	
	function addToCart () {
	    var url = '';
	    var bookid = document.getElementById("002").value;
        var num = document.getElementById("001").value;
	    var data={
		"bookid":bookid,
		"booknum":num
	};
	//第二个参数是传递到后台的数据（json格式），如果没有要传到后台的数据，则可不写
   $.post("shoppingcar1_shoppingcar1.action",data,function(result){
    //后台处理完需不需要进行额外的动作，如果不用，可以不写。

	});
	}
	
	
  </script>

  <script>
	$(document).ready(function() {
		$("select").selectBox();
	});
  </script>

  <script>
	$(document).ready(function() {
		$('#wrapper_tab a').click(function() {
			if ($(this).attr('class') != $('#wrapper_tab').attr('class') ) {
				$('#wrapper_tab').attr('class',$(this).attr('class'));
			}
			return false;
		});
	});
  </script>

  <script>
	$(function() {
	  $('#list_product').carouFredSel({
		prev: '#prev_c1',
		next: '#next_c1',
		auto: false
	  });
          $('#list_banners').carouFredSel({
		prev: '#ban_prev',
		next: '#ban_next',
		scroll: 1,
		auto: false
	  });
	  $('#thumblist').carouFredSel({
		prev: '#img_prev',
		next: '#img_next',
		scroll: 1,
		auto: false,
		circular: false,
	  });
	  $(window).resize();
	});
  </script>
  <script>
       $(document).ready(function(){
	      $("button").click(function(){
		     $(this).addClass('click')
	      });
       })
  </script>

</head>
<body>
  <div class="container_12">
    <div id="top">
      <div class="grid_3">
        <div class="phone_top">
          联系我们 +8888888
        </div><!-- .phone_top -->
      </div><!-- .grid_3 -->

       <div class="grid_6">
        <div class="welcome">
          欢迎光临DuangDuang <a href="login.html">登陆</a> 或者 <a href="register.html">注册</a>.
        </div><!-- .welcome -->
      </div><!-- .grid_6 --> 
    </div><!-- #top -->

    <header id="branding">
      <div class="grid_3">
        <hgroup>
          <h1 id="site_logo"><a href="index.html" title=""><img src="img/d.png" alt="Online Store Theme Logo"/></a></h1>
          <h2 id="site_description">DuangDuang图书网</h2>
        </hgroup>
      </div><!-- .grid_3 -->

      <div class="grid_3">
        <form class="search">
          <input type="text" name="search" class="entry_form" value="" placeholder="搜索"/>
	</form>
      </div><!-- .grid_3 -->

      <div class="grid_6">
        <ul id="cart_nav">
          <li>
            <a class="cart_li" href="#">购物车 <span>￥0.00 <!-- 根据暂存表的总价格--></span></a>
            <ul class="cart_cont">
              <li class="no_border"><p>已有的宝贝</p></li>
              <li>
                <a href="product_page.html" class="prev_cart"><div class="cart_vert"><img src="images/cart_img.png" alt="" title="" /></div></a>
                <div class="cont_cart">
                  <h4>Caldrea Linen and Room Spray</h4>  <!--根据图书暂存表显示 -->
                  <div class="price">1 x $399.00</div>
                </div>
                <a title="close" class="close" href="#"></a>
                <div class="clear"></div>
              </li>
              
              <li>
                <a href="product_page.html" class="prev_cart"><div class="cart_vert"><img src="images/produkt_slid1.png" alt="" title="" /></div></a>
                <div class="cont_cart">
                  <h4>Caldrea Linen and Room Spray</h4>  <!--根据图书暂存表显示 -->
                  <div class="price">1 x $399.00</div>
                </div>
                <a title="close" class="close" href="#"></a>
                <div class="clear"></div>
              </li>
	      <li class="no_border">
		<a href="shopping_cart.html" class="view_cart">购物车</a>
		<a href="checkout.html" class="checkout">购买</a>
	      </li>
            </ul>
          </li>
        </ul>

        <nav class="private">
          <ul>
            <li><a href="#">我的账户</a></li>
		<li class="separator">|</li>
            <li><a href="#">我的订单</a></li>
		<li class="separator">|</li>
          </ul>
        </nav><!-- .private -->
      </div><!-- .grid_6 -->
    </header><!-- #branding -->
  </div><!-- .container_12 -->

  <div class="clear"></div>

  <div id="block_nav_primary">
    <div class="container_12">
      <div class="grid_12">
        <nav class="primary">
          <ul> <!--点击后进入图书展示页面 -->
            <li><a href="index.html">主页</a></li>
                   <li><a href="dcatalog.html">电子书</a></li>
                   <li><a href="xcatalog.html">小说</a></li>
                   <li><a href="wcatalog.html">文艺</a></li>
                   <li><a href="tcatalog.html">童书</a></li>
                   <li><a href="scatalog.html">生活</a></li>
                   <li><a href="kcatalog.html">科技</a></li>
	               <li class="last"><a href="qcatalog.html">其他</a></li>
          </ul>
        </nav><!-- .primary -->
      </div><!-- .grid_12 -->
    </div><!-- .container_12 -->
  </div><!-- .block_nav_primary -->

  <div class="clear"></div>

  <div class="container_12">
    <div class="grid_12">
    </div><!-- .grid_12 -->
  </div><!-- .container_12 -->

  <div class="clear"></div>

  <section id="main">
    <div class="container_12">
       <div id="sidebar" class="grid_3">
	      <aside id="categories_nav">
		     <h3>类别</h3>

		     <nav class="left_menu">
			    <ul>   <!--点击后进入图书展示页面 -->
				   <li><a href="index.html">主页</a></li>
                   <li><a href="dcatalog.html">电子书</a></li>
                   <li><a href="xcatalog.html">小说</a></li>
                   <li><a href="wcatalog.html">文艺</a></li>
                   <li><a href="tcatalog.html">童书</a></li>
                   <li><a href="scatalog.html">生活</a></li>
                   <li><a href="kcatalog.html">科技</a></li>
	               <li class="last"><a href="qcatalog.html">其他</a></li>
			    </ul>
		     </nav><!-- .left_menu -->
	      </aside><!-- #categories_nav -->

	      <aside id="specials" class="specials">  <!--热卖图片 -->
		     <h3>热卖</h3>

		     <ul>
			    <li>
				   <div class="prev">
					  <a href="#"><img src="images/special1.png" alt="" title="" /></a>
				   </div>

				   <div class="cont">
					  <a href="#">书名</a> 
					  <div class="prise"><span>￥</span>75.00</div>
				   </div>
			    </li>

			    <li>
				   <div class="prev">
					  <a href="#"><img src="images/special2.png" alt="" title="" /></a>
				   </div>

				   <div class="cont">
					  <a href="#">书名</a>
					  <div class="prise"><span>￥</span>75.00</div>
				   </div>
			    </li>
		     </ul>
	      </aside><!-- #specials -->

	      <aside id="banners">
		<a id="ban_next" class="next arows" href="#"><span>Next</span></a>
		<a id="ban_prev" class="prev arows" href="#"><span>Prev</span></a>

		<h3>新书上架</h3>

		<div class="list_carousel">
			<ul id="list_banners">
				<li class="banner"><a href="#">
					<div class="prev">
						<img src="images/banner.png" alt="" title="" />
                         <!-- 放新书图片 -->
					</div><!-- .prev -->

					<h2>新书速购</h2>

					<p>下一系列</p>
 			        </a></li>

				<li class="banner"><a href="#">
					<div class="prev">
						<img src="images/banner.png" alt="" title="" />
					</div><!-- .prev -->

					<h2>New smells</h2>

					<p>in the next series</p>
 			        </a></li>

				<li class="banner"><a href="#">
					<div class="prev">
						<img src="images/banner.png" alt="" title="" />
					</div><!-- .prev -->

					<h2>New smells</h2>

					<p>in the next series</p>
 			        </a></li>
                 <!-- 图片循环-->
			</ul>
		</div><!-- .list_carousel -->
	      </aside><!-- #banners -->
       </div><!-- .sidebar -->

       <div id="content" class="grid_9">
	      <h1 class="page_title">书名</h1>  
          <!-- 根据主页点击的图书名而改变-->

		<div class="product_page">
			<div class="grid_4 img_slid" id="products">
				<img class="sale" src="images/sale.png" alt="Sale"/>
				<div class="preview slides_container">
					<div class="prev_bg">
						<a href="images/${book1.src}" class="jqzoom" rel='gal1' title="">
							<img src="images/${book1.src}"  title="" alt=""/> 
                            <!-- 根据主页点击的图书而改变-->
						</a>
					</div>
				</div><!-- .prev -->

				<div class="next_prev">
					<a id="img_prev" class="arows" href="#"><span>Prev</span></a>
					<a id="img_next" class="arows" href="#"><span>Next</span></a>
				</div><!-- . -->
			</div><!-- .grid_4 -->

			<div class="grid_5">
				<div class="entry_content">
					<p>${book1.explain}</p>
					<div class="ava_price">
				        <div class="availability_sku">
                          <div class="availability" style="padding:10px 0 10px 0;">
                              价格&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                              &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                              <span><!-- jsp代码添加价格 -->${book1.price}</span>
                          </div>
                          <div class="sku" style="padding:10px 0 10px 0;">  
                              作者&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                              &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                              <span><!-- jsp代码添加作者 -->${book1.author}</span>
                          </div>
                          <div class="sku_1" style="padding:10px 0 10px 0;">
                              出版&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                              &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                              <span><!-- jsp代码添加出版社 -->${book1.press}</span>
                           </div>
                           <div class="sku_2" style="padding:10px 0 10px 0;">
                              出版时间&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                              &nbsp;&nbsp;
                              <span><!-- jsp代码添加出版时间 -->${book1.time}</span>
                           </div>
                           <div class="sku_3" style="padding:10px 0 10px 0;">
                              国际标准书号&nbsp;&nbsp;&nbsp;&nbsp;
                              <span><!-- jsp代码添加国际标准书号 -->${book1.isbn}</span>
                           </div>
                           <div class="sku_4" style="padding:10px 0 10px 0;">
                              所属分类&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                              &nbsp;
                              <span><!-- jsp代码添所属分类 -->${book1.category}</span>
                           </div>
						</div><!-- .availability_sku -->
					</div><!-- .ava_price -->

					<div class="block_cart">
						<div class="obn_like">
					       <div class="like"><a href="javascript:addToCart();" class="like">加入购物车</a></div>
                        </div>

						<div class="cart">
							<a href="javascript:doShopping();" class="bay">立即购买</a>
							<input type="text" name="num" class="number" value="1" id="001"/>
							<input type="hidden" name="bookid" class=""  value="${book1.id}" id="002">
                            <!-- 数量默认为1，通过键盘输入值-->
							<span>数量:</span>
						</div>
						<div class="clear"></div>
					</div><!-- .block_cart -->
					<div class="soc">
						<img src="images/soc.png" alt="Soc"/>
					</div><!-- .soc -->
				</div><!-- .entry_content -->

			</div><!-- .grid_5 -->

			<div class="clear"></div>

			<div class="grid_9" >
				<div id="wrapper_tab" class="tab1">
					<a href="#" class="tab1 tab_link">商品介绍</a>
				<!--	<a href="#" class="tab2 tab_link">评价</a> -->
					<a href="#" class="tab3 tab_link">Custom Tab</a>

					<div class="clear"></div>

					<div class="tab1 tab_body">
                        <div class="book_detail" style="width:100%;height:5%" >                               <table>
                                <tr>
                                  <td>版次</td>
                                  <td>${book1.edit}</td>   <!-- 从数据库中读取-->
                                  <td>&nbsp;&nbsp;页数</td>
                                  <td>${book1.page}</td> <!-- 从数据库中读取-->
                                  <td>&nbsp;&nbsp;字数</td>
                                  <td>${book1.wordNum}</td> <!-- 从数据库中读取-->
                                </tr>
                                <tr>
                                  <td>印刷时间</td>
                                  <td>${book1.pressTime}</td>   <!-- 从数据库中读取-->
                                  <td>&nbsp;&nbsp;开本</td>
                                  <td>16开</td> <!-- 从数据库中读取-->
                                  <td>&nbsp;&nbsp;包装</td>
                                  <td>${book1.package1}</td> <!-- 从数据库中读取-->
                                </tr>
                                <tr>
                                  <td>印次</td>
                                  <td>${book1.presscount}</td>   <!-- 从数据库中读取-->
                                  <td>&nbsp;&nbsp;纸张</td>
                                  <td>胶版纸</td> <!-- 从数据库中读取-->
                                </tr>   
                               </table>
                              </div>
                         
						<h4><span style="font-size:24px;color:#000000;">内容推荐</span></h4>  
						<p>放精彩内容</p> <!-- 读取数据库中图书表的内容推荐属性-->
						<h4>目录</h4>
						<ol>
							<li>目录1</li> <!-- 从数据库中读取目录-->
							<li>目录2</li>
							<li>目录3</li>
							<li>目录4</li>
							<li>目录5</li>
						</ol>
					<div class="clear"></div>
					</div><!-- .tab1 .tab_body -->
                    
					<div class="tab3 tab_body">
						<h4>Custom Tab</h4>
					<div class="clear"></div>
					</div><!-- .tab3 .tab_body -->
					<div class="clear"></div>
				</div>​<!-- #wrapper_tab -->
				<div class="clear"></div>
			</div><!-- .grid_9 -->

			<div class="clear"></div>

			<div class="related">
				<div class="c_header">
					<div class="grid_7">
						<h2>相关商品</h2>
					</div><!-- .grid_7 -->

					<div class="grid_2">
						<a id="next_c1" class="next arows" href="#"><span>Next</span></a>
						<a id="prev_c1" class="prev arows" href="#"><span>Prev</span></a>
					</div><!-- .grid_2 -->
				</div><!-- .c_header -->

				<div class="list_carousel">

				<ul id="list_product" class="list_product">
                
					<li class=""> <!--标签<li></li>之间为循环体 -->
						<div class="grid_3 product">
							<img class="sale" src="images/sale.png" alt="Sale"/>
							<div class="prev">
								<a href="product_page.html"><img src="images/pikaqiu.png" alt="" title="" /></a>
							</div><!-- .prev -->  <!-- 通过查询图书类别，显示同类别的图书-->
							<h3 class="title">书名</h3>
							<div class="cart">
								<div class="price">
									<div class="vert">
										<div class="price_new">77</div>								
								</div>
                                <a href="#" class="like"></a>
								<a href="#" class="bay"></a>
							</div><!-- .cart -->
						</div><!-- .grid_3 -->
					</li>
                    
			        </ul><!-- #list_product -->
				</div><!-- .list_carousel -->
			</div><!-- .carousel -->
		</div><!-- .product_page -->
		<div class="clear"></div>

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
