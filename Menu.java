package main;
import javax.swing.*;

public class Menu extends JFrame
    {

        public Menu()
            {
                this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                setVisible(false);
                setBounds(100, 100, 454, 343);
                setTitle("Меню");
                getContentPane().setLayout(null);

                    JButton curs = new JButton("Пройти электронный курс.");
                    curs.addActionListener(arg0 ->
                        {
                            new List().setVisible(true);
                            dispose();
                        });
                curs.setBounds(80, 100, 280, 40);
                getContentPane().add(curs);

                    JButton test = new JButton("Пройти тест.");
                    test.addActionListener(arg0 ->
                        {
                            JOptionPane.showMessageDialog(null,"На прохождение теста дается одна попытка!");
                            new Test().setVisible(true);
                            dispose();

                        });
                test.setBounds(150, 150, 150, 40);
                getContentPane().add(test);


            }

    }
