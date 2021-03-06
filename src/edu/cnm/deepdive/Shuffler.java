package edu.cnm.deepdive;

import static java.util.Collections.shuffle;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Shuffler {

  public static void main(String[] args) {
    int[] deck = new int[52];
    for (int i = 0; i < deck.length; i++) {
      deck[i] = i + 1;
    }
    System.out.println(Arrays.toString(deck));
    shuffle(deck);
    System.out.println(Arrays.toString(deck));

  }

  public static void shuffle(Integer[] deck) {
    //Random rng = new Random();
    //for (int i = deck.length - 1; i > 0 ; i--) {
    //  int swap = rng.nextInt(i + 1);
    // int temp = deck[swap];
    // deck[swap] = deck[i];
    //deck[i] = temp;

    shuffle(deck, new Random());

  }

  public static void shuffle(int[] deck, Random rng) {
    for (int i = deck.length - 1; i > 0; i--) {
      int swap = rng.nextInt(i + 1);
      int temp = deck[swap];
      deck[swap] = deck[i];
      deck[i] = temp;
    }
    public static void shuffle ( byte[] deck, Random rng){
      for (int i = deck.length - 1; i > 0; i--) {
        int swap = rng.nextInt(i + 1);
        byte temp = deck[swap];
        deck[swap] = deck[i];
        deck[i] = temp;
      }
      public static void shuffle ( byte[] deck){
        shuffle(deck, new Random());
      }
    }
    public static void shuffle ( char[] deck, Random rng){
      for (int i = deck.length - 1; i > 0; i--) {
        int swap = rng.nextInt(i + 1);
        byte temp = deck[swap];
        deck[swap] = deck[i];
        deck[i] = temp;
      }
      public static void shuffle(double[] deck, Random rng){
        for (int i = deck.length - 1; i > 0; i--) {
          int swap = rng.nextInt(i + 1);
          double temp = deck[swap];
          deck[swap] = deck[i];
          deck[i] = temp;
        }
        public static void shuffle (float[] deck, Random rng){
          for (int i = deck.length - 1; i > 0; i--) {
            int swap = rng.nextInt(i + 1);
            float temp = deck[swap];
            deck[swap] = deck[i];
            deck[i] = temp;
      }
          public static void shuffle (long[] deck, Random rng){
            for (int i = deck.length - 1; i > 0; i--) {
              int swap = rng.nextInt(i + 1);
              long temp = deck[swap];
              deck[swap] = deck[i];
              deck[i] = temp;
    }
  }
}
