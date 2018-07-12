package org.highj.vdom_escape.inc_f;

import org.derive4j.hkt.__2;
import org.derive4j.hkt.__3;
import org.highj.Hkt;
import org.highj.data.tuple.T2;
import org.highj.vdom_escape.*;

public interface IncFCartesian<U> extends IncFCategory, Cartesian<IncF.µ, T2Tensor.µ> {

    @Override
    default <A, C, D> __2<IncF.µ, A, __3<T2Tensor.µ, IncF.µ, C, D>> fork(__2<IncF.µ, A, C> ac, __2<IncF.µ, A, D> ad) {
        class Util {
            private IncF2<A,__3<T2Tensor.µ, IncF.µ, C, D>> fork2(IncF2<A,C> ac, IncF2<A,D> ad) {
                return (Delta<A,?> da) -> {
                    T2<Delta<C, ?>, IncF2<A, C>> x1 = ac.apply(da);
                    T2<Delta<D, ?>, IncF2<A, D>> x2 = ad.apply(da);
                    Delta<__3<T2Tensor.µ,IncF.µ, C, D>, T2<Delta<C, ?>, Delta<D, ?>>> x3 = Delta.create(
                        (__3<T2Tensor.µ,IncF.µ, C, D> cd, T2<Delta<C, ?>, Delta<D, ?>> dcd) ->
                            T2Tensor.create(T2.of(
                                dcd._1().patch(Hkt.asT2Tensor(cd).t()._1()),
                                dcd._2().patch(Hkt.asT2Tensor(cd).t()._2())
                            )),
                        T2.of(x1._1(), x2._1())
                    );
                    return T2.of(x3, fork2(x1._2(), x2._2()));
                };
            }
        }
        final Util util = new Util();
        return (IncF<A,__3<T2Tensor.µ, IncF.µ, C, D>>)(A a) -> {
            T2<C, IncF2<A, C>> x1 = Hkt.asIncF(ac).apply(a);
            T2<D, IncF2<A, D>> x2 = Hkt.asIncF(ad).apply(a);
            return T2.of(T2Tensor.create(T2.of(x1._1(), x2._1())), util.fork2(x1._2(), x2._2()));
        };
    }

    @Override
    default <A, B> __2<IncF.µ, __3<T2Tensor.µ, IncF.µ, A, B>, A> exl() {
        class Util {
            private IncF2<__3<T2Tensor.µ, IncF.µ, A, B>, A> exl2 = null;
        }
        final Util util = new Util();
        util.exl2 = (Delta<__3<T2Tensor.µ, IncF.µ, A, B>,?> dab) -> {
            //noinspection unchecked
            Delta<__3<T2Tensor.µ, IncF.µ, A, B>, T2<Delta<A,?>,Delta<B,?>>> dab2 = (Delta)dab;
            return T2.of(dab2.change()._1(), util.exl2);
        };
        return (IncF<__3<T2Tensor.µ, IncF.µ, A, B>,A>)(__3<T2Tensor.µ, IncF.µ, A, B> ab) -> {
            A l = Hkt.asT2Tensor(ab).t()._1();
            return T2.of(l, util.exl2);
        };
    }

    @Override
    default <A, B> __2<IncF.µ, __3<T2Tensor.µ, IncF.µ, A, B>, B> exr() {
        class Util {
            private IncF2<__3<T2Tensor.µ, IncF.µ, A, B>, B> exr2 = null;
        }
        final Util util = new Util();
        util.exr2 = (Delta<__3<T2Tensor.µ, IncF.µ, A, B>,?> dab) -> {
            //noinspection unchecked
            Delta<__3<T2Tensor.µ, IncF.µ, A, B>, T2<Delta<A,?>,Delta<B,?>>> dab2 = (Delta)dab;
            return T2.of(dab2.change()._2(), util.exr2);
        };
        return (IncF<__3<T2Tensor.µ, IncF.µ, A, B>, B>)(__3<T2Tensor.µ, IncF.µ, A, B> ab) -> {
            B r = Hkt.asT2Tensor(ab).t()._2();
            return T2.of(r, util.exr2);
        };
    }
}
