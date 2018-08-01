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
