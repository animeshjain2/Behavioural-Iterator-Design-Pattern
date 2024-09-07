package org.example;

import java.util.*;

public class InorderCardIterator implements CardIterator {

    private final List<Cards> cards;
    int position;

    public InorderCardIterator(List<Cards> cards)
    {
        this.cards = cards;
        this.position=0;
    }

    @Override
    public boolean hasNext() {
        return position<cards.size();
    }
    @Override
    public Cards next() {
        return cards.get(position++);
    }

}
