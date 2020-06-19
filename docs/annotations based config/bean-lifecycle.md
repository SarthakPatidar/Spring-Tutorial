# Annotation based Bean LifeCycle
## Development Process
* Define your methods for init and destroy
* Add annotations : @PostConstruct and @PreDestroy

### Init: method configuration
```
@Component
public class TennisCoach implements Coach {

    @PostConstruct
    public void doStartupStuff() {

    }
}
```

### Destroy: method configuration
```
@Component
public class TennisCoach implements Coach {

    @PreDestroy
    public void doCleanupStuff() {
        
    }
}
```