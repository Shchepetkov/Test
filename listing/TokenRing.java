package listing;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TokenRing
    {
        public TokenRing()
            {
                JFrame frame = new JFrame();
                JPanel panel = new JPanel();
                JLabel TokenRing = new JLabel();

                TokenRing.setText("<html>\n" +
                        "<head>\n" +
                        "</head>\n" +
                        "<body>\n" +
                        "<p class='p1'><span class='s1'><br>\n" +
                        "</span></p>\n" +
                        "<p class='p2'><span class='s1'><b>Token ring</b></span></p>\n" +
                        "<p class='p1'><span class='s1'>Материал из Википедии — свободной энциклопедии</span></p>\n" +
                        "<p class='p1'><span class='s1'>Текущая версия страницы пока </span><span class='s2'>не проверялась</span><span class='s1'> опытными участниками и может значительно отличаться от </span><span class='s2'>версии</span><span class='s1'>,<span class='Apple-converted-space'> </span></span></p>\n" +
                        "<p class='p1'><span class='s1'>проверенной 13 марта 2017; проверки требуют </span><span class='s2'>12 правок</span><span class='s1'>.</span></p>\n" +
                        "<p class='p1'><span class='s1'><br>\n" +
                        "</span></p>\n" +
                        "<p class='p3'><span class='s1'><b>Token Ring</b> — протокол передачи данных в </span><span class='s2'>локальной вычислительной сети</span><span class='s1'> (LAN) с топологией кольца и «маркерным доступом».<span class='Apple-converted-space'> </span></span></p>\n" +
                        "<p class='p4'><span class='s3'>Находится на </span><span class='s4'>канальном уровне</span><span class='s3'> (DLL) </span><span class='s4'>модели OSI</span><span class='s3'>.<span class='Apple-converted-space'> </span></span></p>\n" +
                        "<p class='p3'><span class='s1'>Станции в локальной вычислительной сети Token Ring логически организованы в </span><span class='s2'>кольцевую топологию</span><span class='s1'>, с данными, передаваемыми<span class='Apple-converted-space'> </span></span></p>\n" +
                        "<p class='p3'><span class='s1'>последовательно от одной станции в кольце к другой. Token Ring использует специальный трёхбайтовый блок данных, называемый маркером,<span class='Apple-converted-space'> </span></span></p>\n" +
                        "<p class='p3'><span class='s1'>который так же перемещается по кольцу. Владение маркером предоставляет его обладателю право передавать данные.<span class='Apple-converted-space'> </span></span></p>\n" +
                        "<p class='p5'><span class='s1'><b>Содержание</b></span></p>\n" +
                        "<ul class='ul1'>\n" +
                        "<li class='li6'><span class='s5'></span><span class='s4'>1 Передача маркера</span></li>\n" +
                        "<li class='li6'><span class='s5'></span><span class='s4'>2 Сфера применения</span></li>\n" +
                        "<li class='li6'><span class='s5'></span><span class='s4'>3 История</span></li>\n" +
                        "<li class='li6'><span class='s5'></span><span class='s4'>4 Модификации Token Ring</span></li>\n" +
                        "<li class='li6'><span class='s5'></span><span class='s4'>5 Примечания</span></li>\n" +
                        "<li class='li6'><span class='s5'></span><span class='s4'>6 Литература</span></li>\n" +
                        "<li class='li6'><span class='s5'></span><span class='s4'>7 Ссылки</span></li>\n" +
                        "</ul>\n" +
                        "<p class='p5'><span class='s1'><b>Передача маркера</b></span></p>\n" +
                        "<p class='p3'><span class='s1'>Token Ring и IEEE 802.5 являются главными примерами сетей с передачей маркера. Сети с передачей маркера перемещают по сети небольшой блок данных,</span></p>\n" +
                        "<p class='p3'><span class='s1'><span class='Apple-converted-space'> </span>называемый маркером. Владение этим маркером гарантирует право передачи. Если узел, принимающий маркер, не имеет информации для отправки,<span class='Apple-converted-space'> </span></span></p>\n" +
                        "<p class='p3'><span class='s1'>он просто переправляет маркер к следующей конечной станции. Каждая станция может удерживать маркер в течение определённого максимального<span class='Apple-converted-space'> </span></span></p>\n" +
                        "<p class='p3'><span class='s1'>времени (по умолчанию — 10 мс). Данная технология предлагает вариант решения проблемы коллизий, которая возникает при работе локальной сети.<span class='Apple-converted-space'> </span></span></p>\n" +
                        "<p class='p3'><span class='s1'>В технологии Ethernet такие коллизии возникают при одновременной передаче информации несколькими рабочими станциями, находящимися в пределах одного </span><span class='s2'>сегмента</span><span class='s1'>,<span class='Apple-converted-space'> </span></span></p>\n" +
                        "<p class='p3'><span class='s1'>то есть использующих общий </span><span class='s2'>физический канал</span><span class='s1'> данных.<span class='Apple-converted-space'>  </span>Если у станции, владеющей маркером, имеется информация для передачи, она захватывает маркер, изменяет у него</span></p>\n" +
                        "<p class='p3'><span class='s1'>один бит (в результате чего маркер превращается в последовательность «начало блока данных»), дополняет информацией, которую он хочет передать, и отсылает эту информацию<span class='Apple-converted-space'> </span></span></p>\n" +
                        "<p class='p3'><span class='s1'>к следующей станции кольцевой сети. Когда информационный блок циркулирует по кольцу, маркер в сети отсутствует (если только кольцо не обеспечивает «раннего<span class='Apple-converted-space'> </span></span></p>\n" +
                        "<p class='p3'><span class='s1'>освобождения маркера» — early token release), поэтому другие станции, желающие передать информацию, вынуждены ожидать. Следовательно, в сетях Token Ring<span class='Apple-converted-space'> </span></span></p>\n" +
                        "<p class='p3'><span class='s1'>не может быть коллизий. Если обеспечивается раннее высвобождение маркера, то новый маркер может быть выпущен после завершения передачи блока данных.<span class='Apple-converted-space'> </span></span></p>\n" +
                        "<p class='p3'><span class='s1'>Информационный блок циркулирует по кольцу, пока не достигнет предполагаемой станции назначения, которая копирует информацию для дальнейшей обработки.<span class='Apple-converted-space'> </span></span></p>\n" +
                        "<p class='p3'><span class='s1'>Информационный блок продолжает циркулировать по кольцу; он окончательно удаляется после достижения станции, отославшей этот блок.<span class='Apple-converted-space'> </span></span></p>\n" +
                        "<p class='p3'><span class='s1'>Станция отправки может проверить вернувшийся блок, чтобы убедиться, что он был просмотрен и затем скопирован станцией назначения.<span class='Apple-converted-space'> </span></span></p>\n" +
                        "<p class='p5'><span class='s1'><b>Сфера применения</b></span></p>\n" +
                        "<p class='p3'><span class='s1'>В отличие от сетей </span><span class='s2'>CSMA/CD</span><span class='s1'> (например, Ethernet), сети с передачей маркера являются детерминистическими сетями.<span class='Apple-converted-space'> </span></span></p>\n" +
                        "<p class='p3'><span class='s1'>Это означает, что можно вычислить максимальное время, которое пройдёт, прежде чем любая конечная станция сможет передавать.<span class='Apple-converted-space'> </span></span></p>\n" +
                        "<p class='p3'><span class='s1'>Эта характеристика, а также некоторые характеристики надёжности, делают сеть Token Ring идеальной для применений, где задержка должна быть предсказуема и важна<span class='Apple-converted-space'> </span></span></p>\n" +
                        "<p class='p3'><span class='s1'>устойчивость функционирования сети. Примерами таких применений является среда автоматизированных станций на заводах.<span class='Apple-converted-space'> </span></span></p>\n" +
                        "<p class='p3'><span class='s1'>Применяется как более дешёвая технология, получила распространение везде, где есть ответственные приложения, для которых важна не столько скорость, сколько<span class='Apple-converted-space'> </span></span></p>\n" +
                        "<p class='p3'><span class='s1'>надёжная доставка информации. В настоящее время Ethernet по надёжности не уступает Token Ring и существенно выше по производительности.<span class='Apple-converted-space'> </span></span></p>\n" +
                        "<p class='p5'><span class='s1'><b>История</b></span></p>\n" +
                        "<p class='p3'><span class='s1'>Изначально технология была разработана компанией </span><span class='s2'>IBM</span><span class='s1'> в </span><span class='s2'>1984 году</span><span class='s1'>. В </span><span class='s2'>1985 году</span><span class='s1'> </span><span class='s2'>комитет IEEE 802</span><span class='s1'> на основе этой технологии принял стандарт </span><span class='s2'>IEEE 802.5</span><span class='s1'>.<span class='Apple-converted-space'> </span></span></p>\n" +
                        "<p class='p3'><span class='s1'>В последнее время даже в продукции IBM доминируют технологии семейства </span><span class='s2'>Ethernet</span><span class='s1'>, несмотря на то, что ранее в течение долгого времени компания использовала<span class='Apple-converted-space'> </span></span></p>\n" +
                        "<p class='p3'><span class='s1'>Token Ring в качестве основной технологии для построения локальных сетей.<span class='Apple-converted-space'> </span></span></p>\n" +
                        "<p class='p5'><span class='s1'><b>Модификации Token Ring</b></span></p>\n" +
                        "<p class='p3'><span class='s1'>Существуют 2 модификации по скоростям передачи: 4 </span><span class='s2'>Мбит/с</span><span class='s1'> и 16 </span><span class='s2'>Мбит/с</span><span class='s1'>. В Token Ring 16 </span><span class='s2'>Мбит/с</span><span class='s1'> используется технология раннего освобождения маркера.<span class='Apple-converted-space'> </span></span></p>\n" +
                        "<p class='p3'><span class='s1'>Суть этой технологии заключается в том, что станция, «захватившая» маркер, по окончании передачи данных генерирует свободный маркер и запускает его в сеть.<span class='Apple-converted-space'> </span></span></p>\n" +
                        "<p class='p3'><span class='s1'>Попытки внедрить 100 </span><span class='s2'>Мбит/с</span><span class='s1'> технологию не увенчались коммерческим успехом. В настоящее время технология Token Ring считается устаревшей.<span class='Apple-converted-space'> </span></span></p>\n" +
                        "<table cellspacing='0' cellpadding='0'>\n" +
                        "<tbody>\n" +
                        "<tr>\n" +
                        "<td valign='middle' class='td1'>\n" +
                        "<p class='p7'><span class='s1'><br>\n" +
                        "</span></p>\n" +
                        "</td>\n" +
                        "<td valign='middle' class='td2'>\n" +
                        "<p class='p7'><span class='s1'><b>IBM Token Ring<span class='Apple-converted-space'> </span></b></span></p>\n" +
                        "</td>\n" +
                        "<td valign='middle' class='td3'>\n" +
                        "<p class='p7'><span class='s1'><b>IEEE 802.5<span class='Apple-converted-space'> </span></b></span></p>\n" +
                        "</td>\n" +
                        "</tr>\n" +
                        "<tr>\n" +
                        "<td valign='middle' class='td1'>\n" +
                        "<p class='p1'><span class='s1'>Скорость передачи данных</span></p>\n" +
                        "</td>\n" +
                        "<td valign='middle' class='td2'>\n" +
                        "<p class='p1'><span class='s1'>4, 16 </span><span class='s2'>Мбит/с</span></p>\n" +
                        "</td>\n" +
                        "<td valign='middle' class='td3'>\n" +
                        "<p class='p1'><span class='s1'>4, 16 </span><span class='s2'>Мбит/с</span><span class='s1'><span class='Apple-converted-space'> </span></span></p>\n" +
                        "</td>\n" +
                        "</tr>\n" +
                        "<tr>\n" +
                        "<td valign='middle' class='td1'>\n" +
                        "<p class='p1'><span class='s1'>Количество станций в сегменте</span></p>\n" +
                        "</td>\n" +
                        "<td valign='middle' class='td2'>\n" +
                        "<p class='p1'><span class='s1'>260 (экранированная витая пара)</span></p>\n" +
                        "<p class='p1'><span class='s1'>72 (неэкранированная витая пара)</span></p>\n" +
                        "</td>\n" +
                        "<td valign='middle' class='td3'>\n" +
                        "<p class='p1'><span class='s1'>250<span class='Apple-converted-space'> </span></span></p>\n" +
                        "</td>\n" +
                        "</tr>\n" +
                        "<tr>\n" +
                        "<td valign='middle' class='td1'>\n" +
                        "<p class='p1'><span class='s1'>Физическая топология</span></p>\n" +
                        "<p class='p3'><span class='s1'>Логическая топология<span class='Apple-converted-space'> </span></span></p>\n" +
                        "</td>\n" +
                        "<td valign='middle' class='td2'>\n" +
                        "<p class='p1'><span class='s1'>Звезда</span></p>\n" +
                        "<p class='p3'><span class='s1'>Кольцо<span class='Apple-converted-space'> </span></span></p>\n" +
                        "</td>\n" +
                        "<td valign='middle' class='td3'>\n" +
                        "<p class='p1'><span class='s1'>Не определено<span class='Apple-converted-space'> </span></span></p>\n" +
                        "</td>\n" +
                        "</tr>\n" +
                        "<tr>\n" +
                        "<td valign='middle' class='td1'>\n" +
                        "<p class='p1'><span class='s1'>Кабель</span></p>\n" +
                        "</td>\n" +
                        "<td valign='middle' class='td2'>\n" +
                        "<p class='p1'><span class='s1'>Витая пара</span></p>\n" +
                        "</td>\n" +
                        "<td valign='middle' class='td3'>\n" +
                        "<p class='p1'><span class='s1'>Не определено<span class='Apple-converted-space'> </span></span></p>\n" +
                        "</td>\n" +
                        "</tr>\n" +
                        "</tbody>\n" +
                        "</table>\n" +
                        "</body>\n" +
                        "</html>\n");

                    panel.add(TokenRing);

                Toolkit kit = Toolkit.getDefaultToolkit();
                Dimension screenSize = kit.getScreenSize();
                int screenHeight = screenSize.height;
                int screenWidth = screenSize.width;

                JScrollPane scrollPane = new JScrollPane(panel);
                scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
                scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
                scrollPane.setBounds(5, 45, 1300, 700);

                JPanel contentPane = new JPanel(null);
                contentPane.setPreferredSize(new Dimension((screenWidth+1185)/2, (screenHeight+625)/2));
                contentPane.add(scrollPane);
                frame.setContentPane(contentPane);
                frame.pack();
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setVisible(true);

                JButton back = new JButton("Назад.");
                back.addActionListener(arg0 ->
                    {
                        new main.List().setVisible(true);
                        frame.setVisible(false);

                    });
                back.setBounds(15, 15, 400, 23);
                frame.getContentPane().add(back);

            }

        public void setVisible(boolean b) {
            return;
        }
    }
