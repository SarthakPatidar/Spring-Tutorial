# Bean Scopes
* Scope refers to lifecycle of the bean.
* How long does the bean live ? 
* How many instances are created ? 
* How is the bean shared ?

## Specifying scope explicitly
```
    <bean id="" class="" scope="singleton">
    .. 
    </bean>
```

## Singleton 
* Defualt Scope
* Spring container creates only one instance of bean, by default.
* It is cached in memory.
* All the requests for bean will return the shared reference to the same bean.

| Scopes | Description |
|------------|:-------------|
| Singleton | Creates shared instance of the bean. Default bean. |
| Prototype | Creates a new bean instance for each container request. |
| request | Scoped to an HTTP web request. Only used for web apps. |
| session | Scoped to an HTTP web session. Only used for web apps. |
| global-session | Scoped to an global HTTP web session. Used only for web apps. |

