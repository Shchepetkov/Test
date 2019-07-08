package listing;

import java.awt.*;
import javax.swing.*;

public class Arcnet
    {
        public Arcnet()
            {

                JFrame frame = new JFrame();
                JPanel panel = new JPanel();
                JLabel ARCNET = new JLabel();

                ARCNET.setText("<html>\n" +
                        "<head>\n" +
                        "</head>\n" +
                        "<body>\n" +
                        "<p class='p1'><span class='s1'><br>\n" +
                        "</span></p>\n" +
                        "<p class='p1'><span class='s1'><br>\n" +
                        "</span></p>\n" +
                        "<p class='p2'><span class='s1'><b>ARCNET</b></span></p>\n" +
                        "<p class='p3'><span class='s1'><b>ARCNET</b> (или <b>ARCnet</b>, от </span><span class='s2'>англ.</span><span class='s1'> <i>Attached Resource Computer NETwork</i>) — технология </span><span class='s2'>ЛВС</span><span class='s1'>, назначение которой аналогично<span class='Apple-converted-space'> </span></span></p>\n" +
                        "<p class='p3'><span class='s1'>назначению </span><span class='s2'>Ethernet</span><span class='s1'> и </span><span class='s2'>Token Ring</span><span class='s1'>. ARCNET являлась первой технологией для создания сетей компьютеров и стала очень<span class='Apple-converted-space'> </span></span></p>\n" +
                        "<p class='p3'><span class='s1'>популярной в 1980-х при автоматизации учрежденческой деятельности.<span class='Apple-converted-space'> </span></span></p>\n" +
                        "<p class='p3'><span class='s1'>Предназначена для организации ЛВС в </span><span class='s2'>сетевой топологии</span><span class='s1'> </span><span class='s2'>«звезда»</span><span class='s1'>.<span class='Apple-converted-space'> </span></span></p>\n" +
                        "<p class='p3'><span class='s1'>Основу коммуникационного оборудования составляет:<span class='Apple-converted-space'> </span></span></p>\n" +
                        "<ul class='ul1'>\n" +
                        "<li class='li1'><span class='s3'></span><span class='s1'>коммутатор (switch)</span></li>\n" +
                        "<li class='li1'><span class='s3'></span><span class='s1'>пассивный/активный концентратор</span></li>\n" +
                        "</ul>\n" +
                        "<p class='p3'><span class='s1'>Преимущество имеет коммутаторное оборудование, так как позволяет формировать сетевые домены.<span class='Apple-converted-space'> </span></span></p>\n" +
                        "<p class='p3'><span class='s1'>Активные хабы применяются при большом удалении рабочей станции (они восстанавливают форму сигнала и усиливают его).<span class='Apple-converted-space'> </span></span></p>\n" +
                        "<p class='p3'><span class='s1'>Пассивные — при маленьком. В сети применяется назначаемый принцип доступа рабочих станций, то есть право на передачу<span class='Apple-converted-space'> </span></span></p>\n" +
                        "<p class='p3'><span class='s1'>имеет станция, получившая от сервера так называемый программный маркер.<span class='Apple-converted-space'> </span></span></p>\n" +
                        "<p class='p3'><span class='s1'>То есть реализуется <i>детерминированный</i> сетевой трафик.<span class='Apple-converted-space'> </span></span></p>\n" +
                        "<p class='p3'><span class='s1'>Преимущества подхода:<span class='Apple-converted-space'> </span></span></p>\n" +
                        "<ul class='ul1'>\n" +
                        "<li class='li1'><span class='s3'></span><span class='s1'>Можно рассчитать точное время доставки пакета данных.</span></li>\n" +
                        "<li class='li1'><span class='s3'></span><span class='s1'>Можно точно рассчитать пропускную способность сети.</span></li>\n" +
                        "</ul>\n" +
                        "<p class='p3'><span class='s1'><i>Замечания</i>: сообщения, передаваемые рабочими станциями, образуют очередь на сервере. Если время обслуживания очереди<span class='Apple-converted-space'> </span></span></p>\n" +
                        "<p class='p3'><span class='s1'>значительно (более, чем в 2 раза) превышает максимальное время доставки пакета между двумя самыми удалёнными станциями,<span class='Apple-converted-space'> </span></span></p>\n" +
                        "<p class='p3'><span class='s1'>то считается, что пропускная способность сети достигла максимального предела. В этом случае дальнейшее наращивание сети<span class='Apple-converted-space'> </span></span></p>\n" +
                        "<p class='p3'><span class='s1'>невозможно и требуется установка второго сервера.<span class='Apple-converted-space'> </span></span></p>\n" +
                        "<p class='p3'><span class='s1'><i>Предельные технические характеристики:</i><span class='Apple-converted-space'> </span></span></p>\n" +
                        "<ul class='ul1'>\n" +
                        "<li class='li1'><span class='s3'></span><span class='s1'>Минимальное расстояние между рабочими станциями, подключенными к одному кабелю — 0,9 м.</span></li>\n" +
                        "<li class='li1'><span class='s3'></span><span class='s1'>Максимальная длина сети по самому длинному маршруту — 6 км.</span></li>\n" +
                        "</ul>\n" +
                        "<p class='p3'><span class='s1'>Ограничения связаны с аппаратной задержкой передачи информации при большом количестве коммутирующих элементов.<span class='Apple-converted-space'> </span></span></p>\n" +
                        "<ul class='ul1'>\n" +
                        "<li class='li1'><span class='s3'></span><span class='s1'>Максимальное расстояние между пассивным концентратором и рабочей станцией — 30 м.</span></li>\n" +
                        "<li class='li1'><span class='s3'></span><span class='s1'>Максимальное расстояние между активным и пассивным хабом — 30 м.</span></li>\n" +
                        "<li class='li1'><span class='s3'></span><span class='s1'>Между активным хабом и активным хабом — 600 м.</span></li>\n" +
                        "</ul>\n" +
                        "<p class='p3'><span class='s1'><b>Достоинства:</b><span class='Apple-converted-space'> </span></span></p>\n" +
                        "<ul class='ul1'>\n" +
                        "<li class='li1'><span class='s3'></span><span class='s1'>Низкая стоимость сетевого оборудования и возможность создания протяжённых сетей.</span></li>\n" +
                        "</ul>\n" +
                        "<p class='p3'><span class='s1'><b>Недостатки:</b><span class='Apple-converted-space'> </span></span></p>\n" +
                        "<ul class='ul1'>\n" +
                        "<li class='li1'><span class='s3'></span><span class='s1'>Невысокая скорость передачи данных.</span></li>\n" +
                        "</ul>\n" +
                        "<p class='p3'><span class='s1'>После распространения </span><span class='s2'>Ethernet</span><span class='s1'> в качестве технологии для создания ЛВС, ARCNET нашла применение во </span><span class='s2'>встраиваемых системах</span><span class='s1'>.<span class='Apple-converted-space'> </span></span></p>\n" +
                        "<p class='p3'><span class='s1'>Поддержкой технологии ARCNET (в частности, распространением спецификаций) занимается некоммерческая организация </span><span class='s2'>ARCNET Trade</span></p>\n" +
                        "<p class='p4'><span class='s4'><span class='Apple-converted-space'> </span>Association</span><span class='s5'> (ATA).<span class='Apple-converted-space'> </span></span></p>\n" +
                        "<p class='p5'><span class='s1'><b>История</b></span></p>\n" +
                        "<p class='p3'><span class='s1'>Технология ARCNET была разработана Джоном Мёрфи — инженером из компании </span><span class='s2'>Datapoint</span><span class='s1'> в 1976 году и анонсирована в 1977 году.<span class='Apple-converted-space'> </span></span></p>\n" +
                        "<p class='p3'><span class='s1'>Архитектура ArcNET представлена двумя основными топологиями: шинная и звездная. В качестве среды передачи используется<span class='Apple-converted-space'> </span></span></p>\n" +
                        "<p class='p3'><span class='s2'>коаксиальный кабель</span><span class='s1'> RG-62 с волновым сопротивлением 93 Ом, обжатый на </span><span class='s2'>BNC-вилки</span><span class='s1'> с соответствующим диаметром заделки<span class='Apple-converted-space'> </span></span></p>\n" +
                        "<p class='p3'><span class='s1'>(отличаются от вилок 10Base-2 («тонкий» Ethernet)).<span class='Apple-converted-space'>  </span>Сетевое оборудование состоит из </span><span class='s2'>сетевых адаптеров</span><span class='s1'> и хабов. Сетевые адаптеры<span class='Apple-converted-space'> </span></span></p>\n" +
                        "<p class='p3'><span class='s1'>могут быть для шинной топологии, для звездной и универсальные. Хабы могут быть активными и пассивными. Пассивные хабы применяются<span class='Apple-converted-space'> </span></span></p>\n" +
                        "<p class='p3'><span class='s1'>для создания звездных участков сети. Активные хабы могут быть для шинной, звездной и смешанной топологии. Порты для шинной топологии<span class='Apple-converted-space'> </span></span></p>\n" +
                        "<p class='p3'><span class='s1'>физически не совместимы с портами для звездной топологии, хоть и имеют одинаковое физическое подключение.<span class='Apple-converted-space'> </span></span></p>\n" +
                        "<p class='p3'><span class='s1'>В случае шинной топологии, рабочие станции и серверы подключаются друг к другу с помощью </span><span class='s2'>T-коннекторов</span><span class='s1'> (таких же, как в<span class='Apple-converted-space'> </span></span></p>\n" +
                        "<p class='p3'><span class='s2'>10Base-2</span><span class='s1'> («тонкий» Ethernet)), подключенных к сетевым адаптерам и хабам и соединенных коаксиальным кабелем. Крайние точки сегмента<span class='Apple-converted-space'> </span></span></p>\n" +
                        "<p class='p3'><span class='s1'>терминируются </span><span class='s2'>наконечниками</span><span class='s1'> с сопротивлением 93 Ом. Количество устройств на одной шине ограничено. Минимальное расстояние между</span></p>\n" +
                        "<p class='p3'><span class='s1'><span class='Apple-converted-space'> </span>коннекторами — 0,9 метра и должно быть кратно этой величине. Для облегчения разделки на кабель могут быть нанесены метки.<span class='Apple-converted-space'> </span></span></p>\n" +
                        "<p class='p3'><span class='s1'>Отдельные шины могут быть объединены с помощью шинных хабов.<span class='Apple-converted-space'> </span></span></p>\n" +
                        "<p class='p3'><span class='s1'>При использовании звездной топологии применяются активные и пассивные хабы. Пассивный хаб представляет собой резистивный делитель-согласователь,<span class='Apple-converted-space'> </span></span></p>\n" +
                        "<p class='p3'><span class='s1'>позволяющий подключить четыре кабеля. Все кабели в этом случае подключаются по принципу «точка-точка», без образования шин.<span class='Apple-converted-space'> </span></span></p>\n" +
                        "<p class='p3'><span class='s1'>Между двумя активными устройствами не должно быть подключено больше двух пассивных хабов. Минимальная длина любого сетевого кабеля —<span class='Apple-converted-space'> </span></span></p>\n" +
                        "<p class='p3'><span class='s1'>0,9 метра и должна быть кратна этой величине. Существует ограничение длины кабеля между активным и пассивным портами, между двумя пассивными, между двумя активными.<span class='Apple-converted-space'> </span></span></p>\n" +
                        "<p class='p3'><span class='s1'>При смешанной топологии применяются активные хабы, поддерживающие оба типа подключения.<span class='Apple-converted-space'> </span></span></p>\n" +
                        "<p class='p3'><span class='s1'>На сетевых адаптерах рабочих станций и серверов с помощью </span><span class='s2'>джамперов</span><span class='s1'> или DIP-переключателей выставляется уникальный сетевой адрес,<span class='Apple-converted-space'> </span></span></p>\n" +
                        "<p class='p3'><span class='s1'>разрешение использования микросхемы расширения </span><span class='s2'>BIOS</span><span class='s1'>, позволяющего осуществить удаленную загрузку рабочей станции (может быть бездисковой),<span class='Apple-converted-space'> </span></span></p>\n" +
                        "<p class='p3'><span class='s1'>тип подключения (шинная или звездная топология), подключение встроенного терминатора (последние два пункта — опционально).<span class='Apple-converted-space'> </span></span></p>\n" +
                        "<p class='p3'><span class='s1'>Ограничение на количество рабочих станций — 255 (по разрядности регистра сетевого адреса). В случае, если два устройства имеют одинаковый сетевой адрес, оба<span class='Apple-converted-space'> </span></span></p>\n" +
                        "<p class='p3'><span class='s1'>теряют работоспособность, но на работу сети в целом эта коллизия не влияет.<span class='Apple-converted-space'> </span></span></p>\n" +
                        "<p class='p3'><span class='s1'>При шинной топологии обрыв кабеля или терминатора приводит к неработоспособности сети для всех устройств, подключенных к сегменту, в который входит этот кабель<span class='Apple-converted-space'> </span></span></p>\n" +
                        "<p class='p3'><span class='s1'>(то есть от терминатора до терминатора). При звёздной топологии обрыв любого кабеля приводит к отказу того сегмента, который отключается этим кабелем от файл-сервера.<span class='Apple-converted-space'> </span></span></p>\n" +
                        "<p class='p3'><span class='s1'>Логическая архитектура ArcNET — кольцо с маркерным доступом. Поскольку такая архитектура в принципе не допускает коллизий, при относительно большом</span></p>\n" +
                        "<p class='p3'><span class='s1'><span class='Apple-converted-space'> </span>количестве хостов (на практике испытывалось 25—30 рабочих станций) производительность сети ArcNET оказывалась выше, чем 10Base-2, при вчетверо меньшей скорости<span class='Apple-converted-space'> </span></span></p>\n" +
                        "<p class='p3'><span class='s1'>в среде (2,5 против 10 Mбит/с). <br>\n" +
                        "</span></p>\n" +
                        "<p class='p1'><span class='s1'><br>\n" +
                        "</span></p>\n" +
                        "</body>\n" +
                        "</html>\n");

                    panel.add(ARCNET);

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
