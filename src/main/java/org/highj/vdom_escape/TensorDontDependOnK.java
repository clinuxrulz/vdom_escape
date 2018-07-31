package org.highj.vdom_escape;

import org.derive4j.hkt.TypeEq;
import org.derive4j.hkt.__3;

public interface TensorDontDependOnK<Tensor> {
    <A,B,K1,K2> TypeEq<__3<Tensor,K1,A,B>,__3<Tensor,K2,A,B>> typeEq();
}
