package org.highj.vdom_escape;

import org.derive4j.hkt.__;
import org.derive4j.hkt.__2;
import org.derive4j.hkt.__3;
import org.highj.Hkt;
import org.highj.data.Maybe;

public class ILC<Hom,A> implements __2<ILC.µ,Hom,A> {
    public static final class µ {}

    private final LC<__<__<__<FreeCCC.µ,IncF.µ>,T2Tensor.µ>,Hom>,Hom,A> lc;

    public ILC(LC<__<__<__<FreeCCC.µ,IncF.µ>,T2Tensor.µ>,Hom>,Hom,A> lc) {
        this.lc = lc;
    }

    public static <Hom,A> ILC<Hom,A> narrow(__<__<ILC.µ,Hom>,A> a) {
        return Hkt.asILC(a);
    }

    public LC<__<__<__<FreeCCC.µ,IncF.µ>,T2Tensor.µ>,Hom>,Hom,A> lc() {
        return lc;
    }

    public static <Hom,A,B> Maybe<IncF<A,B>> compile(HomDontDependOnK<Hom> hom, ILC<Hom,__3<Hom,µ,A,B>> lc) {
        return LC
            .toCCC(
                FreeCCC.<IncF.µ, T2Tensor.µ, Hom>ccc(),
                LC.narrow(hom.<A, B, µ, __<__<__<FreeCCC.µ, IncF.µ>, T2Tensor.µ>, Hom>>typeEq().subst(lc.lc()))
            )
            .map(FreeCCC::narrow)
            .bind(
                (FreeCCC<IncF.µ, T2Tensor.µ, Hom, A, B> x) ->
                    x.reduceToCartesian(T2Tensor.tensorDontDependOnK, IncF.cartesian)
            )
            .map(Hkt::asIncF);
    }
}
