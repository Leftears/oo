<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE HTML>
<html>
<!-- Added by HTTrack --><meta http-equiv="content-type" content="text/html;charset=utf-8" /><!-- /Added by HTTrack -->
<head>
  <meta charset="UTF-8">

  <meta name="description" content="">
  <meta name="keywords" content="">

  <title>Shoping cart</title>

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
          欢迎光临DuangDuang网，请<a href="login.html">登录</a> 或者 <a href="login.html">注册</a>.
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
      <div class="grid_6">
        <ul id="cart_nav">
          <li>
            <a class="cart_li" href="#">购物车 <span>￥0.00</span></a>
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
		<a href="shopping_cart.html" class="view_cart">看看购物车吧</a>
		<a href="checkout.html" class="checkout">去买单咯</a>
	      </li>
            </ul>
          </li>
        </ul>
        
        <nav class="private">
          <ul>
            <li><a href="#">我的DuangDuang</a></li>
		<li class="separator">|</li>
            <li><a href="#">我的订单</a></li>
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
            <li><a href="catalog_grid.html">电子书</a></li>
            <li><a href="catalog_grid.html">小说</a></li>
            <li><a href="catalog_grid.html">文艺</a></li>
            <li><a href="catalog_grid.html">童书</a></li>
            <li><a href="catalog_grid.html">生活</a></li>
            <li><a href="catalog_grid.html">科技</a></li>
	        <li><a href="catalog_grid.html">其他</a></li>
          </ul>
        </nav><!-- .primary -->
      </div><!-- .grid_12 -->
    </div><!-- .container_12 -->
  </div><!-- .block_nav_primary -->


  <div class="clear"></div>

  <section id="main" class="entire_width">
    <div class="container_12">
       <div class="grid_12">
       <h1 class="page_title">我的购物车</h1>

       <table class="cart_product">
       <c:forEach items="${list1}" var="book">
	      <tr>
		     <th class="images"></th>
		     <th class="bg name">书籍名称</th>
		     <th class="edit">${book.name}</th>
		     <th class="bg price">单价</th>
		     <th class="edit">${book.price}</th>
		     <th class="qty">数量</th>
		     <th class="edit">${book.buynum}</th>
		     <th class="bg subtotal">总价</th>
		     <th class="edit">${book.price}*${book.buynum}</th>
		     <th class="close"> </th>
	      </tr>
	      </c:forEach>
		  <!--
	      <tr>
		     <td class="images"><a href="product_page.html"><img src="images/product_6.png" alt="Product 6"></a></td>
		     <td class="bg name">Paddywax Fragrance Diffuser Set, Gardenia Tuberose,<br/> Jasmine, 4-Ounces</td>
		     <td class="edit"><a title="Edit" href="#">Edit</a></td>
		     <td class="bg price">$75.00</td>
		     <td class="qty"><input type="text" name="" value="" placeholder="1000" /></td>
		     <td class="bg subtotal">$750.00</td>
		     <td class="close"><a title="close" class="close" href="#"></a></td>
	      </tr>
	      <tr>
		     <td class="images"><a href="product_page.html"><img src="images/produkt_slid1.png" alt="Product Slide 1"></a></td>
		     <td class="bg name">California Scents Spillproof Organic Air Fresheners,<br/> Coronado Cherry, 1.5 Ounce Cannister</td>
		     <td class="edit"><a title="Edit" href="#">Edit</a></td>
		     <td class="bg price">$75.00</td>
		     <td class="qty"><input type="text" name="" value="" placeholder="1000" /></td>
		     <td class="bg subtotal">$750.00</td>
		     <td class="close"><a title="close" class="close" href="#"></a></td>
	      </tr>-->
	      <tr>
		     <td colspan="7" class="cart_but">
			    <button class="continue"><span>icon</span>继续购物</button>
			    <button class="update"><span>icon</span>更新购物车</button>
		     </td>
	      </tr>
       </table>
       </div><!-- .grid_12 -->

       <div id="content_bottom">
        <div class="grid_4">
          <div class="bottom_block estimate">
            <h3>运费估计</h3>
            <p>选择您的收货地址</p>
	    <form action="${pageContext.request.contextPath}/myorder_myorder.action">
	      <p>
		     <strong>省或者直辖市:</strong><sup class="surely">*</sup><br/>
		     <select>
			    <option>北京市</option>
				<option>天津市</option> 
				<option>上海市</option>
				<option>重庆市</option> 
				<option>河北省</option> 
				<option>河南省</option> 
				<option>云南省</option> 
				<option>辽宁省</option> 
				<option>黑龙江省</option> 
				<option>湖南省</option> 
				<option>安徽省</option> 
				<option>山东省</option> 
				<option>新疆维吾尔</option> 
				<option>江苏省</option> 
				<option>浙江省</option> 
				<option>江西省</option> 
				<option>湖北省</option> 
				<option>广西省</option> 
				<option>甘肃省</option> 
				<option>山西省</option> 
				<option>内蒙古</option> 
				<option>陕西省</option> 
				<option>吉林省</option> 
				<option>福建省</option> 
				<option>贵州省</option> 
				<option>广东省</option> 
				<option>青海省</option> 
				<option>西藏省</option> 
				<option>四川省</option>
				<option>宁夏省</option> 
				<option>海南省</option>
				<option>台湾省</option>
				<option>香港特别行政区</option>
				<option>澳门特别行政区</option>
		     </select>
	      </p>
	      <p>
		     <strong>市</strong><br/>
		     <select>
			    <option>Please select region, state or province</option>
			    <option>Please select region, state or province</option>
		     </select>
	      </p>
	      <p>
		     <strong></strong><br/>
		     <input type="text" name="addr" value="" />
	      </p>
	        <div class="grid_4">
          <div class="bottom_block total">
	      <table class="subtotal">
		     <tr class="grand_total">
			    <td>总价</td><td class="price">${totalprice}</td>
		     </tr>
	      </table>
	   <a href=""><button class="checkout">确认支付</button></a> 
          </div><!-- .total -->
        </div><!-- .grid_4 -->
	     
	    </form>

          </div><!-- .estimate -->
        </div><!-- .grid_4 -->


      

        <div class="clear"></div>
      </div><!-- #content_bottom -->
      <div class="clear"></div>

      <div class="clear"></div>

      <div class="carousel" id="following">
        <div class="c_header">
          <div class="grid_10">
            <h5>我们猜您还会喜欢这些</h5>
          </div><!-- .grid_10 -->

          <div class="grid_2">
            <a id="next_c1" class="next arows" href="#"><span>下一页</span></a>
            <a id="prev_c1" class="prev arows" href="#"><span>上一页</span></a>
           </div><!-- .grid_2 -->
        </div><!-- .c_header -->

        <div class="list_carousel">

        <ul id="list_product" class="list_product">
          <li class="">
            <div class="grid_3 product">
              <img class="sale" src="images/sale.png" alt="Sale"/>
              <div class="prev">
                <a href="product_page.html"><img src="images/product_1.png" alt="" title="" /></a>
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
              <img class="sale" src="images/sale.png" alt="Sale"/>
              <div class="prev">
                <a href="product_page.html"><img src="images/product_2.png" alt="" title="" /></a>
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
                <a href="product_page.html"><img src="images/product_3.png" alt="" title="" /></a>
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
                <a href="product_page.html"><img src="images/product_4.png" alt="" title="" /></a>
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
                <a href="product_page.html"><img src="images/product_5.png" alt="" title="" /></a>
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
