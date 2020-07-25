# Form Validation using Spring MVC

## Need for form validation
1. Required Fields
2. Valid numbers in the range
3. Valid format(postal-code)
4. Custom Business Rule

## Java's Standard Bean Validation API
* Java has a standard Bean Validation API
* Defines a metadata model and API for entity validation.
* Not tied to either the web tier or persistence tier.

## Spring and Validation
* Supported by version 4 or highier.
* Preffered method when building spring apps.
* Add validation JARs to our project.

## Features 
| Validation Features |
|:-------------------:|
| required            |
| valid length        |
| valid numbers       |
| validate with regular expressions |
| custom validation   |

## Valid Annotations
| Annotation | Description |
|:----------:|:-----------:|
| @NotNull | Check that annotated value is not null |
| @Min | Must be a number >= value |
| @Max | Must be a number <= value |
| @Size | Size must match the given value |
| @Pattern | Must match a regular expression pattern |
| @Future/ @Past | Date must be in future/past of given date |


