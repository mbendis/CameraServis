package main.camera;

import main.MainFrame;
import main.cameras.Camera;
import sun.applet.Main;

import javax.swing.*;

public class CameraPanel extends JPanel {
    MainFrame mainFrame;

    public CameraPanel(MainFrame mainFrame, String name){
        this.mainFrame = mainFrame;
        add(new JLabel(name));
    }
}
