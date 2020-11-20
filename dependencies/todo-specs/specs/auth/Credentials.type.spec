name: Credentials
type: Credentials
description: Credentials type for login.
__proto:
    package: auth
    targetfile: auth.proto
    imports: []
    options:
        go_package: github.com/theNorstroem/todo-specs/dist/pb/auth;authpb
        java_multiple_files: "true"
        java_outer_classname: AuthProto
        java_package: com.furo.baseauth
fields:
    password:
        type: string
        description: The password.
        __proto:
            number: 1
            oneof: ""
        __ui: null
        meta:
            default: ""
            hint: ""
            label: auth.Credentials.password.label
            options:
                flags: []
                list: []
            readonly: false
            repeated: false
            typespecific: null
        constraints:
            required:
                is: "true"
                message: password is required
    username:
        type: string
        description: The username or email, or something to identify.
        __proto:
            number: 2
            oneof: ""
        __ui: null
        meta:
            default: ""
            hint: ""
            label: auth.Credentials.username.label
            options:
                flags: []
                list: []
            readonly: false
            repeated: false
            typespecific: null
        constraints:
            required:
                is: "true"
                message: username is required
