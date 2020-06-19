# Java based Dependency Injection

## Development Process
1. Define method to expose bean.
2. Inject the bean dependencies.
3. Read Spring Java configuration class.
4. Retrieve bean from spring container.

## Inject values from the properties file
1. Create Properties File
2. Load properties File in Spring config.
3. Reference values from Properties File.

```
@Configuration
@PropertySource(classpath:sport.properties) 
public class SportConfig {
    
}
```