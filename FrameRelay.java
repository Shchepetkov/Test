package listing;
import javax.swing.*;
import java.awt.*;


public class FrameRelay
    {
        public FrameRelay()
            {

                JFrame frame = new JFrame();
                JPanel panel = new JPanel();
                JLabel FrameRelay = new JLabel();

                FrameRelay.setText("<html>\n" +
                        "<head>\n" +
                        "</head>\n" +
                        "<body>\n" +
                        "<p class='p1'><span class='s1'><b>Frame relay</b></span></p>\n" +
                        "<p class='p2'><span class='s1'><b>Frame relay</b> (с </span><span class='s2'>англ.</span><span class='s3'> </span><span class='s1'>—</span><span class='s3'> </span><span class='s1'>«ретрансляция кадров», FR) — протокол </span><span class='s2'>канального уровня</span><span class='s1'> </span><span class='s2'>сетевой модели OSI</span><span class='s1'>. Максимальная скорость,<span class='Apple-converted-space'> </span></span></p>\n" +
                        "<p class='p2'><span class='s1'>допускаемая протоколом FR — 34,368 мегабит/сек (каналы E3). Коммутация: точка-точка.<span class='Apple-converted-space'> </span></span></p>\n" +
                        "<p class='p2'><span class='s1'>Frame Relay был создан в начале 1990-х в качестве замены протоколу </span><span class='s2'>X.25</span><span class='s1'> для быстрых надёжных каналов связи, технология FR<span class='Apple-converted-space'> </span></span></p>\n" +
                        "<p class='p2'><span class='s1'>архитектурно основывалась на X.25 и во многом сходна с этим протоколом, однако в отличие от X.25, рассчитанного на линии с<span class='Apple-converted-space'> </span></span></p>\n" +
                        "<p class='p2'><span class='s1'>достаточно высокой частотой ошибок, FR изначально ориентировался на физические линии с низкой частотой ошибок, и поэтому<span class='Apple-converted-space'> </span></span></p>\n" +
                        "<p class='p2'><span class='s1'>большая часть механизмов коррекции ошибок X.25 в состав стандарта FR не вошла. В разработке спецификации принимали участие<span class='Apple-converted-space'> </span></span></p>\n" +
                        "<p class='p2'><span class='s1'>многие организации; многочисленные поставщики поддерживают каждую из существующих реализаций, производя соответствующее</span></p>\n" +
                        "<p class='p2'><span class='s1'><span class='Apple-converted-space'> </span>аппаратное и программное обеспечение.<span class='Apple-converted-space'> </span></span></p>\n" +
                        "<p class='p2'><span class='s1'>Frame relay обеспечивает множество независимых </span><span class='s2'>виртуальных соединений (Virtual Circuits, VC)</span><span class='s1'> в одной линии связи, идентифицируемых<span class='Apple-converted-space'> </span></span></p>\n" +
                        "<p class='p2'><span class='s1'>в FR-сети по идентификаторам подключения к соединению (</span><span class='s2'>DLCI</span><span class='s1'>). Вместо средств управления потоком включает функции извещения о<span class='Apple-converted-space'> </span></span></p>\n" +
                        "<p class='p2'><span class='s1'>перегрузках в сети. Возможно назначение минимальной гарантированной скорости (CIR) для каждого виртуального канала.<span class='Apple-converted-space'> </span></span></p>\n" +
                        "<p class='p2'><span class='s1'>В основном применяется при построении территориально распределённых корпоративных сетей, а также в составе решений, связанных с<span class='Apple-converted-space'> </span></span></p>\n" +
                        "<p class='p2'><span class='s1'>обеспечением гарантированной пропускной способности канала передачи данных (</span><span class='s2'>VoIP</span><span class='s1'>, </span><span class='s2'>видеоконференции</span><span class='s1'> и т. п.).<span class='Apple-converted-space'> </span></span></p>\n" +
                        "<p class='p3'><span class='s1'></span><br></p>\n" +
                        "<p class='p4'><span class='s1'><b>Содержание</b></span></p>\n" +
                        "<ul class='ul1'>\n" +
                        "<li class='li5'><span class='s4'></span><span class='s5'>1 Формат кадра</span></li>\n" +
                        "<li class='li5'><span class='s4'></span><span class='s5'>2 Виртуальные каналы</span></li>\n" +
                        "<li class='li5'><span class='s4'></span><span class='s5'>3 CIR и EIR</span></li>\n" +
                        "<li class='li5'><span class='s4'></span><span class='s5'>4 См. также</span></li>\n" +
                        "<li class='li5'><span class='s4'></span><span class='s5'>5 Ссылки</span></li>\n" +
                        "<li class='li5'><span class='s4'></span><span class='s5'>6 Литература</span></li>\n" +
                        "</ul>\n" +
                        "<p class='p4'><span class='s1'><b>Формат кадра</b></span></p>\n" +
                        "<table cellspacing='0' cellpadding='0'>\n" +
                        "<tbody>\n" +
                        "<tr>\n" +
                        "<td valign='middle' class='td1'>\n" +
                        "<p class='p6'><span class='s1'>Флаг (1 Byte)</span></p>\n" +
                        "</td>\n" +
                        "<td valign='middle' class='td2'>\n" +
                        "<p class='p6'><span class='s1'>Адрес (2-4 Byte)</span></p>\n" +
                        "</td>\n" +
                        "<td valign='middle' class='td3'>\n" +
                        "<p class='p6'><span class='s1'>Данные (переменный размер)</span></p>\n" +
                        "</td>\n" +
                        "<td valign='middle' class='td4'>\n" +
                        "<p class='p6'><span class='s1'>FCS (2 Byte)</span></p>\n" +
                        "</td>\n" +
                        "<td valign='middle' class='td1'>\n" +
                        "<p class='p6'><span class='s1'>Флаг (1 Byte)<span class='Apple-converted-space'> </span></span></p>\n" +
                        "</td>\n" +
                        "</tr>\n" +
                        "</tbody>\n" +
                        "</table>\n" +
                        "<ul class='ul1'>\n" +
                        "<li class='li6'><span class='s1'>Каждый кадр начинается и замыкается «флагом» — последовательностью «01111110». Для предотвращения случайной имитации последовательности<span class='Apple-converted-space'> </span></span></li>\n" +
                        "<li class='li6'><span class='s1'>«флаг» внутри кадра при его передаче проверяется всё его содержание между двумя флагами и после каждой последовательности, состоящей из пяти идущих<span class='Apple-converted-space'> </span></span></li>\n" +
                        "<li class='li6'><span class='s1'>подряд бит «1», вставляется бит «0». Эта процедура (bit stuffing) обязательна при формировании любого кадра FR, при приёме эти биты «0» отбрасываются.</span></li>\n" +
                        "<li class='li6'><span class='s1'>FCS (Frame Check Sequence) — проверочная последовательность кадра служит для обнаружения ошибок и формируется аналогично циклическому коду </span><span class='s2'>HDLC</span><span class='s1'>.</span></li>\n" +
                        "<li class='li6'><span class='s1'>Поле данных имеет минимальную длину в 1 октет, максимальную по стандарту Frame Relay Forum — 1600 октетов, однако в реализациях некоторых производителей<span class='Apple-converted-space'> </span></span></li>\n" +
                        "<li class='li6'><span class='s1'>FR-оборудования допускается превышение максимального размера (до 4096 октетов).</span></li>\n" +
                        "<li class='li6'><span class='s1'>Поле <i>Адрес</i> кадра Frame Relay, кроме собственно адресной информации, содержит также и дополнительные поля управления потоком данных и уведомлений о перегрузке канала и имеет следующую</span></li>\n" +
                        "<li class='li6'><span class='s1'>структуру:</span></li>\n" +
                        "</ul>\n" +
                        "<table cellspacing='0' cellpadding='0'>\n" +
                        "<tbody>\n" +
                        "<tr>\n" +
                        "<td valign='middle' class='td5'>\n" +
                        "<p class='p6'><span class='s1'>DLCI (6 Bit)</span></p>\n" +
                        "</td>\n" +
                        "<td valign='middle' class='td6'>\n" +
                        "<p class='p6'><span class='s1'>C/R (1 Bit)</span></p>\n" +
                        "</td>\n" +
                        "<td valign='middle' class='td7'>\n" +
                        "<p class='p6'><span class='s1'>EA (1 Bit)</span></p>\n" +
                        "</td>\n" +
                        "<td valign='middle' class='td5'>\n" +
                        "<p class='p6'><span class='s1'>DLCI (4 Bit)</span></p>\n" +
                        "</td>\n" +
                        "<td valign='middle' class='td8'>\n" +
                        "<p class='p6'><span class='s1'>FECN (1 Bit)</span></p>\n" +
                        "</td>\n" +
                        "<td valign='middle' class='td9'>\n" +
                        "<p class='p6'><span class='s1'>BECN (1 Bit)</span></p>\n" +
                        "</td>\n" +
                        "<td valign='middle' class='td10'>\n" +
                        "<p class='p6'><span class='s1'>DE (1 Bit)</span></p>\n" +
                        "</td>\n" +
                        "<td valign='middle' class='td7'>\n" +
                        "<p class='p6'><span class='s1'>EA (1 Bit)<span class='Apple-converted-space'> </span></span></p>\n" +
                        "</td>\n" +
                        "</tr>\n" +
                        "</tbody>\n" +
                        "</table>\n" +
                        "<p class='p2'><span class='s1'>Наименования и значения полей:<span class='Apple-converted-space'> </span></span></p>\n" +
                        "<table cellspacing='0' cellpadding='0'>\n" +
                        "<tbody>\n" +
                        "<tr>\n" +
                        "<td valign='middle' class='td11'>\n" +
                        "<p class='p7'><span class='s1'><b>Имя поля</b></span></p>\n" +
                        "</td>\n" +
                        "<td valign='middle' class='td12'>\n" +
                        "<p class='p7'><span class='s1'><b>Назначение<span class='Apple-converted-space'> </span></b></span></p>\n" +
                        "</td>\n" +
                        "</tr>\n" +
                        "<tr>\n" +
                        "<td valign='middle' class='td11'>\n" +
                        "<p class='p6'><span class='s1'>DLCI</span></p>\n" +
                        "</td>\n" +
                        "<td valign='middle' class='td12'>\n" +
                        "<p class='p6'><span class='s1'>Data Link Connection Identifier — идентификатор виртуального канала (PVC), мультиплексируемого в </span><span class='s2'>физический канал</span><span class='s1'>. DLCI имеют только локальное значение и не обеспечивают внутрисетевой адресации.<span class='Apple-converted-space'> </span></span></p>\n" +
                        "</td>\n" +
                        "</tr>\n" +
                        "<tr>\n" +
                        "<td valign='middle' class='td11'>\n" +
                        "<p class='p6'><span class='s1'>C/R</span></p>\n" +
                        "</td>\n" +
                        "<td valign='middle' class='td12'>\n" +
                        "<p class='p6'><span class='s1'>Command / Response — признак «команда-ответ», по аналогии с протоколом </span><span class='s2'>HDLC</span><span class='s1'>.<span class='Apple-converted-space'> </span></span></p>\n" +
                        "</td>\n" +
                        "</tr>\n" +
                        "<tr>\n" +
                        "<td valign='middle' class='td11'>\n" +
                        "<p class='p6'><span class='s1'>EA</span></p>\n" +
                        "</td>\n" +
                        "<td valign='middle' class='td12'>\n" +
                        "<p class='p6'><span class='s1'>Address Field Extension Bit — бит расширения адреса. DLCI содержится в 10 битах, входящих в два октета заголовка, однако возможно расширение заголовка на целое число дополнительных октетов с целью указания адреса, состоящего более чем из 10 бит. EA устанавливается в конце каждого октета заголовка; если он имеет значение «1», то это означает, что данный октет в заголовке последний.<span class='Apple-converted-space'> </span></span></p>\n" +
                        "</td>\n" +
                        "</tr>\n" +
                        "<tr>\n" +
                        "<td valign='middle' class='td11'>\n" +
                        "<p class='p6'><span class='s1'>FECN</span></p>\n" +
                        "</td>\n" +
                        "<td valign='middle' class='td12'>\n" +
                        "<p class='p6'><span class='s1'>Forward Explicit Congestion Notification — извещение о перегрузке канала в прямом направлении.<span class='Apple-converted-space'> </span></span></p>\n" +
                        "</td>\n" +
                        "</tr>\n" +
                        "<tr>\n" +
                        "<td valign='middle' class='td11'>\n" +
                        "<p class='p6'><span class='s1'>BECN</span></p>\n" +
                        "</td>\n" +
                        "<td valign='middle' class='td12'>\n" +
                        "<p class='p6'><span class='s1'>Backward Explicit Congestion Notification — извещение о перегрузке канала в обратном направлении.<span class='Apple-converted-space'> </span></span></p>\n" +
                        "</td>\n" +
                        "</tr>\n" +
                        "<tr>\n" +
                        "<td valign='middle' class='td11'>\n" +
                        "<p class='p6'><span class='s1'>DE</span></p>\n" +
                        "</td>\n" +
                        "<td valign='middle' class='td12'>\n" +
                        "<p class='p6'><span class='s1'>Discard Eligibility Indicator — индикатор разрешения сброса кадра при перегрузке канала. Выставляется в «1» для данных, подлежащих передаче в негарантированной полосе (EIR) и указывает на то, что данный кадр может быть уничтожен в первую очередь.<span class='Apple-converted-space'> </span></span></p>\n" +
                        "</td>\n" +
                        "</tr>\n" +
                        "</tbody>\n" +
                        "</table>\n" +
                        "<p class='p4'><span class='s1'><b>Виртуальные каналы</b></span></p>\n" +
                        "<p class='p2'><span class='s1'>Для передачи данных от отправителя к получателю в сети Frame Relay создаются виртуальные каналы, VC (англ. Virtual Circuit), которые бывают двух видов:<span class='Apple-converted-space'> </span></span></p>\n" +
                        "<ul class='ul1'>\n" +
                        "<li class='li6'><i></i><span class='s1'><i>постоянный виртуальный канал</i>, <b>PVC</b> (Permanent Virtual Circuit), который создаётся между двумя точками и существует в течение длительного времени, даже в отсутствие данных для передачи;</span></li>\n" +
                        "<li class='li6'><i></i><span class='s1'><i>коммутируемый виртуальный канал</i>, <b>SVC</b> (Switched Virtual Circuit), который создаётся между двумя точками непосредственно перед передачей данных и разрывается после окончания сеанса связи</span></li>\n" +
                        "</ul>\n" +
                        "<p class='p4'><span class='s1'><b>CIR и EIR</b></span></p>\n" +
                        "<p class='p2'><span class='s1'>CIR (</span><span class='s2'>англ.</span><span class='s1'> <i>Committed Information Rate</i>) — </span><span class='s2'>гарантированная полоса пропускания</span><span class='s1'> виртуального канала PVC в сетях FR.<span class='Apple-converted-space'> </span></span></p>\n" +
                        "<p class='p2'><span class='s1'>В первоначальном наборе стандартов (ANSI T1S1) CIR как отдельный параметр отсутствует, но для отдельного виртуального канала были определены параметры B(c)<span class='Apple-converted-space'> </span></span></p>\n" +
                        "<p class='p2'><span class='s1'>(bits committed, Committed Burst Size), B(e) (bits excess) и T(c) (Committed Rate Measurement Interval). B(c) при этом определяется как количество бит, гарантированно передаваемых</span></p>\n" +
                        "<p class='p2'><span class='s1'><span class='Apple-converted-space'> </span>за время T(c) даже при перегрузке сети, B(e) — максимальное количество бит, которые могут быть переданы за время T(c) при недогрузке сети, то есть без гарантии доставки: заголовки<span class='Apple-converted-space'> </span></span></p>\n" +
                        "<p class='p2'><span class='s1'>пакетов, отправляемые после превышения B(c) метятся битом DE (discard eligible, аналогичен CLP в </span><span class='s2'>ATM</span><span class='s1'>) и в случае возникновения в сети перегрузки уничтожаются на коммутаторах перегруженного участка.<span class='Apple-converted-space'> </span></span></p>\n" +
                        "<p class='p2'><span class='s1'>Таким образом, для виртуального канала могут быть определены две полосы пропускания:<span class='Apple-converted-space'> </span></span></p>\n" +
                        "<ul class='ul1'>\n" +
                        "<li class='li6'><b></b><span class='s1'><b>CIR=B(c)/T(c)</b> — гарантированная полоса пропускания;</span></li>\n" +
                        "<li class='li6'><b></b><span class='s1'><b>EIR=B(e)/T(c)</b> — максимальная негарантированая полоса пропускания (добавляется возможный дополнительный объем трафика).</span></li>\n" +
                        "</ul>\n" +
                        "<p class='p2'><span class='s1'>Возможна настройка и работа FR-каналов со значением CIR, равным нулю.<span class='Apple-converted-space'> </span></span></p>\n" +
                        "<p class='p2'><span class='s1'>В ANSI T1S1 значение T(c) не было определено, так как значения T(c), B(c) и B(e) являются связанными параметрами, зависящими от скоростей физических интерфейсов, агрегированных</span></p>\n" +
                        "<p class='p2'><span class='s1'><span class='Apple-converted-space'> </span>полос пропускания виртуальных каналов, размеров буферов FR-коммутатора и других параметров, зависящих от реализации и настроек коммутатора.<span class='Apple-converted-space'> </span></span></p>\n" +
                        "<p class='p2'><span class='s1'>Однако CIR и EIR оказались удобными показателями для описания параметров каналов при заключении соглашений между операторами FR-сетей и потребителями их услуг, более того,<span class='Apple-converted-space'> </span></span></p>\n" +
                        "<p class='p2'><span class='s1'>во многих случаях T(c) может динамически пересчитываться в зависимости от характера трафика, поэтому в </span><span class='s2'>RFC 3133</span><span class='s1'> (Terminology for Frame Relay Benchmarking) CIR является первичным</span></p>\n" +
                        "<p class='p2'><span class='s1'><span class='Apple-converted-space'> </span>параметром и T(c) определяется как временной интервал, необходимый для поддержания CIR, то есть T(c)=B(c)/CIR, выступая в качестве аналога TCP Sliding Window.<span class='Apple-converted-space'> </span></span></p>\n" +
                        "<p class='p2'><span class='s1'>В сетевых технологиях при множественном доступе к разделяемому каналу с двухуровневой приоритизацией (некоторые беспроводные и спутниковые сети и т. д.) также используют термин<span class='Apple-converted-space'> </span></span></p>\n" +
                        "<p class='p2'><span class='s1'>CIR для приоритезируемой клиентской полосы пропускания, при этом CIR является одним из целевых параметров конфигурации шейперов (shapers) — подсистем сглаживания трафика с</span></p>\n" +
                        "<p class='p2'><span class='s1'><span class='Apple-converted-space'> </span>буферизацией (</span><span class='s2'>RFC 2963</span><span class='s1'>, A Rate Adaptive Shaper for Differentiated Services), в этом случае вместо EIR используется комбинация параметров MIR (Maximum Information Rate) и PIR (Peak Information Rate).<span class='Apple-converted-space'> </span></span></p>\n" +
                        "<p class='p3'><span class='s1'></span><br></p>\n" +
                        "<p class='p3'><span class='s1'></span><br></p>\n" +
                        "</body>\n" +
                        "</html>\n");

                    panel.add(FrameRelay);

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
