package designpattern.iterable;

import designpattern.iterable.dto.Cards;
import designpattern.iterable.dto.Color;
import designpattern.iterable.service.CardDeck;
import designpattern.iterable.service.CardIterator;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        CardDeck cardDeck = new CardDeck();

        cardDeck.addCard(new Cards(Color.HEARTS,1,"one"));
        cardDeck.addCard(new Cards(Color.HEARTS,2,"two"));
        cardDeck.addCard(new Cards(Color.HEARTS,3,"three"));
        cardDeck.addCard(new Cards(Color.HEARTS,4,"four"));
        cardDeck.addCard(new Cards(Color.HEARTS,5,"five"));


        CardIterator cardIterator = cardDeck.InorderCardIterator();
        System.out.println("InOrder Card List => ");
        while (cardIterator.hasNext())
        {
            System.out.println(cardIterator.next());
        }

        System.out.println("ReverseOrder Card List => ");
        CardIterator reverseIterator = cardDeck.reverseOrderCardIterator();
        while (reverseIterator.hasNext())
        {
            System.out.println(reverseIterator.next());
        }

        System.out.println("Random Order Card List => ");
        CardIterator randomIterator = cardDeck.randomOrderCardIterator();
        while (randomIterator.hasNext())
        {
            System.out.println(randomIterator.next());
        }

    }
}