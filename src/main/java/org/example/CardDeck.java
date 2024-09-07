package org.example;
import java.util.*;

public class CardDeck implements AggregateIterator{

    List<Cards> cards;

    CardDeck()
    {
        cards = new ArrayList<>();
    }

    public void addCard(Cards card){
        cards.add(card);
    }

    @Override
    public CardIterator InorderCardIterator() {
        return new InorderCardIterator(cards);
    }
    @Override
    public CardIterator reverseOrderCardIterator() {
        return new ReverseOrderCardIterator(cards);
    }
    @Override
    public CardIterator randomOrderCardIterator() {
        return new RandomCardIterator(cards);
    }
}
