# spring-security-in-memory-users-demo

 Spring Security offers several options for configuring a user store,
including these:
  - An in-memory user store
  - JDBC-based user store
  - An LDAP-backed user store
  - custom user details service

No matter which user store you choose, you can configure it by overriding a configure()
method defined in the WebSecurityConfigurerAdapter configuration base class.

# In-memory user store
 The in-memory user store is convenient for testing purposes or for very simple
applications, but it doesn’t allow for easy editing of users. If you need to add, remove,
or change a user, you’ll have to make the necessary changes and then rebuild and
redeploy the application.

