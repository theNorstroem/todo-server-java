name: CreateAuthSessionRequest
type: CreateAuthSessionRequest
description: request message for CreateAuthSession
__proto:
    package: auth
    targetfile: reqmsgs.proto
    imports:
        - auth/auth.proto
    options:
        go_package: github.com/theNorstroem/todo-specs/dist/pb/auth;authpb
        java_multiple_files: "true"
        java_outer_classname: ReqmsgsProto
        java_package: com.furo.baseauth
fields:
    body:
        type: .auth.Credentials
        description: Body with auth.Credentials
        __proto:
            number: 1
            oneof: ""
        __ui: null
        meta:
            default: ""
            hint: ""
            label: auth.CreateAuthSessionRequest.body.label
            options:
                flags: []
                list: []
            readonly: false
            repeated: false
            typespecific: null
        constraints: {}
