package main.login;

import main.MainFrame;
import main.cameras.CamerasPanel;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginButtonListener implements ActionListener {

        JTextField username;
        JPasswordField password;
        MainFrame mainFrame;

        public LoginButtonListener(JTextField username, JPasswordField password, MainFrame mainFrame){
            this.username = username;
            this.password = password;
            this.mainFrame = mainFrame;
        }


        @Override
        public void actionPerformed(ActionEvent e) {
            JButton source = (JButton) e.getSource();

            if(login(username.getText(), password.getText())){
                drawCamerasPanel();
            } else {
                JOptionPane.showMessageDialog(source, "Invalid username / password.");
            }


        }

        private boolean login(String username, String password){
            return (username.equals("user") && password.equals("pass"));
        }

        private void drawCamerasPanel(){
            mainFrame.getContentPane().removeAll();
            mainFrame.revalidate();
            mainFrame.add(new CamerasPanel());
            mainFrame.revalidate();
            mainFrame.repaint();
        }
}
