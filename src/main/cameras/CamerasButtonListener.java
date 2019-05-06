package main.cameras;

import main.MainFrame;
import main.camera.CameraPanel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CamerasButtonListener implements ActionListener {

    private String name;
    private MainFrame mainFrame;

    public CamerasButtonListener(String name, MainFrame mainFrame){
        this.name = name;
        this.mainFrame = mainFrame;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        mainFrame.getContentPane().removeAll();
        mainFrame.revalidate();
        mainFrame.add(new CameraPanel(mainFrame, name));
        mainFrame.revalidate();
        mainFrame.repaint();
    }
}
