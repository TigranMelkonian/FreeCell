package cs3500.hw02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Tigran on 5/15/2017.
 */
public class Deck{
    //creating new card array that will hold values of all 52 cards
    private Card[] deck;

    // constructor
    public Deck(){
        deck = new Card[52]; // creating a card array of length 52
        int x = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 13; j++) {
                deck[x] = new Card(i,j);
                x++;
            }
        }
        System.out.println("Before shuffle: " + deck.toString());

        shuffle();

        System.out.println("After shuffle: " + deck.toString());
    }


    // method to shuffle cards so that each game will be unique
    public void shuffle(){
        for (int i = 0; i < deck.length;
        i++){
            int index = (int) (Math.random() * deck.length);
            Card temp = deck[i];
            deck[i] = deck[index];
            deck[index] = temp;
        }
    }

    // to string method
    public List<String> toList(){
        String string = "";
        int k = 0;
        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 13; j++){
                string += (deck[k] + " ");
                string += "\n";
                k++;
            }
        }
        List<String> deckList = Arrays.asList(string.split(","));
        return deckList;

    }


}


