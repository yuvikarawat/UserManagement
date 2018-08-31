package com.user.action;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;
import com.user.dao.User;
import com.user.dao.Users;
import com.user.gateway.UserManagementRestServiceGatewayImpl;

@SuppressWarnings("serial")
public class UserManagementAction extends ActionSupport {


	private String userName;
	private List<String> userNames;
	List<User> userList;

	/**
	 * Action Method called on page Load. This makes a call to UserManagement rest Web Service.
	 * @return
	 * @throws Exceptionß
	 */
	public String execute() throws Exception {
		UserManagementRestServiceGatewayImpl userManagementRestServiceGatewayImpl = new UserManagementRestServiceGatewayImpl();
		Users users = userManagementRestServiceGatewayImpl.callUsermanagementrestService();

		// Populate userName dropdown list.
		userNames = new ArrayList<String>();
		for (User user : users.getUsers()) {
			userNames.add(user.getUserName());
		}

		// Sort the list based on user name.
		List<User> userListTemp = users.getUsers();
		if (!userListTemp.isEmpty()) {
			Collections.sort(userListTemp, new Comparator<User>() {
				@Override
				public int compare(final User object1, final User object2) {
					return object1.getUserName().compareTo(object2.getUserName());
				}
			});
		}
		this.userList = userListTemp;

		return "success";
	}

	/**
	 * Action method to filter through a list of objects based on userName.
	 * @return
	 * @throws Exception
	 */
	public String filter() throws Exception {

		
		UserManagementRestServiceGatewayImpl userManagementRestServiceGatewayImpl = new UserManagementRestServiceGatewayImpl();
		Users users = userManagementRestServiceGatewayImpl.callUsermanagementrestService();

		// Populate userName dropdown list.
		userNames = new ArrayList<String>();
		for (User user : users.getUsers()) {
			userNames.add(user.getUserName());
		}
		// Filter the list based on selected user name.
		List<User> userListTemp = new ArrayList<User>();
		if (!users.getUsers().isEmpty()) {
			for (User user : users.getUsers()) {
				if (user.getUserName().equalsIgnoreCase(userName)) {
					userListTemp.add(user);
				}
			}
		}
		this.userList = userListTemp;
		return "success";
	}


	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public List<User> getUserList() {
		return userList;
	}

	public void setUserList(List<User> userList) {
		this.userList = userList;
	}

	public List<String> getUserNames() {
		return userNames;
	}

	public void setUserNames(List<String> userNames) {
		this.userNames = userNames;
	}

}