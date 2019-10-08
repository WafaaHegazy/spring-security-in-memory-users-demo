package com.example.security.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * @author Wafaa.Hegazy
 */
@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    /**
     * you can configure user store by overriding a configure() method defined in the WebSecurityConfigurerAdapter
     * configuration base class
     * 
     * @param auth authentication manager builder
     * @throws Exception
     */
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        /*
         * AuthenticationManagerBuilder employs a builder-style API to configure authentication details. In this case, a call to
         * the inMemoryAuthentication() method gives you an opportunity to specify user information directly in the security
         * configuration itself.
         */
        auth.inMemoryAuthentication()
                // Each call to withUser() starts the configuration for a user. The value given to withUser() is the username
                .withUser("buzz").password("{noop}infinity").authorities("ROLE_USER").and().withUser("woody").password("{noop}bullseye")
                .authorities("ROLE_USER");

        /*
         * HINT: The in-memory user store is convenient for testing purposes or for very simple applications, but it doesn’t
         * allow for easy editing of users. If you need to add, remove, or change a user, you’ll have to make the necessary
         * changes and then rebuild and redeploy the application
         */
    }
}
