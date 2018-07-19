package org.highj.vdom_escape;

import org.highj.data.Map;

public class MapChanges<K,A,DA> {
    private final Map<K,MapChange<K,A,DA>> _changes;

    private MapChanges(Map<K,MapChange<K,A,DA>> changes) {
        this._changes = changes;
    }

    public <K,A,DA> MapChanges<K,A,DA> create(Map<K,MapChange<K,A,DA>> changes) {
        return new MapChanges<>(changes);
    }

    public Map<K, MapChange<K, A, DA>> changes() {
        return _changes;
    }
}
