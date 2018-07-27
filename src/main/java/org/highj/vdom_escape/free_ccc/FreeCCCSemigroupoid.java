package org.highj.vdom_escape.free_ccc;

import org.derive4j.hkt.__;
import org.derive4j.hkt.__2;
import org.highj.typeclass2.arrow.Semigroupoid;
import org.highj.vdom_escape.FreeCCC;

public interface FreeCCCSemigroupoid<K,Tensor,Hom> extends Semigroupoid<__<__<__<FreeCCC.µ,K>,Tensor>,Hom>> {
    @Override
    default <B, C, D> __2<__<__<__<FreeCCC.µ, K>, Tensor>, Hom>, B, D> dot(__2<__<__<__<FreeCCC.µ, K>, Tensor>, Hom>, C, D> cd, __2<__<__<__<FreeCCC.µ, K>, Tensor>, Hom>, B, C> bc) {
        return FreeCCC.dot(FreeCCC.narrow(cd), FreeCCC.narrow(bc));
    }
}
