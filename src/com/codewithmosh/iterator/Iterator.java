package com.codewithmosh.iterator;

public interface Iterator<T> {
    boolean hasNext();
    T current();
    void next();
}
