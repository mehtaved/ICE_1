package exercise1;

/**
 * A class that fills a hand of 7 cards with random Card Objects and then asks the user to pick a card.
 * It then searches the array of cards for the match to the user's card. 
 * To be used as starting code in Exercise
 *
 * @author dancye
 * @author Vedant Mehta 30 May, 2003 
 */
import java.util.Scanner;
public class CardTrick {
    
    public static void main(String[] args) {
        
        Card[] hand = new Card[7];

        for (int i = 0; i < hand.length; i++) {
            Card card = new Card();
            card.setValue((int)(1+Math.random()*13)); 
            card.setSuit(Card.SUITS[(int)(Math.random()*3)]);
            hand[i]=card;
            System.out.println(hand[i].getSuit() + " " + hand[i].getValue());
            //card.setValue(insert call to random number generator here)
            // 
            //card.setSuit(Card.SUITS[insert call to random number between 0-3 here])
            // Hint: You can use Random -> random.nextInt(n) to get a random number between 0 and n-1 (inclusive)
            //       Don't worry about duplicates at this point
        }

         Scanner sc = new Scanner(System.in);
         System.out.print("Enter Suits:");
         String usuit = sc.nextLine();
         System.out.print("Enter Value:");
         int uvalue = sc.nextInt();
         
         for(int i = 0; i < hand.length; i++)
         {
           if(usuit.equalsIgnoreCase(hand[i].getSuit()) && uvalue==hand[i].getValue());
           {
             printInfo();
             break;
           }
         }
        // insert code to ask the user for Card value and suit, create their card
        // and search the hand here. 
        // Hint: You can ask for values 1 to 10, and then
        //       11 for jack, 12 for queen, etc. (remember arrays are 0-based though)
        //       1 for Hearts, 2 for Diamonds, etc. (remember arrays are 0-based though)
        // 
        // Then loop through the cards in the array to see if there's a match.
        
        // If the guess is successful, invoke the printInfo() method below.
        
    }

    /**
     * A simple method to print out personal information. Follow the instructions to 
     * replace this information with your own.
     *@author vedant Mehta Jan 2023
     */
    private static void printInfo() {
    
        System.out.println("Congratulations, you guessed right!");
        System.out.println();
        
        System.out.println("My name is Vedant, but you can call me stud, ved");
        System.out.println();
        
        System.out.println("My career ambitions is to become software engineer:");
        System.out.println("-- Be more active on LinkedIn");
        System.out.println("-- Have a semester with no violations of academic integrity!");
	System.out.println();	

         System.out.println("My hobbies:");
        System.out.println("--Watching Movies");
        System.out.println("-- Cooking");
        System.out.println("-- Reading");
        System.out.println("-- Playing video games");

        System.out.println();
        
    
    }

}
