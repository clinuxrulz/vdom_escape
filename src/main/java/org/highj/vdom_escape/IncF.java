package org.highj.vdom_escape;

import org.derive4j.hkt.__2;
import org.highj.data.Map;
import org.highj.data.Maybe;
import org.highj.data.tuple.T2;
import org.highj.vdom_escape.inc_f.IncFCartesian;
import org.highj.vdom_escape.inc_f.IncFCategory;
import org.highj.vdom_escape.inc_f.IncFSemigroupoid;

public interface IncF<A,B> extends __2<IncF.µ,A,B> {
    final class µ {}

    T2<B,IncF2<A,B>> apply(A a);

    static <A,B> IncF<A,B> constant(B b, Delta<B,?> zeroDb) {
        class Util {
            private IncF2<A,B> constant2 = null;
        }
        final Util util = new Util();
        util.constant2 = (Delta<A,?> da) -> T2.of(
            zeroDb,
            util.constant2
        );
        return (A a) -> T2.of(b, util.constant2);
    }

    static <A,B> IncF<A,Atomic<B>> constantAtomic(Atomic<B> b) {
        return constant(
            b,
            Delta.<Atomic<B>,Maybe<B>>create(
                (b2, db) -> Atomic.create(db.getOrElse(b2.value())),
                Maybe.Nothing()
            )
        );
    }

    static <A,B,C> IncF<A,IMap<B,C>> constantIMap(IMap<B,C> b, Delta<C,?> zeroDc) {
        return constant(
            b,
            Delta.<IMap<B,C>,MapChanges<B,C,?>>create(
                IMap::patch,
                MapChanges.create(Map.empty(), zeroDc.patch())
            )
        );
    }

    IncFSemigroupoid semigroupoid = new IncFSemigroupoid() {};

    IncFCategory category = new IncFCategory() {};

    static <U> IncFCartesian<U> cartesian() {
        return new IncFCartesian<U>() {};
    }
}
