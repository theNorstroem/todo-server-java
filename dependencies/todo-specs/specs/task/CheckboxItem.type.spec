name: CheckboxItem
type: CheckboxItem
description: A checkbox item
__proto:
    package: task
    targetfile: task.proto
    imports: []
    options:
        go_package: github.com/theNorstroem/todo-specs/dist/pb/task;taskpb
        java_multiple_files: "true"
        java_outer_classname: TaskProto
        java_package: pro.furo.todo
fields:
    display_name:
        type: string
        description: We use this field label the task
        __proto:
            number: 2
            oneof: ""
        __ui: null
        meta:
            default: ""
            hint: ""
            label: task.CheckboxItem.display_name.label
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
    done:
        type: bool
        description: Sample
        __proto:
            number: 3
            oneof: ""
        __ui: null
        meta:
            default: ""
            hint: ""
            label: task.CheckboxItem.done.label
            options:
                flags: []
                list: []
            readonly: false
            repeated: false
            typespecific: null
        constraints: {}
    note:
        type: string
        description: Add some notes
        __proto:
            number: 4
            oneof: ""
        __ui: null
        meta:
            default: ""
            hint: ""
            label: task.CheckboxItem.note.label
            options:
                flags: []
                list: []
            readonly: false
            repeated: false
            typespecific: null
        constraints: {}
