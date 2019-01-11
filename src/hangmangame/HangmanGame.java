/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hangmangame;

import hangmangame.exceptions.InvalidInputException;
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
        view.printIntro();
        while (true != hangman.isGamever()) {
            try {
                view.printCurrentGuessView();
                view.printGuessesLeftView();
                view.printGuessStatus();
                hangman.guess();
                hangman.endTurn();
            } catch (InvalidInputException e) {
                System.out.print("Invalid Input");
            }
        }
    }
    
}
