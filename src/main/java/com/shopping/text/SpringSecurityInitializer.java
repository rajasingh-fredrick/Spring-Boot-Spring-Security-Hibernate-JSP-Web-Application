package com.shopping.text;

import org.springframework.security.web.context.AbstractSecurityWebApplicationInitializer;

public class SpringSecurityInitializer extends AbstractSecurityWebApplicationInitializer {
 
	public SpringSecurityInitializer() {
		super(SecurityConfiguration.class);
	}
}