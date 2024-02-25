
package quiz.application;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Quiz extends JFrame implements ActionListener{
    
    JButton rules, back;
    JTextField tfname;
    Quiz() {
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("constant/quizft.jpg"));
        JLabel image = new JLabel(i1);
        image.setBounds(0 , 0, 600, 500);
        add(image);
        
        JLabel heading = new JLabel("Sharp Minds");
        heading.setBounds(750, 60, 300, 45);
        heading.setFont(new Font("Viner Hand ITC", Font.BOLD, 40));
        heading.setForeground(Color.BLACK);
        add(heading);
        
        JLabel name = new JLabel("Enter Your Name");
        name.setBounds(747, 150,  400, 30);
        name.setFont(new Font("Mongolian Baiti", Font.BOLD, 35));
        name.setForeground(Color.RED);
        add(name);
        
        
        tfname = new JTextField();
        tfname.setBounds(735, 200, 300, 25);
        tfname.setFont(new Font("Times New Roman", Font.BOLD, 20));
        add(tfname);
        
        rules = new JButton("Guidelines");
        rules.setBounds(735, 270, 120, 25);
        rules.setBackground(Color.black);
        rules.setForeground(Color.WHITE);
        rules.addActionListener(this);
        add(rules);
        
        back = new JButton("Exit");
        back.setBounds(935, 270, 120, 25);
        back.setBackground(Color.black);
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        add(back);
        
        
        setSize(1100, 500);
        setLocation(110, 140);
        setVisible(true);
    }
    
   public void actionPerformed(ActionEvent ae){
       if(ae.getSource() == rules){
           String name = tfname.getText();
           setVisible(false);
           new Rules(name);
           
       } else if(ae.getSource() == back){
         
           setVisible(false);
       }
       
   }
   public static void main(String[] args) {
       new Quiz();
       
   }
}
