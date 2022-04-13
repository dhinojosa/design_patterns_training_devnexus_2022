package com.xyzcorp.javapatterns.visitor.classic;

/**
 * @author John Ericksen
 */
public interface AnimalVisitor {

    void visit(Lion lion);

    void visit(Elephant elephant);

    void visit(Zebra zebra);

    void visit(Bear bear);

    void visit(Monkey monkey);
}
