package cs3500.hw02;

/**
 * Created by Tigran on 5/16/2017.
 */
public class Card {
        private int rank, suit;

        // Setting two arrays with the suits and ranks options
        private static final String[] suits = {"♠", "♥", "♦", "♣"};
        private static final String[] ranks = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};

        Card(int suit, int rank){
            this.rank = rank;
            this.suit = suit;
       }

       public int getRank() {
            return this.rank;
       }

       public void setRank(int rank) {
            this.rank= rank;
       }



       public String toString(){
            return ranks[rank] + suits[suit];
       }

}

