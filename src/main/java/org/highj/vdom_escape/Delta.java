package org.highj.vdom_escape;

import org.highj.function.F2;

public class Delta<A,DA> {
    private final F2<A,DA,A> _patch;
    private final DA _change;

    private Delta(F2<A,DA,A> patch, DA change) {
        this._patch = patch;
        this._change = change;
    }

    public static <A,DA> Delta<A,DA> create(F2<A,DA,A> patch, DA change) {
        return new Delta<>(patch, change);
    }

    public F2<A, DA, A> patch() {
        return _patch;
    }

    public DA change() {
        return _change;
    }

    public A patch(A a) {
        return patch().apply(a, change());
    }
}
