package GymnasieArbete;

import java.util.Arrays;

public class DeckShuffle {
    public static void main(String[] args) {
        new DeckShuffle();
    }

    public DeckShuffle(){
        int x = 0;
        int[] deckOfCards = new int[52];
        for (int i = 1; i < 14; i++) {
            for (int j = 1; j < 5; j++) {
                deckOfCards[x] = j*100;
                x++;
            }
            for (int k = 4; k > 0; k--) {
                deckOfCards[x-k] += (x/4);
            }
        }
        System.out.println(Arrays.toString(deckOfCards));
    }
}
