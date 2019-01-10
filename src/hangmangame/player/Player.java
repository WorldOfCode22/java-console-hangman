/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hangmangame.player;

/**
 *
 * @author Sloan
 */
public class Player {
    private final boolean isClientsPlayer;
    private final boolean isCPUControlled;
    private String name;
    
    public Player(boolean isClientsPlayer, boolean isCpu ) {
        this.isClientsPlayer = isClientsPlayer;
        this.isCPUControlled = isCpu;
    }
    
    public boolean isClientsPlayer() { return this.isClientsPlayer; }
    
    public boolean isCPUControlled() { return this.isCPUControlled; }
    
    public String getName() { return this.name; }
    
    public void setName(String name) { this.name = name; }
}
