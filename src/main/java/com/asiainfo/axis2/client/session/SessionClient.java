package com.asiainfo.axis2.client.session;

/**
 * @Description: TODO
 * 
 * @author       zq
 * @date         2017年5月30日  下午10:13:27
 * Copyright: 	  北京亚信智慧数据科技有限公司
 */
public class SessionClient {

	//wsdl2java.bat -uri http://localhost:8080/spring-axis2/services/loginService?wsdl -p com.asiainfo.axis2.client.session -d adb -s
	//LoginServiceStub() add _serviceClient.getOptions().setManageSession(true);
	public static void main(String[] args) throws Exception {
		
		LoginServiceStub service = new LoginServiceStub("http://localhost:8080/spring-axis2/services/loginService");
		LoginServiceStub.Login login = new LoginServiceStub.Login();
		login.setUsername("chenzq");
		login.setPassword("password");
		System.out.println(service.login(login).get_return());
		
		LoginServiceStub.GetPassword password = new LoginServiceStub.GetPassword();
		password.setUsername("chenzq");
		System.out.println(service.getPassword(password).get_return());
	}
}
