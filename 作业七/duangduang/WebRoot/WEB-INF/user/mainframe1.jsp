<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<!-- Added by HTTrack --><meta http-equiv="content-type" content="text/html;charset=utf-8" /><!-- /Added by HTTrack -->
<head>
<base href="<%=basePath %>">
  <meta charset="UTF-8">

  <meta name="description" content="">
  <meta name="keywords" content="">

  <title>Home</title>

  <link rel="shortcut icon" href="favicon.ico">
  <link href="css/style.css" media="screen" rel="stylesheet" type="text/css">
  <link href="css/grid.css" media="screen" rel="stylesheet" type="text/css">

  <script src="js/jquery-1.7.2.min.js" ></script>
  <script src="js/html5.js" ></script>
  <script src="js/jflow.plus.js" ></script>
  <script src="js/jquery.carouFredSel-5.2.2-packed.js"></script>

  <script>
	$(document).ready(function(){
	    $("#myController").jFlow({
			controller: ".control", // must be class, use . sign
			slideWrapper : "#jFlowSlider", // must be id, use # sign
			slides: "#slider",  // the div where all your sliding divs are nested in
			selectedWrapper: "jFlowSelected",  // just pure text, no sign
			width: "984px",  // this is the width for the content-slider
			height: "480px",  // this is the height for the content-slider
			duration: 400,  // time in miliseconds to transition one slide
			prev: ".slidprev", // must be class, use . sign
			next: ".slidnext", // must be class, use . sign
			auto: true
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
          $('#list_product2').carouFredSel({
		prev: '#prev_c2',
		next: '#next_c2',
		auto: false
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
          联系我们：15200907048
        </div><!-- .phone_top -->
      </div><!-- .grid_3 -->

      <div class="grid_6">
        <div class="welcome">
           欢迎进入DuangDuang网上书城，您已成功登陆。<a href="${pageContext.request.contextPath}/beginregister_beginregister.action">免费注册</a>.
        </div><!-- .welcome -->
      </div><!-- .grid_6 -->
    </div><!-- #top -->

    <div class="clear"></div>

    <header id="branding">
      <div class="grid_3">
        <hgroup>
          <h1 id="site_logo" ><a href="index.html" title=""><img src="img/logo.png" alt="DuangDuang网上书城"/></a></h1>
          <h2 id="site_description">DuangDuang网上书城</h2>
        </hgroup>
      </div><!-- .grid_3 -->

      <div class="grid_3">
        <form class="search" action="${pageContext.request.contextPath}/search_search.action" method="post">
          <input type="text" name="name" class="entry_form" value="" placeholder="查看你想要的书籍..."/>
	</form>
      </div><!-- .grid_3 -->

      <div class="grid_6">
        <ul id="cart_nav">
          <li>
            <a class="cart_li" href="#">购物车 <span>￥0.00</span></a>
            <ul class="cart_cont">
              <li class="no_border"><p>最近添加的商品</p></li>
              <li>
                <a href="product_page.html" class="prev_cart"><div class="cart_vert"><img src="img/cart_img.png" alt="" title="" /></div></a>
                <div class="cont_cart">
                  <h4>Caldrea Linen and Room Spray</h4>
                  <div class="price">1 x $399.00</div>
                </div>
                <a title="close" class="close" href="#"></a>
                <div class="clear"></div>
              </li>
              
              <li>
                <a href="product_page.html" class="prev_cart"><div class="cart_vert"><img src="img/produkt_slid1.png" alt="" title="" /></div></a>
                <div class="cont_cart">
                  <h4>Caldrea Linen and Room Spray</h4>
                  <div class="price">1 x $399.00</div>
                </div>
                <a title="close" class="close" href="#"></a>
                <div class="clear"></div>
              </li>
	     <li class="no_border">
		<a href="${pageContext.request.contextPath}/shoppingcar_shoppingcar.action" class="view_cart">看看购物车吧</a>
		<a href="${pageContext.request.contextPath}/productpage_productpage.action" class="checkout">去买单咯</a>
	      </li>
            </ul>
          </li>
        </ul>

        <nav class="private">
          <ul>
            <li><a href="${pageContext.request.contextPath}/selfcenter_selfcenter.action">我的DuangDuang</a></li>
		<li class="separator">|</li>
         
		<li class="separator">|</li>
            <li><a href="${pageContext.request.contextPath}/dealcenter1_dealcenter1.action">我的订单</a></li>
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
          <ul>
            <li class="curent"><a href="index.html">主页</a></li>
            <li><a href="${pageContext.request.contextPath}/dcatalog_dcatalog.action">电子书</a></li>
            <li><a href="${pageContext.request.contextPath}/xcatalog_xcatalog.action">小说</a></li>
            <li><a href="${pageContext.request.contextPath}/wcatalog_wcatalog.action">文艺</a></li>
            <li><a href="${pageContext.request.contextPath}/tcatalog_tcatalog.action">图书</a></li>
            <li><a href="${pageContext.request.contextPath}/scatalog_scatalog.action">生活</a></li>
            <li><a href="${pageContext.request.contextPath}/kcatalog_kcatalog.action">科技</a></li>
			<li><a href="${pageContext.request.contextPath}/qcatalog_qcatalog.action">其他</a></li>
          </ul>
        </nav><!-- .primary -->
      </div><!-- .grid_12 -->
    </div><!-- .container_12 -->
  </div><!-- .block_nav_primary -->

  <div class="clear"></div>

  <div class="container_12">
    <div class="grid_12">
        <div class="slidprev"><span>Prev</span></div>
        <div class="slidnext"><span>Next</span></div>
        <div id="slider">
          <div id="slide1">
            <img src="img/content/slide1.jpg" alt="" title="" />
            <div class="slid_text">
              <p class="slid_title"><span>读书之法，在循序而渐进。</span>
			  </p>
              <p><span> —— 朱熹</span></p>
            </div>
          </div>

          <div id="slide2">
            <img src="img/content/slide2.jpg" alt="" title="" />
            <div class="slid_text">
              <h3 class="slid_title"><span>读书使人心明眼亮。</span></h3>
              <p><span> —— 伏尔泰</span></p>
            </div>
          </div>

          <div id="slide3">
            <img src="img/content/slide3.jpeg" alt="" title="" />
            <div class="slid_text">
              <h3 class="slid_title"><span>鸟欲高飞先振翅，人求上进先读书</span></h3>
              <p><span> —— 李苦禅</span></p>
            </div>
          </div>
        </div><!-- .slider -->
        <div id="myController">
          <div class="control"><span>1</span></div>
          <div class="control"><span>2</span></div>
          <div class="control"><span>3</span></div>
        </div>


    </div><!-- .grid_12 -->
  </div><!-- .container_12 -->
  <div class="copyrights">Collect from <a href="http://www.cssmoban.com/"  title="网站模板">网站模板</a></div>
  <div class="clear"></div>

  <section id="main" class="home">
    <div class="container_12">
      <div id="top_button">
       
        <div class="clear"></div>
      </div><!-- #top_button -->

      <div class="clear"></div>

      <div class="carousel">
        <div class="c_header">
          <div class="grid_10">
            <h2>程序员畅销书籍</h2>
          </div><!-- .grid_10 -->

          <div class="grid_2">
            <a id="next_c1" class="next arows" href="#"><span>Next</span></a>
            <a id="prev_c1" class="prev arows" href="#"><span>Prev</span></a>
           </div><!-- .grid_2 -->
        </div><!-- .c_header -->

        <div class="list_carousel">

        <ul id="list_product" class="list_product">
          <li class="">
            <div class="grid_3 product">
              <div class="prev">
                <a href="product_page.html"><img src="img/s5.jpg" alt="" title="" /></a>
              </div><!-- .prev -->
              <h3 class="title">Febreze Air Effects New Zealand Springs</h3>
              <div class="cart">
                <div class="price">
                <div class="vert">
                  <div class="price_new">$550.00</div>
                  <div class="price_old">$725.00</div>
                </div>
                </div>
                <a href="#" class="obn"></a>
                <a href="#" class="like"></a>
                <a href="#" class="bay"></a>
              </div><!-- .cart -->
            </div><!-- .grid_3 -->
          </li>

          <li class="">
            <div class="grid_3 product">
              <div class="prev">
                <a href="product_page.html"><img src="img/s4.jpg" alt="" title="" /></a>
              </div><!-- .prev -->
              <h3 class="title">Febreze Air Effects New Zealand Springs</h3>
              <div class="cart">
                <div class="price">
                <div class="vert">
                  <div class="price_new">$550.00</div>
                  <div class="price_old">$725.00</div>
                </div>
                </div>
                <a href="#" class="obn"></a>
                <a href="#" class="like"></a>
                <a href="#" class="bay"></a>
              </div><!-- .cart -->
            </div><!-- .grid_3 -->
          </li>

          <li class="">
            <div class="grid_3 product">
              <div class="prev">
                <a href="product_page.html"><img src="img/s3.jpg" alt="" title="" /></a>
              </div><!-- .prev -->
              <h3 class="title">Febreze Air Effects New Zealand Springs</h3>
              <div class="cart">
                <div class="price">
                <div class="vert">
                  <div class="price_new">$550.00</div>
                </div>
                </div>
                <a href="#" class="obn"></a>
                <a href="#" class="like"></a>
                <a href="#" class="bay"></a>
              </div><!-- .cart -->
            </div><!-- .grid_3 -->
          </li>

          <li class="">
            <div class="grid_3 product">
              <div class="prev">
                <a href="product_page.html"><img src="img/s6.jpg" alt="" title="" /></a>
              </div><!-- .prev -->
              <h3 class="title">Febreze Air Effects New Zealand Springs</h3>
              <div class="cart">
                <div class="price">
                <div class="vert">
                  <div class="price_new">$550.00</div>
                  <div class="price_old">$725.00</div>
                </div>
                </div>
                <a href="#" class="obn"></a>
                <a href="#" class="like"></a>
                <a href="#" class="bay"></a>
              </div><!-- .cart -->
            </div><!-- .grid_3 -->
          </li>

          <li class="">
            <div class="grid_3 product">
              <div class="prev">
                <a href="product_page.html"><img src="img/s7.jpg" alt="" title="" /></a>
              </div><!-- .prev -->
              <h3 class="title">Febreze Air Effects New Zealand Springs</h3>
              <div class="cart">
                <div class="price">
                <div class="vert">
                  <div class="price_new">$550.00</div>
                  <div class="price_old">$725.00</div>
                </div>
                </div>
                <a href="#" class="obn"></a>
                <a href="#" class="like"></a>
                <a href="#" class="bay"></a>
              </div><!-- .cart -->
            </div><!-- .grid_3 -->
          </li>

        </ul><!-- #list_product -->
        </div><!-- .list_carousel -->
      </div><!-- .carousel -->

      <div class="carousel">
        <div class="c_header">
          <div class="grid_10">
            <h2>生活用书</h2>
          </div><!-- .grid_10 -->

          <div class="grid_2">
            <a id="next_c2" class="next arows" href="#"><span>Next</span></a>
            <a id="prev_c2" class="prev arows" href="#"><span>Prev</span></a>
          </div><!-- .grid_2 -->
        </div><!-- .c_header -->

        <div class="list_carousel">
        <ul id="list_product2" class="list_product">
          <li class="">
            <div class="grid_3 product">
              <img class="sale" src="img/sale.png" alt="Sale"/>
              <div class="prev">
                <a href="product_page.html"><img src="img/s8.jpg" alt="" title="" /></a>
              </div><!-- .prev -->
              <h3 class="title">Febreze Air Effects New Zealand Springs</h3>
              <div class="cart">
                <div class="price">
                <div class="vert">
                  <div class="price_new">$550.00</div>
                  <div class="price_old">$725.00</div>
                </div>
                </div>
                <a href="#" class="obn"></a>
                <a href="#" class="like"></a>
                <a href="#" class="bay"></a>
              </div><!-- .cart -->
            </div><!-- .grid_3 -->
          </li>

          <li class="">
            <div class="grid_3 product">
              <img class="sale" src="img/" alt="Sale"/>
              <div class="prev">
                <a href="product_page.html"><img src="img/s9.jpg" alt="" title="" /></a>
              </div><!-- .prev -->
              <h3 class="title">Febreze Air Effects New Zealand Springs</h3>
              <div class="cart">
                <div class="price">
                <div class="vert">
                  <div class="price_new">$550.00</div>
                  <div class="price_old">$725.00</div>
                </div>
                </div>
                <a href="#" class="obn"></a>
                <a href="#" class="like"></a>
                <a href="#" class="bay"></a>
              </div><!-- .cart -->
            </div><!-- .grid_3 -->
          </li>

          <li class="">
            <div class="grid_3 product">
              <div class="prev">
                <a href="product_page.html"><img src="img/t2.jpg" alt="" title="" /></a>
              </div><!-- .prev -->
              <h3 class="title">Febreze Air Effects New Zealand Springs</h3>
              <div class="cart">
                <div class="price">
                <div class="vert">
                  <div class="price_new">$550.00</div>
                </div>
                </div>
                <a href="#" class="obn"></a>
                <a href="#" class="like"></a>
                <a href="#" class="bay"></a>
              </div><!-- .cart -->
            </div><!-- .grid_3 -->
          </li>

          <li class="">
            <div class="grid_3 product">
              <img class="sale" src="images/sale.png" alt="Sale"/>
              <div class="prev">
                <a href="product_page.html"><img src="img/t3.jpg" alt="" title="" /></a>
              </div><!-- .prev -->
              <h3 class="title">Febreze Air Effects New Zealand Springs</h3>
              <div class="cart">
                <div class="price">
                <div class="vert">
                  <div class="price_new">$550.00</div>
                  <div class="price_old">$725.00</div>
                </div>
                </div>
                <a href="#" class="obn"></a>
                <a href="#" class="like"></a>
                <a href="#" class="bay"></a>
              </div><!-- .cart -->
            </div><!-- .grid_3 -->
          </li>

          <li class="">
            <div class="grid_3 product">
              <div class="prev">
                <a href="product_page.html"><img src="img/t4.jpg" alt="" title="" /></a>
              </div><!-- .prev -->
              <h3 class="title">Febreze Air Effects New Zealand Springs</h3>
              <div class="cart">
                <div class="price">
                <div class="vert">
                  <div class="price_new">$550.00</div>
                  <div class="price_old">$725.00</div>
                </div>
                </div>
                <a href="#" class="obn"></a>
                <a href="#" class="like"></a>
                <a href="#" class="bay"></a>
              </div><!-- .cart -->
            </div><!-- .grid_3 -->
          </li>

        </ul><!-- #list_product2 -->
        </div><!-- .list_carousel -->
      </div><!-- .carousel -->

      
      <div class="clear"></div>

    </div><!-- .container_12 -->
  </section><!-- #main -->

  <div class="clear"></div>

  <footer>
    <div class="f_navigation">
      <div class="container_12">
        <div class="grid_3">
          <h3>联系我们</h3>
          <ul class="f_contact">
            <li>湖南长沙,中软国际有限公司</li>
            <li>8888888+88888</li>
            <li>112234455@163.com</li>
          </ul><!-- .f_contact -->
        </div><!-- .grid_3 -->

        <div class="grid_3">
          <h3>信息</h3>
          <nav class="f_menu">
            <ul>
              <li><a href="#">关于我们</a></li>
              <li><a href="#">隐私相关</a></li>
            </ul>
          </nav><!-- .private -->
        </div><!-- .grid_3 -->
        <div class="grid_3">
          <h3>账户管理</h3>
          <nav class="f_menu">
            <ul>
              <li><a href="#">我的账户</a></li>
              <li><a href="#">订单记录</a></li>
              <li><a href="#">喜欢的订单</a></li>
              <li><a href="#">时事通讯记录</a></li>
            </ul>
          </nav><!-- .private -->
        </div><!-- .grid_3 -->

        <div class="clear"></div>
      </div><!-- .container_12 -->
    </div><!-- .f_navigation -->
  </footer>

</body>
<!-- Added by HTTrack --><meta http-equiv="content-type" content="text/html;charset=utf-8" /><!-- /Added by HTTrack -->
</html>
