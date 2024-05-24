/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package card;

import java.util.Random;
import java.util.Scanner;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author srinivsi
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        Random random = new Random();
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();          
            c.setValue(random.nextInt(13)+1);
            c.setSuit(Card.SUITS[random.nextInt(Card.SUITS.length)]);
            
            magicHand[i] = c;
            //c.setValue(insert call to random number generator here)
            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
            
            System.out.println(c.getValue());
            System.out.println(c.getSuit());
        }
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter a Card Value Between (1-13): ");
        int cardValue = scanner.nextInt();
        
        System.out.println("Enter a number for Suit between (0-3): ");
        int cardSuit = scanner.nextInt();
        boolean cardFound = false;
        for(Card card :magicHand){
            if (card.getValue() == cardValue && card.getSuit().equals(cardSuit)) {
                cardFound = true;
                break;
            }
        }
        if(cardFound = true){
            System.out.println("Bingo!! The Selected Card is in the Magic Hand");
            
        }else{
            System.out.println("Sorry !! The Selected Card is not in the Magic Hand");
        }
                
        
             
        scanner.close();         
            
 
               // add one luckcard hard code 2,clubs
        }
    }

    
  

