# Java Configuration
* Instead of configuring Spring container using XML.
* Configure Spring container using Java Code.

## Java Configuration Class
```
@Configuration
@ComponentScan("com.learning.springpractice")
public class SportConfig {

}
```
## Development Process
1. Create a Java class and annotate as @Configuration.
2. Add component scanning support: 
@ComponentScan. (optional)
3. Read Spring Java configuration class.
4. Retrieve bean from Spring container.