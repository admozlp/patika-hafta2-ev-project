package org.ademozalp.config;

import org.ademozalp.service.Service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.reflect.Method;

public class ServiceFactory {
    private static final Logger log = LoggerFactory.getLogger(ServiceFactory.class);

    private ServiceFactory() {
    }

    public static Service getService(Class<Service> serviceClass) {
        try {
            Method method = serviceClass.getMethod("getInstance");
            return serviceClass.cast(method.invoke(null));
        } catch (Exception exception) {
            log.error("Failed to create object: {}", exception.getMessage());
            throw new RuntimeException("Failed to create object: " + exception.getMessage());
        }
    }
}
