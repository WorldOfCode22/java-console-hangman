/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hangmangame.game;

import hangmangame.player.Player;
import java.util.ArrayList;

/**
 *
 * @author Sloan
 */
public class Game {
    private boolean isGameStarted = false;
    private boolean isGameOver = false;
    private long gameStartTime;
    private final ArrayList<Player> players = new ArrayList();
    
    public long getCurrentGameDurration() { return System.nanoTime() - this.gameStartTime; }
    
    public boolean isGameStarted() { return this.isGameStarted; }
    
    public boolean isGamever() { return this.isGameOver; }
    
    public void startGame() {
        this.isGameStarted = true;
        this.gameStartTime = System.nanoTime();
    }
    
    public void addPlayer(Player p) { this.players.add(p); }
    
    public ArrayList<Player> getPlayers() {return this.players; }
    
    public void endGame() { this.isGameOver = true; }
    
}
