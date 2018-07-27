package org.highj.vdom_escape.dom;

import org.highj.typeclass2.category.LC;
import org.highj.vdom_escape.Atomic;
import org.highj.vdom_escape.IMap;
import org.highj.vdom_escape.IncF;

import java.util.function.Consumer;

/**
 * Element Factory
 */
public class El {

    public static Element div(
        Atomic<String> text,
        IMap<String,Atomic<String>> attributes,
        IMap<String,Atomic<Consumer<DomEvent>>> handlers,
        IMap<Integer,Element> children
    ) {
        return Element.create("div", text, attributes, handlers, children);
    }

    public static Element h1(
        Atomic<String> text,
        IMap<String,Atomic<String>> attributes,
        IMap<String,Atomic<Consumer<DomEvent>>> handlers,
        IMap<Integer,Element> children
    ) {
        return Element.create("h1", text, attributes, handlers, children);
    }

    public static Element input(
        Atomic<String> text,
        IMap<String,Atomic<String>> attributes,
        IMap<String,Atomic<Consumer<DomEvent>>> handlers,
        IMap<Integer,Element> children
    ) {
        return Element.create("input", text, attributes, handlers, children);
    }

    public static Element p(
        Atomic<String> text,
        IMap<String,Atomic<String>> attributes,
        IMap<String,Atomic<Consumer<DomEvent>>> handlers,
        IMap<Integer,Element> children
    ) {
        return Element.create("p", text, attributes, handlers, children);
    }

    public static Element text(
        Atomic<String> text,
        IMap<String,Atomic<String>> attributes,
        IMap<String,Atomic<Consumer<DomEvent>>> handlers,
        IMap<Integer,Element> children
    ) {
        return Element.create("text", text, attributes, handlers, children);
    }
}
