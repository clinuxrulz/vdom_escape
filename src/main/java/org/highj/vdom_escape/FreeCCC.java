package org.highj.vdom_escape;

import org.derive4j.hkt.*;

public abstract class FreeCCC<K,Tensor,Hom,A,B> implements __5<FreeCCC.µ,K,Tensor,Hom,A,B> {
    public static final class µ {}

    public static <K,Tensor,Hom,A,B> FreeCCC<K,Tensor,Hom,A,B> narrow(__<__<__<__<__<µ,K>,Tensor>,Hom>,A>,B> a) {
        return (FreeCCC<K,Tensor,Hom,A,B>)a;
    }

    public interface Cases<R,K,Tensor,Hom,A,B> {
        R eval(Eval<K,Tensor,Hom,?,B,A> eval);
        R curry(Curry<K,Tensor,Hom,A,?,?,B> curry);
        R uncurry(Uncurry<K,Tensor,Hom,?,?,B,A> uncurry);
        R fork(Fork<K,Tensor,Hom,A,?,?,B> fork);
        R exl(Exl<K,Tensor,Hom,B,?,A> exl);
        R exr(Exr<K,Tensor,Hom,?,B,A> exr);
        R identity(Identity<A,B> identity);
        R dot(Dot<K,Tensor,Hom,A,?,B> dot);
        R lift(__2<K,A,B> k);
    }

    public abstract <R> R match(Cases<R,K,Tensor,Hom,A,B> cases);

    public static <K,Tensor,Hom,A,B> FreeCCC<K,Tensor,Hom,__3<Tensor,__<__<__<µ,K>,Tensor>,Hom>,__3<Hom,__<__<__<µ,K>,Tensor>,Hom>,A,B>,A>,B> eval() {
        return new FreeCCC<K,Tensor,Hom,__3<Tensor,__<__<__<µ,K>,Tensor>,Hom>,__3<Hom,__<__<__<µ,K>,Tensor>,Hom>,A,B>,A>,B>() {
            @Override
            public <R> R match(Cases<R, K, Tensor, Hom, __3<Tensor, __<__<__<µ, K>, Tensor>, Hom>, __3<Hom, __<__<__<µ, K>, Tensor>, Hom>, A, B>, A>, B> cases) {
                return cases.eval(new Eval<>(TypeEq.refl()));
            }
        };
    }

    public static <K,Tensor,Hom,A,B,C> FreeCCC<K,Tensor,Hom,A,__3<Hom,__<__<__<µ,K>,Tensor>,Hom>,B,C>> curry(FreeCCC<K,Tensor,Hom,__3<Tensor, __<__<__<µ,K>,Tensor>,Hom>, A, B>,C> k) {
        return new FreeCCC<K,Tensor,Hom,A,__3<Hom,__<__<__<µ,K>,Tensor>,Hom>,B,C>>() {
            @Override
            public <R> R match(Cases<R, K, Tensor, Hom, A, __3<Hom, __<__<__<µ, K>, Tensor>, Hom>, B, C>> cases) {
                return cases.curry(new Curry<>(k, TypeEq.refl()));
            }
        };
    }

    public static <K,Tensor,Hom,A,B,C> FreeCCC<K,Tensor,Hom,__3<Tensor,__<__<__<µ,K>,Tensor>,Hom>,A,B>,C> uncurry(FreeCCC<K,Tensor,Hom, A, __3<Hom, __<__<__<µ,K>,Tensor>,Hom>, B, C>> k) {
        return new FreeCCC<K,Tensor,Hom,__3<Tensor,__<__<__<µ,K>,Tensor>,Hom>,A,B>,C>() {
            @Override
            public <R> R match(Cases<R, K, Tensor, Hom, __3<Tensor, __<__<__<µ, K>, Tensor>, Hom>, A, B>, C> cases) {
                return cases.uncurry(new Uncurry<>(k, TypeEq.refl()));
            }
        };
    }

    public static <K,Tensor,Hom,A,B,C> FreeCCC<K,Tensor,Hom,A,__3<Tensor,__<__<__<µ,K>,Tensor>,Hom>,B,C>> fork(FreeCCC<K,Tensor,Hom,A,B> k1, FreeCCC<K,Tensor,Hom,A,C> k2) {
        return new FreeCCC<K,Tensor,Hom,A,__3<Tensor,__<__<__<µ,K>,Tensor>,Hom>,B,C>>() {
            @Override
            public <R> R match(Cases<R, K, Tensor, Hom, A, __3<Tensor, __<__<__<µ, K>, Tensor>, Hom>, B, C>> cases) {
                return cases.fork(new Fork<>(k1, k2, TypeEq.refl()));
            }
        };
    }

    public static <K,Tensor,Hom,A,B> FreeCCC<K,Tensor,Hom,__3<Tensor,__<__<__<µ,K>,Tensor>,Hom>,A,B>,A> exl() {
        return new FreeCCC<K,Tensor,Hom,__3<Tensor,__<__<__<µ,K>,Tensor>,Hom>,A,B>,A>() {
            @Override
            public <R> R match(Cases<R, K, Tensor, Hom, __3<Tensor, __<__<__<µ, K>, Tensor>, Hom>, A, B>, A> cases) {
                return cases.exl(new Exl<>(TypeEq.refl()));
            }
        };
    }

    public static <K,Tensor,Hom,A,B> FreeCCC<K,Tensor,Hom,__3<Tensor,__<__<__<µ,K>,Tensor>,Hom>,A,B>,B> exr() {
        return new FreeCCC<K,Tensor,Hom,__3<Tensor,__<__<__<µ,K>,Tensor>,Hom>,A,B>,B>() {
            @Override
            public <R> R match(Cases<R, K, Tensor, Hom, __3<Tensor, __<__<__<µ, K>, Tensor>, Hom>, A, B>, B> cases) {
                return cases.exr(new Exr<>(TypeEq.refl()));
            }
        };
    }

    public static <K,Tensor,Hom,A> FreeCCC<K,Tensor,Hom,A,A> identity() {
        return new FreeCCC<K,Tensor,Hom,A,A>() {
            @Override
            public <R> R match(Cases<R, K, Tensor, Hom, A, A> cases) {
                return cases.identity(new Identity<>(TypeEq.refl()));
            }
        };
    }

    public static <K,Tensor,Hom,A,B,C> FreeCCC<K,Tensor,Hom,A,C> dot(FreeCCC<K,Tensor,Hom,B,C> k1, FreeCCC<K,Tensor,Hom,A,B> k2) {
        return new FreeCCC<K,Tensor,Hom,A,C>() {
            @Override
            public <R> R match(Cases<R, K, Tensor, Hom, A, C> cases) {
                return cases.dot(new Dot<>(k1, k2));
            }
        };
    }

    public static <K,Tensor,Hom,A,B> FreeCCC<K,Tensor,Hom,A,B> lift(__2<K,A,B> k) {
        return new FreeCCC<K,Tensor,Hom,A,B>() {
            @Override
            public <R> R match(Cases<R, K, Tensor, Hom, A, B> cases) {
                return cases.lift(k);
            }
        };
    }

    public static class Eval<K,Tensor,Hom,A,B,C> {
        private final TypeEq<C,__3<Tensor, __<__<__<µ,K>,Tensor>,Hom>, __3<Hom, __<__<__<µ,K>,Tensor>,Hom>, A, B>, A>> _typeEq;

        public Eval(TypeEq<C, __3<Tensor, __<__<__<µ,K>,Tensor>,Hom>, __3<Hom, __<__<__<µ,K>,Tensor>,Hom>, A, B>, A>> typeEq) {
            this._typeEq = typeEq;
        }

        public TypeEq<C, __3<Tensor, __<__<__<µ,K>,Tensor>,Hom>, __3<Hom, __<__<__<µ,K>,Tensor>,Hom>, A, B>, A>> typeEq() {
            return _typeEq;
        }
    }

    public static class Curry<K,Tensor,Hom,A,B,C,D> {
        private final FreeCCC<K,Tensor,Hom, __3<Tensor, __<__<__<µ,K>,Tensor>,Hom>, A, B>, C> _k;
        private final TypeEq<D,__3<Hom, __<__<__<µ,K>,Tensor>,Hom>, B, C>> _typeEq;

        public Curry(FreeCCC<K,Tensor,Hom, __3<Tensor, __<__<__<µ,K>,Tensor>,Hom>, A, B>, C> k, TypeEq<D, __3<Hom, __<__<__<µ,K>,Tensor>,Hom>, B, C>> typeEq) {
            this._k = k;
            this._typeEq = typeEq;
        }

        public FreeCCC<K,Tensor,Hom, __3<Tensor, __<__<__<µ,K>,Tensor>,Hom>, A, B>, C> k() {
            return _k;
        }

        public TypeEq<D, __3<Hom, __<__<__<µ,K>,Tensor>,Hom>, B, C>> typeEq() {
            return _typeEq;
        }
    }

    public static class Uncurry<K,Tensor,Hom,A,B,C,D> {
        private final FreeCCC<K, Tensor, Hom, A, __3<Hom, __<__<__<µ,K>,Tensor>,Hom>, B, C>> _k;
        private final TypeEq<D,__3<Tensor, __<__<__<µ,K>,Tensor>,Hom>, A, B>> _typeEq;

        public Uncurry(FreeCCC<K, Tensor, Hom, A, __3<Hom, __<__<__<µ,K>,Tensor>,Hom>, B, C>> k, TypeEq<D, __3<Tensor, __<__<__<µ,K>,Tensor>,Hom>, A, B>> typeEq) {
            this._k = k;
            this._typeEq = typeEq;
        }

        public FreeCCC<K, Tensor, Hom, A, __3<Hom, __<__<__<µ,K>,Tensor>,Hom>, B, C>> k() {
            return _k;
        }

        public TypeEq<D, __3<Tensor, __<__<__<µ,K>,Tensor>,Hom>, A, B>> typeEq() {
            return _typeEq;
        }
    }

    public static class Fork<K,Tensor,Hom,A,B,C,D> {
        private final FreeCCC<K,Tensor,Hom,A,B> _k1;
        private final FreeCCC<K,Tensor,Hom,A,C> _k2;
        private final TypeEq<D,__3<Tensor,__<__<__<µ,K>,Tensor>,Hom>,B,C>> _typeEq;

        public Fork(FreeCCC<K, Tensor, Hom, A, B> k1, FreeCCC<K, Tensor, Hom, A, C> k2, TypeEq<D, __3<Tensor, __<__<__<µ,K>,Tensor>,Hom>, B, C>> typeEq) {
            this._k1 = k1;
            this._k2 = k2;
            this._typeEq = typeEq;
        }

        public FreeCCC<K, Tensor, Hom, A, B> k1() {
            return _k1;
        }

        public FreeCCC<K, Tensor, Hom, A, C> k2() {
            return _k2;
        }

        public TypeEq<D, __3<Tensor, __<__<__<µ,K>,Tensor>,Hom>, B, C>> typeEq() {
            return _typeEq;
        }
    }

    public static class Exl<K,Tensor,Hom,A,B,C> {
        private final TypeEq<C,__3<Tensor,__<__<__<µ,K>,Tensor>,Hom>,A,B>> _typeEq;

        public Exl(TypeEq<C, __3<Tensor, __<__<__<µ, K>, Tensor>, Hom>, A, B>> typeEq) {
            this._typeEq = typeEq;
        }

        public TypeEq<C, __3<Tensor, __<__<__<µ, K>, Tensor>, Hom>, A, B>> typeEq() {
            return _typeEq;
        }
    }

    public static class Exr<K,Tensor,Hom,A,B,C> {
        private final TypeEq<C,__3<Tensor,__<__<__<µ,K>,Tensor>,Hom>,A,B>> _typeEq;

        public Exr(TypeEq<C, __3<Tensor, __<__<__<µ, K>, Tensor>, Hom>, A, B>> typeEq) {
            this._typeEq = typeEq;
        }

        public TypeEq<C, __3<Tensor, __<__<__<µ, K>, Tensor>, Hom>, A, B>> typeEq() {
            return _typeEq;
        }
    }

    public static class Identity<A,B> {
        private final TypeEq<B,A> _typeEq;
        public Identity(TypeEq<B, A> typeEq) {
            this._typeEq = typeEq;
        }
        public TypeEq<B, A> typeEq() {
            return _typeEq;
        }
    }

    public static class Dot<K,Tensor,Hom,A,B,C> {
        private final FreeCCC<K,Tensor,Hom,B,C> _k1;
        private final FreeCCC<K,Tensor,Hom,A,B> _k2;

        public Dot(FreeCCC<K, Tensor, Hom, B, C> k1, FreeCCC<K, Tensor, Hom, A, B> k2) {
            this._k1 = k1;
            this._k2 = k2;
        }

        public FreeCCC<K, Tensor, Hom, B, C> k1() {
            return _k1;
        }

        public FreeCCC<K, Tensor, Hom, A, B> gk2() {
            return _k2;
        }
    }
}
