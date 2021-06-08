package com.personal.service;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.personal.dao.LocationDao;

@Service
public class LocationService {

	@Autowired
	LocationDao locationDao;
	
	public List<HashMap<String, Object>> findAllMTJ() {
		return locationDao.findAllMTJ();
	}
}
