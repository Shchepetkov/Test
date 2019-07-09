package listing;

import javax.swing.*;
import java.awt.*;

public class ATM
    {

        public ATM()
            {

                JFrame frame = new JFrame();
                JPanel panel = new JPanel();
                JLabel ATM = new JLabel();

                ATM.setText("<html>\n" +
                        "<head>\n" +
                        "</head>\n" +
                        "<body>\n" +
                        "<p class='p1'><span class='s1'></span><br></p>\n" +
                        "<p class='p2'><span class='s1'><b>Сети ATM</b></span></p>\n" +
                        "<p class='p3'><span class='s1'><b>Глобальные сети с коммутацией пакетов</b></span></p>\n" +
                        "<p class='p4'><span class='s1'><b>Технология ATM - технология передачи ячеек или технология трансляции ячеек</b></span></p>\n" +
                        "<p class='p1'><span class='s2'></span><br></p>\n" +
                        "<p class='p5'><span class='s1'>Технология асинхронного режима передачи (Asynchronous Transfer Mode, ATM) - технология передачи данных является<span class='Apple-converted-space'> </span></span></p>\n" +
                        "<p class='p5'><span class='s1'>одной перспективных технологий построения высокоскоростных сетей (от локальных до глобальных). АТМ - это коммуникационная<span class='Apple-converted-space'> </span></span></p>\n" +
                        "<p class='p5'><span class='s1'>технология, объединяющая принципы коммутации пакетов и каналов для передачи информации различного типа.<span class='Apple-converted-space'> </span></span></p>\n" +
                        "<p class='p5'><span class='s1'>Технология ATM разрабатывалась для передачи всех видов трафика в локальных и глобальных сетях, т.е. передачи разнородного</span></p>\n" +
                        "<p class='p5'><span class='s1'><span class='Apple-converted-space'> </span>трафика (цифровых, голосовых и мультимедийных данных) по одним и тем же системам и линиям связи. Скорость передачи данных</span></p>\n" +
                        "<p class='p5'><span class='s1'><span class='Apple-converted-space'> </span>в магистралях ATM составляет 155 Мбит/с - 2200 Мбит/с.<span class='Apple-converted-space'> </span></span></p>\n" +
                        "<p class='p5'><span class='s1'>ATM поддерживает физический и канальный уровни OSI. Технология ATM использует для передачи данных технику виртуальных<span class='Apple-converted-space'> </span></span></p>\n" +
                        "<p class='p5'><span class='s1'>соединений (коммутируемых и постоянных).</span></p>\n" +
                        "<p class='p5'><span class='s1'>В технологии ATM информация передается в ячейках (cell) фиксированного размера в 53 байта, из них 48 байт предназначены для<span class='Apple-converted-space'> </span></span></p>\n" +
                        "<p class='p5'><span class='s1'>данных, а 5 байт - для служебной информации (для заголовка ячейки ATM). Ячейки не содержат адресной информации и контрольной<span class='Apple-converted-space'> </span></span></p>\n" +
                        "<p class='p5'><span class='s1'>суммы данных, что ускоряет их обработку и коммутацию.</span></p>\n" +
                        "<p class='p5'><span class='s1'>20-байтовыми адресами приемник и передатчик обмениваются только в момент установления виртуального соединения. Основная функция<span class='Apple-converted-space'> </span></span></p>\n" +
                        "<p class='p5'><span class='s1'>заголовка сводится к идентификации виртуального соединения. В процессе передачи информации ячейки пересылаются между узлами через<span class='Apple-converted-space'> </span></span></p>\n" +
                        "<p class='p5'><span class='s1'>сеть коммутаторов, соединенных между собой цифровыми линиями связи. В отличие от маршрутизаторов коммутаторы АТМ выполняют свои</span></p>\n" +
                        "<p class='p5'><span class='s1'><span class='Apple-converted-space'> </span>функции аппаратно, что ускоряет чтение идентификатора в заголовке ячейки, после чего коммутатор переправляет ее из одного порта в другой.</span></p>\n" +
                        "<p class='p5'><span class='s1'>Малый размер ячеек обеспечивает передачу трафика, чувствительного к задержкам. Фиксированный формат ячейки упрощает ее обработку<span class='Apple-converted-space'> </span></span></p>\n" +
                        "<p class='p5'><span class='s1'>коммуникационным оборудованием, которое аппаратно реализует функции коммутации ячеек.</span></p>\n" +
                        "<p class='p5'><span class='s1'>Именно, сочетание фиксированного размера ячеек для передачи данных и реализация протоколов ATM в аппаратном обеспечении дает этой<span class='Apple-converted-space'> </span></span></p>\n" +
                        "<p class='p5'><span class='s1'>технологии возможность передавать все типы трафика по одним и тем же системам и линиям связи.<span class='Apple-converted-space'> </span></span></p>\n" +
                        "<p class='p5'><span class='s1'>Телекоммуникационная сеть, использующая технологию АТМ, состоит из набора коммутаторов, связанных между собой. Коммутаторы<span class='Apple-converted-space'> </span></span></p>\n" +
                        "<p class='p5'><span class='s1'>АТМ поддерживают два вида интерфейсов: UNI (UNI - user-network interface) и NNI (NNI - network-network interface). Пользовательский<span class='Apple-converted-space'> </span></span></p>\n" +
                        "<p class='p5'><span class='s1'>интерфейс UNI (пользователь - сеть) используется для подключения к коммутатору конечных систем. Межсетевой интерфейс NNI (сеть - сеть)<span class='Apple-converted-space'> </span></span></p>\n" +
                        "<p class='p5'><span class='s1'>используется для соединений между коммутаторами.<span class='Apple-converted-space'> </span></span></p>\n" +
                        "<p class='p5'><span class='s1'>Коммутатор АТМ состоит:</span></p>\n" +
                        "<ul class='ul1'>\n" +
                        "<li class='li6'><span class='s1'>из коммутатора виртуальных путей;</span></li>\n" +
                        "<li class='li6'><span class='s1'>из коммутатора виртуальных каналов.</span></li>\n" +
                        "</ul>\n" +
                        "<p class='p5'><span class='s1'>Коммутатор АТМ анализирует значения идентификаторов виртуального пути и виртуального канала ячейки, которая поступает на его вход и<span class='Apple-converted-space'> </span></span></p>\n" +
                        "<p class='p5'><span class='s1'>направляет ячейку на один из его выходных портов. Номер выходного порта определяется динамически создаваемой таблицей коммутации.</span></p>\n" +
                        "<p class='p1'><span class='s2'></span><br></p>\n" +
                        "<p class='p5'><span class='s1'>Для передачи данных в сети АТМ формируется виртуальное соединение. <b>Виртуальное соединение</b> определяется сочетанием идентификатора<span class='Apple-converted-space'> </span></span></p>\n" +
                        "<p class='p5'><span class='s1'>виртуального пути и идентификатора виртуального канала. Идентификатор позволяет маршрутизировать ячейку для доставки в путь назначения,</span></p>\n" +
                        "<p class='p5'><span class='s1'><span class='Apple-converted-space'> </span>т.е. коммутация ячеек происходит на основе идентификатора виртуального пути и идентификатора виртуального канала, определяющих виртуальное<span class='Apple-converted-space'> </span></span></p>\n" +
                        "<p class='p5'><span class='s1'>соединение. Несколько виртуальных путей составляют виртуальный канал.<span class='Apple-converted-space'> </span></span></p>\n" +
                        "<p class='p5'><span class='s1'><b>Виртуальный канал</b> является соединением, установленным между двумя конечными узлами на время их взаимодействия, а <b>виртуальный путь</b> –<span class='Apple-converted-space'> </span></span></p>\n" +
                        "<p class='p5'><span class='s1'>это путь между двумя коммутаторами.</span></p>\n" +
                        "<p class='p5'><span class='s1'>При создании виртуального канала, коммутаторы определяют, какой виртуальный путь использовать для достижения пункта назначения.<span class='Apple-converted-space'> </span></span></p>\n" +
                        "<p class='p5'><span class='s1'>По одному и тому же виртуальному пути может передаваться одновременно трафик множества виртуальных каналов.<span class='Apple-converted-space'> </span></span></p>\n" +
                        "<p class='p7'><span class='s1'><b>Физический уровень</b></span></p>\n" +
                        "<p class='p5'><span class='s1'>Физический уровень аналогично физическому уровню OSI определяет способы передачи в зависимости от среды.</span></p>\n" +
                        "<p class='p5'><span class='s1'>Стандарты ATM для физического уровня устанавливают, каким образом биты должны проходить через среду передачи, и как биты преобразовывать в ячейки.<span class='Apple-converted-space'> </span></span></p>\n" +
                        "<p class='p5'><span class='s1'>На физическом уровне ATM используют цифровые каналы передачи данных, с различными протоколами, а в качестве линий связи используются:<span class='Apple-converted-space'> </span></span></p>\n" +
                        "<p class='p5'><span class='s1'>кабели 'витая пара', экранированная 'витая пара', оптоволоконный кабель.<span class='Apple-converted-space'> </span></span></p>\n" +
                        "<p class='p7'><span class='s1'><b>Канальный уровень (уровень ATM + уровень адаптации)</b></span></p>\n" +
                        "<p class='p5'><span class='s1'>Уровень ATM вместе с уровнем адаптации примерно эквивалентен второму уровню модели OSI. Уровень ATM отвечает за передачу ячеек через сеть ATM,<span class='Apple-converted-space'> </span></span></p>\n" +
                        "<p class='p5'><span class='s1'>используя информацию их заголовков. Заголовок содержит идентификатор виртуального канала, который назначается соединению при его установлении<span class='Apple-converted-space'> </span></span></p>\n" +
                        "<p class='p5'><span class='s1'>и удаляется при разрыве соединения.</span></p>\n" +
                        "<p class='p8'><span class='s1'><b>Преимущества:</b></span></p>\n" +
                        "<ul class='ul1'>\n" +
                        "<li class='li6'><span class='s1'>одно из важнейших достоинств АТМ является обеспечение высокой скорости передачи информации;</span></li>\n" +
                        "<li class='li6'><span class='s1'>АТМ устраняет различия между локальными и глобальными сетями, превращая их в единую интегрированную сеть;</span></li>\n" +
                        "<li class='li6'><span class='s1'>стандарты АТМ обеспечивают передачу разнородного трафика (цифровых, голосовых и мультимедийных данных) по одним и тем же системам и линиям связи.</span></li>\n" +
                        "</ul>\n" +
                        "<p class='p8'><span class='s1'><b>Недостатки:</b></span></p>\n" +
                        "<ul class='ul1'>\n" +
                        "<li class='li6'><span class='s1'>высокая стоимость оборудования, поэтому технологии АТМ тормозится наличием более дешевых технологий;</span></li>\n" +
                        "<li class='li6'><span class='s1'>высокие требования к качеству линий передачи данных.</span></li>\n" +
                        "</ul>\n" +
                        "</body>\n" +
                        "</html>\n");

                    panel.add(ATM);

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
