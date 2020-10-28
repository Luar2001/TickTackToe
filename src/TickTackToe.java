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

}
