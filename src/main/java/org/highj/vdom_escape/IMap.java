package org.highj.vdom_escape;

import org.highj.data.Map;

public class IMap<K,A> {
    private final Map<K,A> _data;

    private IMap(Map<K,A> data) {
        this._data = data;
    }

    public static <K,A> IMap<K,A> create(Map<K,A> data) {
        return new IMap<>(data);
    }

}
