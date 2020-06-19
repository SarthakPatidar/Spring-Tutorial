# Java Annotations
* Special labels/markers added to Java classes.
* Provides meta-data about the class
* Processed at compiled time or run-time for special processing

## Why Spring Configuration with Annotations ?
* XML configuration can be verbose.
* Configure your beans with Annotations.
* Annotations minimizes the XML configuration.

## Scanning for component classes
* Spring will scan your Java classes for special annotations.
* Automatically register the beans in the Spring container.

## Development Process
1. Enable component scanning in Spring config file.
  ```
    <beans>
        <context:component-scan base-package="com.learning.springpractice">
    </beans>
  ```

2. Add the @Component Annotation to your Java classes.
  ```
  @Component("thatSillyCoach")
  public class TrackCoach implements Coach {

  }
  ```
3. Retrieve the bean from Spring container.

<b><u>NOTE</u> : </b> Spring supports the default bean Ids

* Default Bean Id : The class name, make the first letter lower-case.

* TennisCoach (Class Name) -> tennisCoach (Bean Id)