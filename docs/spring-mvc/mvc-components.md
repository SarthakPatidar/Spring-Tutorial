# Spring MVC Architecture

## Front Controller
* Front Controller is known as DispatcherServlet
    * Part of Spring Framework
    * Already developed by Spring Dev Team.

* We need to create 
    * Model Objects (contains data)
    * View Templates (JSP or view page)
    * Controller Classes (Business Logic)

## Controller
* Created by developer
* Contains the business logic
    * Handle the request.
    * Store/retrieve the data (db, web service...)
    * Place data in model.
* Send to appropriate view template

## Model 
* Contains your data
* Store/retrieve the data via backend systems
    * database, web service, etc...
    * Use a spring bean
* Place your data in model
    * Data can be any Java object/collection

## View Template
* Spring MVC is very flexible
    * Supports many view templates
* Most common is JSP + JSTL
* Developer creates page
    * Displays data
* Supported Templates
    * Thymeleaf, Groovy
    * Velocity, Freemarker etc.
