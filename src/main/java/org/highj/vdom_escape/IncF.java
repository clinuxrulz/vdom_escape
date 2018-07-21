package org.highj.vdom_escape;

import org.derive4j.hkt.__2;
import org.highj.data.Maybe;
import org.highj.data.tuple.T2;
import org.highj.vdom_escape.inc_f.IncFCartesian;
import org.highj.vdom_escape.inc_f.IncFCategory;
import org.highj.vdom_escape.inc_f.IncFSemigroupoid;

public interface IncF<A,B> extends __2<IncF.µ,A,B> {
    final class µ {}

    T2<B,IncF2<A,B>> apply(A a);

    static <A,B> IncF<A,Atomic<B>> constant(Atomic<B> b) {
        class Util {
            private IncF2<A,Atomic<B>> constant2 = null;
        }
        final Util util = new Util();
        util.constant2 = (Delta<A,?> da) -> T2.of(
            Delta.<Atomic<B>,Maybe<B>>create(
                (b2, db) -> Atomic.create(db.getOrElse(b2.value())),
                Maybe.Nothing()
            ),
            util.constant2
        );
        return (A a) -> T2.of(b, util.constant2);
    }

    IncFSemigroupoid semigroupoid = new IncFSemigroupoid() {};

    IncFCategory category = new IncFCategory() {};

    static <U> IncFCartesian<U> cartesian() {
        return new IncFCartesian<U>() {};
    }
}
