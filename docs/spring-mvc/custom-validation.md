# Custom Validation

## Create a custom Java Annotation from scratch
* So far, we've used pre-defined validaiton rules : @Min, @Max, ..
* eg. Custom Annotation - @CourseCode
    ```
        @CourseCode(value="LUV", message="Must start with LUV")
        private String courseCode;
    ```

### Development Process
1. Create a custom validation rule
2. Add validation rule to customer class
3. Display the message to HTML form 
4. Update the confirmation page

#### STEP 1 - Create custom validation rule
    a. Create @CourseCode annotation
    b. Create CourseCodeConstraintValidator

#### STEP 1.a -   Create @CourseCodeAnnotation 
```
// Helper class that contains business rules / validation logic
@Constraint(validatedBy = CourseCodeConstraintValidator.class)

// Can apply annotation to method or field
@Target({ ElementType.METHOD, ElementType.FIELD })

// Retain this annotation in Java class file
@Retention(RetentionPolicy.RUNTIME)
public @interface CourseCode {
    private String value() default "LUV"
    private String message() default "must start with LUV"
}
``` 

#### STEP 1.b -   Create @CourseCodeAnnotation
```
public class CourseCodeConstraintValidator 
    implements ConstraintValidator<CourseCode, String> () {

    private String coursePrefix;

    @Override
    public void initialize(CourseCode theCourseCode) {
        coursePrefix = theCourseCode.value();
    }

    @Override
    public boolean isValid(String code, ConstraintValidatorContext theConstraintValidatorContext) {
        boolean result;

        if(theCode != null)
            result = theCode.startsWith(coursePrefix);
        else
            result = true;
        
        return result;
    }
}
```