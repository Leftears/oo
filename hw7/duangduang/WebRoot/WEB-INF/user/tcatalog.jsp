<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML>
<html>
<!-- Added by HTTrack --><meta http-equiv="content-type" content="text/html;charset=utf-8" /><!-- /Added by HTTrack -->
<head>
<base href="<%=basePath%>">
  <meta charset="UTF-8">

  <meta name="description" content="">
  <meta name="keywords" content="">

  <title>tcatalog</title>

  <link rel="shortcut icon" href="favicon.ico">
  <link href="css/style.css" media="screen" rel="stylesheet" type="text/css">
  <link href="css/grid.css" media="screen" rel="stylesheet" type="text/css">
 
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
 <div class="container_12">
    <div id="top">
      <div class="grid_3">
        <div class="phone_top">
          联系电话 +8888888
        </div><!-- .phone_top -->
      </div><!-- .grid_3 -->
   
     <div class="grid_6">
        <div class="welcome">
          欢迎光临DuangDuang网，请<a href="login.html">登录</a> 或者 <a href="register.html">注册</a>.
        </div><!-- .welcome -->
      </div><!-- .grid_6 -->
     
       <div class="clear"></div>  
 
   

    <header id="branding">
      <div class="grid_3">
        <hgroup>
          <h1 id="site_logo"><a href="index.html" title=""><img src="img/d.png" alt="Online Store Theme Logo"/></a></h1>
          <h2 id="site_description">Online Store Theme</h2>
        </hgroup>
      </div><!-- .grid_3 -->

	  <div class="grid_3">
        <form class="search">
          <input type="text" name="search" class="entry_form" value="" placeholder="查看你想要的书籍..."/>
	</form>
      </div><!-- .grid_3 -->

      <div class="grid_6">
        <ul id="cart_nav">
          <li>
            <a class="cart_li" href="shoppingcart">购物车 <span>￥0.00</span></a>
            <ul class="cart_cont">
              <li class="no_border"><p>最近添加的商品</p></li>
              <!--<li>
                <a href="product_page.html" class="prev_cart"><div class="cart_vert"><img src="images/cart_img.png" alt="" title="" /></div></a>
                <div class="cont_cart">
                  <h4>Caldrea Linen and Room Spray</h4>
                  <div class="price">1 x $399.00</div>
                </div>
                <a title="close" class="close" href="#"></a>
                <div class="clear"></div>
              </li>
              
              <li>
                <a href="product_page.html" class="prev_cart"><div class="cart_vert"><img src="images/produkt_slid1.png" alt="" title="" /></div></a>
                <div class="cont_cart">
                  <h4>Caldrea Linen and Room Spray</h4>
                  <div class="price">1 x $399.00</div>
                </div>
                <a title="close" class="close" href="#"></a>
                <div class="clear"></div>
              </li>-->
	      <li class="no_border">
		<a href="shoppingcart.html" class="view_cart">看看购物车吧</a>
		<a href="shoppingcart.html" class="checkout">去买单咯</a>
	      </li>
            </ul>
          </li>
        </ul>
        
        <nav class="private">
          <ul>
            <li><a href="selfcenter.html">我的DuangDuang</a></li>
		<li class="separator">|</li>
            <li><a href="dealcenter.html">我的订单</a></li>
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
          <ul>
            <li><a href="index.html">主页</a></li>
            <li><a href="dcatalog.html">电子书</a></li>
            <li><a href="xcatalog.html">小说</a></li>
            <li><a href="wcatalog.html">文艺</a></li>
            <li class="curent"><a href="tcatalog.html">童书</a></li>
            <li><a href="scatalog.html">生活</a></li>
            <li><a href="kcatalog.html">科技</a></li>
	        <li><a href="qcatalog.html">其他</a></li>
          </ul>
        </nav><!-- .primary -->
      </div><!-- .grid_12 -->
    </div><!-- .container_12 -->
  </div><!-- .block_nav_primary -->
  
  <div class="clear"></div>
  
  <div class="container_12">
    <div class="grid_12">
       <div class="breadcrumbs">
	      <a href="index.html">主页</a><span>&#8250;</span><span class="current">童书</span>
       </div><!-- .breadcrumbs -->
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
                   <li class="curent"><a href="tcatalog.html">童书</a></li>
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
					  <a href="#"><img src="img/x1.jpg" alt="" title="" /></a>
				   </div>

				   <div class="cont">
					  <a href="#">书名</a> 
					  <div class="prise"><span>￥</span>37.00</div>
				   </div>
			    </li>

			    <li>
				   <div class="prev">
					  <a href="#"><img src="img/w6.jpg" alt="" title="" /></a>
				   </div>

				   <div class="cont">
					  <a href="#">书名</a>
					  <div class="prise"><span>￥</span>36.00</div>
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
						<img src="img/new1.jpg" alt="" title="" />
                         <!-- 放新书图片 -->
					</div><!-- .prev -->

					<h2>新书速购</h2>

					<p>下一系列</p>
 			        </a></li>

				<li class="banner"><a href="#">
					<div class="prev">
						<img src="img/new2.jpg" alt="" title="" />
					</div><!-- .prev -->

					<h2>新书速购</h2>

					<p>下一系列</p>
 			        </a></li>

				<li class="banner"><a href="#">
					<div class="prev">
						<img src="img/new3.jpg" alt="" title="" />
					</div><!-- .prev -->

					<h2>新书速购</h2>

					<p>下一系列</p>
 			        </a></li>
                 <!-- 图片循环-->
			</ul>
		</div><!-- .list_carousel -->
	      </aside><!-- #banners -->
	      
	      
       </div><!-- .sidebar -->
      
       <div id="content" class="grid_9">
	      <h1 class="page_title">书籍列表</h1>
	      
	      
	      
	      <div class="grid_product">
		     <div class="grid_3 product">
			    <div class="prev">
				   <a href="product_page.html"><img src="img/t1.jpg" alt="" title="" /></a>
			    </div><!-- .prev -->
			    <h3 class="title">超级纸飞机</h3>
			    <div class="cart">
				   <div class="price">
					  <div class="vert">
						 <div class="price_new">￥33.00</div>
					  </div>
				   </div>
				   <a href="#" class="obn"></a>
				   <a href="#" class="like"></a>
				   <a href="#" class="bay"></a>
			    </div><!-- .cart -->
		     </div><!-- .grid_3 -->
		     
		     <div class="grid_3 product">
			    <img class="sale" src="images/sale.png" alt="Sale"/>
			    <div class="prev">
				   <a href="product_page.html"><img src="img/t2.jpg" alt="" title="" /></a>
			    </div><!-- .prev -->
			    <h3 class="title">谁买了谁的雨鞋</h3>
			    <div class="cart">
				   <div class="price">
					  <div class="vert">
						 <div class="price_new">￥26.00</div>
					  </div>
				   </div>
				   <a href="#" class="obn"></a>
				   <a href="#" class="like"></a>
				   <a href="#" class="bay"></a>
			    </div><!-- .cart -->
		     </div><!-- .grid_3 -->
		     
		     <div class="grid_3 product">
			    <img class="sale" src="images/new.png" alt="New"/>
			    <div class="prev">
				   <a href="product_page.html"><img src="img/t3.jpg" alt="" title="" /></a>
			    </div><!-- .prev -->
			    <h3 class="title">郑源洁十年未出版的经典童话</h3>
			    <div class="cart">
				   <div class="price">
					  <div class="vert">
						 <div class="price_new">￥24.00</div>
					  </div>
				   </div>
				   <a href="#" class="obn"></a>
				   <a href="#" class="like"></a>
				   <a href="#" class="bay"></a>
			    </div><!-- .cart -->
		     </div><!-- .grid_3 -->
		     
		     <div class="grid_3 product">
			    <img class="sale" src="images/top.png" alt="Top"/>
			    <div class="prev">
				   <a href="product_page.html"><img src="img/t4.jpg" alt="" title="" /></a>
			    </div><!-- .prev -->
			    <h3 class="title">最有趣的生物教科书</h3>
			    <div class="cart">
				   <div class="price">
					  <div class="vert">
						 <div class="price_new">￥45.00</div>
					  </div>
				   </div>
				   <a href="#" class="obn"></a>
				   <a href="#" class="like"></a>
				   <a href="#" class="bay"></a>
			    </div><!-- .cart -->
		     </div><!-- .grid_3 -->
		     
		     <div class="grid_3 product">
			    <div class="prev">
				   <a href="product_page.html"><img src="img/t5.jpg" alt="" title="" /></a>
			    </div><!-- .prev -->
			    <h3 class="title">中国历史故事集</h3>
			    <div class="cart">
				   <div class="price">
					  <div class="vert">
						 <div class="price_new">￥33.00</div>
					  </div>
				   </div>
				   <a href="#" class="obn"></a>
				   <a href="#" class="like"></a>
				   <a href="#" class="bay"></a>
			    </div><!-- .cart -->
		     </div><!-- .grid_3 -->
		     
		     <div class="grid_3 product">
			    <div class="prev">
				   <a href="product_page.html"><img src="img/t6.jpg" alt="" title="" /></a>
			    </div><!-- .prev -->
			    <h3 class="title">法布尔昆虫记</h3>
			    <div class="cart">
				   <div class="price">
					  <div class="vert">
						 <div class="price_new">￥116.80</div>
					  </div>
				   </div>
				   <a href="#" class="obn"></a>
				   <a href="#" class="like"></a>
				   <a href="#" class="bay"></a>
			    </div><!-- .cart -->
		     </div><!-- .grid_3 -->
		     
		     <div class="grid_3 product">
			    <img class="sale" src="images/sale.png" alt="Sale"/>
			    <div class="prev">
				   <a href="product_page.html"><img src="img/t7.jpg" alt="" title="" /></a>
			    </div><!-- .prev -->
			    <h3 class="title">格尔尼卡</h3>
			    <div class="cart">
				   <div class="price">
					  <div class="vert">
						 <div class="price_new">￥46.40</div>
					  </div>
				   </div>
				   <a href="#" class="obn"></a>
				   <a href="#" class="like"></a>
				   <a href="#" class="bay"></a>
			    </div><!-- .cart -->
		     </div><!-- .grid_3 -->
		     
		     <div class="grid_3 product">
			    <img class="sale" src="images/top.png" alt="Top"/>
			    <div class="prev">
				   <a href="product_page.html"><img src="img/t8.jpg" alt="" title="" /></a>
			    </div><!-- .prev -->
			    <h3 class="title">流浪狗之家</h3>
			    <div class="cart">
				   <div class="price">
					  <div class="vert">
						 <div class="price_new">￥15.30</div>
					  </div>
				   </div>
				   <a href="#" class="obn"></a>
				   <a href="#" class="like"></a>
				   <a href="#" class="bay"></a>
			    </div><!-- .cart -->
		     </div><!-- .grid_3 -->
		     
		     <div class="grid_3 product">
			    <img class="sale" src="images/new.png" alt="New"/>
			    <div class="prev">
				   <a href="product_page.html"><img src="img/t9.jpg" alt="" title="" /></a>
			    </div><!-- .prev -->
			    <h3 class="title">奇先生妙小姐</h3>
			    <div class="cart">
				   <div class="price">
					  <div class="vert">
						 <div class="price_new">￥238.20</div>
					  </div>
				   </div>
				   <a href="#" class="obn"></a>
				   <a href="#" class="like"></a>
				   <a href="#" class="bay"></a>
			    </div><!-- .cart -->
		     </div><!-- .grid_3 -->
		     
		     <div class="grid_3 product">
			    <div class="prev">
				   <a href="product_page.html"><img src="img/t10.jpg" alt="" title="" /></a>
			    </div><!-- .prev -->
			    <h3 class="title">梦想家威利</h3>
			    <div class="cart">
				   <div class="price">
					  <div class="vert">
						 <div class="price_new">￥23.20</div>
					  </div>
				   </div>
				   <a href="#" class="obn"></a>
				   <a href="#" class="like"></a>
				   <a href="#" class="bay"></a>
			    </div><!-- .cart -->
		     </div><!-- .grid_3 -->
		     
		     <div class="grid_3 product">
			    <img class="sale" src="images/sale.png" alt="Sale"/>
			    <div class="prev">
				   <a href="product_page.html"><img src="img/t11.jpg" alt="" title="" /></a>
			    </div><!-- .prev -->
			    <h3 class="title">孙悟空故事</h3>
			    <div class="cart">
				   <div class="price">
					  <div class="vert">
						 <div class="price_new">￥11.00</div>
					  </div>
				   </div>
				   <a href="#" class="obn"></a>
				   <a href="#" class="like"></a>
				   <a href="#" class="bay"></a>
			    </div><!-- .cart -->
		     </div><!-- .grid_3 -->
		     
		     <div class="grid_3 product">
			    <img class="sale" src="images/new.png" alt="New"/>
			    <div class="prev">
				   <a href="product_page.html"><img src="img/t12.jpg" alt="" title="" /></a>
			    </div><!-- .prev -->
			    <h3 class="title">我哥哥</h3>
			    <div class="cart">
				   <div class="price">
					  <div class="vert">
						 <div class="price_new">￥12.20</div>
					  </div>
				   </div>
				   <a href="#" class="obn"></a>
				   <a href="#" class="like"></a>
				   <a href="#" class="bay"></a>
			    </div><!-- .cart -->
		     </div><!-- .grid_3 -->
	    
	      <div class="clear"></div>
	      </div><!-- .grid_product -->
	      
	      <div class="clear"></div>
	      
	      <div class="pagination">
		     <ul>
			    <li class="prev"><span>&#8592;</span></li>
			    <li class="curent"><a href="#">1</a></li>
			    <li><a href="#">2</a></li>
			    <li><a href="#">3</a></li>
			    <li><a href="#">4</a></li>
			    <li><a href="#">5</a></li>
			    <li><span>...</span></li>
			    <li><a href="#">100</a></li>
			    <li class="next"><a href="#">&#8594;</a></li>
		     </ul>
	      </div><!-- .pagination -->
	      <p class="pagination_info">Displaying 1 to 12 (of 100 products)</p>
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