package org.highj.vdom_escape;

import org.highj.data.Map;
import org.highj.function.F2;

public class MapChanges<K,A,DA> {
    private final Map<K,MapChange<A,DA>> _changes;
    private final F2<A,DA,A> _elementPatch;

    private MapChanges(Map<K,MapChange<A,DA>> changes, F2<A,DA,A> elementPatch) {
        this._changes = changes;
        this._elementPatch = elementPatch;
    }

    public static <K,A,DA> MapChanges<K,A,DA> create(Map<K,MapChange<A,DA>> changes, F2<A,DA,A> elementPatch) {
        return new MapChanges<>(changes, elementPatch);
    }

    public Map<K, MapChange<A, DA>> changes() {
        return _changes;
    }

    public static <K,A,DA> MapChanges<K,A,DA> zero(F2<A,DA,A> elementPatch) {
        return create(Map.empty(), elementPatch);
    }

    public F2<A,DA,A> elementPatch() {
        return _elementPatch;
    }
}
