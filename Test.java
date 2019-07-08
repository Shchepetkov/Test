package main;

import javax.swing.*;
import java.sql.SQLException;
import java.util.Enumeration;

public class Test extends JFrame
    {
        private static int CounterOtv, CounterJlable, CounterJRadio = 0;
        private static String ListOtv = "";
        private static String ListGroupIsRadioButton = "";

        private JButton Button = new JButton("Начать тест");
        private JLabel[] labels = new JLabel[21];
        private JRadioButton[] radioButtons = new JRadioButton[84];
        private ButtonGroup bgroup = new ButtonGroup();

        public Test()
            {
                super("Тест");
                setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                setBounds(100, 100, 880, 400);
                getContentPane().setLayout(new BoxLayout(getContentPane(), BoxLayout.PAGE_AXIS));

                Button.addActionListener(arg0 ->
                    {
                        Button.setText("OK");
                        getListRadioButton();
                        try
                            {
                                Conn.Conn();
                            }
                            catch (ClassNotFoundException | SQLException e) {e.printStackTrace();}
                        try
                            {
                                Conn.CreateDB();
                            }
                            catch (SQLException e) {e.printStackTrace();}

                        try
                            {
                                JlableUpdate();
                                JRadioButtonUpdate();
                                getListOtv();
                                TrueAndFalse();
                                    if (CounterJRadio == 84)
                                        {
                                            JLabel points = new JLabel("Вы набрали: " + Conn.ResultDBPoints() + " из 10.0"+ " балл(а/ов)");
                                            getContentPane().add(points);
                                            JButton Exit = new JButton("Закончить тест");
                                            Exit.addActionListener(arg ->
                                                {
                                                    dispose();
                                                    System.exit(0);
                                                });
                                                getContentPane().add(Exit);
                                        }
                                revalidate();
                                repaint();
                            }
                            catch (SQLException e) {e.printStackTrace();}

                    });
                getContentPane().add(Button);
            }

        private void JlableUpdate() throws SQLException
            {
                    if (CounterJlable != 0)
                        {
                            remove(labels[CounterJlable - 1]);
                        }

                        labels[CounterJlable] = new JLabel();
                        labels[CounterJlable].setText(Conn.ReadDBJLable());
                        getContentPane().add(labels[CounterJlable]);
                        CounterJlable++;
            }

        private void JRadioButtonUpdate() throws SQLException
            {
                for( int j = CounterJRadio; j < 4 + CounterJRadio; j++)
                    {
                        radioButtons[j] = new JRadioButton();
                        radioButtons[j - CounterJRadio].setText(Conn.ReadDBJRadioButton());
                        getContentPane().add(radioButtons[j - CounterJRadio]);
                        bgroup.add(radioButtons[j]);
                    }
                CounterJRadio+=4;

                    if (CounterJRadio == 84)
                        {
                            for (int i=0; i<4; i++)
                                {
                                    remove(radioButtons[i]);
                                }
                            remove(Button);
                        }
            }

        private void getListOtv() throws SQLException
            {
                if (CounterOtv != 0)
                    {
                        ListOtv = Conn.ReadDBOtv();
                    }
                CounterOtv++;
            }

        private String getSelectedButtonText(ButtonGroup buttonGroup)
            {
                for (Enumeration<AbstractButton> buttons = buttonGroup.getElements(); buttons.hasMoreElements();)
                    {
                        AbstractButton button = buttons.nextElement();

                        if (button.isSelected())
                            {
                                return button.getText();
                            }
                    }
            return null;
            }

        private void getListRadioButton()
            {
                ListGroupIsRadioButton = getSelectedButtonText(bgroup);
            }

        private void TrueAndFalse() throws SQLException
            {
                if(ListOtv.equals(ListGroupIsRadioButton))
                    {
                        Conn Con = new Conn();
                        Con.UpdateDBPoints();
                    }
            }

    }