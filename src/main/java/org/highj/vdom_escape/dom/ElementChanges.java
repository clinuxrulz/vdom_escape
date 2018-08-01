package org.highj.vdom_escape.dom;

import org.highj.data.Maybe;
import org.highj.vdom_escape.Atomic;
import org.highj.vdom_escape.MapChanges;

import java.util.function.Consumer;

public class ElementChanges {
    private final Maybe<String> _textChange;
    private final MapChanges<String,Atomic<String>,Maybe<String>> _attributeChanges;
    private final MapChanges<String,Atomic<Consumer<DomEvent>>,Maybe<Consumer<DomEvent>>> _handlerChanges;
    private final MapChanges<Integer,Element,ElementChanges> _childrenChanges;

    private ElementChanges(
        Maybe<String> textChange,
        MapChanges<String, Atomic<String>, Maybe<String>> attributeChanges,
        MapChanges<String, Atomic<Consumer<DomEvent>>, Maybe<Consumer<DomEvent>>> handlersChanges,
        MapChanges<Integer, Element, ElementChanges> childrenChanges
    ) {
        this._textChange = textChange;
        this._attributeChanges = attributeChanges;
        this._handlerChanges = handlersChanges;
        this._childrenChanges = childrenChanges;
    }

    public static ElementChanges create(
        Maybe<String> textChange,
        MapChanges<String, Atomic<String>, Maybe<String>> attributeChanges,
        MapChanges<String, Atomic<Consumer<DomEvent>>, Maybe<Consumer<DomEvent>>> handlersChanges,
        MapChanges<Integer, Element, ElementChanges> childrenChanges
    ) {
        return new ElementChanges(textChange, attributeChanges, handlersChanges, childrenChanges);
    }

    public Maybe<String> textChange() {
        return _textChange;
    }

    public MapChanges<String, Atomic<String>, Maybe<String>> attributeChanges() {
        return _attributeChanges;
    }

    public MapChanges<String, Atomic<Consumer<DomEvent>>, Maybe<Consumer<DomEvent>>> handlerChanges() {
        return _handlerChanges;
    }

    public MapChanges<Integer, Element, ElementChanges> childrenChanges() {
        return _childrenChanges;
    }
}
