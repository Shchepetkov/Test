package main;

import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;

public class List extends JFrame
    {
        public List()
            {
                this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                setVisible(false);
                setBounds(100, 100, 454, 343);

                setTitle("Содержание");
                getContentPane().setLayout(null);

                    JButton a1 = new JButton("1. Основные понятия по компьютерным сетям.\n\n");
                    a1.addActionListener(arg0 ->
                        {
                            listing.OS vis = new listing.OS();
                            vis.setVisible(true);
                            setVisible(false);
                        });

                a1.setBounds(15, 15, 400, 23);
                getContentPane().add(a1);

                    JButton a2 = new JButton("2. Локальные сети.\n\n");
                    a2.addActionListener(arg0 ->
                        {
                            new listMenuL().setVisible(true);
                            setVisible(false);

                        });

                a2.setBounds(15, 45, 400, 23);
                getContentPane().add(a2);

                    JButton a3 = new JButton("3. Глобальные сети.\n\n");
                    a3.addActionListener(arg0 ->
                        {
                            new listMenuG().setVisible(true);
                            setVisible(false);
                        });

                a3.setBounds(15, 75, 400, 23);
                getContentPane().add(a3);

                JButton a4 = new JButton("4. Самостоятельные работы по локальным сетям.\n\n");
                a4.addActionListener(arg0 ->
                    {

                        new list4().setVisible(true);
                        setVisible(false);

                    });

                a4.setBounds(15, 105, 400, 23);
                getContentPane().add(a4);

                JButton a5 = new JButton("5. Самостоятельные работы по глобальным сетям.\n\n");
                a5.addActionListener(arg0 ->
                    {
                        new list5().setVisible(true);
                        setVisible(false);

                    });

                a5.setBounds(15, 135, 400, 23);
                getContentPane().add(a5);
                JButton back = new JButton("Пройти тест.");
                back.addActionListener(arg0 ->
                    {
                        JOptionPane.showMessageDialog(null,"На прохождение теста дается одна попытка!");
                        new Test().setVisible(true);
                        setVisible(false);

                    });
                back.setBounds(15, 165, 400, 23);
                getContentPane().add(back);

            }

        private class listMenuL extends JFrame
            {
                listMenuL()
                    {
                        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// Приказываем завершать работу программы при закрытии формы
                        setVisible(false);
                        setBounds(100, 100, 454, 80);
                        setTitle("LAN");
                        getContentPane().setLayout(null);

                        JButton Arcnet  = new JButton("Arcnet ");

                        Arcnet.addActionListener(arg0 ->
                            {
                                if (Desktop.isDesktopSupported())
                                    {
                                        try
                                            {
                                                File img1L = new File("../maven/src/main/java/img/1L.jpg");
                                                Desktop.getDesktop().open(img1L);

                                            } catch (IOException ex) { }

                                            new listing.Arcnet().setVisible(true);
                                            setVisible(false);
                                    }
                            });

                        Arcnet.setBounds(5, 10, 80, 23);
                        getContentPane().add(Arcnet);

                        JButton TokenRing  = new JButton("Token Ring");
                        TokenRing.addActionListener(arg0 ->
                            {
                                if (Desktop.isDesktopSupported())
                                {
                                    try
                                        {
                                            File img2L = new File("../maven/src/main/java/img/2L.png");
                                            Desktop.getDesktop().open(img2L);
                                        } catch (IOException ex) { }

                                    new listing.TokenRing().setVisible(true);
                                    setVisible(false);
                                }
                            });

                        TokenRing.setBounds(85, 10, 120, 23);
                        getContentPane().add(TokenRing);

                        JButton Ethernet  = new JButton("Ethernet");
                        Ethernet.addActionListener(arg0 ->
                            {

                                if (Desktop.isDesktopSupported())
                                    {
                                        try
                                            {
                                                File img3L = new File("../maven/src/main/java/img/3L.png");
                                                Desktop.getDesktop().open(img3L);

                                            } catch (IOException ex) { }

                                        listing.Ethernet vis = new listing.Ethernet();
                                        vis.setVisible(true);
                                        setVisible(false);
                                    }
                            });

                        Ethernet.setBounds(195, 10, 83, 23);
                        getContentPane().add(Ethernet);

                        JButton back  = new JButton("Назад");
                        back.addActionListener(arg0 ->
                            {
                                new List().setVisible(true);
                                setVisible(false);

                            });

                        back.setBounds(270, 10, 120, 23);
                        getContentPane().add(back);
                    }
            }

        private class listMenuG extends JFrame
            {

                listMenuG()
                    {
                        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                        setVisible(false);
                        setBounds(100, 100, 454, 80);
                        setTitle("WAN");
                        getContentPane().setLayout(null);

                        JButton X_25  = new JButton("x.25 ");
                        X_25.addActionListener(arg0 ->
                            {

                                if (Desktop.isDesktopSupported())
                                    {
                                        try
                                            {
                                                File img1G = new File("../maven/src/main/java/img/1G.png");
                                                Desktop.getDesktop().open(img1G);
                                            } catch (IOException ex) { }

                                        listing.X_25 vis = new listing.X_25();
                                        vis.setVisible(true);
                                        setVisible(false);
                                    }
                            });

                        X_25.setBounds(5, 10, 80, 23);
                        getContentPane().add(X_25);

                        JButton FrameRelay  = new JButton("Frame Relay");
                        FrameRelay.addActionListener(arg0 ->
                            {
                                if (Desktop.isDesktopSupported())
                                    {
                                        try
                                            {
                                                File img2G = new File("../maven/src/main/java/img/2G.png");
                                                Desktop.getDesktop().open(img2G);
                                            } catch (IOException ex) { }

                                        listing.FrameRelay vis = new listing.FrameRelay();
                                        vis.setVisible(true);
                                        setVisible(false);
                                    }
                            });

                        FrameRelay.setBounds(85, 10, 120, 23);
                        getContentPane().add(FrameRelay);

                        JButton Atm  = new JButton("Atm ");
                        Atm.addActionListener(arg0 ->
                            {
                                if (Desktop.isDesktopSupported())
                                    {
                                        try
                                            {
                                                File img3G = new File("../maven/src/main/java/img/3G.jpg");
                                                Desktop.getDesktop().open(img3G);
                                            } catch (IOException ex) { }

                                        new listing.ATM().setVisible(true);
                                        setVisible(false);
                                    }
                            });

                        Atm.setBounds(195, 10, 83, 23);
                        getContentPane().add(Atm);

                        JButton back  = new JButton("Назад");
                        back.addActionListener(arg0 ->
                            {
                                new List().setVisible(true);
                                setVisible(false);

                            });

                        back.setBounds(270, 10, 120, 23);
                        getContentPane().add(back);
                    }
            }

        private class list4 extends JFrame
            {
                list4()
                    {

                        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                        setVisible(false);
                        setBounds(100, 100, 454, 343);

                        setTitle("4");
                        getContentPane().setLayout(null);

                        JLabel b1 = new JLabel("Самостоятельная работа №1. FDDI - реферат.");
                        b1.setBounds(10, 100, 500, 14);
                        getContentPane().add(b1);

                        JLabel b2 = new JLabel("Самостоятельная работа №2. 100BaseVG - презентация.");
                        b2.setBounds(10, 130, 500, 14);
                        getContentPane().add(b2);

                        JLabel b3 = new JLabel("Самостоятельная работа №3. Fibre channel - сообщение");
                        b3.setBounds(10, 160, 500, 14);
                        getContentPane().add(b3);

                        JButton back = new JButton("Назад.");
                        back.addActionListener(arg0 ->
                            {
                                new List().setVisible(true);
                                setVisible(false);
                            });
                        back.setBounds(15, 15, 400, 23);
                        getContentPane().add(back);
                    }
            }

        private class list5 extends JFrame
            {
                list5()
                    {
                        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                        setVisible(false);
                        setBounds(100, 100, 600, 343);

                        setTitle("5");
                        getContentPane().setLayout(null);

                        JLabel b1 = new JLabel("Самостоятельная работа №4. Стандартизация интернета - сообщения.");
                        b1.setBounds(10, 100, 500, 14);
                        getContentPane().add(b1);

                        JLabel b2 = new JLabel("Самостоятельная работа №5. История развития интернета - презентация.");
                        b2.setBounds(10, 130, 500, 14);
                        getContentPane().add(b2);

                        JLabel b3 = new JLabel("Самостоятельная работа №6. История развития беспроводных технологий - сообщение.");
                        b3.setBounds(10, 160, 580,14 );
                        getContentPane().add(b3);

                        JButton back = new JButton("Назад.");
                        back.addActionListener(arg0 -> {

                            new List().setVisible(true);
                            setVisible(false);

                        });
                        back.setBounds(15, 15, 400, 23);
                        getContentPane().add(back);
                    }
            }
    }