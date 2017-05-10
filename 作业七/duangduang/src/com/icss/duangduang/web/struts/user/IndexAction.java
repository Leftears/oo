package com.icss.duangduang.web.struts.user;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

import org.apache.struts2.ServletActionContext;

import com.icss.duangduang.dao.BookDao;
import com.icss.duangduang.dao.OrderDao;
import com.icss.duangduang.dao.OrderTSDao;
import com.icss.duangduang.dao.UserDao;
import com.icss.duangduang.dao.impl.BookDaoImpl;
import com.icss.duangduang.dao.impl.OrderDaoImpl;
import com.icss.duangduang.dao.impl.OrderTSDaoImpl;
import com.icss.duangduang.dao.impl.UserDaoImpl;
import com.icss.duangduang.domain.Book;
import com.icss.duangduang.domain.Order;
import com.icss.duangduang.domain.OrderTS;
import com.icss.duangduang.domain.User;
import com.icss.duangduang.service.UserService;
import com.icss.duangduang.service.impl.UserServiceImpl;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class IndexAction extends ActionSupport{
	private String account;
	private String password;
	private String password0;
	private String name;
	private String gender;
	private Date birthday;
	private String mail;
	private User user;
	private User user1;
	private UserService userService=new UserServiceImpl();
	private UserDao userDao=new UserDaoImpl();
	private BookDao bookDao=new BookDaoImpl();
	private Integer bookid;
	private Double totalprice=0.00;
	List<Book> list1=new ArrayList<Book>();
	 Book book=new Book();
	 Book book1=new Book();
	 Book book2=new Book();
	 Order order=new Order();
	OrderTS orderTS=new OrderTS();
	private OrderTSDao orderTSDao=new OrderTSDaoImpl();
	List<OrderTS> list2=new ArrayList<OrderTS>();
	List<OrderTS> list3=new ArrayList<OrderTS>();
	List<Order> list4=new ArrayList<Order>();
	List<Order> list6=new ArrayList<Order>();
	List list5=new ArrayList();
	private OrderDao orderDao=new OrderDaoImpl();
	private Integer num;
	private Integer booknum;
	private static Random randGen = null;
	private static char[] numbersAndLetters = null;
	private String addr;
	public static final String randomString(int length) {
		if (length < 1) {
		return null;
		}
		if (randGen == null) {
		randGen = new Random();
		numbersAndLetters = ("0123456789abcdefghijklmnopqrstuvwxyz" +
		"0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ").toCharArray();
		//numbersAndLetters = ("0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ").toCharArray();
		}
		char [] randBuffer = new char[length];
		for (int i=0; i<randBuffer.length; i++) {
		randBuffer[i] = numbersAndLetters[randGen.nextInt(71)];
		//randBuffer[i] = numbersAndLetters[randGen.nextInt(35)];
		}
		return new String(randBuffer);
		}
	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public UserService getUserService() {
		return userService;
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public UserDao getUserDao() {
		return userDao;
	}

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}
    
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}
    
	public String getPassword0() {
		return password0;
	}

	public void setPassword0(String password0) {
		this.password0 = password0;
	}

	public User getUser1() {
		return user1;
	}

	public void setUser1(User user1) {
		this.user1 = user1;
	}

	public BookDao getBookDao() {
		return bookDao;
	}

	public void setBookDao(BookDao bookDao) {
		this.bookDao = bookDao;
	}
	

	public Integer getBookid() {
		return bookid;
	}

	public void setBookid(Integer bookid) {
		this.bookid = bookid;
	}

	public List<Book> getList1() {
		return list1;
	}

	public void setList1(List<Book> list1) {
		this.list1 = list1;
	}
 
	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}
    
	public Book getBook1() {
		return book1;
	}

	public void setBook1(Book book1) {
		this.book1 = book1;
	}
    
	public Book getBook2() {
		return book2;
	}

	public void setBook2(Book book2) {
		this.book2 = book2;
	}
    
	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}
	

	public OrderTS getOrderTS() {
		return orderTS;
	}

	public void setOrderTS(OrderTS orderTS) {
		this.orderTS = orderTS;
	}

	public OrderTSDao getOrderTSDao() {
		return orderTSDao;
	}

	public void setOrderTSDao(OrderTSDao orderTSDao) {
		this.orderTSDao = orderTSDao;
	}
	

	public List<OrderTS> getList2() {
		return list2;
	}

	public void setList2(List<OrderTS> list2) {
		this.list2 = list2;
	}
    
	public List<OrderTS> getList3() {
		return list3;
	}

	public void setList3(List<OrderTS> list3) {
		this.list3 = list3;
	}

	public List<Order> getList4() {
		return list4;
	}

	public void setList4(List<Order> list4) {
		this.list4 = list4;
	}

	public OrderDao getOrderDao() {
		return orderDao;
	}

	public void setOrderDao(OrderDao orderDao) {
		this.orderDao = orderDao;
	}

	public Integer getNum() {
		return num;
	}

	public void setNum(Integer num) {
		this.num = num;
	}

	public Integer getBooknum() {
		return booknum;
	}

	public void setBooknum(Integer booknum) {
		this.booknum = booknum;
	}
    
	public static Random getRandGen() {
		return randGen;
	}
	public static void setRandGen(Random randGen) {
		IndexAction.randGen = randGen;
	}
	public static char[] getNumbersAndLetters() {
		return numbersAndLetters;
	}
	public static void setNumbersAndLetters(char[] numbersAndLetters) {
		IndexAction.numbersAndLetters = numbersAndLetters;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	
	public Double getTotalprice() {
		return totalprice;
	}
	public void setTotalprice(Double totalprice) {
		this.totalprice = totalprice;
	}
	public String index() throws Exception{
		return "index_success";
	}
	
	public String beginlogin() throws Exception{
		return  "beginlogin_success";
	}
	
	public String beginregister() throws Exception{
		return "beginregister_success";
	}
	
   public String register() throws Exception{
	  return "register";
   }
   
   
   public String login() throws Exception{
	  user=this.userService.checkLogin(account, password);
		ActionContext.getContext().getSession().put("user", user);
		if(user!=null){
			 return "login_success";
		}
		if(user==null){
			return "login_error";
		}
	   return null;
  }
   
 
   public String register1() throws Exception{
	  this.userDao.addUser(user);
	  
	  return "register_success";
  }
  
 
   public String shoppingcar() throws Exception{
	  user=(User) ActionContext.getContext().getSession().get("user");
	  list2=this.orderTSDao.find("select * from d_orderts where user_account=?", new Object[]{user.getAccount()}, null);
	  for(int i=0;i<list2.size();i++){
		  orderTS=list2.get(i);
		  bookid=orderTS.getBookid();
		  book=this.bookDao.load(bookid);
		  book.setBuynum(orderTS.getNum());
		  list1.add(book);
		
		  totalprice+=(book.getPrice())*(orderTS.getNum());
		  
		  
	  }
	  return "myshoppingcar";
  }
   
  
   public String selfcenter() throws Exception{
	   user=(User) ActionContext.getContext().getSession().get("user");
	list4=this.orderDao.find("select * from d_order where user_account=?", new Object[]{user.getAccount()}, null);
	   
	  return "selfcenter";
  }
   
 
   public String pwdchange() throws Exception{
	   user= (User) ActionContext.getContext().getSession().get("user");
	   return "pwdchange";
	   
   }
   
   public String pwdchangesuccess() throws Exception{
	   user= (User) ActionContext.getContext().getSession().get("user");

	   this.userDao.updateUser(user, password);
//	 user1=(User) ActionContext.getContext().getSession().put("user1", user1);
	  
	   
	   return "pwdchange_success";
   }
	  
  
   
 
   public String selfchange() throws Exception{
	  return "selfchange";
  }
   
    public String selfchangesuccess() throws Exception{
    	user=(User) ActionContext.getContext().getSession().get("user");
    	this.userDao.updateUserinfo(user, name, gender, birthday, mail);
    	return "selfchange_success";
    }
    
    public String dealcenter() throws Exception{
    	// list4=this.orderDao.findAll();
    	return "dealcenter";
    }
    
    public String productpage() throws Exception{
       book1=this.bookDao.load(bookid);
    	return "productpage";
    }
    
    public String dcatalog() throws Exception{
    	//找到数据库中种类为电子书的书，全部放到一个List中去
    	
    	list1= this.bookDao.find("select * from d_book where type_num=?", new Object[]{"001"}, null);
    	
    	return "dcatalog";
    }
    
    public String xcatalog() throws Exception{
    	return "xcatalog";
    }
    
    public String wcatalog() throws Exception{
    	return "wcatalog";
    }
    
    public String tcatalog() throws Exception{
    	return "tcatalog";
    }
    
    public String scatalog() throws Exception{
    	return "scatalog";
    }
    
    public String kcatalog() throws Exception{
    	return "kcatalog";
    }
    
    public String qcatalog() throws Exception{
    	return "qcatalog";
    }
    
    public String shoppingcar1() throws Exception{
       user=(User) ActionContext.getContext().getSession().get("user");
       
       book2=this.bookDao.load(bookid);
       orderTS.setBookid(book2.getId());
       orderTS.setUseraccount(user.getAccount());
       orderTS.setNum(booknum);
       orderTS.setBuy(false);
       this.orderTSDao.add(orderTS);
      
 	  list2=this.orderTSDao.find("select * from d_orderts where user_account=?", new Object[]{user.getAccount()}, null);
 	  for(int i=0;i<list2.size();i++){
 		  orderTS=list2.get(i);
 		  bookid=orderTS.getBookid();
 		  book=this.bookDao.load(bookid);
 		  book.setBuynum(orderTS.getNum());
 		  list1.add(book);
 		 totalprice+=(book.getPrice())*(orderTS.getNum());
 		  
 	  }
       
    	return "shoppingcar1";
    }
    //由mainframe1界面的我的订单按钮跳转到dealcenter.jsp
    public String dealcenter1() throws Exception{
    list4=this.orderDao.find("select * from d_order where user_account=?", new Object[]{user.getAccount()}, null);
    	return "dealcenter1";
    }
    //点击确认购买转到我的订单的页面显示订单信息
    public String myorder() throws Exception{
    	user=(User) ActionContext.getContext().getSession().get("user");
    	list3=this.orderTSDao.find("select * from d_orderts where user_account=?", new Object[]{user.getAccount()}, null);
    	for(int i=0;i<list3.size();i++){
    		OrderTS orderTS=list3.get(i);
    		bookid=orderTS.getBookid();
    		book=this.bookDao.load(bookid);
    		order.setUseraccount(user.getAccount());
        	order.setBookname(book.getName());
            order.setNum(randomString(8));
            order.setTotalprice((book.getPrice())*orderTS.getNum());
            order.setStatus("交易成功");
            order.setSrc(book.getSrc());
            order.setAddr(addr);
            this.orderDao.addOrder(order);
            
           list4=this.orderDao.find("select * from d_order where user_account=?", new Object[]{user.getAccount()}, null);
        	
            totalprice+=((book.getPrice())*(orderTS.getNum()));
           
            }
    
    	
      this.orderTSDao.delete("delete from d_orderts where user_account=?", new Object[]{user.getAccount()});
    	
    	
    	return "myorder";
    }
    
    public String search() throws Exception{
    	ServletActionContext.getRequest().setCharacterEncoding("UTF-8");
    	list1=this.bookDao.find("select * from d_book where book_name=?", new Object[]{name}, null);
    	return "search";
    }
}
