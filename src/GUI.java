import javax.swing.*;
import javax.swing.border.EtchedBorder;
import java.awt.*;

/**
 * Created by NAME HERE
 * Date: 31/10/2020
 * Time: 15:57
 * Project: TickTackToe
 * Copyright: MIT
 **/
public class GUI extends JFrame {


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

        //adds the box to the panel
        panel.add(box1);


        //Box2
        JLabel box2 = new JLabel();

        //the box has an EtchedBorder
        box2.setBorder(eBorder);

        //adds the box to the panel
        panel.add(box2);


        //Box3
        JLabel box3 = new JLabel();

        //the box has an EtchedBorder
        box3.setBorder(eBorder);

        //adds the box to the panel
        panel.add(box3);


        //Box4
        JLabel box4 = new JLabel();

        //the box has an EtchedBorder
        box4.setBorder(eBorder);

        //adds the box to the panel
        panel.add(box4);


        //Box5
        JLabel box5 = new JLabel();

        //the box has an EtchedBorder
        box5.setBorder(eBorder);

        //adds the box to the panel
        panel.add(box5);


        //Box6
        JLabel box6 = new JLabel();

        //the box has an EtchedBorder
        box6.setBorder(eBorder);

        //adds the box to the panel
        panel.add(box6);


        //Box7
        JLabel box7 = new JLabel();

        //the box has an EtchedBorder
        box7.setBorder(eBorder);

        //adds the box to the panel
        panel.add(box7);


        //Box8
        JLabel box8 = new JLabel();

        //the box has an EtchedBorder
        box8.setBorder(eBorder);

        //adds the box to the panel
        panel.add(box8);


        //Box9
        JLabel box9 = new JLabel();

        //the box has an EtchedBorder
        box9.setBorder(eBorder);

        //adds the box to the panel
        panel.add(box9);





        //adds the reset button aka the thing that will restart the game if pressed
        JButton reset = new JButton("Reset the game");

        Dimension resetDim = new Dimension(40,60);


        reset.setPreferredSize(resetDim);


        //adds reset to the bottom of the frame
        panel2.add(reset,BorderLayout.SOUTH);



        //adds panel to panel 2 (to get the reset button at the button
        panel2.add(panel);
        pack();

    }

}
