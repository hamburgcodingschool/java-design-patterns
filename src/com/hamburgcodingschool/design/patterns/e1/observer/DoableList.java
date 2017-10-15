package com.hamburgcodingschool.design.patterns.e1.observer;

public interface DoableList {

    /**
     * Sets the indices of all elements and returns the next index.
     *
     * Example: There are 3 elements in the list, and startIndex is 4, it would give the indices 4, 5, 6 to its elements
     * and return 7.
     *
     * @param startIndex the index to start with
     * @return the index after the last element
     */
    int setIndices(int startIndex);

    void addDoable(Doable doable);

    void printName();

    void printList();
}
