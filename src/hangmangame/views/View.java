/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hangmangame.views;

import hangmangame.game.WordGuessGame;

/**
 *
 * @author Sloan
 */
public class View {
    private final WordGuessGame game;
    
    public View(WordGuessGame game) {
        this.game = game;
    }
    
    public void printIntro() {
        System.out.println("Welcom to Hangman. A word has been selected can you guess it");
    }
    
    public void printCurrentGuessView() {
        System.out.println("Current Guess: " + game.getTurnsTaken());
    }
    
    public void printGuessesLeftView() {
        System.out.println("Guesses Left (Inculding Current Guess): " + (game.getTurnsToGuess() - game.getTurnsTaken()));
    }
    
    public void printGuessStatus() { 
        System.out.println(this.game.getGuessStatus());
    }
    
}
