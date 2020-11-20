name: ListTasksRequest
type: ListTasksRequest
description: request message for ListTasks
__proto:
    package: task
    targetfile: reqmsgs.proto
    imports:
        - google/protobuf/empty.proto
    options:
        go_package: github.com/theNorstroem/todo-specs/dist/pb/task;taskpb
        java_multiple_files: "true"
        java_outer_classname: ReqmsgsProto
        java_package: pro.furo.todo
fields:
    body:
        type: .google.protobuf.Empty
        description: Body with google.protobuf.Empty
        __proto:
            number: 1
            oneof: ""
        __ui: null
        meta:
            default: ""
            hint: ""
            label: task.ListTasksRequest.body.label
            options:
                flags: []
                list: []
            readonly: false
            repeated: false
            typespecific: null
        constraints: {}
    q:
        type: string
        description: Use this to search for a task by text.
        __proto:
            number: 2
            oneof: ""
        __ui: null
        meta:
            default: ""
            hint: ""
            label: task.ListTasksRequest.q.label
            options:
                flags: []
                list: []
            readonly: false
            repeated: false
            typespecific: null
        constraints: {}
    filter:
        type: string
        description: Use this field to filter the tasks, this is not searching.
        __proto:
            number: 3
            oneof: ""
        __ui: null
        meta:
            default: ""
            hint: ""
            label: task.ListTasksRequest.filter.label
            options:
                flags: []
                list: []
            readonly: false
            repeated: false
            typespecific: null
        constraints: {}
    order_by:
        type: string
        description: Use this field to specify the ordering.
        __proto:
            number: 4
            oneof: ""
        __ui: null
        meta:
            default: ""
            hint: ""
            label: task.ListTasksRequest.order_by.label
            options:
                flags: []
                list: []
            readonly: false
            repeated: false
            typespecific: null
        constraints: {}
    page:
        type: uint32
        description: Use this field to specify page to display.
        __proto:
            number: 5
            oneof: ""
        __ui: null
        meta:
            default: ""
            hint: ""
            label: task.ListTasksRequest.page.label
            options:
                flags: []
                list: []
            readonly: false
            repeated: false
            typespecific: null
        constraints: {}
    page_size:
        type: uint32
        description: Define the size of a page.
        __proto:
            number: 6
            oneof: ""
        __ui: null
        meta:
            default: ""
            hint: ""
            label: task.ListTasksRequest.page_size.label
            options:
                flags: []
                list: []
            readonly: false
            repeated: false
            typespecific: null
        constraints: {}
