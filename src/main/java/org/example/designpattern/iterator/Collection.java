package org.example.designpattern.iterator;

/**
 * Collection interface for creating an iterator.
 * @param <T>
 */
public interface Collection<T> {
    Iterator<T> getIterator();
}
