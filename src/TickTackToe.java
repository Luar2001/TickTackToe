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
    private int[] slots = new int[9];

    private boolean gameOver;

    public TickTackToe(int[] slots) {

        //starts a new game
        newGame();








    }

    public void newGame() {

        Arrays.fill(slots , 0); //fills the array slots with 0;

        gameOver = false;

    }

}
