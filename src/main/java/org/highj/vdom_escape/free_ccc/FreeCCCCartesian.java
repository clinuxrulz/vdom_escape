package org.highj.vdom_escape.free_ccc;

import org.derive4j.hkt.__;
import org.derive4j.hkt.__2;
import org.derive4j.hkt.__3;
import org.highj.vdom_escape.Cartesian;
import org.highj.vdom_escape.FreeCCC;

public interface FreeCCCCartesian<K,Tensor,Hom> extends FreeCCCCategory<K,Tensor,Hom>, Cartesian<__<__<__<FreeCCC.µ,K>,Tensor>,Hom>,Tensor> {
    @Override
    default <A, C, D> __2<__<__<__<FreeCCC.µ, K>, Tensor>, Hom>, A, __3<Tensor, __<__<__<FreeCCC.µ, K>, Tensor>, Hom>, C, D>> fork(__2<__<__<__<FreeCCC.µ, K>, Tensor>, Hom>, A, C> first, __2<__<__<__<FreeCCC.µ, K>, Tensor>, Hom>, A, D> second) {
        return FreeCCC.fork(FreeCCC.narrow(first), FreeCCC.narrow(second));
    }

    @Override
    default <A, B> __2<__<__<__<FreeCCC.µ, K>, Tensor>, Hom>, __3<Tensor, __<__<__<FreeCCC.µ, K>, Tensor>, Hom>, A, B>, A> exl() {
        return FreeCCC.exl();
    }

    @Override
    default <A, B> __2<__<__<__<FreeCCC.µ, K>, Tensor>, Hom>, __3<Tensor, __<__<__<FreeCCC.µ, K>, Tensor>, Hom>, A, B>, B> exr() {
        return FreeCCC.exr();
    }
}
