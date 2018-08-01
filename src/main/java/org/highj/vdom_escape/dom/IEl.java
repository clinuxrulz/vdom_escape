package org.highj.vdom_escape.dom;

import org.derive4j.hkt.__;
import org.derive4j.hkt.__3;
import org.highj.vdom_escape.*;

import java.util.function.Consumer;

public class IEl {

    public static <Hom> LC<IncF.µ,Hom,Element> el(
        String element,
        LC<IncF.µ,Hom,Atomic<String>> text,
        LC<IncF.µ,Hom,IMap<String,Atomic<String>>> attributes,
        LC<IncF.µ,Hom,IMap<String,Consumer<DomEvent>>> handlers,
        LC<IncF.µ,Hom,IMap<Integer,Element>> children
    ) {
        CCC<__<__<__<FreeCCC.µ, IncF.µ>, T2Tensor.µ>, Hom>, T2Tensor.µ, Hom> ccc = FreeCCC.<IncF.µ, T2Tensor.µ, Hom>ccc();
        //IncF.cartesian
        throw new UnsupportedOperationException();
    }

    public static <Hom,A,B> LC<__<__<__<FreeCCC.µ, IncF.µ>, T2Tensor.µ>, Hom>, Hom, __3<T2Tensor.µ, __<__<__<FreeCCC.µ, IncF.µ>, T2Tensor.µ>, Hom>, A, B>> t2(
        LC<__<__<__<FreeCCC.µ, IncF.µ>, T2Tensor.µ>, Hom>,Hom,A> a,
        LC<__<__<__<FreeCCC.µ, IncF.µ>, T2Tensor.µ>, Hom>,Hom,B> b
    ) {
        CCC<__<__<__<FreeCCC.µ, IncF.µ>, T2Tensor.µ>, Hom>, T2Tensor.µ, Hom> ccc = FreeCCC.ccc();
        return LC.ap(LC.ap(LC.lift(ccc.curry(ccc.identity())), a), b);
    }
}
