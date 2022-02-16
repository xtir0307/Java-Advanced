import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class Ex1 {

    Ex1() {
        Calculator();
    }
    void Calculator() {
        JFrame frame;
        JTextField text;
        JButton btn0;
        JButton btn1;
        JButton btn2;
        JButton btn3;
        JButton btn4;
        JButton btn5;
        JButton btn6;
        JButton btn7;
        JButton btn8;
        JButton btn9;
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


        btn0 = new JButton("0");
        btn1 = new JButton("1");
        btn2 = new JButton("2");
        btn3 = new JButton("3");
        btn4 = new JButton("4");
        btn5 = new JButton("5");
        btn6 = new JButton("6");
        btn7 = new JButton("7");
        btn8 = new JButton("8");
        btn9 = new JButton("9");
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

        btn_next.setBounds(330, 150, 60, 30);
        
        btn_mc.setBounds(10, 200, 60, 30);
        btn_mr.setBounds(90, 200, 60, 30);
        btn_mm.setBounds(170, 200, 60, 30);
        btn_mp.setBounds(250, 200, 60, 30);
        
        btn_per.setBounds(10, 250, 60, 30);
        btn7.setBounds(90, 250, 60, 30);
        btn8.setBounds(170, 250, 60, 30);
        btn9.setBounds(250, 250, 60, 30);

        btn_over.setBounds(10, 300, 60, 30);
        btn4.setBounds(90, 300, 60, 30);
        btn5.setBounds(170, 300, 60, 30);
        btn6.setBounds(250, 300, 60, 30);

        btn_c.setBounds(10, 350, 60, 30);
        btn1.setBounds(90, 350, 60, 30);
        btn2.setBounds(170, 350, 60, 30);
        btn3.setBounds(250, 350, 60, 30);

        btn_ac.setBounds(10, 400, 60, 30);
        btn0.setBounds(90, 400, 60, 30);
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
        frame.add(btn_mc);
        frame.add(btn_mr);
        frame.add(btn_mm);
        frame.add(btn_mp);

        frame.add(btn_per);
        frame.add(btn7);
        frame.add(btn8);
        frame.add(btn9);

        frame.add(btn_over);
        frame.add(btn4);
        frame.add(btn5);
        frame.add(btn6);

        frame.add(btn_c);
        frame.add(btn1);
        frame.add(btn2);
        frame.add(btn3);

        frame.add(btn_ac);
        frame.add(btn0);
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
