# Range Validation of Integer
* @Min (value=1, message="Minimum value of 1 is required")
* @Max (value=10, message="Maximum value can be 10")
* <b>NOTE</b> - Refactoring needs to be done from int to Integer for @NotNull

* But on given String input to Integer field a custom message has to be returned.

## Development Process for Custom messages
1. Create custom error message
    * src/resources/messages.properties
2. Load custom messages resource in Spring config file
    * WebContent/WEB-INF/spring-mvc-demo-servlet.xml
3. Contents of messages.properties
    ```
        typeMismatch.customer.freePasses=Invalid Number
    ```
    * Error type => typeMismatch
    * Attribute name => customer
    * Field Name => freePasses
    * Custom Error Message => Invalid Number

4. Load a custom error message
    ```
    <!--  Load custom message resource -->
    <bean id="messageSource" 
        class="org.springframework.context.support.ResourceBundleMessageSource">
        <property name="basenames" value="resources/messages" />
    </bean>
    ```
