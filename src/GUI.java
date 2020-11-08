import javax.swing.*;
import javax.swing.border.EtchedBorder;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Arrays;

/**
 * Created by NAME HERE
 * Date: 31/10/2020
 * Time: 15:57
 * Project: TickTackToe
 * Copyright: MIT
 **/
public class GUI extends JFrame {
    //frame refers to JFrame that this class extends

    //booleans to keep track if a slot was clicked or not
    static Boolean[] boxSet = new Boolean[9]; //switched out the 9 boxSet booleans with a array of booleans

    //Creates 9 JLabel Boxes that the games is played in.
    JLabel[] box = new JLabel[9];

    //Creates a text at the top of the window
    static JLabel text = new JLabel();


    //constructor that takes care of the swing stuff
    public GUI(){

        //creates 2 JPanel object (one to hold the boxes, and one to hold the rest + the other panel)
        JPanel panel = new JPanel();
        JPanel panel2 = new JPanel();

        //sets the layout of panel 2 to a grid with 3 elements
        panel.setLayout(new GridLayout(3, 3));

        Dimension panel2Dim = new Dimension(500, 500);
        panel2.setPreferredSize(panel2Dim);

        //sets the grid to 3/3 so that there is a grid slot for each slot in the TickTackToe games
        panel2.setLayout(new BorderLayout());

        //creates blank space around the things in panel
        panel2.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30));

        //adds panel2 and border layout to the frame
        add(panel2, BorderLayout.CENTER);

        // shuts the Frame Down when its exited
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        //Title for the swing box
        setTitle("TickTackToe made with Swing");


        //sets tje blank space around panel
        panel.setBorder(BorderFactory.createEmptyBorder(0, 0, 30, 0));

        //sets resizable to false (aka you can't resize the window)
        setResizable(false);

        //centers the window on the screen
        setLocationRelativeTo(null);

        //makes the frame visible
        setVisible(true);


        //text at the top of the panel



        //dimensions for the text in the layout
        Dimension textDim = new Dimension(100, 30);

        //Sets the dimensions of text
        text.setPreferredSize(textDim);

        if (TickTackToe.PlayerSwitch) {
            //changes the text at the top of the screen to say witch players turn it is
            text.setText("Player1's Turn ");
        } else {
            //changes the text at the top of the screen to say witch players turn it is
            text.setText("Player2's Turn ");
        }


        //BOXES

        //boxSet initialization
        Arrays.fill(boxSet, true);

        //box initialization
        for (int i = 0; i < box.length ; i++){

            //actually adds the JLabel object to the array
            box[i] = new JLabel();
        }

        //Sets the text for all the boxes to blank

        //the boxes have EtchedBorders
        try {
            for (JLabel jLabel : box) {

                jLabel.setBorder(new EtchedBorder());
            }

        } catch (Exception e){
            System.out.println("ERROR: " + e.getMessage() + " ! ");
        }

        for (int i = 0; i < box.length; i++) {
            try {
                int finalI = i;
                box[i].addMouseListener(new MouseListener() {
                    public void mouseClicked(MouseEvent e) {

                        if (boxSet[finalI]) {

                            if (TickTackToe.PlayerSwitch) {

                                //sets the text to O if its player1
                                box[finalI].setText("O");

                                //sets the value in the array to a 1
                                TickTackToe.slots[finalI] = 1;

                                // TODO: 01/11/2020 block additional user input until next new game

                                //Switches player turn
                                TickTackToe.PlayerSwitch = false;

                            } else {

                                //sets the text to X if its player2
                                box[finalI].setText("X");

                                //sets the value in the array to a 2
                                TickTackToe.slots[finalI] = 2;

                                // TODO: 01/11/2020 block additional user input until next new game

                                //Switches player turn
                                TickTackToe.PlayerSwitch = true;

                            }

                            boxSet[finalI] = false;

                        }
                    }

                    @Override
                    public void mousePressed(MouseEvent e) {

                    }

                    @Override
                    public void mouseReleased(MouseEvent e) {

                    }

                    @Override
                    public void mouseEntered(MouseEvent e) {

                    }

                    @Override
                    public void mouseExited(MouseEvent e) {

                    }
                });
            } catch (Exception a) {
                System.out.println("ERROR: " + a.getMessage() + " ! ");
            }
        }

        //adds the reset button aka the thing that will restart the game if pressed
        JButton reset = new JButton("Reset the game");

        //the dimensions of the button
        Dimension resetDim = new Dimension(40, 60);

        //adds the dimensions of the button
        reset.setPreferredSize(resetDim);

        reset.addActionListener(e -> {

            text.setText("New Game! : Player1's Turn ");

            //Sets all the box set to true again;
            Arrays.fill(boxSet, true);

            //Sets the text for all the boxes to blank
            for (JLabel jLabel : box) {
                jLabel.setText(null);
            }

            Arrays.fill(box, null);


            TickTackToe.newGame();
        });


        //ADDS ALL TO THE PANELS


        //adds text to panel2
        panel2.add(text, BorderLayout.NORTH);


        //adds the boxes to the panel
        for (JLabel jLabel : box) {
            panel.add(jLabel);
        }

        //adds panel to panel 2 (to get the reset button at the button
        panel2.add(panel);

        //adds reset to the bottom of the frame
        panel2.add(reset, BorderLayout.SOUTH);

        pack();

    }


    public static boolean playerWon() {

        if (TickTackToe.playerWon()) {

            //turns all false (so that the players can't change anything on the board
            Arrays.fill(boxSet, false);

            if(TickTackToe.player1Won()){
                text.setText("Player 1 Won! ");
            } else if(TickTackToe.player2Won()){
                text.setText("Player 2 Won! ");
            }

            return true;

        } else {

            return false;
        }


    }
}
