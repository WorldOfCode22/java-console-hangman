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
    
    public String getIntro() {
        return "Welcom to Hangman. A word has been selected can you guess it";
    }
    
    public String getCurrentGuessView() {
        return "Current Guess: " + game.getTurnsTaken();
    }
    
    public String getGuessesLeftView() {
        return "Guesses Left (Inculding Current Guess): " + (game.getTurnsToGuess() - game.getTurnsTaken());
    }
    
    // public String getDashesView() { }
    
}
