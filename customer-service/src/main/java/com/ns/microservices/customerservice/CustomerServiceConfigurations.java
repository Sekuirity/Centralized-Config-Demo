package com.ns.microservices.customerservice;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@ConfigurationProperties("customer-service")
@Data
@RefreshScope
public class CustomerServiceConfigurations {
	
	private String emailtype;

	private String currentProperty;

	
	public String getCurrentProperty() {
		return currentProperty;
	}

	public void setCurrentProperty(String currentProperty) {
		this.currentProperty = currentProperty;
	}

	public String getEmailtype() {
		return emailtype;
	}

	public void setEmailtype(String emailtype) {
		this.emailtype = emailtype;
	}


}
