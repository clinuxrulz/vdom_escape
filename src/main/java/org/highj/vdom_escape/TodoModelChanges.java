package org.highj.vdom_escape;

import org.highj.data.Maybe;

public class TodoModelChanges {
    private final MapChanges<Integer,Atomic<String>,Maybe<String>> _taskChanges;

    public TodoModelChanges(
        MapChanges<Integer,Atomic<String>,Maybe<String>> taskChanges
    ) {
        this._taskChanges = taskChanges;
    }

    public MapChanges<Integer, Atomic<String>, Maybe<String>> taskChanges() {
        return _taskChanges;
    }
}
