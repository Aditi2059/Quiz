import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Score extends JFrame implements ActionListener {
    JLabel lblscore, heading;
    JButton submit;
    Score(String name, int score){
        setBounds(400,150,750,550);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("image/score.png"));
        Image i2 = i1.getImage().getScaledInstance(10,1000, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i1);
        image.setBounds(0, 200, 300,250);
        add(image);

        heading = new JLabel("Thankyou " + name + " for playing Simple Minds");
        heading.setBounds(45,30,700,30);
        heading.setFont(new Font("Tahoma", Font.PLAIN,24));
        add(heading);

        lblscore = new JLabel("Your score is "+score);
        lblscore.setBounds(350,200,300,30);
        lblscore.setFont(new Font("Tahoma", Font.PLAIN,24));
        add(lblscore);

        submit = new JButton("Play again");
        submit.setBounds(360,250,220,30);
        submit.setBackground(Color.blue);
        submit.setForeground(Color.white);
        submit.setFont(new Font("Tahoma", Font.PLAIN,20));
        submit.addActionListener(this);
        add(submit);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        setVisible(false);
        new Login();

    }
    public static void main(String[] args) {
        new Score("User", 0);
    }
}
