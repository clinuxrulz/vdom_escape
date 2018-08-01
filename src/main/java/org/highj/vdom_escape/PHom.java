package org.highj.vdom_escape;

import org.derive4j.hkt.TypeEq;
import org.derive4j.hkt.__3;

/**
 * Phantom Hom
 */
public class PHom<K,A,B> {
    private PHom() {}

    public static final HomDontDependOnK<PHom> homDontDependOnK = new HomDontDependOnK<PHom>() {
        @Override
        public <A2, B2, K1, K2> TypeEq<__3<PHom, K1, A2, B2>, __3<PHom, K2, A2, B2>> typeEq() {
            //noinspection unchecked
            return (TypeEq)TypeEq.refl();
        }
    };
}
