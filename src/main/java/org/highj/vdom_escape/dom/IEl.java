package org.highj.vdom_escape.dom;

import org.derive4j.hkt.__;
import org.derive4j.hkt.__3;
import org.highj.data.tuple.T2;
import org.highj.vdom_escape.*;

import java.util.function.Consumer;

public class IEl {

    public static ILC<Element> el(
        String element,
        ILC<Atomic<String>> text,
        ILC<IMap<String,Atomic<String>>> attributes,
        ILC<IMap<String,Atomic<Consumer<DomEvent>>>> handlers,
        ILC<IMap<Integer,Element>> children
    ) {
        return ILC.ap(
            ILC.liftIncF(incFEl(element)),
            t2(text, t2(attributes, t2(handlers, children)))
        );
    }

    private static IncF<
        __3<
            T2Tensor.µ,
            ILC.µ,
            Atomic<String>, // text
            __3<
                T2Tensor.µ,
                ILC.µ,
                IMap<String,Atomic<String>>, // attributes
                __3<
                    T2Tensor.µ,
                    ILC.µ,
                    IMap<String,Atomic<Consumer<DomEvent>>>, // handlers
                    IMap<Integer,Element> // children
                >
            >
        >,
        Element
    > incFEl(String element) {
        class Util {
            private IncF2<
                __3<
                    T2Tensor.µ,
                    ILC.µ,
                    Atomic<String>, // text
                    __3<
                        T2Tensor.µ,
                        ILC.µ,
                        IMap<String,Atomic<String>>, // attributes
                        __3<
                            T2Tensor.µ,
                            ILC.µ,
                            IMap<String,Atomic<Consumer<DomEvent>>>, // handlers
                            IMap<Integer,Element> // children
                            >
                        >
                    >,
                Element
            > incF2;
        }
        final Util util = new Util();
        util.incF2 = (Delta<__3<T2Tensor.µ, ILC.µ, Atomic<String>, __3<T2Tensor.µ, ILC.µ, IMap<String, Atomic<String>>, __3<T2Tensor.µ, ILC.µ, IMap<String, Atomic<Consumer<DomEvent>>>, IMap<Integer, Element>>>>,?> x1) -> {
            // TODO: Finish this
            throw new UnsupportedOperationException();
        };
        return (__3<T2Tensor.µ, ILC.µ, Atomic<String>, __3<T2Tensor.µ, ILC.µ, IMap<String, Atomic<String>>, __3<T2Tensor.µ, ILC.µ, IMap<String, Atomic<Consumer<DomEvent>>>, IMap<Integer, Element>>>> x1) -> {
            T2Tensor<ILC.µ, Atomic<String>, __3<T2Tensor.µ, ILC.µ, IMap<String, Atomic<String>>, __3<T2Tensor.µ, ILC.µ, IMap<String, Atomic<Consumer<DomEvent>>>, IMap<Integer, Element>>>> x2 = T2Tensor.narrow(x1);
            T2Tensor<ILC.µ, IMap<String, Atomic<String>>, __3<T2Tensor.µ, ILC.µ, IMap<String, Atomic<Consumer<DomEvent>>>, IMap<Integer, Element>>> x3 = T2Tensor.narrow(x2.t()._2());
            T2Tensor<ILC.µ, IMap<String, Atomic<Consumer<DomEvent>>>, IMap<Integer, Element>> x4 = T2Tensor.narrow(x3.t()._2());
            return T2.of(
                Element.create(
                    element,
                    x2.t()._1(),
                    x3.t()._1(),
                    x4.t()._1(),
                    x4.t()._2()
                ),
                util.incF2
            );
        };
    }

    public static <A,B> ILC<__3<T2Tensor.µ, ILC.µ, A, B>> t2(ILC<A> a, ILC<B> b) {
        CCC<__<__<__<FreeCCC.µ, IncF.µ>, T2Tensor.µ>, PHom.µ>, T2Tensor.µ, PHom.µ> ccc = FreeCCC.ccc();
        return ILC.narrow(
            T2Tensor.tensorDontDependOnK
                .<A, B, __<__<__<FreeCCC.µ, IncF.µ>, T2Tensor.µ>, PHom.µ>, ILC.µ>typeEq()
                .<ILC.µ>lift()
                .coerce(
                    ILC.ap(
                        ILC.narrow(
                            PHom.homDontDependOnK
                                .<B, __3<T2Tensor.µ, __<__<__<FreeCCC.µ, IncF.µ>, T2Tensor.µ>, PHom.µ>, A, B>, __<__<__<FreeCCC.µ, IncF.µ>, T2Tensor.µ>, PHom.µ>, ILC.µ>typeEq()
                                .<ILC.µ>lift()
                                .coerce(
                                    ILC.ap(
                                        ILC.liftFreeCCC(
                                            FreeCCC.narrow(
                                                ccc.curry(
                                                    ccc.identity()
                                                )
                                            )
                                        ),
                                        a
                                    )
                                )
                        ),
                        b
                    )
                )
        );
    }
}
