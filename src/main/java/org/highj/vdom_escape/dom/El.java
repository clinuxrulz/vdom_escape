package org.highj.vdom_escape.dom;

import org.derive4j.hkt.__2;
import org.derive4j.hkt.__3;
import org.highj.data.Maybe;
import org.highj.data.tuple.T2;
import org.highj.vdom_escape.*;

import java.util.function.Consumer;

/**
 * Element Factory
 */
public class El {

    public static <I> IncF<I,Element> div(
        IncF<I,Atomic<String>> text,
        IncF<I,IMap<String,Atomic<String>>> attributes,
        IncF<I,IMap<String,Atomic<Consumer<DomEvent>>>> handlers,
        IncF<I,IMap<Integer,Element>> children
    ) {
        return el("div", text, attributes, handlers, children);
    }

    public static <I> IncF<I,Element> h1(
        IncF<I,Atomic<String>> text,
        IncF<I,IMap<String,Atomic<String>>> attributes,
        IncF<I,IMap<String,Atomic<Consumer<DomEvent>>>> handlers,
        IncF<I,IMap<Integer,Element>> children
    ) {
        return el("h1", text, attributes, handlers, children);
    }

    public static <I> IncF<I,Element> input(
        IncF<I,Atomic<String>> text,
        IncF<I,IMap<String,Atomic<String>>> attributes,
        IncF<I,IMap<String,Atomic<Consumer<DomEvent>>>> handlers,
        IncF<I,IMap<Integer,Element>> children
    ) {
        return el("input", text, attributes, handlers, children);
    }

    public static <I> IncF<I,Element> p(
        IncF<I,Atomic<String>> text,
        IncF<I,IMap<String,Atomic<String>>> attributes,
        IncF<I,IMap<String,Atomic<Consumer<DomEvent>>>> handlers,
        IncF<I,IMap<Integer,Element>> children
    ) {
        return el("p", text, attributes, handlers, children);
    }

    public static <I> IncF<I,Element> text(
        IncF<I,Atomic<String>> text,
        IncF<I,IMap<String,Atomic<String>>> attributes,
        IncF<I,IMap<String,Atomic<Consumer<DomEvent>>>> handlers,
        IncF<I,IMap<Integer,Element>> children
    ) {
        return el("text", text, attributes, handlers, children);
    }

    private static IncF<
        __3<
            T2Tensor.µ,
            IncF.µ,
            Atomic<String>, // text
            __3<
                T2Tensor.µ,
                IncF.µ,
                IMap<String,Atomic<String>>, // attributes
                __3<
                    T2Tensor.µ,
                    IncF.µ,
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
                    IncF.µ,
                    Atomic<String>, // text
                    __3<
                        T2Tensor.µ,
                        IncF.µ,
                        IMap<String,Atomic<String>>, // attributes
                        __3<
                            T2Tensor.µ,
                            IncF.µ,
                            IMap<String,Atomic<Consumer<DomEvent>>>, // handlers
                            IMap<Integer,Element> // children
                            >
                        >
                    >,
                Element
                > incF2;
        }
        final Util util = new Util();
        util.incF2 = (Delta<__3<T2Tensor.µ, IncF.µ, Atomic<String>, __3<T2Tensor.µ, IncF.µ, IMap<String, Atomic<String>>, __3<T2Tensor.µ, IncF.µ, IMap<String, Atomic<Consumer<DomEvent>>>, IMap<Integer, Element>>>>,?> x1) -> {
            // TODO: Fix me, very error prone.
            //noinspection unchecked
            T2<Delta<Atomic<String>,Maybe<String>>,Delta<__3<T2Tensor.µ, IncF.µ, IMap<String, Atomic<String>>, __3<T2Tensor.µ, IncF.µ, IMap<String, Atomic<Consumer<DomEvent>>>, IMap<Integer, Element>>>,?>> x2 = (T2)x1.change();
            //noinspection unchecked
            T2<Delta<IMap<String,Atomic<String>>,MapChanges<String,Atomic<String>,Maybe<String>>>,Delta<__3<T2Tensor.µ, IncF.µ, IMap<String, Atomic<Consumer<DomEvent>>>, IMap<Integer, Element>>,?>> x3 = (T2)x2._2().change();
            //noinspection unchecked
            T2<Delta<IMap<String,Atomic<Consumer<DomEvent>>>,MapChanges<String,Atomic<Consumer<DomEvent>>,Maybe<Consumer<DomEvent>>>>,Delta<IMap<Integer, Element>,?>> x4 = (T2)x3._2().change();
            //noinspection unchecked
            Delta<IMap<Integer, Element>,MapChanges<Integer,Element,ElementChanges>> x5 = (Delta)x4._2();
            return T2.of(
                Delta.create(
                    Element::patch,
                    ElementChanges.create(
                        x2._1().change(),
                        x3._1().change(),
                        x4._1().change(),
                        x5.change()
                    )
                ),
                util.incF2
            );
        };
        return (__3<T2Tensor.µ, IncF.µ, Atomic<String>, __3<T2Tensor.µ, IncF.µ, IMap<String, Atomic<String>>, __3<T2Tensor.µ, IncF.µ, IMap<String, Atomic<Consumer<DomEvent>>>, IMap<Integer, Element>>>> x1) -> {
            T2Tensor<IncF.µ, Atomic<String>, __3<T2Tensor.µ, IncF.µ, IMap<String, Atomic<String>>, __3<T2Tensor.µ, IncF.µ, IMap<String, Atomic<Consumer<DomEvent>>>, IMap<Integer, Element>>>> x2 = T2Tensor.narrow(x1);
            T2Tensor<IncF.µ, IMap<String, Atomic<String>>, __3<T2Tensor.µ, IncF.µ, IMap<String, Atomic<Consumer<DomEvent>>>, IMap<Integer, Element>>> x3 = T2Tensor.narrow(x2.t()._2());
            T2Tensor<IncF.µ, IMap<String, Atomic<Consumer<DomEvent>>>, IMap<Integer, Element>> x4 = T2Tensor.narrow(x3.t()._2());
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

    public static <I> IncF<I,Element> el(
        String element,
        __2<IncF.µ,I,Atomic<String>> text,
        __2<IncF.µ,I,IMap<String,Atomic<String>>> attributes,
        __2<IncF.µ,I,IMap<String,Atomic<Consumer<DomEvent>>>> handlers,
        __2<IncF.µ,I,IMap<Integer,Element>> children
    ) {
        return IncF.narrow(IncF.semigroupoid.dot(
            incFEl(element),
            t2(text, t2(attributes, t2(handlers, children)))
        ));
    }

    public static <I,A,B> IncF<I,__3<T2Tensor.µ, IncF.µ, A, B>> t2(
        __2<IncF.µ,I,A> a,
        __2<IncF.µ,I,B> b
    ) {
        return IncF.narrow(IncF.cartesian.fork(a, b));
    }
}
