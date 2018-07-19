package org.highj.vdom_escape;

public abstract class MapChange<K,A,DA> {
    public interface Cases<R,K,A,DA> {
        R add(K key, A a);
        R remove(K key);
        R update(K key, DA da);
    }

    public abstract <R> R match(Cases<R,K,A,DA> cases);

    public static <K,A,DA> MapChange<K,A,DA> add(K key, A a) {
        return new MapChange<K,A,DA>() {
            @Override
            public <R> R match(Cases<R, K, A, DA> cases) {
                return cases.add(key, a);
            }
        };
    }

    public static <K,A,DA> MapChange<K,A,DA> remove(K key) {
        return new MapChange<K,A,DA>() {
            @Override
            public <R> R match(Cases<R, K, A, DA> cases) {
                return cases.remove(key);
            }
        };
    }

    public static <K,A,DA> MapChange<K,A,DA> update(K key, DA da) {
        return new MapChange<K,A,DA>() {
            @Override
            public <R> R match(Cases<R, K, A, DA> cases) {
                return cases.update(key, da);
            }
        };
    }
}
