package model.test.login;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.Test;

import datamodel.User;
import model.login.Login;

public class LoginTest {

	Login l;

	public LoginTest() {
		l = new Login();
	}

	@Test
	public void シンプルテスト(){
		User u = l.login("12345@asojuku.ac.jp", "test");
		assertThat(u.islogin, is(true));
	}

}
