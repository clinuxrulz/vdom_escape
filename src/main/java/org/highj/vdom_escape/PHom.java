package org.highj.vdom_escape;

import org.derive4j.hkt.TypeEq;
import org.derive4j.hkt.__3;

/**
 * Phantom Hom
 */
public class PHom<K,A,B> implements __3<PHom.µ,K,A,B> {
    public static final class µ {}

    private PHom() {}

    public static final HomDontDependOnK<µ> homDontDependOnK = new HomDontDependOnK<µ>() {
        @Override
        public <A2, B2, K1, K2> TypeEq<__3<µ, K1, A2, B2>, __3<µ, K2, A2, B2>> typeEq() {
            //noinspection unchecked
            return (TypeEq)TypeEq.refl();
        }
    };
}
