name: SuspendTaskRequest
type: SuspendTaskRequest
description: request message for SuspendTask
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
            label: task.SuspendTaskRequest.body.label
            options:
                flags: []
                list: []
            readonly: false
            repeated: false
            typespecific: null
        constraints: {}
    tsk:
        type: string
        description: tsk string.
        __proto:
            number: 2
            oneof: ""
        __ui: null
        meta:
            default: ""
            hint: ""
            label: task.SuspendTaskRequest.tsk.label
            options:
                flags: []
                list: []
            readonly: false
            repeated: false
            typespecific: null
        constraints: {}
