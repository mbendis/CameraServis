package main.cameras;

import main.MainFrame;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class CamerasPanel extends JPanel {

    private JLabel camerasText;
    private MainFrame mainFrame;
    private ArrayList<Camera> cameraList = new ArrayList();

    public CamerasPanel(MainFrame mainFrame){

        addMockData();

        this.mainFrame = mainFrame;
        mainFrame.setSize(800, 640);
        setLayout(new GridBagLayout());

        GridBagConstraints c = new GridBagConstraints();
        int x = 1;
        int y = 1;
        c.anchor = GridBagConstraints.FIRST_LINE_START;
        for (Camera camera: cameraList) {

            ImageIcon icon = camera.getIcon();
            JLabel iconLabel = new JLabel();
            iconLabel.setIcon(icon);
            JButton name = new JButton(camera.getName());
            name.addActionListener(new CamerasButtonListener(camera.getName(), mainFrame));

            c.weightx = x;
            c.weighty = y;
            add(iconLabel, c);
            c.weightx = x;
            c.weighty = y+1;
            add(name, c);
            x++;
            y++;
            mainFrame.revalidate();
            mainFrame.repaint();
        }
    }

    private void addMockData() {
        cameraList.add(new Camera("Ulaz", "http://sec.com/ulaz", new ImageIcon(("resources/ulaz1.png"))));
        cameraList.add(new Camera("Kamera naprijed", "http://sec.com/naprijed", new ImageIcon(("resources/rest1.png"))));
        cameraList.add(new Camera("Kamera šank", "http://sec.com/sank", new ImageIcon(("resources/rest2.png"))));
    }
}
