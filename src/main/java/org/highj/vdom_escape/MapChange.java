package org.highj.vdom_escape;

public abstract class MapChange<A,DA> {
    public interface Cases<R,A,DA> {
        R add(A a);
        R remove();
        R update(DA da);
    }

    public abstract <R> R match(Cases<R,A,DA> cases);

    public static <A,DA> MapChange<A,DA> add(A a) {
        return new MapChange<A,DA>() {
            @Override
            public <R> R match(Cases<R, A, DA> cases) {
                return cases.add(a);
            }
        };
    }

    public static <A,DA> MapChange<A,DA> remove() {
        return new MapChange<A,DA>() {
            @Override
            public <R> R match(Cases<R, A, DA> cases) {
                return cases.remove();
            }
        };
    }

    public static <A,DA> MapChange<A,DA> update(DA da) {
        return new MapChange<A,DA>() {
            @Override
            public <R> R match(Cases<R, A, DA> cases) {
                return cases.update(da);
            }
        };
    }
}
