package com.learning.prod.service.impl;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;
import com.learning.entry.entry.Details;
import com.learning.prod.service.api.DetailsService;

@Service
public class DetailsServiceImpl implements DetailsService{
	
	@Override
	public List<Details> findDetails() {
		// TODO Auto-generated method stub
		List<Details> list = new ArrayList<>();
		return list;
	}
	@Override
	public void insertDetail(Details details) {
		// TODO Auto-generated method stub
	}
	@Override
	public void updateDetail(Details details) {
		// TODO Auto-generated method stub
	}
	@Override
	public void deleteDetailById(String comyid) {
		// TODO Auto-generated method stub
	}

}
