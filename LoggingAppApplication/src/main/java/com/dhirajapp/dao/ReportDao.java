package com.dhirajapp.dao;

public class ReportDao {
	
	public String getName(Integer id) {
		String name = null;
		if (id == 101) {
			name = "Dhiraj";
		} else if (id == 102) {
			name = "yasika";
		} else {
			name = "Invalid Id";
		}
	
		return name;
	}


}