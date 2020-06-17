# Bean Lifecycle

1. Container Started 
2. Bean Instantiation
3. Dependency Injection
4. Internal Spring Processing
5. Your custom init method 

Bean is Ready for Use 
to 
Container is Shutdown

Your custom destroy method -> Stop

## Bean LifeCycle Methods / Hooks
* You can add custom code during bean initialization.
1. Calling custom business logic methods.
2. Setting up handles to resources. (db, sockets, file etc)

```
<bean id="" class="" init-method="doMyStartupStuff">
```

* You can add custom code during bean destruction
1. Calling custom business logic method.
2. Clean up handles to resources. (db, sockets, file etc)

```
<bean id="" class="" destroy-method="doMyCleanupStuff">
```
## Development Process 
1. Define your methods for init and destroy.
2. Configure the method names in Spring config file.