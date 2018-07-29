package org.highj.vdom_escape;

import org.derive4j.hkt.TypeEq;
import org.derive4j.hkt.__3;
import org.highj.data.tuple.T2;

public class T2Tensor<K,A,B> implements __3<T2Tensor.µ,K,A,B> {
    public static final class µ {}

    private final T2<A,B> _t;

    private T2Tensor(T2<A,B> t) {
        this._t = t;
    }

    public static <K,A,B> T2Tensor<K,A,B> create(T2<A,B> t) {
        return new T2Tensor<>(t);
    }

    public T2<A, B> t() {
        return _t;
    }

    public static final FreeCCC.TensorDontDependOnK<µ> tensorDontDependOnK = new FreeCCC.TensorDontDependOnK<µ>() {
        @Override
        public <A2, B2, K1, K2> TypeEq<__3<µ, K1, A2, B2>, __3<µ, K2, A2, B2>> typeEq() {
            //noinspection unchecked
            return (TypeEq)TypeEq.refl();
        }
    };
}
