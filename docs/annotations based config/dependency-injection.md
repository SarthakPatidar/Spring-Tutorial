# Spring Autowiring
* For dependency injection, spring can use auto-wiring.
* Spring will look for a class that <i>matches</i> the property.
* <i>matches by type</i> : class or interface.
* Spring will inject it automatically .. hence it is autowired.

## Autowiring Injection Types
* Constructor Injection
* Setter Injection
* Field Injection

## Developement Process
### Constructor Injection
* Define the dependency interface and class.
* Create a constructor in your class for injections
* Configure the dependency injection with @Autowired Annotation.

NOTE -
* @Component on the implementation dependency class.
* @Autowired on the constructor of concrete class.

### Setter Injection
* Create setter method(s) in your class for injections
* Configure the dependency injection with @Autowired Annotation

### Field Injection
* Setting field values on class directly (even private fields)
* Accomplished by Java Reflection. 

### Qualifier Annotation
Tells Spring which implementation to pick for the injection.

```
@Autowired
@Qualifier("happyFortuneService")
private FortuneService fortuneService;
```