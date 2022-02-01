package restaurant.view;

import javax.swing.*;
import java.awt.*;

public class ControlPanel extends JPanel {

    public ControlPanel(){
        super(new GridBagLayout());
        this.setSize(200, 200);
        this.setBackground(Color.blue);
        this.setVisible(true);

        JButton button = new JButton("asd");
        button.setSize(50,50);
        button.setVisible(true);

        this.add(button);
    }
}
