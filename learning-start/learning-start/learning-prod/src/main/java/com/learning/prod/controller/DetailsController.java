package com.learning.prod.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.learning.entry.entry.Details;
import com.learning.prod.service.api.DetailsService;

@RestController
public class DetailsController {

	@Autowired
	private DetailsService service;

	// 查找所有商品信息
	@RequestMapping(value = "/findDetails", method = RequestMethod.GET)
	public List<String> findDetails() {
		List<String> list = new ArrayList<>();
		list.add("啦啦啦");
		list.add("呃呃呃");
		return list;
	}

	// 插入一个商品信息
	@RequestMapping(value = "/insertDetail", method = RequestMethod.POST)
	public void insertDetail(Details details) {
		service.insertDetail(details);
	}

	// 修改一个商品信息
	@RequestMapping(value = "updateDetail", method = RequestMethod.PUT)
	public void updateDetail(Details details) {
		service.updateDetail(details);
	}

	// 根据商品id删除一个商品信息
	@RequestMapping(value = "deleteDetail", method = RequestMethod.DELETE)
	public void deleteDetail(String comyid) {
		service.deleteDetailById(comyid);
	}

}
