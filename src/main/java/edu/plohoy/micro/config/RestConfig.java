package edu.plohoy.micro.config;

import org.springframework.context.annotation.Configuration;

@Configuration
public class RestConfig {
    private static final int CONNECTION_TIMEOUT_MS = 3000;
    private static final int READ_TIMEOUT_MS = 15000;
    private static final int MAX_CONN_TOTAL = 50;
    private static final int MAX_CONN_PER_ROUTE = 30;
}
