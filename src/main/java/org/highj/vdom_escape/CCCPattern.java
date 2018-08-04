package org.highj.vdom_escape;

public abstract class CCCPattern {
    public interface Cases<R> {
        R eval();
        R curry(CCCPattern pattern);
        R uncurry(CCCPattern pattern);
        R fork(CCCPattern lhsPattern, CCCPattern rhsPattern);
        R exl();
        R exr();
        R identity();
        R dot(CCCPattern lhsPattern, CCCPattern rhsPattern);
        R var(int ident);
    }

    public abstract <R> R match(Cases<R> cases);

    public static CCCPattern eval() {
        return _eval;
    }
    private static final CCCPattern _eval = new CCCPattern() {
        @Override
        public <R> R match(Cases<R> cases) {
            return cases.eval();
        }
    };

    public static CCCPattern curry(CCCPattern pattern) {
        return new CCCPattern() {
            @Override
            public <R> R match(Cases<R> cases) {
                return cases.curry(pattern);
            }
        };
    }

    public static CCCPattern uncurry(CCCPattern pattern) {
        return new CCCPattern() {
            @Override
            public <R> R match(Cases<R> cases) {
                return cases.uncurry(pattern);
            }
        };
    }

    public static CCCPattern fork(CCCPattern lhsPattern, CCCPattern rhsPattern) {
        return new CCCPattern() {
            @Override
            public <R> R match(Cases<R> cases) {
                return cases.fork(lhsPattern, rhsPattern);
            }
        };
    }

    public static CCCPattern exl() {
        return _exl;
    }
    private static final CCCPattern _exl = new CCCPattern() {
        @Override
        public <R> R match(Cases<R> cases) {
            return cases.exl();
        }
    };

    public static CCCPattern exr() {
        return _exr;
    }
    private static final CCCPattern _exr = new CCCPattern() {
        @Override
        public <R> R match(Cases<R> cases) {
            return cases.exr();
        }
    };

    public static CCCPattern identity() {
        return _identity;
    }
    private static final CCCPattern _identity = new CCCPattern() {
        @Override
        public <R> R match(Cases<R> cases) {
            return cases.identity();
        }
    };

    public static CCCPattern dot(CCCPattern lhsPattern, CCCPattern rhsPattern) {
        return new CCCPattern() {
            @Override
            public <R> R match(Cases<R> cases) {
                return cases.dot(lhsPattern, rhsPattern);
            }
        };
    }

    public static CCCPattern var(int ident) {
        return new CCCPattern() {
            @Override
            public <R> R match(Cases<R> cases) {
                return cases.var(ident);
            }
        };
    }
}
