name: Person
type: Person
description: Someone has to do the work.
__proto:
    package: person
    targetfile: person.proto
    imports: []
    options:
        go_package: github.com/theNorstroem/todo-specs/dist/pb/person;personpb
        java_multiple_files: "true"
        java_outer_classname: PersonProto
        java_package: com.furo.baseperson
fields:
    id:
        type: string
        description: id (is a ULID). We do not use the email, they change sometimes.
        __proto:
            number: 1
            oneof: ""
        __ui: null
        meta:
            default: ""
            hint: ""
            label: person.Person.id.label
            options:
                flags: []
                list: []
            readonly: true
            repeated: false
            typespecific: null
        constraints: {}
    display_name:
        type: string
        description: We use this field label the person, using last_name and first_name is so 2008
        __proto:
            number: 2
            oneof: ""
        __ui: null
        meta:
            default: ""
            hint: ""
            label: person.Person.display_name.label
            options:
                flags: []
                list: []
            readonly: false
            repeated: false
            typespecific: null
        constraints:
            required:
                is: "true"
                message: display_name is required
    note:
        type: string
        description: Add some notes, limited to 140 chars
        __proto:
            number: 3
            oneof: ""
        __ui: null
        meta:
            default: ""
            hint: ""
            label: person.Person.note.label
            options:
                flags: []
                list: []
            readonly: false
            repeated: false
            typespecific: null
        constraints: {}
    email:
        type: string
        description: We should be able to contact someone.
        __proto:
            number: 4
            oneof: ""
        __ui: null
        meta:
            default: ""
            hint: ""
            label: person.Person.email.label
            options:
                flags: []
                list: []
            readonly: false
            repeated: false
            typespecific: null
        constraints: {}
    mobile:
        type: string
        description: We should be able to talk with someone.
        __proto:
            number: 5
            oneof: ""
        __ui: null
        meta:
            default: ""
            hint: ""
            label: person.Person.mobile.label
            options:
                flags: []
                list: []
            readonly: false
            repeated: false
            typespecific: null
        constraints: {}
