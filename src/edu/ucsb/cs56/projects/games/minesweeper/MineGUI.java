package edu.ucsb.cs56.projects.games.minesweeper;
import javax.swing.*;
import java.awt.ComponentOrientation;

/** MineGUI.java is a GUI interface for MineSweeper that uses
    System.out as the destination for messages.

     @author Daniel Reta
	 @author David Acevedo
     @version CS56, Winter 2014, UCSB
*/

public class MineGUI {

    /** main method to fire up a StartMenu on the screen  
          @param args not used
     */

    public static void main (String[] args) {
       StartMenu frame = new StartMenu();
    }
}