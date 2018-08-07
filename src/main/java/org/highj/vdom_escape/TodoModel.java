package org.highj.vdom_escape;

import org.highj.data.Maybe;
import org.highj.data.tuple.T2;

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

    public static Delta<TodoModel,TodoModelChanges> materializeDelta(Delta<TodoModel,?> delta) {
        //noinspection unchecked
        return (Delta)delta;
    }

    public static IncF<TodoModel,IMap<Integer,Atomic<String>>> incFGetTasks() {
        return (TodoModel todoModel) -> {
            class Util {
                private IncF2<TodoModel,IMap<Integer,Atomic<String>>> iGetTasks2;
            }
            final Util util = new Util();
            util.iGetTasks2 = (Delta<TodoModel, ?> da) ->
                T2.of(
                    Delta.create(
                        IMap::patch,
                        materializeDelta(da)
                            .change()
                            .taskChanges()
                    ),
                    util.iGetTasks2
                );
            return T2.of(
                todoModel.tasks(),
                util.iGetTasks2
            );
        };
    }
}
