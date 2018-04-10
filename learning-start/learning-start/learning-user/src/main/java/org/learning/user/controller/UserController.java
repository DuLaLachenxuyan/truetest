package org.learning.user.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.learning.user.service.api.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.learning.entry.entry.User;

@RestController
public class UserController {
	@Autowired
	private UserService userService;

	@Autowired
	RestTemplate restTemplate;

	@RequestMapping(value = "findUserById", method = RequestMethod.GET)
	public User findObjectById(@RequestParam(value = "userId", required = true) String id) {
		User user = userService.findObjectById(id);
		return user;
	}

	@RequestMapping(value = "insertUser", method = RequestMethod.POST)
	public void insertObject(User user) {
		userService.insertObject(user);
	}

	@RequestMapping(value = "updateUser", method = RequestMethod.PUT)
	public void updateObject(User user) {
		userService.updateObject(user);
	}

	@RequestMapping(value = "updateUserById", method = RequestMethod.DELETE)
	public void deleteObjectById(@RequestParam(value = "userId", required = true) String id) {
		userService.deleteObject(id);
	}

	@RequestMapping(value = "/findDetailsByUserId", method = RequestMethod.GET)
	public String findDetailsByUserId() {
		/*
		 * Map<String, Object> map = new HashMap<>(); map.put("id", 1);
		 */
		return restTemplate.getForEntity("http://prod-server/findDetails", String.class).getBody();
	}
}
