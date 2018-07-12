package org.highj.vdom_escape;

import org.derive4j.hkt.__2;
import org.derive4j.hkt.__3;
import org.highj.typeclass2.arrow.Category;

public interface Cartesian<K, Tensor> extends Category<K> {

    <A,C, D> __2<K, A, __3<Tensor, K, C, D>> fork(__2<K, A, C> first, __2<K, A, D> second);

    <A,B> __2<K, __3<Tensor, K, A, B>,  A> exl();

    <A,B> __2<K, __3<Tensor, K, A, B>,  B> exr();

}