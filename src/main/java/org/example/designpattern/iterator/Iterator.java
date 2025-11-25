package org.example.designpattern.iterator;

/**
 * Iterator interface
 * @param <T>
 */
public interface Iterator<T> {
    boolean hasNext();
    T next();
}
