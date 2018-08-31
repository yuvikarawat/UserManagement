package com.user.dao;

import java.util.ArrayList;

import com.user.service.User;
import com.user.service.Users;

public class UserDao { 
   public Users getAllUsers(){ 
      Users users = new Users();
      
      try {   	  
    	  	ArrayList<User> userList=new ArrayList<User>();
    	  	 	  	
    	  	userList.add(new User(100,"Jerry Allen Sienfeld", "Jerry","Allen","Sienfeld","JAS123","Active","Admin"));
    	  	userList.add(new User(101,"Christopher Julius Rock", "Christopher","Julius","Rock","CJR123","Active","Developer"));           
    	  	userList.add(new User(102,"Kevin Darnell Hart", "Kevin","Darnell","Hart","KDH123","Active","Developer"));
    	  	userList.add(new User(103,"Ellen Lee DeGeneres", "Ellen","Lee","DeGeneres","ELD123","Active","Project Manager"));	
    	  	users.setUsers(userList);
 
      } catch (Exception e) { 
         e.printStackTrace(); 
      }   
      return users; 
   }  
}