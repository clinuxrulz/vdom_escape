package org.highj.vdom_escape;

public class TodoModel {
    private final IMap<Integer,Atomic<String>> _tasks;

    public TodoModel(
        IMap<Integer,Atomic<String>> tasks
    ) {
        this._tasks = tasks;
    }

    public IMap<Integer, Atomic<String>> tasks() {
        return _tasks;
    }

    public TodoModel patch(TodoModelChanges changes) {
        return new TodoModel(tasks().patch(changes.taskChanges()));
    }
}
