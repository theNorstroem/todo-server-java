name: Persons
version: ""
description: |
    People / persons are important to us, they should do the work for us.
lifecycle: null
__proto:
    package: person
    targetfile: personservice.proto
    imports:
        - google/api/annotations.proto
        - person/reqmsgs.proto
        - google/protobuf/empty.proto
        - google/protobuf/field_mask.proto
        - person/person.proto
        - furo/signatures/signatures.proto
    options:
        go_package: github.com/theNorstroem/todo-specs/dist/pb/person;personpb
        java_multiple_files: "true"
        java_outer_classname: PersonserviceProto
        java_package: com.furo.baseperson
services:
    List:
        description: List persons with pagination.
        data:
            request: google.protobuf.Empty
            response: person.PersonCollection
            bodyfield: body
        deeplink:
            description: 'List: GET /persons google.protobuf.Empty , person.PersonCollection #List persons with pagination.'
            href: /persons
            method: GET
            rel: list
        query:
            q:
                constraints: {}
                description: Use this to search for a person by text.
                meta: null
                type: string
            filter:
                constraints: {}
                description: Use this field to filter the persons, this is not searching.
                meta: null
                type: string
            order_by:
                constraints: {}
                description: Use this field to specify the ordering.
                meta: null
                type: string
            page:
                constraints: {}
                description: Use this field to specify page to display.
                meta: null
                type: string
        rpc_name: ListPersons
    Get:
        description: Returns a single person.
        data:
            request: google.protobuf.Empty
            response: person.PersonEntity
            bodyfield: body
        deeplink:
            description: 'Get: GET /persons/{pn} google.protobuf.Empty , person.PersonEntity #Returns a single person.'
            href: /persons/{pn}
            method: GET
            rel: self
        query:
            pn:
                constraints: {}
                description: The query param pn stands for the id of a person.
                meta: null
                type: string
        rpc_name: GetPerson
    Create:
        description: Use this to create new persons.
        data:
            request: person.Person
            response: furo.signatures.EmptyEntity
            bodyfield: body
        deeplink:
            description: 'Create: POST /persons person.Person , furo.signatures.EmptyEntity #Use this to create new persons.'
            href: /persons
            method: POST
            rel: create
        query: {}
        rpc_name: CreatePerson
    Update:
        description: Use this to update existing persons. PATCH is also supported
        data:
            request: person.Person
            response: person.PersonEntity
            bodyfield: body
        deeplink:
            description: 'Update: PUT /persons/{pn} person.Person , person.PersonEntity #Use this to update existing persons. PATCH is also supported'
            href: /persons/{pn}
            method: PUT
            rel: update
        query:
            pn:
                constraints: {}
                description: The query param pn stands for the id of a person.
                meta: null
                type: string
            update_mask:
                constraints: {}
                description: Needed to patch a record
                meta: null
                type: google.protobuf.FieldMask
        rpc_name: UpdatePerson
    Delete:
        description: We use this to disable a person in the list, we do not delete them.
        data:
            request: google.protobuf.Empty
            response: google.protobuf.Empty
            bodyfield: body
        deeplink:
            description: 'Delete: DELETE /persons/{pn} google.protobuf.Empty , google.protobuf.Empty #We use this to disable a person in the list, we do not delete them.'
            href: /persons/{pn}
            method: DELETE
            rel: delete
        query:
            pn:
                constraints: {}
                description: The query param pn stands for the id of a person.
                meta: null
                type: string
        rpc_name: DeletePerson
    Fire:
        description: Fireing some persons can increase the performance of the other persons POST. Do not use this to much.
        data:
            request: google.protobuf.Empty
            response: google.protobuf.Empty
            bodyfield: body
        deeplink:
            description: 'Fire: POST /persons/{pn}:ferment google.protobuf.Empty , google.protobuf.Empty #Fireing some persons can increase the performance of the other persons POST. Do not use this to much.'
            href: /persons/{pn}:ferment
            method: POST
            rel: fire
        query:
            pn:
                constraints: {}
                description: The query param pn stands for the id of a person.
                meta: null
                type: string
        rpc_name: FirePerson
