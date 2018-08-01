package org.highj.vdom_escape;

import org.derive4j.hkt.__;
import org.derive4j.hkt.__2;
import org.derive4j.hkt.__3;
import org.derive4j.hkt.__5;
import org.highj.Hkt;
import org.highj.data.Maybe;

import java.util.function.Function;

public class ILC<A> implements __<ILC.µ,A> {
    public static final class µ {}

    private final LC<__<__<__<FreeCCC.µ,IncF.µ>,T2Tensor.µ>,PHom.µ>,PHom.µ,A> lc;

    private ILC(LC<__<__<__<FreeCCC.µ,IncF.µ>,T2Tensor.µ>,PHom.µ>,PHom.µ,A> lc) {
        this.lc = lc;
    }

    public static <A> ILC<A> ilc(
        LC<__<__<__<FreeCCC.µ,IncF.µ>,T2Tensor.µ>,PHom.µ>,PHom.µ,A> lc
    ) {
        return new ILC<>(lc);
    }

    public static <A> ILC<A> narrow(__<ILC.µ,A> a) {
        return (ILC<A>)a;
    }

    public LC<__<__<__<FreeCCC.µ,IncF.µ>,T2Tensor.µ>,PHom.µ>,PHom.µ,A> lc() {
        return lc;
    }

    public static <A,B> ILC<__3<PHom.µ,µ,A,B>> lam(Function<ILC<A>,ILC<B>> fn) {
        return narrow(
            PHom.homDontDependOnK
                .<A, B, __<__<__<FreeCCC.µ, IncF.µ>, T2Tensor.µ>, PHom.µ>, µ>typeEq()
                .<µ>lift()
                .coerce(
                    ILC.ilc(
                        LC.lam(
                            (LC<__<__<__<FreeCCC.µ, IncF.µ>, T2Tensor.µ>, PHom.µ>, PHom.µ, A> a) ->
                                fn.apply(ILC.ilc(a)).lc()
                        )
                    )
                )
        );
    }

    public static <A,B> ILC<B> ap(ILC<__3<PHom.µ,µ,A,B>> fn, ILC<A> a) {
        return ILC.ilc(LC.ap(
            narrow(
                PHom.homDontDependOnK
                    .<A,B,µ,__<__<__<FreeCCC.µ, IncF.µ>, T2Tensor.µ>, PHom.µ>>typeEq()
                    .<µ>lift()
                    .coerce(fn)
            ).lc(),
            a.lc()
        ));
    }

    public static <A,B> ILC<__3<PHom.µ,µ,A,B>> liftIncF(__2<IncF.µ,A,B> fn) {
        return narrow(
            PHom.homDontDependOnK
                .<A,B,__<__<__<FreeCCC.µ, IncF.µ>, T2Tensor.µ>, PHom.µ>,µ>typeEq()
                .<µ>lift()
                .coerce(ILC.ilc(LC.lift(FreeCCC.lift(fn))))
        );
    }

    public static <A,B> ILC<__3<PHom.µ,µ,A,B>> liftFreeCCC(__5<FreeCCC.µ,IncF.µ,T2Tensor.µ,PHom.µ,A,B> fn) {
        return narrow(
            PHom.homDontDependOnK
                .<A,B,__<__<__<FreeCCC.µ, IncF.µ>, T2Tensor.µ>, PHom.µ>,µ>typeEq()
                .<µ>lift()
                .coerce(ILC.ilc(LC.lift(fn)))
        );
    }

    public static <A,B> Maybe<IncF<A,B>> compile(ILC<__3<PHom.µ,µ,A,B>> lc) {
        return LC
            .toCCC(
                FreeCCC.<IncF.µ, T2Tensor.µ, PHom.µ>ccc(),
                LC.narrow(PHom.homDontDependOnK.<A, B, µ, __<__<__<FreeCCC.µ, IncF.µ>, T2Tensor.µ>, PHom.µ>>typeEq().subst(lc.lc()))
            )
            .map(FreeCCC::narrow)
            .bind(
                (FreeCCC<IncF.µ, T2Tensor.µ, PHom.µ, A, B> x) ->
                    x.reduceToCartesian(T2Tensor.tensorDontDependOnK, IncF.cartesian)
            )
            .map(Hkt::asIncF);
    }
}
