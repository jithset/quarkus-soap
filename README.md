# Sample Application Using SOAP Webservices

Sample Quarkus Application using [quarkus-cxf](https://github.com/quarkiverse/quarkus-cxf) Extension.
SEI are generated using [wsimport](https://docs.oracle.com/javase/8/docs/technotes/tools/unix/wsimport.html) 

[Swagger UI](http://localhost:8080/q/swagger-ui)

## Generating Service Endpoint Interface (SEI)

```java
wsimport <wsdl file or url> -keep -d <folder_path>
wsimport test.wsdl -keep -d wsdl_test
```

## Sample Soap EndPoint Used

Public SOAP APIs - Postman [link](https://documenter.getpostman.com/view/8854915/Szf26WHn?version=latest)