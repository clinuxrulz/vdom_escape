package org.highj.vdom_escape;

import org.derive4j.hkt.__2;
import org.derive4j.hkt.__3;

public interface CCC<K,Tensor,Hom> extends Cartesian<K,Tensor> {

    <A, B> __2<K, __3<Tensor, K, __3<Hom, K, A, B>, A>, B> eval();

    <A, B, C> __2<K, A, __3<Hom, K, B, C>> curry(__2<K, __3<Tensor, K, A, B>, C> var1);

    <A, B, C> __2<K, __3<Tensor, K, A, B>, C> uncurry(__2<K, A, __3<Hom, K, B, C>> var1);

}
