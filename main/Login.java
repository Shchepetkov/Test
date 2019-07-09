package main;

import javax.swing.*;
import java.sql.SQLException;

class Login extends JFrame
    {
        private static Boolean status = false;
        private JPasswordField txtPassword;
        private JTextField txtUsername;
        private static String user1;
        private static String strUsername;
        private static String strPassword;

        Login()
            {
                this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                setVisible(false);

                setBounds(100, 100, 454, 343);
                setTitle("Вход");
                getContentPane().setLayout(null);

                JLabel hUsername = new JLabel("Username :");
                hUsername.setBounds(78, 52, 89, 14);
                getContentPane().add(hUsername);

                JLabel hPassword = new JLabel("Пароль :");
                hPassword.setBounds(78, 84, 89, 14);
                getContentPane().add(hPassword);

                txtUsername = new JTextField("");
                txtUsername.setBounds(217, 47, 99, 20);
                getContentPane().add(txtUsername);

                txtPassword = new JPasswordField();
                txtPassword.setBounds(217, 77, 102, 20);
                getContentPane().add(txtPassword);

                JButton login = new JButton("Вход");
                login.addActionListener(arg0 ->
                    {
                        try {
                            if (Login())
                                {
                                    JOptionPane.showMessageDialog(null,
                                            "Добро пожаловать" + " " + user1 + "!");
                                    dispose();
                                    new Menu().setVisible(true);

                                } else
                                    {
                                        JOptionPane.showMessageDialog(null,
                                                "Попробуйте еще раз!");
                                    }
                        } catch (ClassNotFoundException | SQLException e) {e.printStackTrace();}
                    });

                login.setBounds(300, 227, 80, 23);
                getContentPane().add(login);

                JButton back = new JButton("Назад к регистрации");
                back.addActionListener(arg0 ->
                    {
                        new Login().setVisible(true);
                        setVisible(false);
                    });

                back.setBounds(80, 227, 180, 23);
                getContentPane().add(back);
            }

        private boolean Login() throws ClassNotFoundException, SQLException
            {
                strUsername = txtUsername.getText();
                strPassword = new String(txtPassword.getPassword());

                Conn.Conn();
                Conn.CreateDB();

                   if (Conn.LoginDB())
                       {
                           status = true;
                       }
                    user1 = strUsername;

                return status;
            }

        static String getNam()
            {
                return user1;
            }

        static String getStrUsername()
            {
                return strUsername;
            }

        static String getStrPassword()
            {
                return strPassword;
            }
    }
