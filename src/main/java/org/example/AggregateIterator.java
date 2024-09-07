package org.example;

public interface AggregateIterator {
    CardIterator InorderCardIterator();
    CardIterator reverseOrderCardIterator();
    CardIterator randomOrderCardIterator();
}
