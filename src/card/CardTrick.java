/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package card;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author srinivsi
 * @Modifier Atila Ureten 991850506
 */
import java.util.Random;
import java.util.Scanner;
public class CardTrick {
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        Scanner k = new Scanner(System.in);
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card(); //store card object
            Random random = new Random();
            Integer randomValue = random.nextInt(1, 13);
            c.setValue(randomValue);
            Integer randomSuit = random.nextInt(0, 3);
            c.setSuit(Card.SUITS[randomSuit]);
            magicHand[i]=c;
            System.out.println(c.getValue() + " " + c.getSuit());
        }
        Card luckyCard = new Card();
        luckyCard.setValue(3);
        luckyCard.setSuit(2);
        
        //System.out.print("Please provide card value(1-13): ");
        //Integer cardValue = k.nextInt();
        //System.out.print("Please provide card suit(0-3 where 0=hearts,1=Diamonds,2=Clubs,3=Spades)");
        //String cardSuit = k.next()  ;
        //Card cc=new Card();
        //cc.setValue(cardValue);
        //cc.setSuit(cardSuit);
        for (int i=0;i<magicHand.length; i++){
            
            //Integer magicValue = magicHand.getValue();
            if (magicHand[i].getValue() == cc.getValue() && magicHand[i].getSuit().equals(cc.getSuit())){
                    System.out.println("Congratulations, your card is in the magic hand");
            
                  }
            else {
                System.out.println("Sorry your card is not in the magic hand");
            }
        }
        
       k.close();
        //insert code to ask the user for Card value and suit, create their card
        // and search magicHand here
        //Then report the result here
        // add one luckcard hard code 2,clubs
    }
    
}
