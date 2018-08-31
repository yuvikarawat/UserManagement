package com.user.gateway;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;

import org.apache.logging.log4j.Logger;

import com.user.dao.Users;

public class UserManagementRestServiceGatewayImpl {
	
	/**
	 * Call UserManagementRestService.
	 * @return
	 */
  public Users callUsermanagementrestService() {
	  Users users = null;
	  try {	
		  
		Client client = ClientBuilder.newClient();
		WebTarget webTarget = client.target("http://localhost:8080/UserManagementRestSvc/rest/UserService/users");
		Invocation.Builder invocationBuilder 
		  = webTarget.request(MediaType.APPLICATION_JSON);
		javax.ws.rs.core.Response response = invocationBuilder.get();
		users = response.readEntity(Users.class);
		System.out.println("Processing completed.");
		return users;
	  } catch (Exception e) {
		e.printStackTrace();
	  }
	return users;

	}
}
