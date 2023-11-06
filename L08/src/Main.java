import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main extends JFrame implements ActionListener {

    Main() {
        // Sätt storleken p fönstret
        setSize(640, 480);
        // Set en titel
        setTitle("My Window");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //noLayoutManager();
        //flowLayout();
        //gridLayout();
        //gridBagLayout();
        //borderLayout();
        //boxLayout();
        //cardLayout();
        compositeExample();

        setVisible(true);
        // testAnonymousClasses();
    }

    private CardLayout cardLayout;
    private JPanel labelPanel;

    public void compositeExample() {
        setLayout(new BorderLayout());

        JPanel buttonPanel = new JPanel();
        add(buttonPanel, BorderLayout.NORTH);
        buttonPanel.setLayout(new FlowLayout());

        JButton button1 = new JButton("Sida 1");
        buttonPanel.add(button1);
        JButton button2 = new JButton("Sida 2");
        buttonPanel.add(button2);

        cardLayout = new CardLayout();
        labelPanel = new JPanel();
        labelPanel.setLayout(cardLayout);
        add(labelPanel, BorderLayout.CENTER);

        JLabel label1 = new JLabel("Detta är den första sidan");
        labelPanel.add(label1, "SIDA1");
        JLabel label2 = new JLabel("Detta är den andra sidan");
        labelPanel.add(label2, "SIDA2");
        cardLayout.show(labelPanel, "SIDA1");
        button1.addActionListener(this);
        button2.addActionListener(this);
        /*
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(labelPanel, "SIDA1");
            }
        });
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(labelPanel, "SIDA2");
            }
        });
         */

    }

    public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand().equals("Sida 1")) {
            cardLayout.show(labelPanel, "SIDA1");
        } else {
            cardLayout.show(labelPanel, "SIDA2");
        }
    }

    public void cardLayout() {
        CardLayout cardLayout = new CardLayout();
        setLayout(cardLayout);

        JLabel label1 = new JLabel("This is a label (1)");
        add(label1, "LABEL1");

        JButton button1 = new JButton("This is a button (1)");
        add(button1, "BUTTON1");
        button1.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(Main.this.getContentPane(), "LABEL1");
            }
        });

        JLabel label2 = new JLabel("This is a label (2)");
        add(label2, "LABEL2");

        JButton button2 = new JButton("This is a button (2)");
        add(button2, "BUTTON2");

        cardLayout.show(this.getContentPane(), "BUTTON1");
    }

    public void boxLayout() {
        setLayout(new BoxLayout(this.getContentPane(), BoxLayout.Y_AXIS));

        JLabel label1 = new JLabel("This is a label (1)");
        label1.setAlignmentX(Component.LEFT_ALIGNMENT);
        add(label1);

        JButton button1 = new JButton("This is a button (1)");
        button1.setAlignmentX(Component.CENTER_ALIGNMENT);
        add(button1);

        JLabel label2 = new JLabel("This is a label (2)");
        label2.setAlignmentX(Component.RIGHT_ALIGNMENT);
        add(label2);

        JButton button2 = new JButton("This is a button (2)");
        button2.setAlignmentX(Component.CENTER_ALIGNMENT);
        add(button2);
    }

    public void borderLayout() {
        setLayout(new BorderLayout());

        JLabel label1 = new JLabel("This is a label (1)");
        add(label1, BorderLayout.NORTH);

        JButton button1 = new JButton("This is a button (1)");
        add(button1, BorderLayout.WEST);

        JLabel label2 = new JLabel("This is a label (2)");
        add(label2, BorderLayout.SOUTH);

        JButton button2 = new JButton("This is a button (2)");
        add(button2, BorderLayout.CENTER);
    }

    public void gridBagLayout() {
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();

        JLabel label1 = new JLabel("This is a label (1)");
        gbc.gridx=0;
        gbc.gridy=0;
        gbc.gridwidth=1;
        gbc.gridheight=1;
        add(label1, gbc);

        JButton button1 = new JButton("This is a button (1)");
        gbc.gridx=1;
        gbc.gridy=0;
        gbc.gridwidth=1;
        gbc.gridheight=1;
        add(button1, gbc);

        JLabel label2 = new JLabel("This is a label (2)");
        gbc.gridx=0;
        gbc.gridy=1;
        gbc.gridwidth=2;
        gbc.gridheight=1;
        add(label2, gbc);

        JButton button2 = new JButton("This is a button (2)");
        gbc.gridx=0; // 2
        gbc.gridy=2; // 0
        gbc.gridwidth=2;
        gbc.gridheight=1; //2
        gbc.fill = GridBagConstraints.HORIZONTAL;
        add(button2, gbc);

    }

    public void gridLayout(){
        setLayout(new GridLayout(2, 2));

        JLabel label1 = new JLabel("This is a label (1)");
        add(label1);

        JButton button1 = new JButton("This is a button (1)");
        add(button1);

        JLabel label2 = new JLabel("This is a label (2)");
        add(label2);

        JButton button2 = new JButton("This is a button (2)");
        add(button2);
    }

    public void flowLayout() {
        setLayout(new FlowLayout());

        JLabel label1 = new JLabel("This is a label (1)");
        add(label1);

        JButton button1 = new JButton("This is a button (1)");
        add(button1);

        JLabel label2 = new JLabel("This is a label (2)");
        add(label2);

        JButton button2 = new JButton("This is a button (2)");
        add(button2);
    }

    public void noLayoutManager() {
        setLayout(null);

        JLabel label1 = new JLabel("This is a label (1)");
        label1.setBounds(10, 10, 140, 10);
        add(label1);

        JButton button1 = new JButton("This is a button (1)");
        button1.setBounds(200, 10, 150, 20);
        add(button1);

        JLabel label2 = new JLabel("This is a label (2)");
        label2.setBounds(150, 40, 140, 20);
        add(label2);

        JButton button2 = new JButton("This is a button (2)");
        button2.setBounds(300, 40, 150, 20);
        add(button2);
    }

    public static void main(String[] args) {
        Main main = new Main();
    }

    public static void testAnonymousClasses() {

        // Skapar en anonymklass från Veggie interfacet.
        Veggie myTomato = new Veggie() {

            private String color = "";

            @Override
            public String getColor() {
                return color;
            }

            @Override
            public void setColor(String color) {
                this.color = color;
            }
        };

        System.out.println("Min tomat är: " + myTomato.getColor());
        myTomato.setColor("Green");
        System.out.println("Min tomat är: " + myTomato.getColor());
    }
}