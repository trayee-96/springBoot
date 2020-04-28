package com.cognizant.truyum.service;

import java.util.Date;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.truyum.dao.MenuItemDao;
import com.cognizant.truyum.model.MenuItem;
import com.cognizant.truyum.repository.MenuItemRepository;

@Service("menuItemService")
public class MenuItemService {
	@Autowired
	MenuItemDao menuItemDao;
	@Autowired
	MenuItemRepository menuItemRepository;
	
	public void setMenuItemDao(MenuItemDao menuItemdao) {
		this.menuItemDao=menuItemdao;
	}
	@Transactional
	public List<MenuItem> getMenuItemListAdmin(){
		//return menuItemDao.getMenuItemListAdmin();
		return menuItemRepository.findAll();
	}
	@Transactional
	public List<MenuItem> getMenuItemListCustomer(){
		//return menuItemDao.getMenuItemListCustomer();
		Date d = new Date();
		System.out.println(d);
		return menuItemRepository.findByActiveAndDateOfLaunchLessThan(true, d);
	}
	@Transactional
	public MenuItem getMenuItem(long menuItemId) {
//		return menuItemDao.getMenuItem(menuItemId);
		return menuItemRepository.getOne(menuItemId);
	}
	public void modifyMenuItem(MenuItem menuItem) {
//		menuItemDao.modifyMenuItem(menuItem);
		menuItemRepository.save(menuItem);
	}
}
