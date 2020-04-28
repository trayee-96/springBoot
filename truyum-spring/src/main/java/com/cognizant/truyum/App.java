package com.cognizant.truyum;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cognizant.truyum.model.MenuItem;
import com.cognizant.truyum.service.MenuItemService;
import com.cognizant.truyum.util.DateUtil;

/**
 * Hello world!
 *
 */
public class App {
	@Autowired
	static MenuItemService menuItemService;
	private static ApplicationContext ctx;
    public static void main( String[] args ){
    	ctx = new ClassPathXmlApplicationContext("spring-config.xml");
    	menuItemService = ctx.getBean(MenuItemService.class);
//        System.out.println(menuItemService.getMenuItemListCustomer());
//        System.out.println(menuItemService.getMenuItemListAdmin());
//    	System.out.println(menuItemService.getMenuItem(1));
    	MenuItem menuItem = new MenuItem();
//    	menuItem.setId(10);
//    	menuItem.setCategory("Main Course");
//    	menuItem.setActive(true);
//    	menuItem.setFreeDelivery(true);
//    	menuItem.setName("Ani");
//    	menuItem.setPrice(100000f);
//    	menuItem.setDateOfLaunch( DateUtil.convertToDate("06/06/1996"));
//				 
//    	menuItemService.modifyMenuItem(menuItem);
    	System.out.println(menuItemService.getMenuItem(7));
    }
}
