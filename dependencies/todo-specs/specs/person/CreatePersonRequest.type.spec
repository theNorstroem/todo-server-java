name: CreatePersonRequest
type: CreatePersonRequest
description: request message for CreatePerson
__proto:
    package: person
    targetfile: reqmsgs.proto
    imports:
        - person/person.proto
    options:
        go_package: github.com/theNorstroem/todo-specs/dist/pb/person;personpb
        java_multiple_files: "true"
        java_outer_classname: ReqmsgsProto
        java_package: com.furo.baseperson
fields:
    body:
        type: .person.Person
        description: Body with person.Person
        __proto:
            number: 1
            oneof: ""
        __ui: null
        meta:
            default: ""
            hint: ""
            label: person.CreatePersonRequest.body.label
            options:
                flags: []
                list: []
            readonly: false
            repeated: false
            typespecific: null
        constraints: {}
