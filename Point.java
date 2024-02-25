
package quiz.application;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Point extends JFrame implements ActionListener{
    Point(String name, int Point){
        setBounds(0, 0, 1000, 1000);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("constant/scores.jpg"));
        JLabel image = new JLabel(i1);
        image.setBounds(0 , 300,  1000, 300);
        add(image);
        
        JLabel heading = new JLabel(" Thank you "+ name + " for playing Sharp Minds");
        heading.setBounds(100, 60, 750, 30);
        heading.setFont(new Font("Tahoma", Font.BOLD, 26));
        add(heading);
        
        JLabel lblPoint = new JLabel("Your score is " + Point);
        lblPoint.setBounds(250, 200, 300, 30);
        lblPoint.setFont(new Font("Tahoma", Font.BOLD, 26));
        add(lblPoint);
        
        JButton submit  = new JButton("Play Again");
        submit.setBounds(550, 200, 300, 30);
        submit.setFont(new Font("Tahoma", Font.PLAIN, 22));
        submit.setBackground(Color.black);
        submit.setForeground(Color.white);
        submit.addActionListener(this);
        submit.setEnabled(false);
        add(submit);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        setVisible(false);
        new Quiz();
}
    
    
    public static void main(String[] args){
        new Point("user", 0);
    }
}

