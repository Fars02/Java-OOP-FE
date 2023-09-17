/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Q1;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class FootballPlayer {
    protected String playerName;
    protected int jerseyNumber;
    protected String position;
    
    public FootballPlayer(String playername, int jerseyNumber, String position){
        this.playerName = playername;
        this.jerseyNumber = jerseyNumber;
        this.position = position;
    }

    /**
     * @return the playerName
     */
    public String getPlayerName() {
        return playerName;
    }

    /**
     * @param playerName the playerName to set
     */
    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    /**
     * @return the jerseyNumber
     */
    public int getJerseyNumber() {
        return jerseyNumber;
    }

    /**
     * @param jerseyNumber the jerseyNumber to set
     */
    public void setJerseyNumber(int jerseyNumber) {
        this.jerseyNumber = jerseyNumber;
    }

    /**
     * @return the position
     */
    public String getPosition() {
        return position;
    }

    /**
     * @param position the position to set
     */
    public void setPosition(String position) {
        this.position = position;
    }
    
    

}


class FootballPlayerMain{
    public static void main(String[] args){
        FootballPlayer[] player = new FootballPlayer[5];
        FootballPlayer[] player2 = new FootballPlayer[2];
        Scanner input = new Scanner(System.in);
        
        System.out.print("INPUT");
        for(int i=0; i<player.length; i++)
        {
            player[i] = new FootballPlayer("Ali", 12, "Winger");
            
            if(i<3)
            {
                System.out.print("\n");
                System.out.print("Enter player " + (i+1) + " name: ");
                player[i].setPlayerName(input.next());
                System.out.print("Enter player " + (i+1) + " number: ");
                player[i].setJerseyNumber(input.nextInt());
                System.out.print("Enter player " + (i+1) + " position: ");
                player[i].setPosition(input.next());
            }
            else
            {
                System.out.print("\n\nINPUT FOR ANOTHER 2 PLAYERS");
                System.out.print("\n");
                System.out.print("Enter player " + (i+1) + " name: ");
                player[i].setPlayerName(input.next());
                System.out.print("Enter player " + (i+1) + " number: ");
                player[i].setJerseyNumber(input.nextInt());
                System.out.print("Enter player " + (i+1) + " position: ");
                player[i].setPosition(input.next());
                
            }
        }
        
        
        for(int i=0; i<player2.length; i++)
        {
            System.out.print("\n");
                System.out.print("Enter player " + (i+1) + " name: ");
                player[i].setPlayerName(input.next());
                System.out.print("Enter player " + (i+1) + " number: ");
                player[i].setJerseyNumber(input.nextInt());
                System.out.print("Enter player " + (i+1) + " position: ");
                player[i].setPosition(input.next());
        }
        
        
        
        System.out.println("\n\nOUTPUT");
        
        for(int j=0; j<player.length; j++)
        {
            System.out.print("\nPlayer name: " + player[j].getPlayerName());
            System.out.print("\nPlayer Jersey: " + player[j].getJerseyNumber());
            System.out.print("\nPlayer Position: " + player[j].getPosition());
            
            System.out.print("\n");
        }
        
    }
    
}
