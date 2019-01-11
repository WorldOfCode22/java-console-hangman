/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hangmangame.game;

/**
 *
 * @author Sloan
 */

import hangmangame.enums.Reason;
import hangmangame.exceptions.InvalidInputException;
import java.util.Random;
import java.util.Scanner;

public class WordGuessGame extends Game {
    private final String[] wordDictionary;
    private String chosenWord;
    private final Random random;
    private final int turnsToGuess;
    private int turnsTaken;
    private String guessStatus;
    private final Scanner input;
    private char lastGuess;

    public WordGuessGame(String[] words, int turns) {
        this.turnsToGuess = turns;
        this.turnsTaken = 0;
        this.random = new Random();
        this.wordDictionary = words;
        this.selectChosenWord();
        this.guessStatus = this.getInitalGuessStatus();
        this.input = new Scanner(System.in);
    }
    
    public int getTurnsTaken() {
        return this.turnsTaken;
    }
    
    public int getTurnsToGuess() {
        return this.turnsToGuess;
    }
    
    public String getGuessStatus() {
        char[] guessStatusArray = this.guessStatus.toCharArray();
        String viewHappyGuessString = new String();
        for (int i = 1; i <= guessStatusArray.length; i++) {
            viewHappyGuessString += guessStatusArray[i - 1];
            viewHappyGuessString += " ";
        }
        return viewHappyGuessString;
    }
    
    public char guess() throws InvalidInputException {
        char guess;
        String line = this.input.next();
        if (line.length() > 1) { throw new InvalidInputException("", Reason.Short); }
        if (line.length() < 1) { throw new InvalidInputException("", Reason.Long); }
        guess = line.charAt(0);
        this.lastGuess = guess;
        return this.lastGuess;
    }
 
    public boolean isCorrectWord(String guess) {
        return this.chosenWord.equals(guess);
    }
    
    public void endTurn() {
        this.turnsTaken++;
        this.updateGuessStatus();
    }
    
    private String getInitalGuessStatus() {
        String status = "";
        for (int i = 0; i < this.chosenWord.length(); i++) {
            status += "_";
        }
        return status;
    }
    
    private void updateGuessStatus() {
        char[] chosenWordArray = this.chosenWord.toCharArray();
        char[] guessStatusArray = this.guessStatus.toCharArray();

        for (int i = 0; i < chosenWordArray.length; i++) {
            if (chosenWordArray[i] == this.lastGuess) {
                guessStatusArray[i] = this.lastGuess;
            }
        }
        
        this.guessStatus = new String(guessStatusArray);
    }
    
    private void selectChosenWord() {
        int wordIndex = random.nextInt(this.wordDictionary.length);
        this.chosenWord = this.wordDictionary[wordIndex];
    }
}
