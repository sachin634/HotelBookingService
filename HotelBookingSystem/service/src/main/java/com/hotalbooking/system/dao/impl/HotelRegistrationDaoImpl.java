package com.hotalbooking.system.dao.impl;

import java.util.List;

import javax.sql.DataSource;

import com.hotalbooking.system.cofiguration.DataBaseConnection;
import com.hotalbooking.system.dao.HotelRegistrationDao;
import com.hotalbooking.system.model.Hotel;

public class HotelRegistrationDaoImpl implements HotelRegistrationDao {
	static String  readAllQuery = "select * from hotel_registration";
	
	@Override
	public List<Hotel> readAll() {
		
	}

}
