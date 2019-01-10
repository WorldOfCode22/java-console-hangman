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

import java.util.Random;

public class WordGuessGame extends Game {
    private final String[] wordDictionary;
    private String chosenWord;
    private final Random random;
    private final int turnsToGuess;
    private int turnsTaken;
    public WordGuessGame(String[] words, int turns) {
        this.turnsToGuess = turns;
        this.turnsTaken = 0;
        this.random = new Random();
        this.wordDictionary = words;
        this.selectChosenWord();
    }
    
    public int getTurnsTaken() {
        return this.turnsTaken;
    }
    
    public int getTurnsToGuess() {
        return this.turnsToGuess;
    }
    public boolean isCorrectWord(String guess) {
        return this.chosenWord.equals(guess);
    }
    
    public void endTurn() {
        this.turnsTaken++;
    }
    
    private void selectChosenWord() {
        int wordIndex = random.nextInt(this.wordDictionary.length);
        this.chosenWord = this.wordDictionary[wordIndex];
    }
}
