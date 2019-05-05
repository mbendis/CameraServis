package main;

import main.cameras.CamerasPanel;
import main.login.LoginPanel;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {

    private String title = "CameraServis";
    private CamerasPanel camerasPanel;
    private LoginPanel loginPanel;

    public MainFrame(){
        setTitle(title);

        setLayout(new BorderLayout());



        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        setSize(800,600);

        Container c = getContentPane();



        loginPanel = new LoginPanel(this);

        c.add(loginPanel, BorderLayout.CENTER);

    }
}
