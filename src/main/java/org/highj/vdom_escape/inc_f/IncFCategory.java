package org.highj.vdom_escape.inc_f;

import org.derive4j.hkt.__2;
import org.highj.data.tuple.T2;
import org.highj.typeclass2.arrow.Category;
import org.highj.vdom_escape.Delta;
import org.highj.vdom_escape.IncF;
import org.highj.vdom_escape.IncF2;

public interface IncFCategory extends IncFSemigroupoid, Category<IncF.µ> {
    @Override
    default <B> __2<IncF.µ, B, B> identity() {
        class Util {
            private IncF2<B,B> identity2 = null;
        }
        final Util util = new Util();
        util.identity2 =
            (Delta<B,?> db) ->
                T2.of(db, util.identity2);
        return (IncF<B,B>)(B b) -> T2.of(b, util.identity2);
    }
}
