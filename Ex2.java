import java.awt.*;
import java.awt.image.*;
import java.awt.geom.*;
import javax.swing.*;
import javax.swing.border.*;


public class Ex2 extends JPanel {
    Ex2() {
        Contacts();
    }
    void Contacts() {
        JFrame frame;
        JLabel title;
        JTextField name;
        JTextField organzation;
        JTextField email;
        JTextField subject;
        JTextArea cmt;
        JButton btn_send;
        AbstractBorder brdrWhite = new TextBubbleBorder(Color.WHITE,2,10,0);
        AbstractBorder brdrYellow = new TextBubbleBorder(Color.yellow,2,10,0,false);

        frame = new JFrame("Contact");
        
        title = new JLabel("Contact Us");
        title.setFont(new Font("SansSerif", Font.BOLD, 30));
        title.setBounds(100, 100, 300, 50);
        title.setHorizontalTextPosition(SwingConstants.CENTER);
        


        name = new JTextField("Name");
        name.setForeground(Color.BLACK);
        name.setBounds(100, 150, 300, 40);
        name.setBorder(brdrWhite);
        name.setBackground(Color.white);

        organzation = new JTextField("Organzation");
        organzation.setBounds(100, 200, 300, 40);
        organzation.setBorder(brdrWhite);


        email = new JTextField("E-mail");
        email.setBounds(100, 250, 300, 40);
        email.setBorder(brdrWhite);

        subject = new JTextField("Subject");
        subject.setBounds(100, 300, 300, 40);
        subject.setBorder(brdrWhite);

        cmt = new JTextArea();
        cmt.setBounds(100, 350, 300, 100);
        cmt.setBorder(brdrWhite);

        btn_send = new JButton("Send");
        btn_send.setBounds(100, 480, 300, 40);
        btn_send.setBorder(brdrYellow);
        btn_send.setBackground(Color.yellow);



        frame.setSize(500, 700);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setLayout(null);

        frame.add(title);
        frame.add(name);
        frame.add(organzation);
        frame.add(email);
        frame.add(subject);
        frame.add(cmt);
        frame.add(btn_send);


        

    }
    public static void main(String[] args) {
        new Ex2();
    }
}



class TextBubbleBorder extends AbstractBorder {

    private Color color;
    private int thickness = 4;
    private int radii = 8;
    private int pointerSize = 1;
    private Insets insets = null;
    private BasicStroke stroke = null;
    private int strokePad;
    private int pointerPad = 4;
    private boolean left = true;
    RenderingHints hints;

    TextBubbleBorder(
            Color color) {
        this(color, 4, 8, 7);
    }

    TextBubbleBorder(
            Color color, int thickness, int radii, int pointerSize) {
        this.thickness = thickness;
        this.radii = radii;
        this.pointerSize = pointerSize;
        this.color = color;

        stroke = new BasicStroke(thickness);
        strokePad = thickness / 2;

        hints = new RenderingHints(
                RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON);

        int pad = radii + strokePad;
        int bottomPad = pad + pointerSize + strokePad;
        insets = new Insets(pad, pad, bottomPad, pad);
    }

    TextBubbleBorder(
            Color color, int thickness, int radii, int pointerSize, boolean left) {
        this(color, thickness, radii, pointerSize);
        this.left = left;
    }

    @Override
    public Insets getBorderInsets(Component c) {
        return insets;
    }

    @Override
    public Insets getBorderInsets(Component c, Insets insets) {
        return getBorderInsets(c);
    }

    @Override
    public void paintBorder(
            Component c,
            Graphics g,
            int x, int y,
            int width, int height) {

        Graphics2D g2 = (Graphics2D) g;

        int bottomLineY = height - thickness - pointerSize;

        RoundRectangle2D.Double bubble = new RoundRectangle2D.Double(
                0 + strokePad,
                0 + strokePad,
                width - thickness,
                bottomLineY,
                radii,
                radii);

        Polygon pointer = new Polygon();

        if (left) {
            // left point
            pointer.addPoint(
                    strokePad + radii + pointerPad,
                    bottomLineY);
            // right point
            pointer.addPoint(
                    strokePad + radii + pointerPad + pointerSize,
                    bottomLineY);
            // bottom point
            pointer.addPoint(
                    strokePad + radii + pointerPad + (pointerSize / 2),
                    height - strokePad);
        } else {
            // left point
            pointer.addPoint(
                    width - (strokePad + radii + pointerPad),
                    bottomLineY);
            // right point
            pointer.addPoint(
                    width - (strokePad + radii + pointerPad + pointerSize),
                    bottomLineY);
            // bottom point
            pointer.addPoint(
                    width - (strokePad + radii + pointerPad + (pointerSize / 2)),
                    height - strokePad);
        }

        Area area = new Area(bubble);
        area.add(new Area(pointer));

        g2.setRenderingHints(hints);

        // Paint the BG color of the parent, everywhere outside the clip
        // of the text bubble.
        Component parent  = c.getParent();
        if (parent!=null) {
            Color bg = parent.getBackground();
            Rectangle rect = new Rectangle(0,0,width, height);
            Area borderRegion = new Area(rect);
            borderRegion.subtract(area);
            g2.setClip(borderRegion);
            g2.setColor(bg);
            g2.fillRect(0, 0, width, height);
            g2.setClip(null);
        }

        g2.setColor(color);
        g2.setStroke(stroke);
        g2.draw(area);
    }
}