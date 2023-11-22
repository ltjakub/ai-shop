## ShopAI - backend
### Endpoints:
#### Secured Endpoints:
##### register
```
POST http://localhost:8080/api/v1/auth/register
```
Sample Body:
```
{
    "firstname": "malibu",
    "lastname": "barbie",
    "email":"malibu@barbie.com",
    "password": "123"    
}
```
##### login
```
POST http://localhost:8080/api/v1/auth/authenticate
```
Default admin:
```
{
"email":"admin@example.com",
"password": "admin"    
}
```
##### add product
```
POST http://localhost:8080/api/v1/product
```
Sample body (form with picture):
```
{
**IMAGE IN FORM AS JPG or something**
"name" : "name",
"description" : "description",
"category" : "category",
"style" : "style",
"color" : "color",
"price" : "price"
}
```

#### Not secured endpoints
##### get all products
```
GET http://localhost:8080/api/v1/product
```

##### get product by id
```
GET http://localhost:8080/api/v1/product/{product-id}
```

It returns image as byte array so you have to convert it somehow on front end to image XD I don't know how to solve it better