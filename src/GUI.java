import javax.swing.*;
import javax.swing.border.EtchedBorder;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/**
 * Created by NAME HERE
 * Date: 31/10/2020
 * Time: 15:57
 * Project: TickTackToe
 * Copyright: MIT
 **/
public class GUI extends JFrame {
    //frame refers to JFrame that this class extends
    //creates a JPanel object
    private JPanel panel = new JPanel();

    private JPanel panel2 = new JPanel();

    //Creates a text at the top of the window
    private final JLabel text = new JLabel();

    //dimensions in the layout
    private Dimension textDim = new Dimension(100,30);

    //border for the boxes
    private final EtchedBorder eBorder = new EtchedBorder();

    //Creates 9 JLabel Boxes that the games is played in.
    private final JLabel[] box = new JLabel[9];

    //booleans to keep track if a slot was clicked or not
    private static final boolean[] boxSet = new boolean[9]; //switched out the 9 boxSet booleans with a array of booleans


    //constructor that takes care of the swing stuff
    public GUI() {

        //sets the layout of panel 2 to a grid with 3 elements
        panel.setLayout(new GridLayout(3,3));

        Dimension panel2Dim = new Dimension(500,500);
        panel2.setPreferredSize(panel2Dim);

        //sets the grid to 3/3 so that there is a grid slot for each slot in the TickTackToe games
        panel2.setLayout(new BorderLayout());

        //creates blank space around the things in panel
        panel2.setBorder(BorderFactory.createEmptyBorder( 30,30,10,30));

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

        //Sets the dimensions of text
        text.setPreferredSize(textDim);

        if(TickTackToe.PlayerSwitch) {
            //changes the text at the top of the screen to say witch players turn it is
            text.setText("Player1's Turn ");
        }else {
            //changes the text at the top of the screen to say witch players turn it is
            text.setText("Player2's Turn ");
        }




        //BOXES

        //the boxes have EtchedBorders
        for(int i = 0; i<9; i++){
            box[i].setBorder(eBorder);
        }

        //Box1

        if(boxSet[0]) {
            box[0].addMouseListener(new MouseListener() {
                public void mouseClicked(MouseEvent e) {


                    if (TickTackToe.PlayerSwitch) {

                        //sets the text to O if its player1
                        box[0].setText("O");

                        //sets the value in the array to a 1
                        TickTackToe.slots[0] = 1;

                        // TODO: 01/11/2020 block additional user input until next new game

                        //Switches player turn
                        TickTackToe.PlayerSwitch = false;

                    } else {

                        //sets the text to X if its player2
                        box[0].setText("X");

                        //sets the value in the array to a 2
                        TickTackToe.slots[0] = 2;

                        // TODO: 01/11/2020 block additional user input until next new game

                        //Switches player turn
                        TickTackToe.PlayerSwitch = true;

                    }

                    boxSet[0] = false;
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
        }

        //Box2

        if(boxSet[1]) {
            box[1].addMouseListener(new MouseListener() {
                public void mouseClicked(MouseEvent e) {


                    if (TickTackToe.PlayerSwitch) {

                        //sets the text to O if its player1
                        box[1].setText("O");

                        //sets the value in the array to a 1
                        TickTackToe.slots[1] = 1;

                        // TODO: 01/11/2020 block additional user input until next new game

                        //Switches player turn
                        TickTackToe.PlayerSwitch = false;

                    } else {

                        //sets the text to X if its player2
                        box[1].setText("X");

                        //sets the value in the array to a 2
                        TickTackToe.slots[1] = 2;

                        // TODO: 01/11/2020 block additional user input until next new game

                        //Switches player turn
                        TickTackToe.PlayerSwitch = true;

                    }

                    boxSet[1] = false;

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
        }


        if(boxSet[2]) {
            box[2].addMouseListener(new MouseListener() {
                public void mouseClicked(MouseEvent e) {


                    if (TickTackToe.PlayerSwitch) {

                        //sets the text to O if its player1
                        box[2].setText("O");

                        //sets the value in the array to a 1
                        TickTackToe.slots[2] = 1;

                        // TODO: 01/11/2020 block additional user input until next new game

                        //Switches player turn
                        TickTackToe.PlayerSwitch = false;

                    } else {

                        //sets the text to X if its player2
                        box[2].setText("X");

                        //sets the value in the array to a 2
                        TickTackToe.slots[2] = 2;

                        // TODO: 01/11/2020 block additional user input until next new game

                        //Switches player turn
                        TickTackToe.PlayerSwitch = true;

                    }


                    boxSet[2] = false;

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
        }

        if(boxSet[3]) {
            box[3].addMouseListener(new MouseListener() {
                public void mouseClicked(MouseEvent e) {

                    if (TickTackToe.PlayerSwitch) {

                        //sets the text to O if its player1
                        box[3].setText("O");

                        //sets the value in the array to a 1
                        TickTackToe.slots[3] = 1;

                        // TODO: 01/11/2020 block additional user input until next new game

                        //Switches player turn
                        TickTackToe.PlayerSwitch = false;

                    } else {

                        //sets the text to X if its player2
                        box[3].setText("X");

                        //sets the value in the array to a 2
                        TickTackToe.slots[3] = 2;

                        // TODO: 01/11/2020 block additional user input until next new game

                        //Switches player turn
                        TickTackToe.PlayerSwitch = true;

                    }


                    boxSet[3] = false;

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
        }

        if(boxSet[4]) {
            box[4].addMouseListener(new MouseListener() {
                public void mouseClicked(MouseEvent e) {

                    if (TickTackToe.PlayerSwitch) {

                        //sets the text to O if its player1
                        box[4].setText("O");

                        //sets the value in the array to a 1
                        TickTackToe.slots[4] = 1;

                        // TODO: 01/11/2020 block additional user input until next new game

                        //Switches player turn
                        TickTackToe.PlayerSwitch = false;

                    } else {

                        //sets the text to X if its player2
                        box[4].setText("X");

                        //sets the value in the array to a 2
                        TickTackToe.slots[4] = 2;

                        // TODO: 01/11/2020 block additional user input until next new game

                        //Switches player turn
                        TickTackToe.PlayerSwitch = true;

                    }

                    boxSet[4] = false;


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
        }

        if(boxSet[5]) {
            box[5].addMouseListener(new MouseListener() {
                public void mouseClicked(MouseEvent e) {

                    if (TickTackToe.PlayerSwitch) {

                        //sets the text to O if its player1
                        box[5].setText("O");

                        //sets the value in the array to a 1
                        TickTackToe.slots[5] = 1;

                        // TODO: 01/11/2020 block additional user input until next new game

                        //Switches player turn
                        TickTackToe.PlayerSwitch = false;

                    } else {

                        //sets the text to X if its player2
                        box[5].setText("X");

                        //sets the value in the array to a 2
                        TickTackToe.slots[5] = 2;

                        // TODO: 01/11/2020 block additional user input until next new game

                        //Switches player turn
                        TickTackToe.PlayerSwitch = true;

                    }


                    boxSet[5] = false;

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
        }

        if(boxSet[6]) {
            box[6].addMouseListener(new MouseListener() {
                public void mouseClicked(MouseEvent e) {

                    if (TickTackToe.PlayerSwitch) {

                        //sets the text to O if its player1
                        box[6].setText("O");

                        //sets the value in the array to a 1
                        TickTackToe.slots[6] = 1;

                        // TODO: 01/11/2020 block additional user input until next new game

                        //Switches player turn
                        TickTackToe.PlayerSwitch = false;

                    } else {

                        //sets the text to X if its player2
                        box[6].setText("X");

                        //sets the value in the array to a 2
                        TickTackToe.slots[6] = 2;

                        // TODO: 01/11/2020 block additional user input until next new game

                        //Switches player turn
                        TickTackToe.PlayerSwitch = true;

                    }


                    boxSet[6] = false;

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
        }

        if(boxSet[7]) {
            box[7].addMouseListener(new MouseListener() {
                public void mouseClicked(MouseEvent e) {

                    if (TickTackToe.PlayerSwitch) {

                        //sets the text to O if its player1
                        box[7].setText("O");

                        //sets the value in the array to a 1
                        TickTackToe.slots[7] = 1;

                        // TODO: 01/11/2020 block additional user input until next new game

                        //Switches player turn
                        TickTackToe.PlayerSwitch = false;

                    } else {

                        //sets the text to X if its player2
                        box[7].setText("X");

                        //sets the value in the array to a 2
                        TickTackToe.slots[7] = 2;

                        // TODO: 01/11/2020 block additional user input until next new game

                        //Switches player turn
                        TickTackToe.PlayerSwitch = true;

                    }

                    boxSet[7] = false;


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
        }


        box[8].addMouseListener(new BoxClicker());





        //adds the reset button aka the thing that will restart the game if pressed
        JButton reset = new JButton("Reset the game");

        //the dimensions of the button
        Dimension resetDim = new Dimension(40,60);

        //adds the dimensions of the button
        reset.setPreferredSize(resetDim);

        reset.addActionListener(e -> {

            text.setText("New Game! : Player1's Turn ");

            //Sets all the box set to true again;
            for(int i = 0; i<9; i++){
                boxSet[i] = true;
            }

            //Sets the text for all the boxes to blank
            for(int i = 0; i<9; i++){
                box[i].setText(null);
            }


            TickTackToe.newGame();
        });


        //ADDS ALL TO THE PANELs


        //adds text to panel2
        panel2.add(text,BorderLayout.NORTH);


        //adds the boxes to the panel
        for(int i = 0; i<9; i++) {
            panel.add(box[i]);
        }

        //adds reset to the bottom of the frame
        panel2.add(reset,BorderLayout.SOUTH);

        //adds panel to panel 2 (to get the reset button at the button
        panel2.add(panel);
        pack();

    }


    public static boolean playerWon(){

        if(TickTackToe.playerWon()){

            //turns all false (so that the players can't change anything on the board
            for(int i = 0; i<9;i++){
                boxSet[i] =false;
            }


            return true;

        } else {

            return false;
        }


    }
}

class BoxClicker extends MouseAdapter {


    @Override
    public void mouseClicked(MouseEvent e) {

        if (TickTackToe.PlayerSwitch) {

            //sets the text to O if its player1
           // setText("O");

            //sets the value in the array to a 1
            TickTackToe.slots[8] = 1;

            // TODO: 01/11/2020 block additional user input until next new game

            //Switches player turn
            TickTackToe.PlayerSwitch = false;

        } else {

            //sets the text to X if its player2
           // setText("X");

            //sets the value in the array to a 2
            TickTackToe.slots[8] = 2;

            // TODO: 01/11/2020 block additional user input until next new game

            //Switches player turn
            TickTackToe.PlayerSwitch = true;

        }
    }
}
