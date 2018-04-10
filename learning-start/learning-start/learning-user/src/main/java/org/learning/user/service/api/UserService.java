package org.learning.user.service.api;

import com.learning.entry.entry.Details;
import com.learning.entry.entry.User;

public interface UserService {
	User findObjectById(String partnerId);
	void insertObject(User user);
	void updateObject(User user);
	void deleteObject(String partnerId);
	
	Details  findPord();
}
