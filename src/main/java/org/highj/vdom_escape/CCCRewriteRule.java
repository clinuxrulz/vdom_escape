package org.highj.vdom_escape;

public class CCCRewriteRule {
    private final CCCPattern _src;
    private final CCCPattern _dst;

    private CCCRewriteRule(CCCPattern src, CCCPattern dst) {
        this._src = src;
        this._dst = dst;
    }

    public static CCCRewriteRule create(CCCPattern src, CCCPattern dst) {
        return new CCCRewriteRule(src, dst);
    }

    public CCCPattern src() {
        return _src;
    }

    public CCCPattern dst() {
        return _dst;
    }
}
