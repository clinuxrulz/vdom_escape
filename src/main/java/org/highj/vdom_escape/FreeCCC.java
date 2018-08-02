package org.highj.vdom_escape;

import org.derive4j.hkt.*;
import org.highj.data.Maybe;
import org.highj.typeclass2.arrow.Category;
import org.highj.typeclass2.arrow.Semigroupoid;
import org.highj.vdom_escape.free_ccc.FreeCCCCCC;
import org.highj.vdom_escape.free_ccc.FreeCCCCartesian;
import org.highj.vdom_escape.free_ccc.FreeCCCCategory;
import org.highj.vdom_escape.free_ccc.FreeCCCSemigroupoid;

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
        R exr(Exr<K,Tensor,Hom,B,?,A> exr);
        R identity(Identity<A,B> identity);
        R dot(Dot<K,Tensor,Hom,A,?,B> dot);
        R lift(__2<K,A,B> k);
    }

    public static class CasesAdapter<R,K,Tensor,Hom,A,B> implements Cases<R,K,Tensor,Hom,A,B> {
        private final R default_;
        private CasesAdapter(R default_) {
            this.default_ = default_;
        }
        @Override
        public R eval(Eval<K, Tensor, Hom, ?, B, A> eval) {
            return default_;
        }
        @Override
        public R curry(Curry<K, Tensor, Hom, A, ?, ?, B> curry) {
            return default_;
        }
        @Override
        public R uncurry(Uncurry<K, Tensor, Hom, ?, ?, B, A> uncurry) {
            return default_;
        }
        @Override
        public R fork(Fork<K, Tensor, Hom, A, ?, ?, B> fork) {
            return default_;
        }
        @Override
        public R exl(Exl<K, Tensor, Hom, B, ?, A> exl) {
            return default_;
        }
        @Override
        public R exr(Exr<K, Tensor, Hom, B, ?, A> exr) {
            return default_;
        }
        @Override
        public R identity(Identity<A, B> identity) {
            return default_;
        }
        @Override
        public R dot(Dot<K, Tensor, Hom, A, ?, B> dot) {
            return default_;
        }
        @Override
        public R lift(__2<K, A, B> k) {
            return default_;
        }
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

    public static <K,Tensor,Hom> Semigroupoid<__<__<__<µ,K>,Tensor>,Hom>> semigroupoid() {
        return new FreeCCCSemigroupoid<K, Tensor, Hom>() {};
    }

    public static <K,Tensor,Hom> Category<__<__<__<µ,K>,Tensor>,Hom>> category() {
        return new FreeCCCCategory<K,Tensor,Hom>() {};
    }

    public static <K,Tensor,Hom> Cartesian<__<__<__<µ,K>,Tensor>,Hom>,Tensor> cartesian() {
        return new FreeCCCCartesian<K,Tensor,Hom>() {};
    }

    public static <K,Tensor,Hom> CCC<__<__<__<µ,K>,Tensor>,Hom>,Tensor,Hom> ccc() {
        return new FreeCCCCCC<K,Tensor,Hom>() {};
    }

    public interface FreeCCCSubst<K,Tensor,Hom> {
        <A,B> FreeCCC<K,Tensor,Hom,A,B> apply(FreeCCC<K,Tensor,Hom,A,B> x);
    }

    public FreeCCC<K,Tensor,Hom,A,B> subst(FreeCCCSubst<K,Tensor,Hom> fn) {
        FreeCCC<K,Tensor,Hom,A,B> this_ = this;
        return match(new Cases<FreeCCC<K,Tensor,Hom,A,B>,K,Tensor,Hom,A,B>() {
            @Override
            public FreeCCC<K, Tensor, Hom, A, B> eval(Eval<K, Tensor, Hom, ?, B, A> eval) {
                return fn.apply(this_);
            }
            @Override
            public FreeCCC<K, Tensor, Hom, A, B> curry(Curry<K, Tensor, Hom, A, ?, ?, B> curry) {
                return fn.apply(substCurry(fn, curry));
            }
            @Override
            public FreeCCC<K, Tensor, Hom, A, B> uncurry(Uncurry<K, Tensor, Hom, ?, ?, B, A> uncurry) {
                return fn.apply(substUncurry(fn, uncurry));
            }
            @Override
            public FreeCCC<K, Tensor, Hom, A, B> fork(Fork<K, Tensor, Hom, A, ?, ?, B> fork) {
                return fn.apply(substFork(fn, fork));
            }
            @Override
            public FreeCCC<K, Tensor, Hom, A, B> exl(Exl<K, Tensor, Hom, B, ?, A> exl) {
                return fn.apply(this_);
            }
            @Override
            public FreeCCC<K, Tensor, Hom, A, B> exr(Exr<K, Tensor, Hom, B, ?, A> exr) {
                return fn.apply(this_);
            }
            @Override
            public FreeCCC<K, Tensor, Hom, A, B> identity(Identity<A, B> identity) {
                return fn.apply(this_);
            }
            @Override
            public FreeCCC<K, Tensor, Hom, A, B> dot(Dot<K, Tensor, Hom, A, ?, B> dot) {
                return fn.apply(substDot(fn, dot));
            }
            @Override
            public FreeCCC<K, Tensor, Hom, A, B> lift(__2<K, A, B> k) {
                return fn.apply(this_);
            }
        });
    }

    private static <K,Tensor,Hom,A,B,C,D> FreeCCC<K,Tensor,Hom,A,B> substCurry(FreeCCCSubst<K,Tensor,Hom> fn, Curry<K, Tensor, Hom, A, C, D, B> curry) {
        return narrow(curry.typeEq().symm().<__<__<__<__<µ, K>, Tensor>, Hom>, A>>lift().coerce(FreeCCC.curry(fn.apply(curry.k()))));
    }

    private static <K,Tensor,Hom,A,B,C,D> FreeCCC<K,Tensor,Hom,A,B> substUncurry(FreeCCCSubst<K,Tensor,Hom> fn, Uncurry<K, Tensor, Hom, C, D, B, A> uncurry) {
        return narrow(uncurry.typeEq().symm().<__<__<__<µ, K>, Tensor>, Hom>, B>lift2().coerce(FreeCCC.uncurry(fn.apply(uncurry.k()))));
    }

    private static <K,Tensor,Hom,A,B,C,D> FreeCCC<K,Tensor,Hom,A,B> substFork(FreeCCCSubst<K,Tensor,Hom> fn, Fork<K, Tensor, Hom, A, C, D, B> fork) {
        return narrow(fork.typeEq().symm().<__<__<__<__<µ, K>, Tensor>, Hom>, A>>lift().coerce(FreeCCC.fork(fn.apply(fork.k1()), fn.apply(fork.k2()))));
    }

    private static <K,Tensor,Hom,A,B,C> FreeCCC<K,Tensor,Hom,A,B> substDot(FreeCCCSubst<K,Tensor,Hom> fn, Dot<K, Tensor, Hom, A, C, B> dot) {
        return FreeCCC.dot(fn.apply(dot.k1()), fn.apply(dot.k2()));
    }

    public FreeCCC<K,Tensor,Hom,A,B> tryEliminateHom() {
        return subst(homEliminatorSubstFn());
    }

    private static <K,Tensor,Hom> FreeCCCSubst<K,Tensor,Hom> homEliminatorSubstFn() {
        return new FreeCCCSubst<K,Tensor,Hom>() {
            @Override
            public <A, B> FreeCCC<K, Tensor, Hom, A, B> apply(FreeCCC<K, Tensor, Hom, A, B> this_) {
                // eval . (curry h `fork` g) = h . (id `fork` g)
                return this_.match(new CasesAdapter<FreeCCC<K,Tensor,Hom,A,B>,K,Tensor,Hom,A,B>(this_) {
                    @Override
                    public FreeCCC<K, Tensor, Hom, A, B> dot(Dot<K, Tensor, Hom, A, ?, B> dot) {
                        return homEliminatorDot(this_, dot);
                    }
                });
            }
        };
    }

    private static <K,Tensor,Hom,A,B,C> FreeCCC<K,Tensor,Hom,A,B> homEliminatorDot(FreeCCC<K,Tensor,Hom,A,B> this_, Dot<K, Tensor, Hom, A, C, B> dot) {
        // eval . (curry h `fork` g) = h . (id `fork` g)
        return dot.k1().match(new CasesAdapter<FreeCCC<K,Tensor,Hom,A,B>,K,Tensor,Hom,C,B>(this_) {
            @Override
            public FreeCCC<K, Tensor, Hom, A, B> eval(Eval<K, Tensor, Hom, ?, B, C> eval) {
                return homEliminatorDotEval(this_, dot, eval);
            }
        });
    }

    private static <K,Tensor,Hom,A,B,C,D> FreeCCC<K,Tensor,Hom,A,B> homEliminatorDotEval(FreeCCC<K,Tensor,Hom,A,B> this_, Dot<K, Tensor, Hom, A, C, B> dot, Eval<K, Tensor, Hom, D, B, C> eval) {
        // eval . (curry h `fork` g) = h . (id `fork` g)
        return dot.k2().match(new CasesAdapter<FreeCCC<K,Tensor,Hom,A,B>,K,Tensor,Hom,A,C>(this_) {
            @Override
            public FreeCCC<K, Tensor, Hom, A, B> fork(Fork<K, Tensor, Hom, A, ?, ?, C> fork) {
                return homEliminatorDotEvalFork(this_, dot, eval, fork);
            }
        });
    }

    private static <K,Tensor,Hom,A,B,C,D,E,F> FreeCCC<K,Tensor,Hom,A,B> homEliminatorDotEvalFork(FreeCCC<K,Tensor,Hom,A,B> this_, Dot<K, Tensor, Hom, A, C, B> dot, Eval<K, Tensor, Hom, D, B, C> eval, Fork<K, Tensor, Hom, A, E, F, C> fork) {
        // eval . (curry h `fork` g) = h . (id `fork` g)
        return fork.k1().match(new CasesAdapter<FreeCCC<K,Tensor,Hom,A,B>,K,Tensor,Hom,A,E>(this_) {
            @Override
            public FreeCCC<K, Tensor, Hom, A, B> curry(Curry<K, Tensor, Hom, A, ?, ?, E> curry) {
                return homEliminatorDotEvalForkCurry(this_, dot, eval, fork, curry);
            }
        });
    }

    private static <K,Tensor,Hom,A,B,C,D,E,F,G,H> FreeCCC<K,Tensor,Hom,A,B> homEliminatorDotEvalForkCurry(FreeCCC<K,Tensor,Hom,A,B> this_, Dot<K, Tensor, Hom, A, C, B> dot, Eval<K, Tensor, Hom, D, B, C> eval, Fork<K, Tensor, Hom, A, E, F, C> fork, Curry<K, Tensor, Hom, A, G, H, E> curry) {
        // eval . (curry h `fork` g) = h . (id `fork` g)
        FreeCCC<K, Tensor, Hom, __3<Tensor, __<__<__<µ, K>, Tensor>, Hom>, A, G>, H> h = curry.k();
        FreeCCC<K, Tensor, Hom, A, F> g = fork.k2();
        FreeCCC<K, Tensor, Hom, A, __3<Tensor, __<__<__<µ, K>, Tensor>, Hom>, A, F>> id_fork_g = FreeCCC.fork(FreeCCC.<K, Tensor, Hom, A>identity(), g);
        // TODO: Use TypeEqs to make this type safe.
        //noinspection unchecked
        return FreeCCC.dot((FreeCCC)h, (FreeCCC)id_fork_g);
    }

    public Maybe<__2<K,A,B>> reduceToCartesian(TensorDontDependOnK<Tensor> tensorDontDependOnK, Cartesian<K,Tensor> cartesian) {
        return match(new Cases<Maybe<__2<K,A,B>>,K,Tensor,Hom,A,B>() {
            @Override
            public Maybe<__2<K, A, B>> eval(Eval<K, Tensor, Hom, ?, B, A> eval) {
                return Maybe.Nothing();
            }
            @Override
            public Maybe<__2<K, A, B>> curry(Curry<K, Tensor, Hom, A, ?, ?, B> curry) {
                return Maybe.Nothing();
            }
            @Override
            public Maybe<__2<K, A, B>> uncurry(Uncurry<K, Tensor, Hom, ?, ?, B, A> uncurry) {
                return Maybe.Nothing();
            }
            @Override
            public Maybe<__2<K, A, B>> fork(Fork<K, Tensor, Hom, A, ?, ?, B> fork) {
                return reduceToCartesianFork(tensorDontDependOnK, cartesian, fork);
            }
            @Override
            public Maybe<__2<K, A, B>> exl(Exl<K, Tensor, Hom, B, ?, A> exl) {
                return reduceToCartesianExl(tensorDontDependOnK, cartesian, exl);
            }
            @Override
            public Maybe<__2<K, A, B>> exr(Exr<K, Tensor, Hom, B, ?, A> exr) {
                return reduceToCartesianExr(tensorDontDependOnK, cartesian, exr);
            }
            @Override
            public Maybe<__2<K, A, B>> identity(Identity<A, B> identity) {
                return Maybe.Just(
                    TypeEq
                        .<K, A, B>__2()
                        .coerce(
                            identity
                                .typeEq()
                                .symm()
                                .<__<K, A>>lift()
                                .coerce(cartesian.<A>identity())
                        )
                );
            }
            @Override
            public Maybe<__2<K, A, B>> dot(Dot<K, Tensor, Hom, A, ?, B> dot) {
                return reduceToCartesianDot(tensorDontDependOnK, cartesian, dot);
            }
            @Override
            public Maybe<__2<K, A, B>> lift(__2<K, A, B> k) {
                return Maybe.Just(k);
            }
        });
    }

    private static <K,Tensor,Hom,A,B,C,D> Maybe<__2<K,A,B>> reduceToCartesianFork(TensorDontDependOnK<Tensor> tensorDontDependOnK, Cartesian<K,Tensor> cartesian, Fork<K,Tensor,Hom,A,C,D,B> fork) {
        return org.highj.Hkt.asMaybe(Maybe.monad.apply2(
            (__2<K, A, C> k1) -> (__2<K, A, D> k2) ->
                TypeEq.<K, A, B>__2().coerce(fork.typeEq().symm().<__<K, A>>lift().coerce(
                    tensorDontDependOnK.<C, D, K, __<__<__<µ, K>, Tensor>, Hom>>typeEq().<__<K, A>>lift().coerce(
                        cartesian.fork(k1, k2)
                    )
                )),
            fork.k1().reduceToCartesian(tensorDontDependOnK, cartesian),
            fork.k2().reduceToCartesian(tensorDontDependOnK, cartesian)
        ));
    }

    private static <K,Tensor,Hom,A,B,C> Maybe<__2<K,A,B>> reduceToCartesianExl(TensorDontDependOnK<Tensor> tensorDontDependOnK, Cartesian<K,Tensor> cartesian, Exl<K, Tensor, Hom, B, C, A> exl) {
        return Maybe.Just(
            TypeEq.<K, A, B>__2()
                .coerce(
                    exl.typeEq()
                        .symm()
                        .<K, B>lift2()
                        .coerce(
                            tensorDontDependOnK
                                .<B, C, K, __<__<__<µ, K>, Tensor>, Hom>>typeEq()
                                .<K, B>lift2()
                                .coerce(cartesian.exl())
                        )
                )
        );
    }

    private static <K,Tensor,Hom,A,B,C> Maybe<__2<K,A,B>> reduceToCartesianExr(TensorDontDependOnK<Tensor> tensorDontDependOnK, Cartesian<K,Tensor> cartesian, Exr<K,Tensor,Hom,B,C,A> exr) {
        return Maybe.Just(
            TypeEq.<K,A,B>__2()
                .coerce(
                    exr.typeEq()
                        .symm()
                        .<K, B>lift2()
                        .coerce(
                            tensorDontDependOnK
                                .<C, B, K, __<__<__<µ, K>, Tensor>, Hom>>typeEq()
                                .<K, B>lift2()
                                .coerce(cartesian.exr())
                        )
                )
        );
    }

    private static <K,Tensor,Hom,A,B,C> Maybe<__2<K,A,B>> reduceToCartesianDot(TensorDontDependOnK<Tensor> tensorDontDependOnK, Cartesian<K,Tensor> cartesian, Dot<K,Tensor,Hom,A,C,B> dot) {
        return Maybe.firstBiasedMonadPlus.mplus(
            Maybe.monad.apply2(
                (__2<K,C,B> k1) -> (__2<K,A,C> k2) ->
                    cartesian.dot(k1, k2),
                dot.k1().reduceToCartesian(tensorDontDependOnK, cartesian),
                dot.k2().reduceToCartesian(tensorDontDependOnK, cartesian)
            ),
            // eval . (curry h `fork` g) = h . (id `fork` g)
            dot.k1().match(new CasesAdapter<Maybe<__2<K,A,B>>,K,Tensor,Hom,C,B>(Maybe.Nothing()) {
                @Override
                public Maybe<__2<K, A, B>> eval(Eval<K, Tensor, Hom, ?, B, C> eval) {
                    return reduceToCartesianDotK1Eval(tensorDontDependOnK, cartesian, dot, eval);
                }
            })
        );
    }

    private static <K,Tensor,Hom,A,B,C,D> Maybe<__2<K,A,B>> reduceToCartesianDotK1Eval(TensorDontDependOnK<Tensor> tensorDontDependOnK, Cartesian<K,Tensor> cartesian, Dot<K,Tensor,Hom,A,C,B> dot, Eval<K, Tensor, Hom, D, B, C> eval) {
        // eval . (curry h `fork` g) = h . (id `fork` g)
        return dot.k2().match(new CasesAdapter<Maybe<__2<K,A,B>>,K,Tensor,Hom,A,C>(Maybe.Nothing()) {
            @Override
            public Maybe<__2<K, A, B>> fork(Fork<K, Tensor, Hom, A, ?, ?, C> fork) {
                return reduceToCartesianDotK1EvalK2Fork(tensorDontDependOnK, cartesian, dot, eval, fork);
            }
        });
    }

    private static <K,Tensor,Hom,A,B,C,D,E,F> Maybe<__2<K,A,B>> reduceToCartesianDotK1EvalK2Fork(TensorDontDependOnK<Tensor> tensorDontDependOnK, Cartesian<K,Tensor> cartesian, Dot<K,Tensor,Hom,A,C,B> dot, Eval<K, Tensor, Hom, D, B, C> eval, Fork<K, Tensor, Hom, A, E, F, C> fork) {
        // eval . (curry h `fork` g) = h . (id `fork` g)
        return fork.k1().match(new CasesAdapter<Maybe<__2<K,A,B>>,K,Tensor,Hom,A,E>(Maybe.Nothing()) {
            @Override
            public Maybe<__2<K, A, B>> curry(Curry<K, Tensor, Hom, A, ?, ?, E> curry) {
                return reduceToCartesianDotK1EvalK2ForkK1Curry(tensorDontDependOnK, cartesian, dot, eval, fork, curry);
            }
        });
    }

    private static <K,Tensor,Hom,A,B,C,D,E,F,G,H> Maybe<__2<K,A,B>> reduceToCartesianDotK1EvalK2ForkK1Curry(TensorDontDependOnK<Tensor> tensorDontDependOnK, Cartesian<K,Tensor> cartesian, Dot<K,Tensor,Hom,A,C,B> dot, Eval<K, Tensor, Hom, D, B, C> eval, Fork<K, Tensor, Hom, A, E, F, C> fork, Curry<K, Tensor, Hom, A, G, H, E> curry) {
        // eval . (curry h `fork` g) = h . (id `fork` g)
        FreeCCC<K, Tensor, Hom, __3<Tensor, __<__<__<µ, K>, Tensor>, Hom>, A, G>, H> x1 = curry.k();
        FreeCCC<K, Tensor, Hom, A, __3<Tensor, __<__<__<µ, K>, Tensor>, Hom>, A, F>> x2 = FreeCCC.fork(FreeCCC.identity(), fork.k2());
        // TODO: Make this type safe.
        //noinspection unchecked
        FreeCCC<K,Tensor,Hom,A,B> x = FreeCCC.dot((FreeCCC) x1, (FreeCCC) x2);
        return x.reduceToCartesian(tensorDontDependOnK, cartesian);
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
        private final TypeEq<C,__3<Tensor,__<__<__<µ,K>,Tensor>,Hom>,B,A>> _typeEq;

        public Exr(TypeEq<C, __3<Tensor, __<__<__<µ, K>, Tensor>, Hom>, B, A>> typeEq) {
            this._typeEq = typeEq;
        }

        public TypeEq<C, __3<Tensor, __<__<__<µ, K>, Tensor>, Hom>, B,A>> typeEq() {
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

        public FreeCCC<K, Tensor, Hom, A, B> k2() {
            return _k2;
        }
    }

    @Override
    public String toString() {
        return match(new Cases<String,K,Tensor,Hom,A,B>() {
            @Override
            public String eval(Eval<K, Tensor, Hom, ?, B, A> eval) {
                return "eval";
            }
            @Override
            public String curry(Curry<K, Tensor, Hom, A, ?, ?, B> curry) {
                return "(curry " + curry.k().toString() + ")";
            }
            @Override
            public String uncurry(Uncurry<K, Tensor, Hom, ?, ?, B, A> uncurry) {
                return "(uncurry " + uncurry.k().toString() + ")";
            }
            @Override
            public String fork(Fork<K, Tensor, Hom, A, ?, ?, B> fork) {
                return "(" + fork.k1().toString() + " `fork` " + fork.k2().toString() + ")";
            }
            @Override
            public String exl(Exl<K, Tensor, Hom, B, ?, A> exl) {
                return "exl";
            }
            @Override
            public String exr(Exr<K, Tensor, Hom, B, ?, A> exr) {
                return "exr";
            }
            @Override
            public String identity(Identity<A, B> identity) {
                return "id";
            }
            @Override
            public String dot(Dot<K, Tensor, Hom, A, ?, B> dot) {
                return "(" + dot.k1().toString() + " . " + dot.k2().toString() + ")";
            }
            @Override
            public String lift(__2<K, A, B> k) {
                return "(lift ?)";
            }
        });
    }
}
