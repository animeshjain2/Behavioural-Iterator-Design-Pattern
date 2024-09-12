package designpattern.iterable.service;

import designpattern.iterable.dto.Cards;

public interface CardIterator {
    boolean hasNext();
    Cards next();
}
