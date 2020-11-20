name: Tasks
version: ""
description: |
    Doing nothing is very hard to do… you never know when you’re finished.
    Having some tasks can help you a lot by giving you that comfortable feeling that you
    did something.
lifecycle: null
__proto:
    package: task
    targetfile: taskservice.proto
    imports:
        - google/api/annotations.proto
        - task/reqmsgs.proto
        - google/protobuf/empty.proto
        - google/protobuf/field_mask.proto
        - task/task.proto
        - furo/signatures/signatures.proto
    options:
        go_package: github.com/theNorstroem/todo-specs/dist/pb/task;taskpb
        java_multiple_files: "true"
        java_outer_classname: TaskserviceProto
        java_package: pro.furo.todo
services:
    List:
        description: List tasks with pagination.
        data:
            request: google.protobuf.Empty
            response: task.TaskCollection
            bodyfield: body
        deeplink:
            description: 'List: GET /tasks google.protobuf.Empty , task.TaskCollection #List tasks with pagination.'
            href: /tasks
            method: GET
            rel: list
        query:
            q:
                constraints: {}
                description: Use this to search for a task by text.
                meta: null
                type: string
            filter:
                constraints: {}
                description: Use this field to filter the tasks, this is not searching.
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
                type: uint32
            page_size:
                constraints: {}
                description: Define the size of a page.
                meta: null
                type: uint32
        rpc_name: ListTasks
    Get:
        description: Returns a single task.
        data:
            request: google.protobuf.Empty
            response: task.TaskEntity
            bodyfield: body
        deeplink:
            description: 'Get: GET /tasks/{tsk} google.protobuf.Empty , task.TaskEntity #Returns a single task.'
            href: /tasks/{tsk}
            method: GET
            rel: self
        query:
            tsk:
                constraints: {}
                description: The query param tsk stands for the id of a task.
                meta: null
                type: string
        rpc_name: GetTask
    Create:
        description: Use this to create new tasks.
        data:
            request: task.Task
            response: furo.signatures.EmptyEntity
            bodyfield: body
        deeplink:
            description: 'Create: POST /tasks task.Task , furo.signatures.EmptyEntity #Use this to create new tasks.'
            href: /tasks
            method: POST
            rel: create
        query: {}
        rpc_name: CreateTask
    Update:
        description: Use this to update existing tasks. PATCH is also supported
        data:
            request: task.Task
            response: task.TaskEntity
            bodyfield: body
        deeplink:
            description: 'Update: PUT /tasks/{tsk} task.Task , task.TaskEntity #Use this to update existing tasks. PATCH is also supported'
            href: /tasks/{tsk}
            method: PUT
            rel: update
        query:
            tsk:
                constraints: {}
                description: tsk string.
                meta: null
                type: string
            update_mask:
                constraints: {}
                description: Needed to patch a record
                meta: null
                type: google.protobuf.FieldMask
        rpc_name: UpdateTask
    Delete:
        description: Use this to delete existing tasks.
        data:
            request: google.protobuf.Empty
            response: google.protobuf.Empty
            bodyfield: body
        deeplink:
            description: 'Delete: DELETE /tasks/{tsk} google.protobuf.Empty , google.protobuf.Empty #Use this to delete existing tasks.'
            href: /tasks/{tsk}
            method: DELETE
            rel: delete
        query:
            tsk:
                constraints: {}
                description: tsk string.
                meta: null
                type: string
        rpc_name: DeleteTask
    DeleteAll:
        description: Use this to delete ALL tasks.
        data:
            request: google.protobuf.Empty
            response: google.protobuf.Empty
            bodyfield: body
        deeplink:
            description: 'DeleteAll: DELETE /tasks google.protobuf.Empty , google.protobuf.Empty #Use this to delete ALL tasks.'
            href: /tasks
            method: DELETE
            rel: delete
        query: {}
        rpc_name: DeleteAllTaskss
    Suspend:
        description: Custom methods are always POST.
        data:
            request: google.protobuf.Empty
            response: google.protobuf.Empty
            bodyfield: body
        deeplink:
            description: 'Suspend: POST /tasks/{tsk}:suspend google.protobuf.Empty , google.protobuf.Empty #Custom methods are always POST.'
            href: /tasks/{tsk}:suspend
            method: POST
            rel: suspend
        query:
            tsk:
                constraints: {}
                description: tsk string.
                meta: null
                type: string
        rpc_name: SuspendTask
