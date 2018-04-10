package com.learning.prod.service.api;

import java.util.List;

import com.learning.entry.entry.Details;



public interface DetailsService {
	
	List<Details> findDetails();
	void insertDetail(Details details);
	void updateDetail(Details details);
	void deleteDetailById(String comyid);
}
