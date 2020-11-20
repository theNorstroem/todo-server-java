name: Reference
type: Reference
description: Use this to set a reference to a task
__proto:
    package: task
    targetfile: task.proto
    imports:
        - furo/furo.proto
    options:
        go_package: github.com/theNorstroem/todo-specs/dist/pb/task;taskpb
        java_multiple_files: "true"
        java_outer_classname: TaskProto
        java_package: pro.furo.todo
fields:
    id:
        type: string
        description: Id of the referenced task.
        __proto:
            number: 1
            oneof: ""
        __ui: null
        meta:
            default: ""
            hint: ""
            label: task.Reference.id.label
            options:
                flags: []
                list: []
            readonly: false
            repeated: false
            typespecific: null
        constraints:
            required:
                is: "true"
                message: id is required
    display_name:
        type: string
        description: Label of the referenced task
        __proto:
            number: 2
            oneof: ""
        __ui: null
        meta:
            default: ""
            hint: ""
            label: task.Reference.display_name.label
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
    link:
        type: furo.Link
        description: HTS for the initial search (works on root resources only)
        __proto:
            number: 3
            oneof: ""
        __ui: null
        meta:
            default: |
                {
                    "rel": "list",
                    "href": "/tasks",
                    "method": "GET",
                    "type": "task.Task",
                    "service": "Tasks"
                }
            hint: ""
            label: task.Reference.link.label
            options:
                flags: []
                list: []
            readonly: false
            repeated: false
            typespecific: null
        constraints:
            required:
                is: "true"
                message: link is required
