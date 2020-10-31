import javax.swing.*;
import javax.swing.border.EtchedBorder;
import java.awt.*;
import javax.swing.JLabel.*;

/**
 * Created by NAME HERE
 * Date: 31/10/2020
 * Time: 15:57
 * Project: TickTackToe
 * Copyright: MIT
 **/
public class GUI extends JFrame{


    //constructor that takes care of the swing stuff
    public GUI(){
        //frame refers to JFrame that this class extends

        //creates a JPanel object
        JPanel panel = new JPanel();

        //sets the grid to 3/3 so that there is a grid slot for each slot in the TickTackToe games
        panel.setLayout(new GridLayout(3,3));

        //creates blank space around the things in panel
        panel.setBorder(BorderFactory.createEmptyBorder(30,30,30,30));

        //adds panel and border layout to the frame
        add(panel, BorderLayout.CENTER);


        // shuts the Frame Down when its exited
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);



        //Title for the swing box
        setTitle("TickTackToe made with Swing");

        //packs in all the elements so that they just fit in the box
        pack();

        //makes the frame visible
        setVisible(true);

        //border for the boxes
        EtchedBorder eBorder = new EtchedBorder();



        //Test Boxes
        JLabel box1 = new JLabel();

        //the box has an EtchedBorder
        box1.setBorder(eBorder);







    }
}
