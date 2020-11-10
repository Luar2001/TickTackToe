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
    public static final int[] slots = new int[9];

    public static boolean gameOver;

    //boolean that switches between true and false || true = player1 || false = player2
    protected static boolean PlayerSwitch;

    public TickTackToe() {

        //calls the GUI Object
        new GUI();

        //starts at false so that turn makes it player 1;
        PlayerSwitch = false;

        //starts a new game
        newGame();

        //ends the game
        gameOver = true;

    }

    public static void newGame() {

        //test Print of array before it gets 0d
        System.out.println(Arrays.toString(slots));

        Arrays.fill(slots, 0); //fills the array slots with 0;

        //Sets gameOver to false aka a new game
        gameOver = false;

        //test print of the array
        System.out.println(Arrays.toString(slots));

        //keep playing as long as a player has not won

        while (!GUI.playerWon()) {

            if (playerWon()) {

                gameOver = true;

                //breaks the loop;

                break;

            }
        }

    }

    public static boolean player1Won() {
        //player 1 full row check
        if (
                        //horizontal rows
                        (slots[0] == 1 && slots[1] == 1 && slots[2] == 1) || //if the first horizontal row is filled with 1
                        (slots[3] == 1 && slots[4] == 1 && slots[5] == 1) || //if the second horizontal row is filled with 1
                        (slots[6] == 1 && slots[7] == 1 && slots[8] == 1) || //if the third horizontal row is filled with 1
                        //vertical rows
                        (slots[0] == 1 && slots[3] == 1 && slots[6] == 1) || //if the first vertical row is filled with 1
                        (slots[1] == 1 && slots[4] == 1 && slots[7] == 1) || //if the second vertical row is filled with 1
                        (slots[2] == 1 && slots[5] == 1 && slots[8] == 1) || //if the third vertical row is filled with 1
                        // sideways \ row
                        (slots[0] == 1 && slots[4] == 1 && slots[8] == 1) || //if the row is filled with 1
                        // sideways / row
                        (slots[6] == 1 && slots[4] == 1 && slots[2] == 1)//if the row is filled with 1
        ) {

            //There was a 3 in a row of 1s
            return true;
        } else {


            // TODO: 08/11/2020 figure out why i have to print here ? !
            System.out.println("1");
            //if there is not a 3 in a row of 1s the game will not be over
            return false;
        }
    }

    public static boolean player2Won() {
        //player2 full row check

        if (
                        //horizontal rows
                        (slots[0] == 2 && slots[1] == 2 && slots[2] == 2) || //if the first horizontal row is filled with 1
                        (slots[3] == 2 && slots[4] == 2 && slots[5] == 2) || //if the second horizontal row is filled with 1
                        (slots[6] == 2 && slots[7] == 2 && slots[8] == 2) || //if the third horizontal row is filled with 1
                        //vertical rows
                        (slots[0] == 2 && slots[3] == 2 && slots[6] == 2) || //if the first vertical row is filled with 1
                        (slots[1] == 2 && slots[4] == 2 && slots[7] == 2) || //if the second vertical row is filled with 1
                        (slots[2] == 2 && slots[5] == 2 && slots[8] == 2) || //if the third vertical row is filled with 1
                        // sideways \ row
                        (slots[0] == 2 && slots[4] == 2 && slots[8] == 2) || //if the row is filled with 1
                        // sideways / row
                        (slots[6] == 2 && slots[4] == 2 && slots[2] == 2) //if the row is filled with 1
        ) {

            //There was a 3 in a row of 1s
            return true;
        } else {

            // TODO: 08/11/2020 figure out why i have to print here ? !
            System.out.println("2");
            //if there is not a 3 in a row of 1s the game will not be over
            return false;
        }
    }

    public static boolean playerWon() {
        //checks that only one of player2WOn and player1Won is true
        //if player1Won is true and player2Won is false
        if (player1Won() && !player2Won()) {

            //System.out.println("Player1 Won!! ");
            GUI.text.setText("Player 1 WON! ");
            // a playerWon
            return true;

        } else if (player2Won() && !player1Won()) {

            //System.out.println("player2 Won!! ");
            GUI.text.setText("Player 2 WON! ");
            //a playerWon
            return true;
        } else if (player1Won() & player2Won()) {

            //System.out.println("ERROR: both players won somehow!!! ");
            GUI.text.setText("Both players won somehow!!! That's not supposed to happen! ");

            //i want the game to end so a player won (for now)
            return true;
        }else if(!player1Won() && !player2Won() && !contains(slots, 0)){

            //System.out.println("There was a Draw! ");
            GUI.text.setText("There was a Draw! ");
            return true;
        } else {
            //no one has won yet
            return false;
        }
    }

    public static boolean contains(int[] nbrArray, int number){
        //checks if a specific number is in the array
        boolean found = false;//boolean that keeps track if the number is in the array

        // for loop that checks if the number is in the array
        for(int nAr : nbrArray){
            if(nAr == number ){

                found = true;

                break;//breaks the loop
            }
        }

        //returns true or false
        return found;


    }

}