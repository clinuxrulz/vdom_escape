package org.highj.vdom_escape;

import org.derive4j.hkt.__2;
import org.highj.data.tuple.T2;

public interface IncF2<A,B> extends __2<IncF2.µ,A,B> {
    final class µ {}

    T2<Delta<B,?>,IncF2<A,B>> apply(Delta<A,?> da);
}
