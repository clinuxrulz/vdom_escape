package org.highj.vdom_escape.free_ccc;

import org.derive4j.hkt.__;
import org.derive4j.hkt.__2;
import org.highj.typeclass2.arrow.Category;
import org.highj.vdom_escape.FreeCCC;

public interface FreeCCCCategory<K,Tensor,Hom> extends FreeCCCSemigroupoid<K,Tensor,Hom>, Category<__<__<__<FreeCCC.µ,K>,Tensor>,Hom>> {
    @Override
    default <B> __2<__<__<__<FreeCCC.µ, K>, Tensor>, Hom>, B, B> identity() {
        return FreeCCC.identity();
    }
}
