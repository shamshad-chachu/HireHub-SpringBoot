package com.Coorg.JobSerach;

import org.springframework.boot.web.server.WebServerFactoryCustomizer;
import org.springframework.boot.web.servlet.server.ConfigurableServletWebServerFactory;

public class ServerPortCustomizer implements WebServerFactoryCustomizer<ConfigurableServletWebServerFactory> {

	@Override
	public void customize(ConfigurableServletWebServerFactory factory) {
		// TODO Auto-generated method stub
		String port = System.getenv("X_ZOHO_CATALYST_LISTEN_PORT");
		int listenPort ;
		if(port != null && !port.isEmpty()) {
			listenPort = Integer.parseInt(System.getenv("X_ZOHO_CATALYST_LISTEN_PORT"));
		}else {
			listenPort = 8082;
		}
		factory.setPort(listenPort);
	}

}
