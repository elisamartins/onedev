package com.gitplex.server.web.page.admin.authenticator;

import java.io.Serializable;

import org.hibernate.validator.constraints.NotEmpty;

import com.gitplex.server.util.editable.annotation.Editable;
import com.gitplex.server.util.editable.annotation.Password;

@Editable
public class AuthenticationToken implements Serializable {

	private static final long serialVersionUID = 1L;

	private String userName;
	
	private String password;

	@Editable(order=100, description="Specify user name to authenticate with")
	@NotEmpty
	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	@Editable(order=200, description="Specify password to authenticate with")
	@Password
	@NotEmpty
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
