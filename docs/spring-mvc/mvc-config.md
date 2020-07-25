# MVC Configuration Process

## PART 1
Add configurations to the file WEB-INF/web.xml

1. Configure MVC Dispatcher Servlet.
2. Setup URL to Spring MVC Dispatcher Servlet.

    ```
    <web-app>
        <servlet>
            <servlet-name>dispatcher</servlet-name>
            <servlet-class>org.springframework.web.servlet.DispatcherServlet</servlet-class>

            <init-param>
                <param-name>contextConfigLocation</param-name>
                <param-value>/WEB-INF/spring-mvc-demo-servlet.xml</param-value>
            </init-param>
        </servlet>

        <servlet-mapping>
            <servlet-name>dispatcher</servlet-name>
            <url-pattern>/</url-pattern>
        </servlet-mapping>
    </web-app>
    ```

## PART 2
Add the configurations to file : WEB-INF/spring-mvc-demo-servlet.xml

3. Add support for component scanning.
    ```
    <beans>
        <!-- Add support for component scanning -->
        <context:component-scan base-package="com.learning.springpractice" />
    </beans>
    ```
4. Add support for conversion, formatting and validation.
    ```
    <mvc:annotation-driven />
    ```
5. Configure Spring MVC View Resolver.
    ```
    <bean class="org.springframework.web.servlet.view.InternalResourceViewResolver">
        <property name="prefix" value="/WEB-INF/view/" />
        <property name="suffix" value=".jsp" />
    </bean>
    ```
Spring MVC will automatically prepend the prefix and append the suffix to the view name.