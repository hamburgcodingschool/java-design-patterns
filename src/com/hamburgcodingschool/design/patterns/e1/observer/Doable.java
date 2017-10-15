package com.hamburgcodingschool.design.patterns.e1.observer;

public interface Doable {

    /**
     * Sets the indices of all elements and returns the next index.
     *
     * Example 1: The implementing object is a leaf. It will set its own index and return index+1.
     * Example 2: The implementing object has 3 children. If index is 4, it would set its own index to 4, set the
     * indices of its children to 5, 6, 7 and return 8.
     *
     * @param index the index to start with
     * @return the index after the last element
     */
    int setIndex(int index);

    void done();

    void undo();

    boolean isDone();

    void print(int indentation);
}
