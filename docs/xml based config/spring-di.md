# Dependency Injection
Outsource the construction and injection of the object to an external entity

## Injection Types
* Constructor Injection
* Setter Injection

## Development Process
1. Constructor Injection
* Define dependency interface and it's class.
* Create a constructor in your class for injections.
* Config the dependency injection in Spring config file.

2. Setter Injection
Inject dependencies by calling setter method of class
* Create a setter method in class for injections.
* Configure dependency injection in Spring config file.

3. Injecting Literal values
* Create setter method(s) in your class for application.
* Configure the injection in Spring config file.

4. Injecting values from properties file
* Create properties file.
* Load the properties file into the Spring config file.
* Reference values from properties file.

```
<context:property-placeholder location="sport.properties" />
```