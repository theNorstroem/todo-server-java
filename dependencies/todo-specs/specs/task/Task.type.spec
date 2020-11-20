name: Task
type: Task
description: Tasks are essential at work.
__proto:
    package: task
    targetfile: task.proto
    imports:
        - google/type/date.proto
        - person/person.proto
    options:
        go_package: github.com/theNorstroem/todo-specs/dist/pb/task;taskpb
        java_multiple_files: "true"
        java_outer_classname: TaskProto
        java_package: pro.furo.todo
fields:
    id:
        type: string
        description: Task id (is a ULID).
        __proto:
            number: 1
            oneof: ""
        __ui: null
        meta:
            default: ""
            hint: ""
            label: task.Task.id.label
            options:
                flags: []
                list: []
            readonly: true
            repeated: false
            typespecific: null
        constraints: {}
    display_name:
        type: string
        description: We use this field label the task
        __proto:
            number: 2
            oneof: ""
        __ui:
            component: furo-data-text-input
            flags:
                - full
            noinit: false
            noskip: false
        meta:
            default: ""
            hint: ""
            label: task.Task.display_name.label
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
        description: Add some notes
        __proto:
            number: 3
            oneof: ""
        __ui: null
        meta:
            default: ""
            hint: ""
            label: task.Task.note.label
            options:
                flags: []
                list: []
            readonly: false
            repeated: false
            typespecific: null
        constraints: {}
    parent:
        type: task.Reference
        description: The parent for this task
        __proto:
            number: 4
            oneof: ""
        __ui:
            component: task-task-reference-search
            flags:
                - full
            noinit: false
            noskip: false
        meta:
            default: ""
            hint: ""
            label: task.Task.parent.label
            options:
                flags: []
                list: []
            readonly: false
            repeated: false
            typespecific: null
        constraints: {}
    checklist:
        type: string
        description: A task can have a checklist (more work)
        __proto:
            number: 5
            oneof: ""
        __ui: null
        meta:
            default: ""
            hint: ""
            label: task.Task.checklist.label
            options:
                flags: []
                list: []
            readonly: false
            repeated: true
            typespecific: null
        constraints: {}
    due_date:
        type: google.type.Date
        description: Use this to give pressure.
        __proto:
            number: 6
            oneof: ""
        __ui: null
        meta:
            default: ""
            hint: ""
            label: task.Task.due_date.label
            options:
                flags: []
                list: []
            readonly: false
            repeated: false
            typespecific: null
        constraints: {}
    related_tasks:
        type: task.Reference
        description: Maybe we can benefit.
        __proto:
            number: 7
            oneof: ""
        __ui: null
        meta:
            default: ""
            hint: ""
            label: task.Task.related_tasks.label
            options:
                flags: []
                list: []
            readonly: false
            repeated: true
            typespecific: null
        constraints: {}
    involved_persons:
        type: person.Reference
        description: Sometimes a task is to hard for one person only.
        __proto:
            number: 8
            oneof: ""
        __ui: null
        meta:
            default: ""
            hint: ""
            label: task.Task.involved_persons.label
            options:
                flags: []
                list: []
            readonly: false
            repeated: true
            typespecific: null
        constraints: {}
    responsible_person:
        type: person.Reference
        description: If something goes wrong, we should be able to make some one responsible for it. This is aligned with our CYA strategy.
        __proto:
            number: 9
            oneof: ""
        __ui: null
        meta:
            default: ""
            hint: ""
            label: task.Task.responsible_person.label
            options:
                flags: []
                list: []
            readonly: false
            repeated: false
            typespecific: null
        constraints: {}
    done:
        type: bool
        description: this si maybe the main feature.
        __proto:
            number: 10
            oneof: ""
        __ui: null
        meta:
            default: ""
            hint: ""
            label: task.Task.done.label
            options:
                flags: []
                list: []
            readonly: false
            repeated: false
            typespecific: null
        constraints: {}
