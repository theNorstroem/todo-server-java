 # Server for Todo Sample App
 
 this is an example backend server for the demonstration of how to use the generated gRPC stubs.
 There are only a few of implementations with **mock** data in this sample server. 
 
- the specs and protos which come from the [spec project](https://github.com/theNorstroem/todo-specs) are 
copied in the dependencies/todo-specs folder. You may replace them with you spec repo in your project.
- the stubs of gRPC will be generated from protos. those generated java classes will be located in 
'/dependencies/generated' folder
- todo server should implement the generated gRPC service classes and register those services. 
 
 ## build java class from protos
  
  ```
./gradlew build
 ```
the grpc classes will be generated by building 

 ## run todo server 
 ```
 ./gradlew runserver
```
 this server run on port 7777
 
 ## run gRPC Gateway of the todo project
  
  run you gRPC Gateway from the [spec project](https://github.com/theNorstroem/todo-specs)
  ```
go run pkg/grpc-gateway/cmd/cmd.go
 ```
please be aware the port's config in please be aware in it's pkg/grpc-gateway/cmd.

```
backendAddr := ":7777" // The grpc server addr
exposedArr := ":7001"  // The addr of the exposed api
```
after starting the gRPC Gateway you can test the bff:  e.g. http://localhost:7001/tasks

 ## run client server of todo project
 
   run you client from the [client project](https://github.com/theNorstroem/todo-client)
   ```
npm run start
  ```
after starting the client server. you can test the hole chain: e.g. http://localhost:8080

## Overview


```

    :8080
   +-------------------------+
   |                         |
   |       todo-client       |  <-----------------+
   |       (webserver)       |                    |
   +-------------------------+                    |
                |                         +----------------+
                |                         |   todo-specs   |
    :7001       v                         |   ----------   |
   +-------------------------+            +----------------+
   |                         |                    |    
   |       grpc gateway      |  <-----------------+     
   |                         |                    |      
   +-------------------------+                    |     You are here.
                |                                 |      /
    :7777       v                                 |     /
   +-------------------------+                    |   /
   |                         |                    |
   |       todo-server       |  <-----------------+
   |                         |
   +-------------------------+



```




