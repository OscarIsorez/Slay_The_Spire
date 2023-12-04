package main;

import java.util.List;

public class Pack {

    List<Card> cards;

    public Pack(List<Card> cards) {
        this.cards = cards;
    }

    public void addCard(Card card) {
        this.cards.add(card);
    }

    public void removeCard(Card card) {
        this.cards.remove(card);
    }

    public void shuffle() {
        /* shuffle the pack */
    }

    public Card getCard(Card card) {

        for (Card c : this.cards) {
            if (c == card) {
                return c;
            }
        }
        return null;

    }

}
