# Spring_Boot2
Spring Boot Security 2.0 - Basic security project

Default Security Setup
In order to add security to our Spring Boot application, we need to add the security starter dependency:

<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-security</artifactId>
</dependency>
This will include the SecurityAutoConfiguration class – containing the initial/default security configuration.
By default, the application will get Basic Authentication enabled. There are some predefined properties, such as:
spring.security.user.name=user
spring.security.password=password
security.basic.enabled=true

Spring Boot provides a default user with a generated password. If you want to configure that single user, note that the configuration keys have moved to spring.security.user:

