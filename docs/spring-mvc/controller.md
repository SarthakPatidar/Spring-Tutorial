# Controller

## Development Process
1. Create Controller class
2. Define Controller method
3. Add request mapping to Controller method.
4. Return View Name
5. Develop View Page

### STEP 1 - Create Component Class
* Annotate the class with @Controller
* @Controller inherits from @Component ... supports scanning

```
@Controller
public class HomeController {

}
```

### STEP 2 - Define controller method
```
@Controller
public class HomeController {

    public String showMyPage() {
        
    }
}
```

### STEP 3 - Add request mapping
```
@Controller
public class HomeController {

    @RequestMapping("/")
    public String showMyPage() {
        
    }
}
```

### STEP 4 - Return View Name
```
@Controller
public class HomeController {

    @RequestMapping("/")
    public String showMyPage() {
        return "main-menu" 
    }
}
```

### STEP 5 - Display View Page
```
<html>
    <body>
        <h2> Spring MVC Demo - Home Page </h2>
    </body>
</html>
```