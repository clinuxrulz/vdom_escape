package org.highj.vdom_escape;

import org.derive4j.hkt.__2;
import org.highj.data.tuple.T2;
import org.highj.vdom_escape.inc_f.IncFCartesian;
import org.highj.vdom_escape.inc_f.IncFCategory;
import org.highj.vdom_escape.inc_f.IncFSemigroupoid;

public interface IncF<A,B> extends __2<IncF.µ,A,B> {
    final class µ {}

    T2<B,IncF2<A,B>> apply(A a);

    IncFSemigroupoid semigroupoid = new IncFSemigroupoid() {};

    IncFCategory category = new IncFCategory() {};

    static <U> IncFCartesian<U> cartesian() {
        return new IncFCartesian<U>() {};
    }
}
