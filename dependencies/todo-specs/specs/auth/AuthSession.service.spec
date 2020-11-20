name: AuthSession
version: ""
description: Login with credentials. The service should set a auth cookie on successful login and delete it on logout
lifecycle: null
__proto:
    package: auth
    targetfile: authservice.proto
    imports:
        - google/api/annotations.proto
        - auth/reqmsgs.proto
        - google/protobuf/empty.proto
        - auth/auth.proto
    options:
        go_package: github.com/theNorstroem/todo-specs/dist/pb/auth;authpb
        java_multiple_files: "true"
        java_outer_classname: AuthserviceProto
        java_package: com.furo.baseauth
services:
    Create:
        description: 'Login with credentials #A login is nothing else then creating a valid session'
        data:
            request: auth.Credentials
            response: google.protobuf.Empty
            bodyfield: body
        deeplink:
            description: 'Create: POST /auth auth.Credentials , google.protobuf.Empty #Login with credentials #A login is nothing else then creating a valid session'
            href: /auth
            method: POST
            rel: create
        query: {}
        rpc_name: CreateAuthSession
    Delete:
        description: Logout.
        data:
            request: google.protobuf.Empty
            response: google.protobuf.Empty
            bodyfield: body
        deeplink:
            description: 'Delete: DELETE /auth google.protobuf.Empty , google.protobuf.Empty #Logout.'
            href: /auth
            method: DELETE
            rel: delete
        query: {}
        rpc_name: DeleteAuthSession
