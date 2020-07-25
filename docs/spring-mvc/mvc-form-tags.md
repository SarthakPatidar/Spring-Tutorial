# Spring MVC Form Tags
* Building blocks of a web page
* Form Tags are configurable and reusable for a web page

## Data Binding
* Spring MVC Form Tags make use of data binding
* Automatically setting / retreiving from a Java object / bean.
* Tags generate an HTML for you

    | Form Tag  | Description |
    |-----------|:------------|
    | form:form | main from container |
    | form:input | text field |
    | form:textarea | multi-line text field |
    | form:checkbox | check box |
    | form:radiobutton | radio buttons |
    | form:select   |  drop down list |


## Practice Buildup
1. Create Student class
    * firstName (String)
    * lastName (String)
    * Getters and Setter  for the above fields
2. Create Student controller class
    * Annotate the class with @Controller
    * Provide the path using @RequestMapping annotation
    * Create method to show up form with @RequestMapping path annotation.
    * return the view name
3. Create an HTML form
    * Include the taglib prefix
    ```
      <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
    ```
4. Create form processing code
5. Create confirmation page

## Implemented Form Tags
1. form:form
2. form:input
3. form:select
4. form:option / form:options
5. form:radiobutton / form:radiobuttons
6. form:checkbox / form:checkboxes