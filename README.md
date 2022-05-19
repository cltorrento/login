# Login Registration Backend
Login Registration Backend with Spring Boot.

Setting: 
Spring Boot,
Spring Security,
Java Mail,
Email verification with expiry,
Spring Boot

#Email Server
https://github.com/maildev/maildev
yo lo use de esta forma: docker run -p 1080:1080 -p 1025:1025 maildev/maildev

#Generate Token
With POST
http://localhost:8081/api/v1/customer/
Postman Conf(Body, raw, JSON)
{
"firstName":"David",
"lastName": "Jones",
"email": "djones33@itech.com",
"password": "tilin"
}



#Confirm Token
With GET
http://localhost:8081/api/v1/customer/confirm?token=c45a0d4f-ab04-476d-a0c9-de0f42a11010
