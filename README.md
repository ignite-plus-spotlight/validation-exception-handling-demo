# validation-exception-handling-demo

Request / Response :

    Invalid Employee Id  : 
            Request : 
                http://localhost:8080/employee/122sam
            Response : 
                { "exceptionMessage": "Employee Id Should be Numeric", "exceptionCode": "100" }
            Status : 
                400 - Bad Request
                
                
    Employee Record Not found in Db : 
            Request : 
                http://localhost:8080/employee/1000000
            Response : 
                { "exceptionMessage": "Employee Record Not found for Id : 122", "exceptionCode": "200" }
            Status : 
                404 - Not Found
    
    Valid Employee Id : 
            Request : 
                http://localhost:8080/employee/1
            Response : 
                { "employeeId": "1", "employeeName": "SaM", "employeeEmail": "sam@gmail.com" }
            Status : 
                200 - Ok
                
## Note 

- Exception is always in the standard form. Hence it will be easy to parse by the Consumers (Here its React UI) to extract the exception
  If the exception are not in the standard form Consumer will have no clue how to parse during the negative scenario
- Success Scenario will always returns the Know Object
