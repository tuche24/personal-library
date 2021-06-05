package com.personal.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.personal.dao.ItemDao;
import com.personal.vo.ItemVO;

@Service
public class ItemService {

	@Autowired
	ItemDao itemDao;
	
	public void createItem(ItemVO itemVO) {
		itemDao.createItem(itemVO);
	}
}
