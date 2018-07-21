package org.highj.vdom_escape.dom;

import org.highj.typeclass2.category.LC;
import org.highj.vdom_escape.IMap;
import org.highj.vdom_escape.IncF;

import java.util.function.Consumer;

/**
 * Element Factory
 */
public class El {

    public static <HOM> Element<HOM> div(
        LC<IncF.µ,HOM,String> text,
        LC<IncF.µ,HOM,IMap<String,String>> attributes,
        LC<IncF.µ,HOM,IMap<String,Consumer<DomEvent>>> handlers,
        LC<IncF.µ,HOM,IMap<Integer,Element<HOM>>> children
    ) {
        return Element.create("div", text, attributes, handlers, children);
    }

    public static <HOM> Element<HOM> h1(
        LC<IncF.µ,HOM,String> text,
        LC<IncF.µ,HOM,IMap<String,String>> attributes,
        LC<IncF.µ,HOM,IMap<String,Consumer<DomEvent>>> handlers,
        LC<IncF.µ,HOM,IMap<Integer,Element<HOM>>> children
    ) {
        return Element.create("h1", text, attributes, handlers, children);
    }

    public static <HOM> Element<HOM> input(
        LC<IncF.µ,HOM,String> text,
        LC<IncF.µ,HOM,IMap<String,String>> attributes,
        LC<IncF.µ,HOM,IMap<String,Consumer<DomEvent>>> handlers,
        LC<IncF.µ,HOM,IMap<Integer,Element<HOM>>> children
    ) {
        return Element.create("input", text, attributes, handlers, children);
    }
}
