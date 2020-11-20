name: DeleteAllTaskssRequest
type: DeleteAllTaskssRequest
description: request message for DeleteAllTaskss
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
            label: task.DeleteAllTaskssRequest.body.label
            options:
                flags: []
                list: []
            readonly: false
            repeated: false
            typespecific: null
        constraints: {}
