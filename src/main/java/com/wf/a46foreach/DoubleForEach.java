package com.wf.a46foreach;

import java.util.*;

/**
 * @Author: wangfa
 * @Date: 2019/6/13 17:50
 * @Description:
 */
public class DoubleForEach {

    enum Suit{CLUE,DIAMOND,HEART,SPADE}
    enum Rank{ACE,DEUCE,THREE,FOUR,FIVE,SIX,SEVEN,EIGHT,NINE,TEN,JACK,QUEEN,KING}




    public static void main(String[] args) {

        DoubleForEach each = new DoubleForEach();
        each.printForEach();

    }


    /**
     * 在迭代器上对外部的集合(suits)调用的太多次next方法了，他应该从外部的循环进行调用，以便每种花色调用一次，但是他却是从内部调用，
     * 因此它是每张牌调用一次，在用完所有的花色之后，循环就会抛出NoSuchElementException异常
     */
    public void printFor(){
        Collection<Suit> suits = Arrays.asList(Suit.values());
        Collection<Rank> ranks = Arrays.asList(Rank.values());
        List<Card> deck = new ArrayList<>();

        for (Iterator<Suit> i =suits.iterator();i.hasNext(); ){
            for(Iterator<Rank> j = ranks.iterator();j.hasNext();){
                deck.add(new Card(i.next(),j.next()));
            }
        }
    }

    public void printForEach(){
        Collection<Suit> suits = Arrays.asList(Suit.values());
        Collection<Rank> ranks = Arrays.asList(Rank.values());
        List<Card> deck = new ArrayList<>();

        for (Suit suit: suits){
            for (Rank rank:ranks){
                deck.add(new Card(suit,rank));
            }
        }

    }









    class  Card{
        private Suit suit;
        private Rank rank;

        public Card(Suit suit, Rank rank) {
            this.suit = suit;
            this.rank = rank;
        }

        public Suit getSuit() {
            return suit;
        }

        public void setSuit(Suit suit) {
            this.suit = suit;
        }

        public Rank getRank() {
            return rank;
        }

        public void setRank(Rank rank) {
            this.rank = rank;
        }
    }
}
