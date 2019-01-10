/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hangmangame;

import hangmangame.game.WordGuessGame;
import hangmangame.player.Player;
import hangmangame.views.View;

/**
 *
 * @author Sloan
 */
public class HangmanGame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] words = { "test" };
        View view;
        WordGuessGame hangman = new WordGuessGame(words, 6);
        Player humanPlayer = new Player(true, false);
        hangman.addPlayer(humanPlayer);
        view = new View(hangman);
        System.out.println(view.getIntro());
        System.out.println(view.getCurrentGuessView());
        System.out.println(view.getGuessesLeftView());
        while (true != hangman.isGamever()) {
            // TODO: add logic
        }
    }
    
}
