package org.highj.vdom_escape.free_ccc;

import org.derive4j.hkt.__;
import org.derive4j.hkt.__2;
import org.derive4j.hkt.__3;
import org.highj.vdom_escape.CCC;
import org.highj.vdom_escape.FreeCCC;

public interface FreeCCCCCC<K,Tensor,Hom> extends FreeCCCCartesian<K,Tensor,Hom>, CCC<__<__<__<FreeCCC.µ,K>,Tensor>,Hom>,Tensor,Hom> {
    @Override
    default <A, B> __2<__<__<__<FreeCCC.µ, K>, Tensor>, Hom>, __3<Tensor, __<__<__<FreeCCC.µ, K>, Tensor>, Hom>, __3<Hom, __<__<__<FreeCCC.µ, K>, Tensor>, Hom>, A, B>, A>, B> eval() {
        return FreeCCC.eval();
    }
    @Override
    default <A, B, C> __2<__<__<__<FreeCCC.µ, K>, Tensor>, Hom>, A, __3<Hom, __<__<__<FreeCCC.µ, K>, Tensor>, Hom>, B, C>> curry(__2<__<__<__<FreeCCC.µ, K>, Tensor>, Hom>, __3<Tensor, __<__<__<FreeCCC.µ, K>, Tensor>, Hom>, A, B>, C> k) {
        return FreeCCC.curry(FreeCCC.narrow(k));
    }
    @Override
    default <A, B, C> __2<__<__<__<FreeCCC.µ, K>, Tensor>, Hom>, __3<Tensor, __<__<__<FreeCCC.µ, K>, Tensor>, Hom>, A, B>, C> uncurry(__2<__<__<__<FreeCCC.µ, K>, Tensor>, Hom>, A, __3<Hom, __<__<__<FreeCCC.µ, K>, Tensor>, Hom>, B, C>> k) {
        return FreeCCC.uncurry(FreeCCC.narrow(k));
    }
}
