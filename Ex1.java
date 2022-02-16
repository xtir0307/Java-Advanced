import java.awt.*;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

public class Ex1 {

    Ex1() {
        Calculator();
    }
    void Calculator() {
        JFrame frame;
        JTextField text;
        JButton btn_0;
        JButton btn_1;
        JButton btn_2;
        JButton btn_3;
        JButton btn_4;
        JButton btn_5;
        JButton btn_6;
        JButton btn_7;
        JButton btn_8;
        JButton btn_9;
        JButton btn_plus;
        JButton btn_minus;
        JButton btn_multi;
        JButton btn_divi;
        JButton btn_equals;
        JButton btn_mr;
        JButton btn_mc;
        JButton btn_next;
        JButton btn_sqrt;
        JButton btn_mp;
        JButton btn_mm;
        JButton btn_c;
        JButton btn_ac;
        JButton btn_dot;
        JButton btn_per;
        JButton btn_over;

        frame = new JFrame("Calculator");

        text = new JTextField();
        text.setBounds(10, 50, 380, 80);
        text.setBorder(new LineBorder(Color.LIGHT_GRAY, 8));

        btn_0 = new JButton("0");
        btn_1 = new JButton("1");
        btn_2 = new JButton("2");
        btn_3 = new JButton("3");
        btn_4 = new JButton("4");
        btn_5 = new JButton("5");
        btn_6 = new JButton("6");
        btn_7 = new JButton("7");
        btn_8 = new JButton("8");
        btn_9 = new JButton("9");
        btn_mc = new JButton("MC");
        btn_mr = new JButton("MR");
        btn_mp = new JButton("M+");
        btn_mm = new JButton("M-");
        btn_divi = new JButton("/");
        btn_multi = new JButton("*");
        btn_plus = new JButton("+");
        btn_minus = new JButton("-");
        btn_c = new JButton("C");
        btn_ac = new JButton("AC");
        btn_dot = new JButton(".");
        btn_equals = new JButton("=");
        btn_per = new JButton("%");
        btn_over = new JButton("+/-");
        btn_next = new JButton(">");
        btn_sqrt = new JButton("^");

        btn_next.setBounds(330, 150, 60, 30);
        btn_sqrt.setBounds(250, 150, 60, 30);
        
        btn_mc.setBounds(10, 200, 60, 30);
        btn_mr.setBounds(90, 200, 60, 30);
        btn_mm.setBounds(170, 200, 60, 30);
        btn_mp.setBounds(250, 200, 60, 30);
        
        btn_per.setBounds(10, 250, 60, 30);
        btn_7.setBounds(90, 250, 60, 30);
        btn_8.setBounds(170, 250, 60, 30);
        btn_9.setBounds(250, 250, 60, 30);

        btn_over.setBounds(10, 300, 60, 30);
        btn_4.setBounds(90, 300, 60, 30);
        btn_5.setBounds(170, 300, 60, 30);
        btn_6.setBounds(250, 300, 60, 30);

        btn_c.setBounds(10, 350, 60, 30);
        btn_1.setBounds(90, 350, 60, 30);
        btn_2.setBounds(170, 350, 60, 30);
        btn_3.setBounds(250, 350, 60, 30);

        btn_ac.setBounds(10, 400, 60, 30);
        btn_0.setBounds(90, 400, 60, 30);
        btn_dot.setBounds(170, 400, 60, 30);
        btn_equals.setBounds(250, 400, 60, 30);

        btn_multi.setBounds(330, 200, 60, 30);
        btn_divi.setBounds(330, 250, 60, 30);
        btn_minus.setBounds(330, 300, 60, 30);
        btn_plus.setBounds(330, 350, 60, 80);

        frame.setSize(412, 490);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setLayout(null);
        
        frame.add(text);

        frame.add(btn_next);
        frame.add(btn_sqrt);

        frame.add(btn_mc);
        frame.add(btn_mr);
        frame.add(btn_mm);
        frame.add(btn_mp);

        frame.add(btn_per);
        frame.add(btn_7);
        frame.add(btn_8);
        frame.add(btn_9);

        frame.add(btn_over);
        frame.add(btn_4);
        frame.add(btn_5);
        frame.add(btn_6);

        frame.add(btn_c);
        frame.add(btn_1);
        frame.add(btn_2);
        frame.add(btn_3);

        frame.add(btn_ac);
        frame.add(btn_0);
        frame.add(btn_dot);
        frame.add(btn_equals);

        
        frame.add(btn_multi);
        frame.add(btn_divi);
        frame.add(btn_minus);
        frame.add(btn_plus);

    }
    public static void main(String[] args) {
        new Ex1();
    }
}
