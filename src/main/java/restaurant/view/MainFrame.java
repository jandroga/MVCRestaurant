package restaurant.view;


import javax.swing.*;
import java.awt.*;

import static java.awt.GridBagConstraints.RELATIVE;

public class MainFrame extends JFrame {
    private ControlPanel cp;
    private Viewer v;

    public MainFrame(){
        super("Restaurant");
        this.setLayout(new GridBagLayout());
        this.setSize(1000,1000);
        this.getContentPane().setBackground(Color.gray);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setVisible(true);

        GridBagConstraints c = new GridBagConstraints();

        v = new Viewer();
        c.gridx = 0;
        c.gridy = 0;
        c.gridheight = RELATIVE;
        v.setBackground(Color.white);
        this.add(v);

        cp = new ControlPanel();
        c.gridx = 1;
        c.gridy = 0;
        c.fill = GridBagConstraints.HORIZONTAL;
        this.add(cp, c);
    }
}
