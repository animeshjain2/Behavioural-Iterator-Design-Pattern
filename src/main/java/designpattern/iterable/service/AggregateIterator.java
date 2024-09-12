package designpattern.iterable.service;

public interface AggregateIterator {
    CardIterator InorderCardIterator();
    CardIterator reverseOrderCardIterator();
    CardIterator randomOrderCardIterator();
}
