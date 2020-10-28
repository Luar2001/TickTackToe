import java.util.Arrays;

/**
 * Created by Lukas Aronsson
 * Date: 28/10/2020
 * Time: 12:34
 * Project: TickTackToe
 * Copyright: MIT
 **/
public class TickTackToe {

    //int array that represents the 9 slots in a tickTackToe game
    //if the first player presses the array index of the press will be set to a value of 1 while the 2nd players to 2
    private final int[] slots = new int[9];

    private boolean gameOver;

    //boolean that switches between true and false || true = player1 || false = player2
    private boolean PlayerSwitch;

    public TickTackToe(int[] slots) {

        //starts a new game
        newGame();

        //keep playing as long as a player has not won
        while(!playerWon()){

            System.out.println("NO winner yet! ");
        }

        //if a player won
        if(playerWon()){

            //game is over
            gameOver = true;
            System.out.println(" A player won! ");
        }



    }

    public void newGame() {

        Arrays.fill(slots , 0); //fills the array slots with 0;

        gameOver = false;

    }

    public boolean player1Won(){
        //player 1 full row check
        if(
                //horizontal rows
                slots[0] == 1 && slots[1] == 1 && slots[2] == 1 || //if the first horizontal row is filled with 1
                slots[3] == 1 && slots[4] == 1 && slots[5] == 1 || //if the second horizontal row is filled with 1
                slots[6] == 1 && slots[7] == 1 && slots[8] == 1 || //if the third horizontal row is filled with 1
                //vertical rows
                slots[0] == 1 && slots[3] == 1 && slots[6] == 1 || //if the first vertical row is filled with 1
                slots[1] == 1 && slots[4] == 1 && slots[7] == 1 || //if the second vertical row is filled with 1
                slots[2] == 1 && slots[5] == 1 && slots[8] == 1 || //if the third vertical row is filled with 1
                // sideways \ row
                slots[0] == 1 && slots[4] == 1 && slots[8] == 1 || //if the row is filled with 1
                // sideways / row
                slots[6] == 1 && slots[4] == 1 && slots[2] == 1//if the row is filled with 1
        ){

            //There was a 3 in a row of 1s
            return true;
        }else{

            //if there is not a 3 in a row of 1s the game will not be over
            return false;
        }
    }
    public boolean player2Won(){
        //player2 full row check

        if(
                //horizontal rows
                slots[0] == 2 && slots[1] == 2 && slots[2] == 2 || //if the first horizontal row is filled with 1
                slots[3] == 2 && slots[4] == 2 && slots[5] == 2 || //if the second horizontal row is filled with 1
                slots[6] == 2 && slots[7] == 2 && slots[8] == 2 || //if the third horizontal row is filled with 1
                //vertical rows
                slots[0] == 2 && slots[3] == 2 && slots[6] == 2 || //if the first vertical row is filled with 1
                slots[1] == 2 && slots[4] == 2 && slots[7] == 2 || //if the second vertical row is filled with 1
                slots[2] == 2 && slots[5] == 2 && slots[8] == 2 || //if the third vertical row is filled with 1
                // sideways \ row
                slots[0] == 2 && slots[4] == 2 && slots[8] == 2 || //if the row is filled with 1
                // sideways / row
                slots[6] == 2 && slots[4] == 2 && slots[2] == 2//if the row is filled with 1
        ){

            //There was a 3 in a row of 1s
            return true;
        }else{

            //if there is not a 3 in a row of 1s the game will not be over
            return false;
        }
    }

    public boolean playerWon(){
        //checks that only one of player2WOn and player1Won is true


        // TODO: 28/10/2020 replace all system.out with messages
        //if player1Won is true and player2Won is false
        if(player1Won() && !player2Won()){

            System.out.println("Player1 Won!! ");
            // a playerWon
            return true;

        } else if(player2Won() && !player1Won()){

            System.out.println("player2 Won!! ");
           //a playerWon
            return true;
        } else if (player1Won() & player2Won()){

            System.out.println("ERROR: both players won somehow!!! ");

            // TODO: 28/10/2020 replace with whatever stops the program
            //i want the game to end so a player won (for now)
            return true;

        } else{
            //no one has won yet
            return false;
        }
    }

}
