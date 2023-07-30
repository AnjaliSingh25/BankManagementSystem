package bank.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login extends JFrame implements ActionListener {
    JLabel label1,label2,label3;//(global declair..now we can use where we want)
    JTextField textField2;//global declair
    JPasswordField passwordField3;//global declair
    JButton button1,button2,button3;
    Login(){
        super("Bank Management System");

        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image=new JLabel(i3);
        image.setBounds(350,10,100,100);
        add(image);

        ImageIcon ii1=new ImageIcon(ClassLoader.getSystemResource("icon/card.png"));
        Image ii2 = ii1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon ii3=new ImageIcon(ii2);
        JLabel iimage=new JLabel(ii3);
        iimage.setBounds(630,350,100,100);
        add(iimage);


        label1= new JLabel("Welcome To  ATM");// jlabel show the test on image
       label1.setForeground(Color.WHITE);
       label1.setFont(new Font("AvantGrade",Font.BOLD,38));
        label1.setBounds(230,124,450,40);
        add(label1);
        label2 = new JLabel("Card No:");
        label2.setFont(new Font("Railway",Font.BOLD,28));
        label2.setForeground(Color.white);
        label2.setBounds(150,190,375,30);
        add(label2);
        textField2=new JTextField();
        textField2.setBounds(325,190,230,30);
        textField2.setFont(new Font("Arial",Font.BOLD,28));
        add(textField2);

        label3 = new JLabel("PIN:");
        label3.setFont(new Font("Railway",Font.BOLD,28));
        label3.setForeground(Color.white);
        label3.setBounds(150,250,375,30);
        add(label3);

        passwordField3= new JPasswordField(15);
        passwordField3.setBounds(325,250,230,30);
        passwordField3.setFont(new Font("Arial",Font.BOLD,14));
        add(passwordField3);

        button1=new JButton("SIGN IN");
        button1.setFont((new Font("Arial",Font.BOLD,14)));
        button1.setForeground(Color.white);
        button1.setBackground(Color.GREEN);
        button1.setBounds(300,300,100,30);
        button1.addActionListener(this);

        add(button1);

        button2=new JButton("Clear");
        button2.setFont((new Font("Arial",Font.BOLD,14)));
        button2.setForeground(Color.white);
        button2.setBackground(Color.RED);
        button2.setBounds(430,300,100,30);
        button2.addActionListener(this);

        add(button2);

        button3=new JButton("Sign UP");
        button3.setFont((new Font("Arial",Font.BOLD,14)));
        button3.setForeground(Color.white);
        button3.setBackground(Color.BLUE);
        button3.setBounds(325,350,230,30);
        button3.addActionListener(this);
        add(button3);

        setSize(850,480);
        setLocation(450,200);
        ImageIcon iii1=new ImageIcon(ClassLoader.getSystemResource("icon/backbg.png"));
        Image iii2 = iii1.getImage().getScaledInstance(850,480,Image.SCALE_DEFAULT);
        ImageIcon iii3=new ImageIcon(iii2);
        JLabel iiimage=new JLabel(iii3);
        iiimage.setBounds(0,0,850,480);
        add(iiimage);
        setLayout(null);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try{
            if(e.getSource()==button1){

            } else if (e.getSource()==button2) {
                textField2.setText("");
                passwordField3.setText("");
            } else if (e.getSource()==button3) {

            }

        } catch(Exception E){
            E.printStackTrace();
        }

    }

    public static void main(String[] args) {
       new Login();
    }
}
