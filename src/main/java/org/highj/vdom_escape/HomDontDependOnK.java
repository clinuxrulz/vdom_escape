package org.highj.vdom_escape;

import org.derive4j.hkt.TypeEq;
import org.derive4j.hkt.__3;

public interface HomDontDependOnK<Hom> {
    <A,B,K1,K2> TypeEq<__3<Hom,K1,A,B>,__3<Hom,K2,A,B>> typeEq();
}
