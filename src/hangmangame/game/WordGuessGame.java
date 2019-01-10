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
public class WordGuessGame extends Game {
    private final String[] wordDictionary;
    
    public WordGuessGame(String[] words) { 
        this.wordDictionary = words;
    }
}
