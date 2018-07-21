package org.highj.vdom_escape.dom;

import org.highj.typeclass2.category.LC;
import org.highj.vdom_escape.Atomic;
import org.highj.vdom_escape.IMap;
import org.highj.vdom_escape.IncF;

import java.util.function.Consumer;

public class Element<HOM> {
    private final String _element;
    private final LC<IncF.µ,HOM,Atomic<String>> _text;
    private final LC<IncF.µ,HOM,IMap<String,Atomic<String>>> _attributes;
    private final LC<IncF.µ,HOM,IMap<String,Atomic<Consumer<DomEvent>>>> _handlers;
    private final LC<IncF.µ,HOM,IMap<Integer,Element<HOM>>> _children;
    
    private Element(
        String element,
        LC<IncF.µ,HOM,Atomic<String>> text,
        LC<IncF.µ,HOM,IMap<String,Atomic<String>>> attributes,
        LC<IncF.µ,HOM,IMap<String,Atomic<Consumer<DomEvent>>>> handlers,
        LC<IncF.µ,HOM,IMap<Integer,Element<HOM>>> children
    ) {
        this._element = element;
        this._text = text;
        this._attributes = attributes;
        this._handlers = handlers;
        this._children = children;
    }

    public static <HOM> Element<HOM> create(
        String element,
        LC<IncF.µ,HOM,Atomic<String>> text,
        LC<IncF.µ,HOM,IMap<String,Atomic<String>>> attributes,
        LC<IncF.µ,HOM,IMap<String,Atomic<Consumer<DomEvent>>>> handlers,
        LC<IncF.µ,HOM,IMap<Integer,Element<HOM>>> children
    ) {
        return new Element<>(
            element,
            text,
            attributes,
            handlers,
            children
        );
    }

    public String element() {
        return _element;
    }

    public LC<IncF.µ, HOM, Atomic<String>> text() {
        return _text;
    }

    public LC<IncF.µ, HOM, IMap<String, Atomic<String>>> attributes() {
        return _attributes;
    }

    public LC<IncF.µ, HOM, IMap<String, Atomic<Consumer<DomEvent>>>> handlers() {
        return _handlers;
    }

    public LC<IncF.µ, HOM, IMap<Integer, Element<HOM>>> children() {
        return _children;
    }
}
