import java.util.*;
 
 public class Deck {
 
 ArrayList<Card> cards = new ArrayList<Card>();
 // creating object of arraylist
 
 String[] values = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "J", "Q", "K"};
 String[] suit = {"Club", "Spades", "Diamond", "Heart"};
 
 // constructor : automatically called
 // method: call createDeck
 
 public ArrayList<Card> getDeck() {
 return cards;
 }
 
 public Object getCard() {
 return cards.get(0);
 }
 
 public void createDeck() {
 for(int i = 0; i < suit.length; i++) {
 for(int j = 0; j < values.length; j++) {
 this.cards.add(new Card(suit[i], values[j]));
 System.out.println(suit[i] + values[j]);
 }
 }
 // Collections: available in util
 Collections.shuffle(this.cards);
}
 
 public void printDeck() {
 for(Card card : cards) {
 System.out.println(card);
 }
 }
 
 public void printCard(String suit, String value) {
 for(Card card : cards) {
 if(card.getSuit().equals(suit) && card.getValue().equals(value)) {
 System.out.println(card);
 return;
 }
 }
 System.out.println("Card not found.");
 }
 
 public void sameCard(String suit) {
 for(Card card : cards) {
 if(card.getSuit().equals(suit)) {
 System.out.println(card);
 }
 }
 }
 
 public void compareCard(String value) {
 for(Card card : cards) {
 if(card.getValue().equals(value)) {
 System.out.println(card);
 }
 }
 }
 
 public void findCard(String suit, String value) {
 for(Card card : cards) {
 if(card.getSuit().equals(suit) && card.getValue().equals(value)) {
 System.out.println("Card found: " + card);
 return;
 }
 }
 System.out.println("Card not found.");
 }
 
 public void shuffleDeck() {
 Collections.shuffle(this.cards);
 }
 
 public void dealCard() {
 for(int i = 0; i <= suit.length; i++) {
 System.out.println(this.cards.get(i));
 }
 }
 }
