import java.util.*;

   public class Main {
   public static void main(String args[]) {
   Scanner scan = new Scanner(System.in);
  
   Deck deck = new Deck();
 
   boolean ch = true;
 
   do {
     System.out.println("MENU:");
     System.out.println("1 Create Deck");
     System.out.println("2 Print Deck");
     System.out.println("3 Print Card");
     System.out.println("4 Print Card from same suit");
     System.out.println("5 Print Card with same rank");
     System.out.println("6 Find Card");
     System.out.println("7 Dealing 5 Random Cards");
     System.out.println("8 Shuffle Deck");

     System.out.println("Enter choice:");
     int choice = scan.nextInt();

     switch(choice) {
      case 1:
       deck.createDeck();
       break;
      case 2:
        System.out.println("Printing the entire deck:");
        deck.printDeck();
        break;
      case 3:
        System.out.println("Enter suit of the card:");
        String suit1 = scan.next();
        System.out.println("Enter value of card:");
        String value = scan.next();
        deck.printCard(suit1, value);
        break;
     case 4:
        System.out.println("Enter suit to print cards from:");
        String suit2 = scan.next();
        deck.sameCard(suit2);
 // compare two cards and find out if they're from the same suit
        break;
     case 5:
       System.out.println("Enter rank to print cards with the same rank:");
       String rank = scan.next();
       deck.compareCard(rank);
       break;
     case 6:
       System.out.println("Enter suit:");
       String suit3 = scan.next();
       System.out.println("Enter value:");
       String val = scan.next();
       deck.findCard(suit3, val);
       break;
    case 7:
       System.out.println("Dealin 5 random cards:");
       deck.dealCard();
       break;
    case 8:
       System.out.println("Shuffling Deck:");
       deck.shuffleDeck();
       break;
    case 9:
       ch = false;
       System.out.println("Quit");
       break;
       default:
       System.out.println("Invalid choice");
 }
} while(ch);
 
 
}
}

