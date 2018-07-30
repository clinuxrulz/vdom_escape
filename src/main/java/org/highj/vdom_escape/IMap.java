package org.highj.vdom_escape;

import org.highj.data.Map;
import org.highj.data.tuple.T2;
import org.highj.function.F1;

import java.util.Iterator;

public class IMap<K,A> {
    private final Map<K,A> _data;

    private IMap(Map<K,A> data) {
        this._data = data;
    }

    public static <K,A> IMap<K,A> create(Map<K,A> data) {
        return new IMap<>(data);
    }

    public <DA> IMap<K,A> patch(MapChanges<K,A,DA> mapChanges) {
        Map<K,A> at = this._data;
        Iterator<T2<K, MapChange<A, DA>>> it = mapChanges.changes().iterator();
        while (it.hasNext()) {
            T2<K,MapChange<A,DA>> change = it.next();
            at = change._2().match(new MapChange.Cases<F1<Map<K,A>,Map<K,A>>,A,DA>() {
                @Override
                public F1<Map<K,A>,Map<K,A>> add(A a) {
                    return (Map<K,A> at2) -> at2.plus(change._1(), a);
                }
                @Override
                public F1<Map<K,A>,Map<K,A>> remove() {
                    return (Map<K,A> at2) -> at2.minus(change._1());
                }
                @Override
                public F1<Map<K,A>,Map<K,A>> update(DA da) {
                    return (Map<K,A> at2) ->
                        at2.apply(change._1())
                            .map((A a) -> at2.plus(change._1(), mapChanges.elementPatch().apply(a, da)))
                            .getOrElse(at2);
                }
            }).apply(at);
        }
        return new IMap<>(at);
    }
}
