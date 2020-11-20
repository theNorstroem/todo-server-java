 ## build java class from protos
 build to get java service and entity classes
 
  ```
./gradlew build

 ```
 
 ## generate server 
 generate the server for a project
e.g. there is a specs-folder names `task` for entity `task` then run
  ```
npm run genserver task
```
Of course you can also call and use other entities in the `task` server

 ## run grpc gateway 
 
 ```
npm run gateway
```

 ## run server 
 ```
 ./gradlew runserver
```
