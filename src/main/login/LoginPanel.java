package main.login;

import main.MainFrame;

import javax.swing.*;
import java.awt.*;

public class LoginPanel extends JPanel {

    MainFrame mainFrame;

    public LoginPanel(MainFrame mainFrame){

        this.mainFrame = mainFrame;

        mainFrame.setSize(400, 150);

        JLabel userLabel = new JLabel("Username");
        userLabel.setBounds(10, 10, 80, 25);

        JTextField userText = new JTextField(20);
        userText.setBounds(100, 10, 160, 25);

        JLabel passwordLabel = new JLabel("Password");
        passwordLabel.setBounds(10, 40, 80, 25);

        JPasswordField passwordText = new JPasswordField(20);
        passwordText.setBounds(100, 40, 160, 25);

        JButton loginButton = new JButton("Login");
        loginButton.setBounds(10, 80, 80, 25);

        loginButton.addActionListener(new LoginButtonListener(userText, passwordText, mainFrame));

        setLayout(new GridBagLayout());


        GridBagConstraints gbc = new GridBagConstraints();

        gbc.weightx = 0.5;
        gbc.weighty = 0.5;

        gbc.gridx = 0;
        gbc.gridy = 0;
        add(userLabel, gbc);

        gbc.gridx = 0;
        gbc.gridx = 1;
        add(userText, gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        add(passwordLabel, gbc);

        gbc.gridx = 0;
        gbc.gridx = 1;
        add(passwordText, gbc);

        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.fill = GridBagConstraints.CENTER;
        add(loginButton, gbc);

        gbc.anchor = GridBagConstraints.FIRST_LINE_START;

    }
}
