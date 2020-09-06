# Payment_Gateway_API
Implemented API for a payment gateway

## Languages Used
Java, SpringBoot, Hibernate and MySql.


## Functional Requirements:
• The following payment type should be supported:
1. Credit Card
2. Debit Card

• All order data and response with status should be logged in an SQL
database.
• Relevant Unit Tests need to be written and should pass.


## Api can be tested using Postman.
Url used: "http://localhost:8080/card"  
Request method: POST


## request payload
{
 "amount": "100",
 “currency”: “USD”,
 “type”: “creditcard”
 "card": {
 "number": "4111111111111111",
 "expirationMonth": "2",
 "expirationYear": "2020",
 "cvv": "111"
 }
}


## response payload
{
    "amount": "100",
    "currency": "USD",
    "type": "creditcard",
    "card": {
        "number": "4111111111111111"
    },
    "status": "success",
    "authorization_code": "2u42npZDQeCm",
    "time": "2020-09-06T19:47:19.836+00:00"
}



## Instructions:
Open the zip file in Eclipse or STS and run the server. Make the database connection. Details of the database are present in "application.properties" file. Hit the api using POSTman tool(POST request) and the response will be displayed.


