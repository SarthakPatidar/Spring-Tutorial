# Inversion of Control (IOC)
* The approach of outsourcing the creation and management of the objects.
* Outsource to an object Factory

## Spring Container 
### Primary Functions
* Create and manage objects (Inversion Of Control)
* Inject object's dependencies (Dependency Injection)

## Spring Development Process
### Configure your beans
```
<beans ..>
    <bean id="myCoach" class="com.learning.springpractice.BaseballCoach">
</beans>
```
id : alias
class : fully qualified class name of implementation class.

### Create a spring container
Spring container is generally known as ApplicationContext
Specialized Implementations
* ClassPathXmlApplicationContext
* AnnotationConfigApplicationContext
* GenericWebApplicationContext

```
ClassPathXmlApplicationContext context = 
    new ClassPathXmlApplicationContext("applicationContext.xml");
```

### Retrieve Beans from Spring Container
```
Coach theCoach = context.getBean("myCoach", Coach.class);
```
