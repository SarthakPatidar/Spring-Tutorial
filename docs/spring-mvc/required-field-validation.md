# Validating Required Field

## Development Process
1. Add validation rule to Customer class
2. Display error message on the HTML form
3. Perform validation in the controller class.
4. Update confirmation page.

### STEP 1 : Add validation rule to Customer class
```
public class Customer {
    private String firstName;

    @NotNull(message="is required")
    @Size(min=1, message="is required")
    private String lastName;
}

// getter/setter methods
```

### STEP 2 : Display error message on HTML form
```
<form:errors path="lastName" cssColor="error" />
```

### STEP 3 : Perform validation in the controller class

1. @Valid : Perform validation rules on Customer object.
2. BindingResult : Results of validation placed in BindingResult.

<b>NOTE - </b> The BindingResult parameter must appear immediately after the model attribute. 

```
@RequestMapping("/processForm") 
public String processForm ( @Valid @ModelAttribute ("customer") Customer theCustomer, BindingResult theBindingResult) {
    if(theBindingResilt.hasErrors()) {
        return "customer-form";
    }
    else {
        return "customer-confirmation";
    }
}
```

## How to deal with the whitespaces ?
### @InitBinder
* @InitBinder annotation works as a pre-processor
* It will process every web request to our controller
* Method annotated with @InitBinder is executed

```
@InitBinder
public void initBinder(WebDataBinder dataBinder) {
    StringTrimmerEditor stringTrimmerEditor = new StringTrimmerEditor();

    dataBinder.registerCustomEditor(String.class, stringTrimmerEditor);
}
```

* StringTrimmerEditor is defined in Spring API.
* It accepts true/false. If true, it trims to null
