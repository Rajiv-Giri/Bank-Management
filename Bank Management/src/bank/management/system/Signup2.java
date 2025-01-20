package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;

public class Signup2 extends JFrame implements ActionListener {
    JComboBox comboBox, comboBox2,comboBox3, comboBox4,comboBox5;

    JTextField textPan, textAadhar;

    JRadioButton s1, s2, e1, e2;

    JButton next;


    String formno;

    Signup2(String formno){

        super("APPLICATION FORM");

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(150,5,100,100);
        add(image);


        this.formno = formno;

        JLabel l1 = new JLabel("Page 2 :-");
        l1.setFont(new Font("Raleway",Font.BOLD,22));
        l1.setBounds(300,30,600,40);
        add(l1);

        JLabel l2 = new JLabel("Additional Details");
        l2.setFont(new Font("Raleway",Font.BOLD,22));
        l2.setBounds(300,60,600,40);
        add(l2);

        JLabel l3 = new JLabel("Religion :");
        l3.setFont(new Font("Raleway",Font.BOLD,18));
        l3.setBounds(100,150,100,30);
        add(l3);

        String religion[] = {"Hindu","Muslim","Christian","Other"};
        comboBox = new JComboBox(religion);
        comboBox.setBackground(new Color(252,208,76));
        comboBox.setFont(new Font("Raleway",Font.BOLD,14));
        comboBox.setBounds(300,150,320,30);
        add(comboBox);

        JLabel l4 = new JLabel("Category : ");
        l4.setFont(new Font("Raleway",Font.BOLD,18));
        l4.setBounds(100,200,100,30);
        add(l4);

        String category[] = {"General","OBC","SC","ST","Other"};
        comboBox2 = new JComboBox(category);
        comboBox2.setFont(new Font("Raleway",Font.BOLD,14));
        comboBox2.setBounds(300,200,320,30);
        comboBox2.setBackground(new Color(252,208,76));
        add(comboBox2);

        JLabel l5 = new JLabel("Income :");
        l5.setFont(new Font("Raleway",Font.BOLD,18));
        l5.setBounds(100,250,100,30);
        add(l5);

        String income[] = {"Null","<2,50,000", "<2,50,000", "5,00,000", "Upto 10,00,000"};
        comboBox3 = new JComboBox(income);
        comboBox3.setBackground(new Color(252,208,76));
        comboBox3.setFont(new Font("Raleway",Font.BOLD,14));
        comboBox3.setBounds(300,250,320,30);
        add(comboBox3);

        JLabel l6 = new JLabel("Educational :");
        l6.setFont(new Font("Raleway",Font.BOLD,18));
        l6.setBounds(100,300,150,30);
        add(l6);

        String education[] = {"Graduate","Non-Graduate", "Post-Graduate", "Doctrate", "Others"};
        comboBox4 = new JComboBox(education);
        comboBox4.setBackground(new Color(252, 208,76));
        comboBox4.setBounds(300,300,320,30);
        comboBox4.setFont(new Font("Raleway",Font.BOLD,14));
        add(comboBox4);

        JLabel l7 = new JLabel("Occupation :");
        l7.setFont(new Font("Raleway",Font.BOLD,18));
        l7.setBounds(100,350,120,30);
        add(l7);

        String occupation[] = {"Salaried", "Self-Employed", "Business", "Student", "Retired", "Other"};
        comboBox5 = new JComboBox(occupation);
        comboBox5.setFont(new Font("Raleway",Font.BOLD,14));
        comboBox5.setBounds(300,350,320,30);
        comboBox5.setBackground(new Color(252,208,76));
        add(comboBox5);

        JLabel pan = new JLabel("PAN Number :");
        pan.setFont(new Font("Raleway",Font.BOLD,18));
        pan.setBounds(100,400,150,30);
        add(pan);

        textPan = new JTextField();
        textPan.setFont(new Font("Raleway",Font.BOLD,14));
        textPan.setBounds(300,400,320,30);
        add(textPan);


        JLabel aadhar = new JLabel("Aadhar Number :");
        aadhar.setFont(new Font("Raleway",Font.BOLD,18));
        aadhar.setBounds(100, 450,150,30);
        add(aadhar);

        textAadhar = new JTextField();
        textAadhar.setFont(new Font("Raleway",Font.BOLD,14));
        textAadhar.setBounds(300,450,320,30);
        add(textAadhar);


        JLabel senior = new JLabel("Senior Citizen :");
        senior.setFont(new Font("Raleway",Font.BOLD,18));
        senior.setBounds(100,500,320,30);
        add(senior);

        s1 = new JRadioButton("Yes");
        s1.setFont(new Font("Raleway",Font.BOLD,14));
        s1.setBounds(300,500,80,30);
        s1.setBackground(new Color(252,208,76));
        add(s1);

        s2 = new JRadioButton("NO");
        s2.setBackground(new Color(252,208,76));
        s2.setFont(new Font("Raleway",Font.BOLD,14));
        s2.setBounds(400,500,80,30);
        add(s2);


        ButtonGroup buttonGroup1 = new ButtonGroup();
        buttonGroup1.add(s1);
        buttonGroup1.add(s2);


        JLabel existing = new JLabel("Existing Account :");
        existing.setFont(new Font("Raleway",Font.BOLD,18));
        existing.setBounds(100,550,200,30);
        add(existing);

        e1 = new JRadioButton("Yes");
        e1.setFont(new Font("Raleway",Font.BOLD,14));
        e1.setBounds(300,550,80,30);
        e1.setBackground(new Color(252,208,76));
        add(e1);

        e2 = new JRadioButton("No");
        e2.setBackground(new Color(252,208,76));
        e2.setFont(new Font("Raleway",Font.BOLD,14));
        e2.setBounds(400,550,80,30);
        add(e2);

        ButtonGroup buttonGroup2 = new ButtonGroup();
        buttonGroup2.add(e1);
        buttonGroup2.add(e2);

        JLabel form = new JLabel("Form No :");
        form.setFont(new Font("Raleway",Font.BOLD,14));
        form.setBounds(700,10,100,30);
        add(form);

        JLabel Fno = new JLabel(formno);
        Fno.setFont(new Font("Raleway",Font.BOLD,14));
        Fno.setBounds(770,10,60,30);
        add(Fno);

        next = new JButton("Next");
        next.setFont(new Font("Raleway",Font.BOLD,14));
        next.setBackground(Color.WHITE);
        next.setForeground(Color.BLACK);
        next.setBounds(520,640,100,30);
        next.addActionListener(this);
        add(next);



        setLayout(null);
        setSize(850,750);
        setLocation(450,80);
        getContentPane().setBackground(new Color(252, 208,76));
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        String rel = (String) comboBox.getSelectedItem();
        String cate = (String) comboBox2.getSelectedItem();
        String inc = (String) comboBox3.getSelectedItem();
        String edu = (String) comboBox4.getSelectedItem();
        String occ = (String) comboBox5.getSelectedItem();

        String pan = textPan.getText();
        String aadhar = textAadhar.getText();

        String scitizen = "";
        if((s1.isSelected())){
            scitizen = "Yes";
        } else if ((s2.isSelected())){
            scitizen = "No";
        }

        String eAccount = "";
        if((e1.isSelected())){
            eAccount = "Yes";
        } else if ((e2.isSelected())){
            eAccount = "No";
        }

        try{
            if(textPan.getText().equals("") || textAadhar.getText().equals("")){
                JOptionPane.showMessageDialog(null,"Fill all the fields");
            }else{
                Con c1 = new Con();
                String q = "insert into signuptwo values('"+formno+"', '"+rel+"', '"+cate+"', '"+inc+"', '"+edu+"',  '"+occ+"', '"+pan+"', '"+aadhar+"', '"+scitizen+"', '"+eAccount+"')";
                c1.statement.executeUpdate(q);
                new Signup3(formno);
                setVisible(false);
            }

        }catch (Exception E){
            E.printStackTrace();
        }

    }

    public static void main(String[] args) {

        new Signup2("");
    }
}
