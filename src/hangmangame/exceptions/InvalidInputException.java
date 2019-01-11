/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hangmangame.exceptions;

import hangmangame.enums.Reason;

/**
 *
 * @author Sloan
 */

public class InvalidInputException extends Exception {
    private final boolean toLong;
    private final boolean toShort;

    public InvalidInputException(String s) {
        super(s);
        this.toShort = false;
        this.toLong = false;
    }
    
    public InvalidInputException(String s, Reason r) {
        super(s);
        if (null == r) {
            this.toLong = false;
            this.toShort = false;
        } else switch (r) {
            case Short:
                this.toShort = true;
                this.toLong = false;
                break;
            case Long:
                this.toLong = true;
                this.toShort = false;
                break;
            default:
                this.toLong = false;
                this.toShort = false;
                break;
        }
    }
}
