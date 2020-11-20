name: UpdateTaskRequest
type: UpdateTaskRequest
description: request message for UpdateTask
__proto:
    package: task
    targetfile: reqmsgs.proto
    imports:
        - google/protobuf/field_mask.proto
        - task/task.proto
    options:
        go_package: github.com/theNorstroem/todo-specs/dist/pb/task;taskpb
        java_multiple_files: "true"
        java_outer_classname: ReqmsgsProto
        java_package: pro.furo.todo
fields:
    body:
        type: .task.Task
        description: Body with task.Task
        __proto:
            number: 1
            oneof: ""
        __ui: null
        meta:
            default: ""
            hint: ""
            label: task.UpdateTaskRequest.body.label
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
            label: task.UpdateTaskRequest.tsk.label
            options:
                flags: []
                list: []
            readonly: false
            repeated: false
            typespecific: null
        constraints: {}
    update_mask:
        type: google.protobuf.FieldMask
        description: Needed to patch a record
        __proto:
            number: 3
            oneof: ""
        __ui: null
        meta:
            default: ""
            hint: ""
            label: task.UpdateTaskRequest.update_mask.label
            options:
                flags: []
                list: []
            readonly: false
            repeated: false
            typespecific: null
        constraints: {}
