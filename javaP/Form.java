import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


class Form extends JFrame implements ActionListener{
    JLabel l1,l2,l3; 
    JButton b;
    JRadioButton r1,r2,r3;
    JCheckBox c1,c2,c3;
    JTextField t1,t2;
    ButtonGroup b1;
    JPanel p1,p2;
    
    Form(){
        b1 = new ButtonGroup();
        p1 = new JPanel();
        p2 = new JPanel();
        b = new JButton();
        b.addActionListener(this);

        r1 = new JRadioButton("FY");
        r2 = new JRadioButton("SY");
        r3 = new JRadioButton("TY");

        b1.add(r1);
        b1.add(r2);
        b1.add(r3);

        r1.addActionListener(this);
        r2.addActionListener(this);
        r3.addActionListener(this);

        c1 = new JCheckBox("Music");
        c2 = new JCheckBox("Dance");
        c3 = new JCheckBox("Sports");

        c1.addActionListener(this);
        c2.addActionListener(this);
        c3.addActionListener(this);

    
       l1 = new JLabel("Your Name");
       l2 = new JLabel("your class");
       l3 = new JLabel("Your Hobbies");


       t1 = new JTextField(20);
       t2 = new JTextField(20);


        p1.setLayout(new GridLayout(5,2));
        p1.add(l1); p1.add(t1);
        p1.add(l2); p1.add(t2);
        p1.add(r1); p1.add(c1);
        p1.add(r2); p1.add(c2);
        p1.add(r3); p1.add(c3);
        
        p2.setLayout(new FlowLayout());
        p2.add(b);
        p2.add(t2);

        setLayout(new BorderLayout());
        add(p1,BorderLayout.NORTH);
        add(p2,BorderLayout.EAST);

        setSize(400,200);
        setVisible(true);
        //setDefaultCloseOperation(jFrame.EXIT_ON_CLOSE);

    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == r1){
            return;
        }
    }

    public static void main(String args[]){
        new Form();
    }
}
