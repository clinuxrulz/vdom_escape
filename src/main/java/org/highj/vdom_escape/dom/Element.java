package org.highj.vdom_escape.dom;

import org.highj.vdom_escape.Atomic;
import org.highj.vdom_escape.IMap;

import java.util.function.Consumer;

public class Element {
    private final String _element;
    private final Atomic<String> _text;
    private final IMap<String,Atomic<String>> _attributes;
    private final IMap<String,Atomic<Consumer<DomEvent>>> _handlers;
    private final IMap<Integer,Element> _children;
    
    private Element(
        String element,
        Atomic<String> text,
        IMap<String,Atomic<String>> attributes,
        IMap<String,Atomic<Consumer<DomEvent>>> handlers,
        IMap<Integer,Element> children
    ) {
        this._element = element;
        this._text = text;
        this._attributes = attributes;
        this._handlers = handlers;
        this._children = children;
    }

    public static Element create(
        String element,
        Atomic<String> text,
        IMap<String,Atomic<String>> attributes,
        IMap<String,Atomic<Consumer<DomEvent>>> handlers,
        IMap<Integer,Element> children
    ) {
        return new Element(
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

    public Atomic<String> text() {
        return _text;
    }

    public IMap<String, Atomic<String>> attributes() {
        return _attributes;
    }

    public IMap<String, Atomic<Consumer<DomEvent>>> handlers() {
        return _handlers;
    }

    public IMap<Integer, Element> children() {
        return _children;
    }
}
