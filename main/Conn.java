package main;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

class Conn
    {
            private static String username = "root";
            private static String password = "root";
            private static String URL = "jdbc:mysql://localhost:3306/dip?verifyServerCertificate=false&requireSSL=false&useLegacyDatetimeCode=false&amp&serverTimezone=UTC";

            private static Connection conn;
            private static Statement statmt;
            private static ResultSet resSet;

        private static int CounterJLable = -1;
        private static int CounterJRadioButton = -1;
        private static int CounterOtv = 0;

        static void setCounterJLable()
            {
                CounterJLable = -1;
            }

        static void setCounterJRadioButton()
            {
                CounterJRadioButton = -1;
            }

        static void setCounterOtv()
            {
                CounterOtv = 0;
            }

            private static List<String> ListDataForJlabels = new ArrayList<>();
            private static List<String> ListDataForJRadioButton = new ArrayList<>();
            private static List<String> ListDataForOtv = new ArrayList<>();

        static void Conn() throws ClassNotFoundException, SQLException
            {
                Class.forName("com.mysql.cj.jdbc.Driver");
                conn = DriverManager.getConnection(URL, username, password);
            }

        static void CreateDB() throws SQLException
            {
                statmt = conn.createStatement();
                            statmt.execute("CREATE TABLE if not exists user (" +
                                    "id INTEGER PRIMARY KEY AUTO_INCREMENT, " +
                                    "Username text NOT NULL, " +
                                    "Password text NOT NULL, " +
                                    "Email text NOT NULL, " +
                                    "Name text NOT NULL, " +
                                    "points float NOT NULL DEFAULT 0, " +
                                    "UNIQUE(Username (255)))"
                            );

                statmt.execute("CREATE TABLE if not exists new (" +
                        "id INTEGER PRIMARY KEY AUTO_INCREMENT," +
                        "variants text NOT NULL," +
                        "text text NOT NULL, " +
                        "otv text NOT NULL)"
                );
            }

        static boolean WriteDB() throws SQLException
            {
                statmt.execute("INSERT INTO user "
                        + "(Username,Password,Email,Name) "
                        + "VALUES ('" + Registration.getStrUsername() + "','"
                        + Registration.getStrPassword() + "','"
                        + Registration.getStrEmail() + "'" + ",'"
                        + Registration.getStrName() + "') ");
                return true;
            }

        static String ReadDBJLable() throws SQLException
            {
                resSet = statmt.executeQuery("SELECT text FROM new");

                    while (resSet.next())
                        {
                            ListDataForJlabels.add(resSet.getString("text"));
                        }
                CounterJLable++;

            return ListDataForJlabels.get(CounterJLable);
            }

        static String ReadDBJRadioButton() throws SQLException
            {
                resSet = statmt.executeQuery("SELECT variants FROM new");

                    while (resSet.next())
                        {
                            ListDataForJRadioButton.add(resSet.getString("variants"));

                        }
                CounterJRadioButton++;

            return ListDataForJRadioButton.get(CounterJRadioButton);
            }

        static String ReadDBOtv() throws SQLException
            {
                resSet = statmt.executeQuery("SELECT otv FROM new");

                    while(resSet.next())
                        {
                            ListDataForOtv.add(resSet.getString("otv"));
                        }
                CounterOtv++;

            return ListDataForOtv.get(CounterOtv-1);
            }

        static String ReadID() throws SQLException
        {
            String id = "";
            String x = Login.getNam();
            resSet = statmt.executeQuery("SELECT id FROM user WHERE Username = '"+ x +"'");

                while (resSet.next())
                    {
                        id = resSet.getString("id");
                    }

            return id;
        }

        void UpdateDBPoints() throws SQLException
            {
                String y = ReadID();
                statmt.executeUpdate("UPDATE user AS s, (SELECT id  FROM user WHERE id= '" + y + "') " +
                        "AS p SET s.points = points+0.5 WHERE s.id = p.id");
            }

        static void ZeroizeDBPoints() throws SQLException
            {
                String y = ReadID();
                statmt.executeUpdate("UPDATE user AS s, (SELECT id  FROM user WHERE id = '" + y + "') " +
                        "AS p SET s.points = 0 WHERE s.id = p.id;");
            }

        static String ResultDBPoints() throws SQLException
            {
                String x = Login.getNam();
                String ResultPoints = "";
                    resSet = statmt.executeQuery("SELECT points FROM user WHERE Username = '"+ x +"'");

                        while(resSet.next())
                            {
                                ResultPoints = resSet.getString("points");
                            }

                return ResultPoints;
            }

        static boolean LoginDB() throws SQLException
            {
                resSet = statmt.executeQuery(" SELECT Username ,Password FROM user "
                        + "WHERE (Username = '" + Login.getStrUsername() + "' AND Password ='"
                        + Login.getStrPassword() + "') ");

                    while (resSet.next())
                        {
                            String Username = resSet.getString("Username");
                            String Password = resSet.getString("Password");

                            if (Login.getStrUsername().equals(Username) && (Login.getStrPassword().equals(Password)))
                                {
                                    return true;
                                }

                                if (Login.getStrUsername().equals(""))
                                    {
                                        return false;
                                    }

                                    if (Login.getStrPassword().equals(""))
                                        {
                                            return false;
                                        }
                        }

                return false;
            }

        static void CloseDB() throws SQLException
            {
                conn.close();
                statmt.close();
                resSet.close();
            }
    }

