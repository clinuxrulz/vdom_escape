package org.highj.vdom_escape;

import org.highj.data.Maybe;

/**
 * Atomic incremental values, the change structure of Atomic A is just Maybe A.
 * This is useful for primitive types, like int, double or string.
 * @param <A>
 */
public class Atomic<A> {
    private final A _value;

    private Atomic(A value) {
        this._value = value;
    }

    public static <A> Atomic<A> create(A value) {
        return new Atomic<>(value);
    }

    public A value() {
        return _value;
    }

    public Atomic<A> patch(Maybe<A> change) {
        return Atomic.create(change.getOrElse(value()));
    }
}
