package org.learning.user.service.impl;


import org.learning.user.service.api.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.learning.entry.entry.Details;
import com.learning.entry.entry.User;

@Service
public class UserServiceImpl implements UserService{
	@Autowired
	private RestTemplate restTemplate;
	

	@Override
	public User findObjectById(String partnerId) {
		return new User();
	}

	@Override
	public void insertObject(User user) {
		
	}

	@Override
	public void updateObject(User user) {
		
	}

	@Override
	public void deleteObject(String partnerId) {
		
	}

	/* (non-Javadoc)
	 * @see org.learning.user.service.api.UserService#findPord()
	 */
	@Override
	public Details findPord() {
		// TODO Auto-generated method stub
		
		return restTemplate.getForObject("url", Details.class);
	}

}
