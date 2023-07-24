import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login extends JFrame implements ActionListener {
    JButton rules, exit;
    JTextField tfname;
    Login(){

        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("image/login.jpeg"));
        JLabel image = new JLabel(i1);
        image.setBounds(0, 0, 600,500);
        add(image);

        JLabel heading = new JLabel("Simple Minds");
        heading.setBounds(750,60,300,45);
        heading.setFont(new Font("Viner Hand ITC", Font.BOLD,40));
        heading.setForeground( Color.BLUE);
        add(heading);

        JLabel name = new JLabel("Enter your name.");
        name.setBounds(810,130,300,30);
        name.setFont(new Font("Mongolian Baiti", Font.BOLD,20));
        name.setForeground( Color.BLUE);
        add(name);

        tfname = new JTextField();
        tfname.setBounds(725, 180,300, 25);
        tfname.setFont(new Font("Times New Roman", Font.BOLD,20));
        add(tfname);

        rules = new JButton("Rules");
        rules.setBounds(735, 220,120, 25);
        rules.setBackground(Color.blue);
        rules.setForeground( Color.white);
        rules.addActionListener(this);
        add(rules);

        exit = new JButton("Exit");
        exit.setBounds(915, 220,120, 25);
        exit.setBackground(Color.blue);
        exit.setForeground( Color.white);
        exit.addActionListener(this);
        add(exit);

        setVisible(true);
        setSize(1200,500);
        setLocation(100,150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == rules){
            String name = tfname.getText();
            setVisible(false);
            new Rules(name);
        }else if (ae.getSource() == exit){
            setVisible(false);
        }
    }
    public static void main(String[] args) {
        new Login();
    }

}
