import javax.swing.*;
import javax.swing.border.EtchedBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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

    //booleans to keep track if a slot was clicked or not
    private boolean box1set=false;
    private boolean box2set=false;
    private boolean box3set=false;
    private boolean box4set=false;
    private boolean box5set=false;
    private boolean box6set=false;
    private boolean box7set=false;
    private boolean box8set=false;
    private boolean box9set=false;

    //constructor that takes care of the swing stuff
    public GUI() {
        //frame refers to JFrame that this class extends

        //creates a JPanel object
        JPanel panel = new JPanel();

        JPanel panel2 = new JPanel();

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




        //border for the boxes
        EtchedBorder eBorder = new EtchedBorder();



        // BOXES

        //Creates a text at the top of the window
        JLabel text = new JLabel();

        //dimensions in the layout
        Dimension textDim = new Dimension(100,30);

        text.setPreferredSize(textDim);


        if(TickTackToe.PlayerSwitch) {
            //changes the text at the top of the screen to say witch players turn it is
            text.setText("Player1's Turn ");
        }else {
            //changes the text at the top of the screen to say witch players turn it is
            text.setText("Player2's Turn ");
        }

        //adds text to panel2
        panel2.add(text,BorderLayout.NORTH);


        //Box1
        JLabel box1 = new JLabel();

        //the box has an EtchedBorder
        box1.setBorder(eBorder);


        if(!box1set) {
            box1.addMouseListener(new MouseListener() {
                public void mouseClicked(MouseEvent e) {


                    if (TickTackToe.PlayerSwitch) {

                        //sets the text to O if its player1
                        box1.setText("O");

                        //sets the value in the array to a 1
                        TickTackToe.slots[0] = 1;

                        // TODO: 01/11/2020 block additional user input until next new game

                        //Switches player turn
                        TickTackToe.PlayerSwitch = false;

                    } else {

                        //sets the text to X if its player2
                        box1.setText("X");

                        //sets the value in the array to a 2
                        TickTackToe.slots[0] = 2;

                        // TODO: 01/11/2020 block additional user input until next new game

                        //Switches player turn
                        TickTackToe.PlayerSwitch = true;

                    }

                    box1set = true;
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

        //adds the box to the panel
        panel.add(box1);


        //Box2
        JLabel box2 = new JLabel();

        //the box has an EtchedBorder
        box2.setBorder(eBorder);

        if(!box2set) {
            box2.addMouseListener(new MouseListener() {
                public void mouseClicked(MouseEvent e) {


                    if (TickTackToe.PlayerSwitch) {

                        //sets the text to O if its player1
                        box2.setText("O");

                        //sets the value in the array to a 1
                        TickTackToe.slots[1] = 1;

                        // TODO: 01/11/2020 block additional user input until next new game

                        //Switches player turn
                        TickTackToe.PlayerSwitch = false;

                    } else {

                        //sets the text to X if its player2
                        box2.setText("X");

                        //sets the value in the array to a 2
                        TickTackToe.slots[1] = 2;

                        // TODO: 01/11/2020 block additional user input until next new game

                        //Switches player turn
                        TickTackToe.PlayerSwitch = true;

                    }

                    box2set = true;

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

        //adds the box to the panel
        panel.add(box2);


        //Box3
        JLabel box3 = new JLabel();

        //the box has an EtchedBorder
        box3.setBorder(eBorder);

        if(!box3set) {
            box3.addMouseListener(new MouseListener() {
                public void mouseClicked(MouseEvent e) {


                    if (TickTackToe.PlayerSwitch) {

                        //sets the text to O if its player1
                        box3.setText("O");

                        //sets the value in the array to a 1
                        TickTackToe.slots[2] = 1;

                        // TODO: 01/11/2020 block additional user input until next new game

                        //Switches player turn
                        TickTackToe.PlayerSwitch = false;

                    } else {

                        //sets the text to X if its player2
                        box3.setText("X");

                        //sets the value in the array to a 2
                        TickTackToe.slots[2] = 2;

                        // TODO: 01/11/2020 block additional user input until next new game

                        //Switches player turn
                        TickTackToe.PlayerSwitch = true;

                    }


                    box3set = true;

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

        //adds the box to the panel
        panel.add(box3);


        //Box4
        JLabel box4 = new JLabel();

        //the box has an EtchedBorder
        box4.setBorder(eBorder);


        if(!box4set) {
            box4.addMouseListener(new MouseListener() {
                public void mouseClicked(MouseEvent e) {

                    if (TickTackToe.PlayerSwitch) {

                        //sets the text to O if its player1
                        box4.setText("O");

                        //sets the value in the array to a 1
                        TickTackToe.slots[3] = 1;

                        // TODO: 01/11/2020 block additional user input until next new game

                        //Switches player turn
                        TickTackToe.PlayerSwitch = false;

                    } else {

                        //sets the text to X if its player2
                        box4.setText("X");

                        //sets the value in the array to a 2
                        TickTackToe.slots[3] = 2;

                        // TODO: 01/11/2020 block additional user input until next new game

                        //Switches player turn
                        TickTackToe.PlayerSwitch = true;

                    }


                    box4set = true;

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

        //adds the box to the panel
        panel.add(box4);


        //Box5
        JLabel box5 = new JLabel();

        //the box has an EtchedBorder
        box5.setBorder(eBorder);

        if(!box5set) {
            box5.addMouseListener(new MouseListener() {
                public void mouseClicked(MouseEvent e) {

                    if (TickTackToe.PlayerSwitch) {

                        //sets the text to O if its player1
                        box5.setText("O");

                        //sets the value in the array to a 1
                        TickTackToe.slots[4] = 1;

                        // TODO: 01/11/2020 block additional user input until next new game

                        //Switches player turn
                        TickTackToe.PlayerSwitch = false;

                    } else {

                        //sets the text to X if its player2
                        box5.setText("X");

                        //sets the value in the array to a 2
                        TickTackToe.slots[4] = 2;

                        // TODO: 01/11/2020 block additional user input until next new game

                        //Switches player turn
                        TickTackToe.PlayerSwitch = true;

                    }

                    box5set = true;


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

        //adds the box to the panel
        panel.add(box5);


        //Box6
        JLabel box6 = new JLabel();

        //the box has an EtchedBorder
        box6.setBorder(eBorder);

        if(!box6set) {
            box6.addMouseListener(new MouseListener() {
                public void mouseClicked(MouseEvent e) {

                    if (TickTackToe.PlayerSwitch) {

                        //sets the text to O if its player1
                        box6.setText("O");

                        //sets the value in the array to a 1
                        TickTackToe.slots[5] = 1;

                        // TODO: 01/11/2020 block additional user input until next new game

                        //Switches player turn
                        TickTackToe.PlayerSwitch = false;

                    } else {

                        //sets the text to X if its player2
                        box6.setText("X");

                        //sets the value in the array to a 2
                        TickTackToe.slots[5] = 2;

                        // TODO: 01/11/2020 block additional user input until next new game

                        //Switches player turn
                        TickTackToe.PlayerSwitch = true;

                    }


                    box6set = true;

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


        //adds the box to the panel
        panel.add(box6);


        //Box7
        JLabel box7 = new JLabel();

        //the box has an EtchedBorder
        box7.setBorder(eBorder);

        if(!box7set) {
            box7.addMouseListener(new MouseListener() {
                public void mouseClicked(MouseEvent e) {

                    if (TickTackToe.PlayerSwitch) {

                        //sets the text to O if its player1
                        box7.setText("O");

                        //sets the value in the array to a 1
                        TickTackToe.slots[6] = 1;

                        // TODO: 01/11/2020 block additional user input until next new game

                        //Switches player turn
                        TickTackToe.PlayerSwitch = false;

                    } else {

                        //sets the text to X if its player2
                        box7.setText("X");

                        //sets the value in the array to a 2
                        TickTackToe.slots[6] = 2;

                        // TODO: 01/11/2020 block additional user input until next new game

                        //Switches player turn
                        TickTackToe.PlayerSwitch = true;

                    }


                    box7set = true;

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

        //adds the box to the panel
        panel.add(box7);


        //Box8
        JLabel box8 = new JLabel();

        //the box has an EtchedBorder
        box8.setBorder(eBorder);

        if(!box8set) {
            box8.addMouseListener(new MouseListener() {
                public void mouseClicked(MouseEvent e) {

                    if (TickTackToe.PlayerSwitch) {

                        //sets the text to O if its player1
                        box8.setText("O");

                        //sets the value in the array to a 1
                        TickTackToe.slots[7] = 1;

                        // TODO: 01/11/2020 block additional user input until next new game

                        //Switches player turn
                        TickTackToe.PlayerSwitch = false;

                    } else {

                        //sets the text to X if its player2
                        box8.setText("X");

                        //sets the value in the array to a 2
                        TickTackToe.slots[7] = 2;

                        // TODO: 01/11/2020 block additional user input until next new game

                        //Switches player turn
                        TickTackToe.PlayerSwitch = true;

                    }

                    box8set = true;


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

        //adds the box to the panel
        panel.add(box8);


        //Box9
        JLabel box9 = new JLabel();

        //the box has an EtchedBorder
        box9.setBorder(eBorder);

        if(!box9set) {
            box9.addMouseListener(new MouseListener() {
                public void mouseClicked(MouseEvent e) {

                    if (TickTackToe.PlayerSwitch) {

                        //sets the text to O if its player1
                        box9.setText("O");

                        //sets the value in the array to a 1
                        TickTackToe.slots[8] = 1;

                        // TODO: 01/11/2020 block additional user input until next new game

                        //Switches player turn
                        TickTackToe.PlayerSwitch = false;

                    } else {

                        //sets the text to X if its player2
                        box9.setText("X");

                        //sets the value in the array to a 2
                        TickTackToe.slots[8] = 2;

                        // TODO: 01/11/2020 block additional user input until next new game

                        //Switches player turn
                        TickTackToe.PlayerSwitch = true;

                    }

                    box9set = true;


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

        //adds the box to the panel
        panel.add(box9);





        //adds the reset button aka the thing that will restart the game if pressed
        JButton reset = new JButton("Reset the game");

        //the dimensions of the button
        Dimension resetDim = new Dimension(40,60);

        //adds the dimensions of the button
        reset.setPreferredSize(resetDim);

        reset.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                text.setText("New Game! : Player1's Turn ");

                //Sets all the box set to false again;
                box1set = false;
                box2set = false;
                box3set = false;
                box4set = false;
                box5set = false;
                box6set = false;
                box7set = false;
                box8set = false;
                box9set = false;

                //Sets the text for all the boxes to blank
                box1.setText(null);
                box2.setText(null);
                box3.setText(null);
                box4.setText(null);
                box5.setText(null);
                box6.setText(null);
                box7.setText(null);
                box8.setText(null);
                box9.setText(null);


                TickTackToe.newGame();
            }
        });

        if(TickTackToe.player2Won() && TickTackToe.player1Won()){


            //turns all true (so that the players can't change anything on the board
            box1set = true;
            box2set = true;
            box3set = true;
            box4set = true;
            box5set = true;
            box6set = true;
            box7set = true;
            box8set = true;
            box9set = true;



        }




        //adds reset to the bottom of the frame
        panel2.add(reset,BorderLayout.SOUTH);



        //adds panel to panel 2 (to get the reset button at the button
        panel2.add(panel);
        pack();

    }
}
