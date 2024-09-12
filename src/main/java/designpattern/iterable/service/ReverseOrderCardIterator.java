package designpattern.iterable.service;

import designpattern.iterable.dto.Cards;

import java.util.List;

public class ReverseOrderCardIterator implements CardIterator {

    private final List<Cards> cards;
    int position;

    public ReverseOrderCardIterator(List<Cards> cards)
    {
        this.cards = cards;
        this.position=cards.size()-1;
    }

    @Override
    public boolean hasNext() {
        return position>=0;
    }
    @Override
    public Cards next() {
        return cards.get(position--);
    }
}
