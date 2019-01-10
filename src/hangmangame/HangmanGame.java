/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hangmangame;

import hangmangame.game.WordGuessGame;
import hangmangame.player.Player;

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
        WordGuessGame hangman = new WordGuessGame(words);
        Player humanPlayer = new Player(true, false);
        Player cpuPlayer = new Player(false, true);
        hangman.addPlayer(humanPlayer);
        hangman.addPlayer(cpuPlayer);
        while (true != hangman.isGamever()) {
            // TODO: add logic
        }
    }
    
}
