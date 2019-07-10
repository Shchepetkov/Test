package main;

import javax.swing.*;
import java.awt.*;
import java.sql.SQLException;

public class Registration extends JFrame
    {
        private static Boolean status = false;
        private static JTextField txtUsername;
        private static JPasswordField txtPassword;
        private JPasswordField txtConfirmPassword;
        private static JTextField txtName;
        private static JTextField txtEmail;
        private static String strUsername;
        private static String strPassword;
        private static String strName;
        private static String strEmail;

        private Registration()
            {
                setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                setBounds(100, 100, 454, 343);
                setTitle("Регистрация");
                getContentPane().setLayout(null);

                JLabel hRegister = new JLabel("Регистрация");
                hRegister.setFont(new Font("Tahoma", Font.BOLD, 13));
                hRegister.setHorizontalAlignment(SwingConstants.CENTER);
                hRegister.setBounds(121, 11, 132, 20);
                getContentPane().add(hRegister);

                JLabel hUsername = new JLabel("Логин :");
                hUsername.setBounds(78, 52, 89, 14);
                getContentPane().add(hUsername);

                JLabel hPassword = new JLabel("Пароль :");
                hPassword.setBounds(78, 84, 89, 14);
                getContentPane().add(hPassword);

                JLabel hConfirmPassword = new JLabel("Повторите Пароль :");
                hConfirmPassword.setBounds(77, 113, 130, 14);
                getContentPane().add(hConfirmPassword);

                JLabel hName = new JLabel("Имя :");
                hName.setBounds(78, 148, 89, 14);
                getContentPane().add(hName);

                JLabel hEmail = new JLabel("Email :");
                hEmail.setBounds(80, 176, 89, 14);
                getContentPane().add(hEmail);

                txtUsername = new JTextField("");
                txtUsername.setBounds(217, 47, 99, 20);
                getContentPane().add(txtUsername);

                txtPassword = new JPasswordField();
                txtPassword.setBounds(217, 77, 102, 20);
                getContentPane().add(txtPassword);

                txtConfirmPassword = new JPasswordField();
                txtConfirmPassword.setBounds(217, 112, 102, 20);
                getContentPane().add(txtConfirmPassword);

                txtName = new JTextField("");
                txtName.setBounds(217, 140, 176, 20);
                getContentPane().add(txtName);

                txtEmail = new JTextField("");
                txtEmail.setBounds(217, 172, 176, 20);
                getContentPane().add(txtEmail);

                JButton reg = new JButton("Зарегестрироваться");
                reg.addActionListener(arg0 -> {
                    try
                        {
                            if(RegisterData())
                                {
                                    JOptionPane.showMessageDialog(null,
                                            "Регистрация Данных Успешно");
                                }
                        } catch (ClassNotFoundException | SQLException e) {e.printStackTrace();}
                });

                JButton login = new JButton("Вход");
                login.addActionListener(arg0 ->
                    {
                        new Login().setVisible(true);
                        setVisible(false);
                    });

                login.setBounds(300, 227, 80, 23);
                getContentPane().add(login);
                reg.setBounds(80, 227, 180, 23);
                getContentPane().add(reg);

            }

        private boolean RegisterData() throws ClassNotFoundException, SQLException
            {
                strUsername = txtUsername.getText();
                strPassword = new String(txtPassword.getPassword());
                strName = txtName.getText();
                strEmail = txtEmail.getText();
                String strConfirmPassword = new String(txtConfirmPassword.getPassword());

                if(strUsername.equals(""))
                    {
                        JOptionPane.showMessageDialog(null,
                                "Пожалуйста, Введите Имя Пользователя)");
                        txtUsername.requestFocusInWindow();
                        return false;
                    }

                if(strPassword.equals(""))
                    {
                        JOptionPane.showMessageDialog(null,
                                "Пожалуйста, Введите (Пароль)");
                        txtPassword.requestFocusInWindow();
                        return false;
                    }

                if(strConfirmPassword.equals(""))
                    {
                        JOptionPane.showMessageDialog(null,
                                "Пожалуйста, Введите (Подтвердите Пароль)");
                        txtConfirmPassword.requestFocusInWindow();
                        return false;
                    }

                if(!strPassword.equals(strConfirmPassword)) // Password math
                    {
                        JOptionPane.showMessageDialog(null,
                                "Пожалуйста, Введите Пароль или (Пароль Не Совпадает!)");
                        txtPassword.requestFocusInWindow();
                        return false;
                    }

                if(strName.equals(""))
                    {
                        JOptionPane.showMessageDialog(null,
                                "Пожалуйста, Введите (Имя)");
                        txtName.requestFocusInWindow();
                        return false;
                    }

                if(strEmail.equals(""))
                    {
                        JOptionPane.showMessageDialog(null,
                                "Пожалуйста, Введите (Email)");
                        txtEmail.requestFocusInWindow();
                        return false;
                    }

                    Conn.Conn();
                    Conn.CreateDB();
                    Conn.WriteDB();

                status = true;
                txtUsername.setText("");
                txtPassword.setText("");
                txtConfirmPassword.setText("");
                txtName.setText("");
                txtEmail.setText("");

                return status;
            }

        static String getStrUsername()
            {
                return strUsername;
            }

        static String getStrPassword()
            {
                return strPassword;
            }

        static String getStrName()
            {
                return strName;
            }

        static String getStrEmail()
            {
                return strEmail;
            }

        public static void main(String[] args)
            {
                EventQueue.invokeLater(() ->
                    {
                        Registration frame = new Registration();
                        frame.setVisible(true);
                    });
            }

    }
