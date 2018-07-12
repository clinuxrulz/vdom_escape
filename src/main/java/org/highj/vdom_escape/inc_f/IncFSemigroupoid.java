package org.highj.vdom_escape.inc_f;

import org.derive4j.hkt.__2;
import org.highj.Hkt;
import org.highj.data.tuple.T2;
import org.highj.typeclass2.arrow.Semigroupoid;
import org.highj.vdom_escape.Delta;
import org.highj.vdom_escape.IncF;
import org.highj.vdom_escape.IncF2;

public interface IncFSemigroupoid extends Semigroupoid<IncF.µ> {

    default <B, C, D> __2<IncF.µ, B, D> dot(__2<IncF.µ, C, D> cd, __2<IncF.µ, B, C> bc) {
        class Util {
            private IncF2<B,D> dot2(IncF2<C,D> cd, IncF2<B,C> bc) {
                return (IncF2<B,D>)(Delta<B,?> db) -> {
                    T2<Delta<C, ?>, IncF2<B, C>> x1 = bc.apply(db);
                    T2<Delta<D, ?>, IncF2<C, D>> x2 = cd.apply(x1._1());
                    return T2.of(x2._1(), dot2(x2._2(), x1._2()));
                };
            }
        }
        final Util util = new Util();
        return (IncF<B,D>)(B b) -> {
            T2<C, IncF2<B, C>> x1 = Hkt.asIncF(bc).apply(b);
            T2<D, IncF2<C, D>> x2 = Hkt.asIncF(cd).apply(x1._1());
            return T2.of(x2._1(), util.dot2(x2._2(), x1._2()));
        };
    }
}
