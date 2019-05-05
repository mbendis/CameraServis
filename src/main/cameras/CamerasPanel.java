package main.cameras;

import javax.swing.*;
import java.awt.*;

public class CamerasPanel extends JPanel {

    private JLabel camerasText;

    public CamerasPanel(){
        camerasText = new JLabel("Cameras");
        setLayout(new BorderLayout());
        add(camerasText, BorderLayout.SOUTH);
    }
}
