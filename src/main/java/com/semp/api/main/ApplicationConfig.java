package com.semp.api.main;

import org.glassfish.jersey.jackson.JacksonFeature;
import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.server.ServerProperties;

public class ApplicationConfig extends ResourceConfig {

	public ApplicationConfig() {
		packages("com.semp.api.action");
        register(JacksonFeature.class);
        property(ServerProperties.METAINF_SERVICES_LOOKUP_DISABLE, true);
	}

}
