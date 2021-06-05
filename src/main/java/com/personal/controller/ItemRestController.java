package com.personal.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.personal.service.ItemService;
import com.personal.vo.ItemVO;

@RestController
public class ItemRestController {

	@Autowired
	ItemService itemService;

	@PostMapping("/item")
	public void createItem(MultipartFile file, ItemVO itemVO) {
		System.out.println("[TRACE] createItem");
		byte[] fileArray = null;
		
		try {
			fileArray = file.getBytes();
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("createItem method fileArray = " + fileArray);
		}
		itemVO.setItemImg(fileArray);
		
		itemService.createItem(itemVO);
	}
}
