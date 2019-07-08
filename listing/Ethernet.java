package listing;
import javax.swing.*;
import java.awt.*;

public class Ethernet
    {

        public Ethernet()
            {

                JFrame frame = new JFrame();
                JPanel panel = new JPanel();
                JLabel Ethernet = new JLabel();

                Ethernet.setText("<html>\n" +
                        "<head>\n" +
                        "</head>\n" +
                        "<body>\n" +
                        "<p class='p1'><span class='s1'><b>Ethernet</b></span></p>\n" +
                        "<p class='p2'><span class='s1'>Кабель </span><span class='s2'>UTP</span><span class='s1'> с разъёмом </span><span class='s2'>8P8C</span><span class='s1'>, используемый в Ethernet-сетях стандартов 10BASE-T, 100BASE-T(x) и 1000BASE-T(x).</span></p>\n" +
                        "<p class='p3'><span class='s1'><b>Локальная сеть</b> (</span><span class='s2'>англ.</span><span class='s1'> <i>Ethernet</i> </span><span class='s2'>[</span><span class='s3'>ˈ</span><span class='s2'>i</span><span class='s3'>ː</span><span class='s2'>θə</span><span class='s3'>ˌ</span><span class='s2'>n</span><span class='s3'>ɛ</span><span class='s2'>t]</span><span class='s1'> от </span><span class='s2'><i>ether</i></span><span class='s1'> </span><span class='s2'>[</span><span class='s3'>ˈ</span><span class='s2'>i</span><span class='s3'>ː</span><span class='s2'>θə]</span><span class='s1'> «</span><span class='s2'>эфир</span><span class='s1'>» + </span><span class='s2'><i>network</i></span><span class='s1'> «сеть, цепь») — семейство технологий </span><span class='s2'>пакетной</span><span class='s1'> передачи<span class='Apple-converted-space'> </span></span></p>\n" +
                        "<p class='p3'><span class='s1'>данных между устройствами для </span><span class='s2'>компьютерных</span><span class='s1'> и </span><span class='s2'>промышленных</span><span class='s1'> сетей.<span class='Apple-converted-space'> </span></span></p>\n" +
                        "<p class='p3'><span class='s1'>Стандарты Ethernet определяют проводные соединения и электрические сигналы на </span><span class='s2'>физическом уровне</span><span class='s1'>, формат </span><span class='s2'>кадров</span><span class='s1'> и протоколы<span class='Apple-converted-space'> </span></span></p>\n" +
                        "<p class='p3'><span class='s1'>управления доступом к среде — на </span><span class='s2'>канальном уровне</span><span class='s1'> </span><span class='s4'>модели OSI</span><span class='s1'>. Ethernet в основном описывается стандартами </span><span class='s2'>IEEE</span><span class='s1'> </span><span class='s2'>группы 802.3</span><span class='s1'>.<span class='Apple-converted-space'> </span></span></p>\n" +
                        "<p class='p3'><span class='s1'>Ethernet стал самой распространённой технологией </span><span class='s2'>ЛВС</span><span class='s1'> в середине </span><span class='s2'>1990-х годов</span><span class='s1'>, вытеснив такие устаревшие технологии, как </span><span class='s2'>Token Ring</span><span class='s1'>, </span><span class='s2'>FDDI</span><span class='s1'> и </span><span class='s2'>ARCNET</span><span class='s1'>.<span class='Apple-converted-space'> </span></span></p>\n" +
                        "<p class='p3'><span class='s1'>Название «Ethernet» (буквально «эфирная сеть» или «среда сети») отражает первоначальный принцип работы этой технологии: всё, передаваемое</span></p>\n" +
                        "<p class='p3'><span class='s1'>одним узлом, одновременно принимается всеми остальными (то есть имеется некое сходство с </span><span class='s2'>радиовещанием</span><span class='s1'>). В настоящее время практически<span class='Apple-converted-space'> </span></span></p>\n" +
                        "<p class='p3'><span class='s1'>всегда подключение происходит через </span><span class='s2'>коммутаторы (switch)</span><span class='s1'>, так что кадры, отправляемые одним узлом, доходят лишь до адресата<span class='Apple-converted-space'> </span></span></p>\n" +
                        "<p class='p3'><span class='s1'>(исключение составляют передачи на </span><span class='s2'>широковещательный адрес</span><span class='s1'>) — это повышает скорость работы и безопасность сети.<span class='Apple-converted-space'> </span></span></p>\n" +
                        "<p class='p4'><span class='s1'><b>Содержание</b></span></p>\n" +
                        "<ul class='ul1'>\n" +
                        "<li class='li5'><span class='s5'></span><span class='s1'>1 История</span></li>\n" +
                        "<li class='li5'><span class='s5'></span><span class='s1'>2 Технология</span></li>\n" +
                        "<li class='li5'><span class='s5'></span><span class='s1'>3 Формат кадра</span></li>\n" +
                        "<li class='li5'><span class='s5'></span><span class='s1'>4 MAC-адреса</span></li>\n" +
                        "<li class='li5'><span class='s5'></span><span class='s1'>5 Разновидности Ethernet</span></li>\n" +
                        "<li class='li5'><span class='s5'></span><span class='s1'>5.1 Ранние модификации Ethernet</span></li>\n" +
                        "<li class='li5'><span class='s5'></span><span class='s1'>5.2 10 Мбит/с Ethernet</span></li>\n" +
                        "<li class='li5'><span class='s5'></span><span class='s1'>5.3 Быстрый Ethernet (Fast Ethernet, 100 Мбит/с)</span></li>\n" +
                        "<li class='li5'><span class='s5'></span><span class='s1'>5.4 Гигабитный Ethernet (Gigabit Ethernet, 1 Гбит/с)</span></li>\n" +
                        "<li class='li5'><span class='s5'></span><span class='s1'>5.5 2,5- и 5-гигабитные варианты (NBASE-T, MGBASE-T)</span></li>\n" +
                        "<li class='li5'><span class='s5'></span><span class='s1'>5.6 10-гигабитный Ethernet (10G Ethernet, 10 Гбит/с)</span></li>\n" +
                        "<li class='li5'><span class='s5'></span><span class='s1'>5.7 40-гигабитный и 100-гигабитный Ethernet</span></li>\n" +
                        "<li class='li5'><span class='s5'></span><span class='s1'>5.8 Перспективы</span></li>\n" +
                        "<li class='li5'><span class='s5'></span><span class='s1'>6 См. также</span></li>\n" +
                        "<li class='li5'><span class='s5'></span><span class='s1'>7 Примечания</span></li>\n" +
                        "<li class='li5'><span class='s5'></span><span class='s1'>8 Ссылки</span></li>\n" +
                        "</ul>\n" +
                        "<p class='p2'><span class='s1'><br>\n" +
                        "</span></p>\n" +
                        "<p class='p4'><span class='s1'><b>История</b></span></p>\n" +
                        "<p class='p3'><span class='s1'>Технология Ethernet была разработана вместе со многими первыми проектами корпорации </span><span class='s2'>Xerox PARC</span><span class='s1'>. Общепринято считать, что<span class='Apple-converted-space'> </span></span></p>\n" +
                        "<p class='p3'><span class='s1'>Ethernet был изобретён </span><span class='s2'>22 мая</span><span class='s1'> </span><span class='s2'>1973 года</span><span class='s1'>, когда </span><span class='s2'>Роберт Меткалф</span><span class='s1'> (<i>Robert Metcalfe</i>) составил докладную записку для главы PARC о потенциале<span class='Apple-converted-space'> </span></span></p>\n" +
                        "<p class='p3'><span class='s1'>технологии Ethernet. Но законное право на технологию Меткалф получил через несколько лет. В </span><span class='s2'>1976 году</span><span class='s1'> он и его ассистент Дэвид Боггс<span class='Apple-converted-space'> </span></span></p>\n" +
                        "<p class='p3'><span class='s1'>(David Boggs) издали брошюру под названием «Ethernet: Distributed Packet-Switching For Local Computer Networks».<span class='Apple-converted-space'> </span></span></p>\n" +
                        "<p class='p3'><span class='s1'>Меткалф ушёл из Xerox в </span><span class='s2'>1979 году</span><span class='s1'> и основал компанию </span><span class='s2'>3Com</span><span class='s1'> для продвижения </span><span class='s2'>компьютеров</span><span class='s1'> и </span><span class='s2'>локальных вычислительных сетей (ЛВС)</span><span class='s1'>.<span class='Apple-converted-space'> </span></span></p>\n" +
                        "<p class='p3'><span class='s1'>Ему удалось убедить </span><span class='s2'>DEC</span><span class='s1'>, </span><span class='s2'>Intel</span><span class='s1'> и </span><span class='s2'>Xerox</span><span class='s1'> работать совместно и разработать стандарт Ethernet (DIX). Впервые этот стандарт был опубликован<span class='Apple-converted-space'> </span></span></p>\n" +
                        "<p class='p3'><span class='s2'>30 сентября</span><span class='s1'> </span><span class='s2'>1980 года</span><span class='s1'>. Он начал соперничество с двумя крупными запатентованными технологиями: </span><span class='s2'>token ring</span><span class='s1'> и </span><span class='s2'>ARCNET</span><span class='s1'>, — которые вскоре<span class='Apple-converted-space'> </span></span></p>\n" +
                        "<p class='p3'><span class='s1'>были раздавлены под накатывающимися волнами продукции Ethernet. В процессе борьбы 3Com стала основной компанией в этой отрасли.<span class='Apple-converted-space'> </span></span></p>\n" +
                        "<p class='p4'><span class='s1'><b>Технология</b></span></p>\n" +
                        "<p class='p3'><span class='s1'>В стандарте первых версий (Ethernet v1.0 и Ethernet v2.0) указано, что в качестве передающей среды используется </span><span class='s2'>коаксиальный кабель</span><span class='s1'>,<span class='Apple-converted-space'> </span></span></p>\n" +
                        "<p class='p3'><span class='s1'>в дальнейшем появилась возможность использовать </span><span class='s2'>витую пару</span><span class='s1'> и </span><span class='s2'>оптический кабель</span><span class='s1'>.<span class='Apple-converted-space'> </span></span></p>\n" +
                        "<p class='p3'><span class='s1'>Преимущества использования витой пары по сравнению с коаксиальным кабелем:<span class='Apple-converted-space'> </span></span></p>\n" +
                        "<ul class='ul1'>\n" +
                        "<li class='li2'><span class='s5'></span><span class='s1'>возможность работы в </span><span class='s2'>дуплексном</span><span class='s1'> режиме;</span></li>\n" +
                        "<li class='li2'><span class='s5'></span><span class='s1'>низкая стоимость кабеля витой пары;</span></li>\n" +
                        "<li class='li2'><span class='s5'></span><span class='s1'>более высокая надёжность сетей: при использовании витой пары сеть строится по топологии «звезда», поэтому обрыв кабеля приводит лишь</span></li>\n" +
                        "<li class='li2'><span class='s5'></span><span class='s1'>к нарушению связи между двумя объектами сети, соединёнными этим кабелем (при использовании коаксиального кабеля сеть строится по топологии<span class='Apple-converted-space'> </span></span></li>\n" +
                        "<li class='li2'><span class='s5'></span><span class='s1'>«общая шина», для которой требуется наличие терминальных резисторов на концах кабеля, поэтому обрыв кабеля приводит к неисправности сегмента сети);</span></li>\n" +
                        "<li class='li2'><span class='s5'></span><span class='s1'>уменьшен минимально допустимый радиус изгиба кабеля;</span></li>\n" +
                        "<li class='li2'><span class='s5'></span><span class='s1'>большая помехоустойчивость из-за использования дифференциального сигнала;</span></li>\n" +
                        "<li class='li2'><span class='s5'></span><span class='s1'>возможность питания по кабелю маломощных узлов, например, IP-телефонов (стандарт </span><span class='s2'>Power over Ethernet</span><span class='s1'>, PoE);</span></li>\n" +
                        "<li class='li2'><span class='s5'></span><span class='s2'>гальваническая развязка</span><span class='s1'> </span><span class='s2'>трансформаторного типа</span><span class='s1'>. В условиях СНГ, где, как правило, отсутствует заземление компьютеров, применение коаксиального<span class='Apple-converted-space'> </span></span></li>\n" +
                        "<li class='li2'><span class='s5'></span><span class='s1'>кабеля часто приводило к выходу из строя сетевых карт в результате электрического пробоя.</span></li>\n" +
                        "</ul>\n" +
                        "<p class='p3'><span class='s1'>Причиной перехода на оптический кабель была необходимость увеличить длину сегмента без повторителей.<span class='Apple-converted-space'> </span></span></p>\n" +
                        "<p class='p3'><span class='s1'>Метод управления доступом (для сети на коаксиальном кабеле) — </span><span class='s2'>множественный доступ с контролем несущей и обнаружением коллизий</span><span class='s1'> (CSMA/CD, Carrier Sense Multiple<span class='Apple-converted-space'> </span></span></p>\n" +
                        "<p class='p3'><span class='s1'>Access with Collision Detection), скорость передачи данных 10 Мбит/с, размер кадра от 64 до 1518 </span><span class='s2'>байт</span><span class='s1'>, описаны методы кодирования данных. Режим работы полудуплексный,<span class='Apple-converted-space'> </span></span></p>\n" +
                        "<p class='p3'><span class='s1'>то есть узел не может одновременно передавать и принимать информацию. Количество узлов в одном разделяемом сегменте сети ограничено предельным значением в 1024 рабочих<span class='Apple-converted-space'> </span></span></p>\n" +
                        "<p class='p3'><span class='s1'>станции (спецификации физического уровня могут устанавливать более жёсткие ограничения, например, к сегменту тонкого коаксиала может подключаться </span><span class='s6'>не более 30 рабочих станций</span><span class='s1'>,<span class='Apple-converted-space'> </span></span></p>\n" +
                        "<p class='p3'><span class='s1'>а к сегменту толстого коаксиала — не более 100). Однако сеть, построенная на одном разделяемом сегменте, становится неэффективной задолго до достижения предельного значения</span></p>\n" +
                        "<p class='p3'><span class='s1'><span class='Apple-converted-space'> </span>количества узлов, в основном по причине полудуплексного режима работы.<span class='Apple-converted-space'> </span></span></p>\n" +
                        "<p class='p3'><span class='s1'>В </span><span class='s2'>1995 году</span><span class='s1'> принят стандарт </span><span class='s2'>IEEE</span><span class='s1'> 802.3u </span><span class='s2'>Fast Ethernet</span><span class='s1'> со скоростью 100 Мбит/с и появилась возможность работы в режиме </span><span class='s2'>полный дуплекс</span><span class='s1'>. В </span><span class='s2'>1997 году</span><span class='s1'> был принят стандарт</span></p>\n" +
                        "<p class='p3'><span class='s1'><span class='Apple-converted-space'> </span></span><span class='s2'>IEEE</span><span class='s1'> 802.3z Gigabit Ethernet со скоростью 1000 Мбит/с для передачи по </span><span class='s2'>оптическому волокну</span><span class='s1'> и ещё через два года для передачи по витой паре.<span class='Apple-converted-space'> </span></span></p>\n" +
                        "<p class='p4'><span class='s1'><b>Формат кадра</b></span></p>\n" +
                        "<p class='p3'><span class='s1'>Существует несколько форматов Ethernet-кадра.<span class='Apple-converted-space'> </span></span></p>\n" +
                        "<ul class='ul1'>\n" +
                        "<li class='li2'><span class='s5'></span><span class='s1'>Первоначальный Version I (больше не применяется).</span></li>\n" +
                        "<li class='li2'><span class='s5'></span><span class='s1'>Ethernet Version 2 или Ethernet-кадр II, ещё называемый DIX (аббревиатура первых букв фирм-разработчиков DEC, Intel, Xerox) — наиболее распространена и используется по сей день.</span></li>\n" +
                        "<li class='li2'><span class='s5'></span><span class='s1'>Часто используется непосредственно </span><span class='s2'>протоколом Интернет</span><span class='s1'>.</span></li>\n" +
                        "</ul>\n" +
                        "<p class='p2'><span class='s1'><br>\n" +
                        "</span></p>\n" +
                        "<p class='p2'><span class='s1'><br>\n" +
                        "</span></p>\n" +
                        "<p class='p2'><span class='s1'>Наиболее распространённый формат кадра Ethernet II</span></p>\n" +
                        "<ul class='ul1'>\n" +
                        "<li class='li2'><span class='s5'></span><span class='s2'>Novell</span><span class='s1'> — внутренняя модификация IEEE 802.3 без LLC (</span><span class='s2'>Logical Link Control</span><span class='s1'>).</span></li>\n" +
                        "<li class='li2'><span class='s5'></span><span class='s1'>Кадр IEEE 802.3 </span><span class='s2'>LLC</span><span class='s1'>.</span></li>\n" +
                        "<li class='li2'><span class='s5'></span><span class='s1'>Кадр IEEE 802.3 </span><span class='s2'>LLC</span><span class='s1'>/</span><span class='s2'>SNAP</span><span class='s1'>.</span></li>\n" +
                        "<li class='li2'><span class='s5'></span><span class='s1'>Некоторые </span><span class='s2'>сетевые карты</span><span class='s1'> Ethernet, производимые компанией </span><span class='s2'>Hewlett-Packard</span><span class='s1'>, использовали при работе кадр формата IEEE 802.12, соответствующий стандарту </span><span class='s2'>100VG-AnyLAN</span><span class='s1'>.</span></li>\n" +
                        "</ul>\n" +
                        "<p class='p3'><span class='s1'>В качестве дополнения Ethernet-кадр может содержать тег </span><span class='s2'>IEEE 802.1Q</span><span class='s1'> для идентификации </span><span class='s2'>VLAN</span><span class='s1'>, к которой он адресован, а в нем </span><span class='s2'>IEEE 802.1p</span><span class='s1'> для указания приоритетности.<span class='Apple-converted-space'> </span></span></p>\n" +
                        "<p class='p3'><span class='s1'>Разные типы кадра имеют различный формат и значение </span><span class='s2'>MTU</span><span class='s1'>.<span class='Apple-converted-space'> </span></span></p>\n" +
                        "<p class='p4'><span class='s1'><b>MAC-адреса</b></span></p>\n" +
                        "<p class='p3'><span class='s1'>При проектировании стандарта Ethernet было предусмотрено, что каждая сетевая карта (равно как и встроенный сетевой интерфейс) должна иметь уникальный шестибайтный номер</span></p>\n" +
                        "<p class='p3'><span class='s1'><span class='Apple-converted-space'> </span>(</span><span class='s2'>MAC-адрес</span><span class='s1'>), прошитый в ней при изготовлении. Этот номер используется для идентификации отправителя и получателя кадра, и предполагается, что при появлении</span></p>\n" +
                        "<p class='p3'><span class='s1'><span class='Apple-converted-space'> </span>в сети нового компьютера (или другого устройства, способного работать в сети) сетевому администратору не придётся настраивать MAC-адрес.<span class='Apple-converted-space'> </span></span></p>\n" +
                        "<p class='p3'><span class='s1'>Уникальность MAC-адресов достигается тем, что каждый производитель получает в координирующем комитете </span><span class='s2'>IEEE Registration Authority</span><span class='s1'> диапазон из шестнадцати<span class='Apple-converted-space'> </span></span></p>\n" +
                        "<p class='p3'><span class='s1'>миллионов (2</span><span class='s7'><sup>24</sup></span><span class='s1'>) адресов, и по мере исчерпания выделенных адресов может запросить новый диапазон. Поэтому по трём старшим байтам MAC-адреса можно определить<span class='Apple-converted-space'> </span></span></p>\n" +
                        "<p class='p3'><span class='s1'>производителя. Существуют таблицы, позволяющие определить производителя по MAC-адресу; в частности, они включены в программы типа </span><span class='s2'>arpalert</span><span class='s1'>.<span class='Apple-converted-space'> </span></span></p>\n" +
                        "<p class='p3'><span class='s1'>MAC-адрес считывается один раз из ПЗУ при инициализации сетевой карты, в дальнейшем все кадры генерируются операционной системой. Все современные операционные<span class='Apple-converted-space'> </span></span></p>\n" +
                        "<p class='p3'><span class='s1'>системы позволяют поменять его. Для Windows, начиная, как минимум, с Windows 98, он менялся в реестре. Некоторые </span><span class='s2'>драйверы</span><span class='s1'> сетевых карт давали возможность изменить<span class='Apple-converted-space'> </span></span></p>\n" +
                        "<p class='p3'><span class='s1'>его в настройках, но смена работает абсолютно для любых карт.<span class='Apple-converted-space'> </span></span></p>\n" +
                        "<p class='p3'><span class='s1'>Некоторое время назад, когда драйверы сетевых карт не давали возможность изменить свой MAC-адрес, а альтернативные возможности не были слишком известны, некоторые<span class='Apple-converted-space'> </span></span></p>\n" +
                        "<p class='p3'><span class='s1'>провайдеры Internet использовали его для идентификации машины в сети при учёте трафика. Программы из Microsoft Office, начиная с версии Office 97, записывали MAC-адрес<span class='Apple-converted-space'> </span></span></p>\n" +
                        "<p class='p3'><span class='s1'>сетевой платы в редактируемый документ в качестве составляющей уникального GUID-идентификатора..<span class='Apple-converted-space'> </span></span></p>\n" +
                        "<p class='p4'><span class='s1'><b>Разновидности Ethernet</b></span></p>\n" +
                        "<p class='p3'><span class='s1'>В зависимости от скорости передачи данных и передающей среды существует несколько вариантов технологии. Независимо от способа передачи, стек сетевого протокола и программы<span class='Apple-converted-space'> </span></span></p>\n" +
                        "<p class='p3'><span class='s1'>работают одинаково практически во всех нижеперечисленных вариантах.<span class='Apple-converted-space'> </span></span></p>\n" +
                        "<p class='p3'><span class='s1'>В этом разделе дано краткое описание всех официально существующих разновидностей. По некоторым причинам, в дополнение к основному стандарту многие производители<span class='Apple-converted-space'> </span></span></p>\n" +
                        "<p class='p3'><span class='s1'>рекомендуют пользоваться другими запатентованными носителями — например, для увеличения расстояния между точками сети используется </span><span class='s2'>волоконно-оптический кабель</span><span class='s1'>.<span class='Apple-converted-space'> </span></span></p>\n" +
                        "<p class='p3'><span class='s1'>Большинство Ethernet-карт и других устройств имеет поддержку нескольких скоростей передачи данных, используя автоопределение (</span><span class='s2'>autonegotiation</span><span class='s1'>) скорости и дуплексности<span class='Apple-converted-space'> </span></span></p>\n" +
                        "<p class='p3'><span class='s1'>для достижения наилучшего соединения между двумя устройствами. Если автоопределение не срабатывает, скорость подстраивается под партнёра и включается режим полудуплексной</span></p>\n" +
                        "<p class='p3'><span class='s1'><span class='Apple-converted-space'> </span>передачи. Например, наличие в устройстве порта Ethernet 10/100 говорит о том, что через него можно работать по технологиям 10BASE-T и 100BASE-TX, а порт<span class='Apple-converted-space'> </span></span></p>\n" +
                        "<p class='p3'><span class='s1'>Ethernet 10/100/1000 — поддерживает стандарты 10BASE-T, 100BASE-TX и 1000BASE-T.<span class='Apple-converted-space'> </span></span></p>\n" +
                        "<p class='p6'><span class='s1'><b>Ранние модификации Ethernet</b></span></p>\n" +
                        "<ul class='ul1'>\n" +
                        "<li class='li2'><span class='s5'><b></b></span><span class='s2'><b>Xerox Ethernet</b></span><span class='s1'> — оригинальная технология, скорость 3 Мбит/с, существовала в двух вариантах Version 1 и Version 2, формат<span class='Apple-converted-space'> </span></span></li>\n" +
                        "<li class='li2'><span class='s5'></span><span class='s1'>кадра последней версии до сих пор имеет широкое применение.</span></li>\n" +
                        "<li class='li2'><span class='s5'><b></b></span><span class='s2'><b>1BROAD36</b></span><span class='s1'> — широкого распространения не получил. Один из первых стандартов, позволяющий работать на больших расстояниях.<span class='Apple-converted-space'> </span></span></li>\n" +
                        "<li class='li2'><span class='s5'></span><span class='s1'>Использовал технологию широкополосной </span><span class='s2'>модуляции</span><span class='s1'>, похожей на ту, что используется в кабельных </span><span class='s2'>модемах</span><span class='s1'>. В качестве среды передачи данных использовался коаксиальный кабель.</span></li>\n" +
                        "<li class='li2'><span class='s5'><b></b></span><span class='s2'><b>1BASE5</b></span><span class='s1'> — также известный, как </span><span class='s2'>StarLAN</span><span class='s1'>, стал первой модификацией Ethernet-технологии, использующей витую пару. Работал на скорости 1 Мбит/с, но не нашёл коммерческого применения.</span></li>\n" +
                        "</ul>\n" +
                        "<p class='p2'><span class='s1'><br>\n" +
                        "</span></p>\n" +
                        "<p class='p6'><span class='s1'><b>10 Мбит/с Ethernet</b></span></p>\n" +
                        "<ul class='ul1'>\n" +
                        "<li class='li2'><span class='s5'><b></b></span><span class='s2'><b>10BASE5</b></span><span class='s1'>, </span><span class='s2'>IEEE 802.3</span><span class='s1'> (называемый также «Толстый Ethernet») — первоначальная разработка технологии со скоростью передачи<span class='Apple-converted-space'> </span></span></li>\n" +
                        "<li class='li2'><span class='s5'></span><span class='s1'>данных 10 Мбит/с. Следуя раннему стандарту, </span><span class='s2'>IEEE</span><span class='s1'> использует коаксиальный кабель с волновым сопротивлением 50 Ом (</span><span class='s2'>RG-8</span><span class='s1'>), с максимальной длиной сегмента 500 </span><span class='s2'>метров</span><span class='s1'>.</span></li>\n" +
                        "<li class='li2'><span class='s5'><b></b></span><span class='s2'><b>10BASE2</b></span><span class='s1'>, </span><span class='s2'>IEEE 802.3a</span><span class='s1'> (называемый «Тонкий Ethernet») — используется кабель </span><span class='s2'>RG-58</span><span class='s1'>, с максимальной длиной сегмента 185 </span><span class='s2'>метров</span><span class='s1'>,<span class='Apple-converted-space'> </span></span></li>\n" +
                        "<li class='li2'><span class='s5'></span><span class='s1'>компьютеры присоединялись один к другому, для подключения кабеля к сетевой карте нужен </span><span class='s2'>T-коннектор</span><span class='s1'>, а на кабеле должен быть </span><span class='s2'>BNC-коннектор</span><span class='s1'>.<span class='Apple-converted-space'> </span></span></li>\n" +
                        "<li class='li2'><span class='s5'></span><span class='s1'>Требуется наличие </span><span class='s2'>терминаторов</span><span class='s1'> на каждом конце. Многие годы этот стандарт был основным для технологии Ethernet.</span></li>\n" +
                        "<li class='li2'><span class='s5'><b></b></span><span class='s2'><b>StarLAN 10</b></span><span class='s1'> — Первая разработка, использующая витую пару для передачи данных на скорости 10 Мбит/с. В дальнейшем эволюционировал в стандарт </span><span class='s2'>10BASE-T</span><span class='s1'>.</span></li>\n" +
                        "</ul>\n" +
                        "<p class='p3'><span class='s1'>Несмотря на то, что теоретически возможно подключение к одному кабелю (сегменту) витой пары более чем двух устройств, работающих в симплексном режиме,<span class='Apple-converted-space'> </span></span></p>\n" +
                        "<p class='p3'><span class='s1'>такая схема никогда не применяется для Ethernet, в отличие от работы с коаксиальным кабелем. Поэтому все сети на витой паре используют топологию «звезда»,<span class='Apple-converted-space'> </span></span></p>\n" +
                        "<p class='p3'><span class='s1'>в то время как сети на коаксиальном кабеле построены на топологии «шина». Терминаторы для работы по витой паре встроены в каждое устройство, и применять<span class='Apple-converted-space'> </span></span></p>\n" +
                        "<p class='p3'><span class='s1'>дополнительные внешние терминаторы в линии не нужно.<span class='Apple-converted-space'> </span></span></p>\n" +
                        "<ul class='ul1'>\n" +
                        "<li class='li2'><span class='s5'><b></b></span><span class='s2'><b>10BASE-T</b></span><span class='s1'>, </span><span class='s2'>IEEE 802.3i</span><span class='s1'> — для передачи данных используется 4 провода кабеля витой пары (две скрученные пары) категории 3 или </span><span class='s2'>категории-5</span><span class='s1'>. Максимальная длина сегмента - 100 метров.</span></li>\n" +
                        "<li class='li2'><span class='s5'><b></b></span><span class='s2'><b>FOIRL</b></span><span class='s1'> — (акроним от <a href='https://ru.wikipedia.org/wiki/%D0%90%D0%BD%D0%B3%D0%BB%D0%B8%D0%B9%D1%81%D0%BA%D0%B8%D0%B9_%D1%8F%D0%B7%D1%8B%D0%BA'><span class='s8'>англ.</span></a> <i>Fiber-optic inter-repeater link</i>). Базовый стандарт для технологии Ethernet, использующий для передачи данных оптический кабель.<span class='Apple-converted-space'> </span></span></li>\n" +
                        "<li class='li2'><span class='s5'></span><span class='s1'>Максимальное расстояние передачи данных без повторителя — 1 км.</span></li>\n" +
                        "<li class='li2'><span class='s5'><b></b></span><span class='s2'><b>10BASE-F</b></span><span class='s1'>, </span><span class='s2'>IEEE 802.3j</span><span class='s1'> — Основной термин для обозначения семейства 10 Мбит/с ethernet-стандартов, использующих оптический кабель на расстоянии<span class='Apple-converted-space'> </span></span></li>\n" +
                        "<li class='li2'><span class='s5'></span><span class='s1'>до 2 километров: 10BASE-FL, 10BASE-FB и 10BASE-FP. Из перечисленного только 10BASE-FL получил широкое распространение.</span></li>\n" +
                        "<li class='li2'><span class='s5'><b></b></span><span class='s2'><b>10BASE-FL</b></span><span class='s1'> (</span><span class='s2'>Fiber Link</span><span class='s1'>) — Улучшенная версия стандарта FOIRL. Улучшение коснулось увеличения длины сегмента до 2 км.</span></li>\n" +
                        "<li class='li2'><span class='s5'><b></b></span><span class='s2'><b>10BASE-FB</b></span><span class='s1'> (</span><span class='s2'>Fiber Backbone</span><span class='s1'>) — Сейчас неиспользуемый стандарт, предназначался для объединения повторителей в магистраль.</span></li>\n" +
                        "<li class='li2'><span class='s5'><b></b></span><span class='s2'><b>10BASE-FP</b></span><span class='s1'> (</span><span class='s2'>Fiber Passive</span><span class='s1'>) — Топология «пассивная звезда», в которой не нужны повторители — никогда не применялся.</span></li>\n" +
                        "</ul>\n" +
                        "<p class='p2'><span class='s1'><br>\n" +
                        "</span></p>\n" +
                        "<p class='p6'><span class='s1'><b>Быстрый Ethernet (</b></span><span class='s2'><b>Fast Ethernet</b></span><span class='s1'><b>, 100 Мбит/с)</b></span></p>\n" +
                        "<ul class='ul1'>\n" +
                        "<li class='li2'><span class='s5'><b></b></span><span class='s2'><b>100BASE-T</b></span><span class='s1'> — общий термин для обозначения стандартов, использующих в качестве среды передачи данных витую пару.<span class='Apple-converted-space'> </span></span></li>\n" +
                        "<li class='li2'><span class='s5'></span><span class='s1'>Длина сегмента — до 100 метров. Включает в себя стандарты </span><span class='s2'>100BASE-TX</span><span class='s1'>, </span><span class='s2'>100BASE-T4</span><span class='s1'> и </span><span class='s2'>100BASE-T2</span><span class='s1'>.</span></li>\n" +
                        "<li class='li2'><span class='s5'><b></b></span><span class='s2'><b>100BASE-TX</b></span><span class='s1'>, </span><span class='s2'>IEEE 802.3u</span><span class='s1'> — развитие стандарта 10BASE-T для использования в сетях топологии «звезда». Задействована витая пара категории<span class='Apple-converted-space'> </span></span></li>\n" +
                        "<li class='li2'><span class='s5'></span><span class='s1'>5, фактически используются только две неэкранированные пары проводников, поддерживается дуплексная передача данных, расстояние до 100 м.</span></li>\n" +
                        "<li class='li2'><span class='s5'><b></b></span><span class='s2'><b>100BASE-T4</b></span><span class='s1'> — стандарт, использующий витую пару категории 3. Задействованы все четыре пары проводников, передача данных идёт в полудуплексе. Практически не используется.</span></li>\n" +
                        "<li class='li2'><span class='s5'><b></b></span><span class='s2'><b>100BASE-T2</b></span><span class='s1'> — стандарт, использующий витую пару категории 3. Задействованы только две пары проводников. Поддерживается полный дуплекс,<span class='Apple-converted-space'> </span></span></li>\n" +
                        "<li class='li2'><span class='s5'></span><span class='s1'>когда сигналы распространяются в противоположных направлениях по каждой паре. Скорость передачи в одном направлении — 50 Мбит/с. Практически не используется.</span></li>\n" +
                        "<li class='li2'><span class='s5'><b></b></span><span class='s2'><b>100BASE-FX</b></span><span class='s1'> — стандарт, использующий многомодовое волокно. Максимальная длина сегмента - 400 метров в полудуплексе (для гарантированного обнаружения коллизий)<span class='Apple-converted-space'> </span></span></li>\n" +
                        "<li class='li2'><span class='s5'></span><span class='s1'>или 2 километра в полном дуплексе.</span></li>\n" +
                        "<li class='li2'><span class='s5'><b></b></span><span class='s2'><b>100BASE-SX</b></span><span class='s1'> — стандарт, использующий многомодовое волокно. Максимальная длина ограничена только величиной затухания в оптическом кабеле и мощностью<span class='Apple-converted-space'> </span></span></li>\n" +
                        "<li class='li2'><span class='s5'></span><span class='s1'>передатчиков, по разным материалам, от 2 до 10 километров.</span></li>\n" +
                        "<li class='li2'><span class='s5'><b></b></span><span class='s2'><b>100BASE-FX WDM</b></span><span class='s1'> — стандарт, использующий одномодовое волокно. Максимальная длина ограничена только величиной затухания в волоконно-оптическом кабеле<span class='Apple-converted-space'> </span></span></li>\n" +
                        "<li class='li2'><span class='s5'></span><span class='s1'>и мощностью передатчиков. Интерфейсы бывают двух видов, отличаются длиной волны передатчика и маркируются либо цифрами (длина волны), либо одной латинской<span class='Apple-converted-space'> </span></span></li>\n" +
                        "<li class='li2'><span class='s5'></span><span class='s1'>буквой A (1310) или B (1550). В паре могут работать только парные интерфейсы: с одной стороны передатчик на 1310 нм, а с другой — на 1550 нм.</span></li>\n" +
                        "</ul>\n" +
                        "<p class='p2'><span class='s1'><br>\n" +
                        "</span></p>\n" +
                        "<p class='p6'><span class='s1'><b>Гигабитный Ethernet (Gigabit Ethernet, 1 Гбит/с)</b></span></p>\n" +
                        "<ul class='ul1'>\n" +
                        "<li class='li2'><span class='s5'><b></b></span><span class='s1'><b>1000BASE-T</b>, </span><span class='s2'>IEEE 802.3ab</span><span class='s1'> — основной гигабитный стандарт, опубликованный в 1999 году, использует </span><span class='s2'>витую пару</span><span class='s1'> категории 5e. В передаче данных</span></li>\n" +
                        "<li class='li2'><span class='s5'></span><span class='s1'> участвуют 4 пары, каждая пара используется одновременно для передачи по обоим направлениям со скоростью — 250 Мбит/с. Используется метод<span class='Apple-converted-space'> </span></span></li>\n" +
                        "<li class='li2'><span class='s5'></span><span class='s1'>кодирования PAM5 (<i>5-level Phase Amplitude Modulation</i>, пятиуровневая фазоамплитудная модуляция) с 4 линиями (4D-PAM5) и 4-мерной </span><span class='s2'>Треллис-модуляцией</span><span class='s1'><span class='Apple-converted-space'> </span></span></li>\n" +
                        "<li class='li2'><span class='s5'></span><span class='s1'>(TCM), частота основной гармоники - 62,5 МГц. Расстояние — до 100 метров.</span></li>\n" +
                        "<li class='li2'><span class='s5'><b></b></span><span class='s1'><b>1000BASE-TX</b> был создан Ассоциацией Телекоммуникационной Промышленности (англ. <i>Telecommunications Industry Association, TIA</i>) и опубликован в<span class='Apple-converted-space'> </span></span></li>\n" +
                        "<li class='li2'><span class='s5'></span><span class='s1'>марте 2001 года как «Спецификация физического уровня дуплексного Ethernet 1000 Мб/с (1000BASE-TX) симметричных кабельных систем категории 6<span class='Apple-converted-space'> </span></span></li>\n" +
                        "<li class='li2'><span class='s5'></span><span class='s1'>(ANSI/TIA/EIA-854-2001)». Распространения не получил из-за высокой стоимости кабелей, фактически устарел. Стандарт разделяет принимаемые и посылаемые<span class='Apple-converted-space'> </span></span></li>\n" +
                        "<li class='li2'><span class='s5'></span><span class='s1'>сигналы по парам (две пары передают данные, каждая на 500 Мбит/с и две пары принимают), что упрощало бы конструкцию приёмопередающих устройств.<span class='Apple-converted-space'> </span></span></li>\n" +
                        "<li class='li2'><span class='s5'></span><span class='s1'>Ещё одним существенным отличием 1000BASE-TX являлось отсутствие схемы цифровой компенсации наводок и возвратных помех, в результате чего сложность,</span></li>\n" +
                        "<li class='li2'><span class='s5'></span><span class='s1'>уровень энергопотребления и цена реализаций должны становиться ниже, чем у стандарта 1000BASE-T. Для работы технологии требуется кабельная система<span class='Apple-converted-space'> </span></span></li>\n" +
                        "<li class='li7'><span class='s5'></span><span class='s9'>6-й категории. </span><span class='s10'>На основе данного стандарта создано большое количество продуктов для промышленных сетей.</span></li>\n" +
                        "</ul>\n" +
                        "<ul class='ul1'>\n" +
                        "<li class='li2'><span class='s5'><b></b></span><span class='s2'><b>1000BASE-X</b></span><span class='s1'> — общий термин для обозначения стандартов со сменными приёмопередатчиками в форм-факторах </span><span class='s2'>GBIC</span><span class='s1'> или </span><span class='s2'>SFP</span><span class='s1'>.</span></li>\n" +
                        "<li class='li2'><span class='s5'><b></b></span><span class='s2'><b>1000BASE-SX</b></span><span class='s1'>, </span><span class='s2'>IEEE 802.3z</span><span class='s1'> — стандарт, использующий многомодовое волокно в первом окне прозрачности с длиной волны, равной 850 нм. Дальность прохождения сигнала составляет до 550 метров.</span></li>\n" +
                        "<li class='li2'><span class='s5'><b></b></span><span class='s2'><b>1000BASE-LX</b></span><span class='s1'>, </span><span class='s2'>IEEE 802.3z</span><span class='s1'> — стандарт, использующий одномодовое или многомодовое оптическое волокно во втором окне прозрачности с длиной волны, равной 1310 нм.<span class='Apple-converted-space'> </span></span></li>\n" +
                        "<li class='li2'><span class='s5'></span><span class='s1'>Дальность прохождения сигнала зависит только от типа используемых приёмопередатчиков и, как правило, составляет для одномодового оптического волокна до<span class='Apple-converted-space'> </span></span></li>\n" +
                        "<li class='li2'><span class='s5'></span><span class='s1'>5 км и для многомодового оптического волокна до 550 метров.</span></li>\n" +
                        "<li class='li2'><span class='s5'><b></b></span><span class='s1'><b>1000BASE-CX</b> — стандарт для коротких расстояний (до 25 метров), использующий 2-парный </span><span class='s2'>экранированный кабель</span><span class='s1'> (150 Ом, STP IBM Type I или лучше). Применяется<span class='Apple-converted-space'> </span></span></li>\n" +
                        "<li class='li2'><span class='s5'></span><span class='s1'>кодирование 8B/10B, сигнал передаётся по одной паре, принимается по другой паре проводов; разъёмы - 9-контактный D, HSSDC. Заменён стандартом 1000BASE-T и сейчас не используется.</span></li>\n" +
                        "<li class='li2'><span class='s5'><b></b></span><span class='s2'><b>1000BASE-LH</b></span><span class='s1'> (Long Haul) — стандарт, использующий одномодовое волокно. Дальность прохождения сигнала без повторителя — до 100 километров.</span></li>\n" +
                        "</ul>\n" +
                        "<p class='p2'><span class='s1'><br>\n" +
                        "</span></p>\n" +
                        "<p class='p6'><span class='s1'><b>2,5- и 5-гигабитные варианты (NBASE-T, MGBASE-T)</b></span></p>\n" +
                        "<p class='p3'><span class='s1'>В 2014 появились частные инициативы NBASE-T (Cisco) и MGBASE-T (Broadcom) по созданию стандартов Ethernet со скоростью, промежуточной между<span class='Apple-converted-space'> </span></span></p>\n" +
                        "<p class='p3'><span class='s1'>1 и 10 Гбит/с. Новый стандарт должен использовать существующую кабельную инфраструктуру категории 5e на расстояниях до 100 метров, предоставляя<span class='Apple-converted-space'> </span></span></p>\n" +
                        "<p class='p3'><span class='s1'>скорости в 2,5 или, менее вероятно, 5 Гбит/с. Среди причин появления инициатив — распространение Wi-Fi-маршрутизаторов, поддерживающих скорости более</span></p>\n" +
                        "<p class='p3'><span class='s1'><span class='Apple-converted-space'> </span>1 гигабита (802.11ac Wave 2, 802.11ad, 802.11ax, LiFi), и невозможность использования 10 Гбит/с стандартов Ethernet по длинным кабелям 5e- и 6-й категорий.<span class='Apple-converted-space'> </span></span></p>\n" +
                        "<p class='p3'><span class='s1'>Ранее группа IEEE 802 отмечала, что гипотетический стандарт 2500BASE-T мог бы быть близок по стоимости к 1000BASE-T решениям.<span class='Apple-converted-space'> </span></span></p>\n" +
                        "<p class='p3'><span class='s1'>Стандарт на 2,5 и 5 Гбит/с Ethernet по кабелям Cat 5e и Cat 6 был принят осенью 2016 года как </span><span class='s2'>IEEE 802.3bz</span><span class='s1'>.<span class='Apple-converted-space'> </span></span></p>\n" +
                        "<p class='p6'><span class='s1'><b>10-гигабитный Ethernet (10G Ethernet, 10 Гбит/с)</b></span></p>\n" +
                        "<p class='p3'><span class='s1'>Стандарт 10-гигабитного Ethernet включает в себя семь стандартов физической среды для </span><span class='s2'>LAN</span><span class='s1'>, </span><span class='s2'>MAN</span><span class='s1'> и </span><span class='s2'>WAN</span><span class='s1'>. В настоящее время он описывается поправкой<span class='Apple-converted-space'> </span></span></p>\n" +
                        "<p class='p3'><span class='s2'>IEEE 802.3ae</span><span class='s1'> и должен войти в следующую ревизию стандарта </span><span class='s2'>IEEE 802.3</span><span class='s1'>.<span class='Apple-converted-space'> </span></span></p>\n" +
                        "<ul class='ul1'>\n" +
                        "<li class='li2'><span class='s5'><b></b></span><span class='s2'><b>10GBASE-CX4</b></span><span class='s1'> — технология 10-гигабитного Ethernet для коротких расстояний (до 15 </span><span class='s2'>метров</span><span class='s1'>), используется медный кабель CX4 и коннекторы </span><span class='s2'>InfiniBand</span><span class='s1'>.</span></li>\n" +
                        "<li class='li2'><span class='s5'><b></b></span><span class='s2'><b>10GBASE-SR</b></span><span class='s1'> — технология 10-гигабитного Ethernet для коротких расстояний (до 26 или 82 </span><span class='s2'>метров</span><span class='s1'>, в зависимости от типа кабеля), используется многомодовое волокно.<span class='Apple-converted-space'> </span></span></li>\n" +
                        "<li class='li2'><span class='s5'></span><span class='s1'>Он также поддерживает расстояния до 300 метров с использованием нового многомодового волокна (2000 МГц/км).</span></li>\n" +
                        "<li class='li2'><span class='s5'><b></b></span><span class='s2'><b>10GBASE-LX4</b></span><span class='s1'> — использует </span><span class='s2'>уплотнение по длине волны</span><span class='s1'> для поддержки расстояний от 240 до 300 </span><span class='s2'>метров</span><span class='s1'> по многомодовому волокну. Также поддерживает расстояния<span class='Apple-converted-space'> </span></span></li>\n" +
                        "<li class='li2'><span class='s5'></span><span class='s1'>до 10 </span><span class='s2'>километров</span><span class='s1'> при использовании одномодового волокна.</span></li>\n" +
                        "<li class='li2'><span class='s5'><b></b></span><span class='s2'><b>10GBASE-LR</b></span><span class='s1'> и </span><span class='s2'><b>10GBASE-ER</b></span><span class='s1'> — эти стандарты поддерживают расстояния до 10 и 40 </span><span class='s2'>километров</span><span class='s1'>, соответственно.</span></li>\n" +
                        "<li class='li2'><span class='s5'><b></b></span><span class='s2'><b>10GBASE-SW</b></span><span class='s1'>, </span><span class='s2'><b>10GBASE-LW</b></span><span class='s1'> и </span><span class='s2'><b>10GBASE-EW</b></span><span class='s1'> — эти стандарты используют физический интерфейс, совместимый по скорости и формату данных с интерфейсом<span class='Apple-converted-space'> </span></span></li>\n" +
                        "<li class='li2'><span class='s5'></span><span class='s2'>OC-192</span><span class='s1'> / </span><span class='s2'>STM-64</span><span class='s1'> </span><span class='s2'>SONET</span><span class='s1'>/</span><span class='s2'>SDH</span><span class='s1'>. Они подобны стандартам </span><span class='s2'>10GBASE-SR</span><span class='s1'>, </span><span class='s2'>10GBASE-LR</span><span class='s1'> и </span><span class='s2'>10GBASE-ER</span><span class='s1'> соответственно, так как используют те же самые типы кабелей и расстояния передачи.</span></li>\n" +
                        "<li class='li2'><span class='s5'><b></b></span><span class='s2'><b>10GBASE-T</b></span><span class='s1'>, </span><span class='s2'>IEEE 802.3an-2006</span><span class='s1'> — принят в июне 2006 года после 4 лет разработки. Использует витую пару категории 6 (максимальное расстояние 55 метров) и 6а (максимальное расстояние 100 метров).</span></li>\n" +
                        "<li class='li2'><span class='s5'><b></b></span><span class='s2'><b>10GBASE-KR</b></span><span class='s1'> — технология 10-гигабитного Ethernet для кросс-плат (backplane/midplane) модульных коммутаторов/маршрутизаторов и серверов (Modular/Blade).</span></li>\n" +
                        "</ul>\n" +
                        "<p class='p2'><span class='s1'><br>\n" +
                        "</span></p>\n" +
                        "<p class='p6'><span class='s1'><b>40-гигабитный и 100-гигабитный Ethernet</b></span></p>\n" +
                        "<p class='p8'><span class='s9'>Основная статья: </span><span class='s11'><b>100-гигабитный Ethernet</b></span></p>\n" +
                        "<p class='p3'><span class='s1'>Согласно наблюдениям Группы 802.3ba, требования к полосе пропускания для вычислительных задач и приложений ядра сети растут с разными скоростями,<span class='Apple-converted-space'> </span></span></p>\n" +
                        "<p class='p3'><span class='s1'>что определяет необходимость двух соответствующих стандартов для следующих поколений Ethernet — 40 Gigabit Ethernet (или 40GbE) и 100 Gigabit Ethernet</span></p>\n" +
                        "<p class='p3'><span class='s1'><span class='Apple-converted-space'> </span>(или 100GbE). В настоящее время </span><span class='s2'>серверы</span><span class='s1'>, высокопроизводительные вычислительные </span><span class='s2'>кластеры</span><span class='s1'>, </span><span class='s2'>блейд-системы</span><span class='s1'>, </span><span class='s2'>SAN</span><span class='s1'> и </span><span class='s2'>NAS</span><span class='s1'> используют технологии</span></p>\n" +
                        "<p class='p3'><span class='s1'><span class='Apple-converted-space'> </span>1GbE и 10GbE, при этом в 2007 и 2008 гг. был отмечен значительный рост последней.<span class='Apple-converted-space'> </span></span></p>\n" +
                        "<p class='p6'><span class='s1'><b>Перспективы</b></span></p>\n" +
                        "<p class='p3'><span class='s1'>О </span><span class='s2'>Terabit Ethernet</span><span class='s1'> (так упрощённо называют технологию Ethernet со скоростью передачи 1 Тбит/с) стало известно в </span><span class='s2'>2008 году</span><span class='s1'> из заявления создателя Ethernet<span class='Apple-converted-space'> </span></span></p>\n" +
                        "<p class='p3'><span class='s2'>Роберта Меткалфа</span><span class='s1'> на конференции OFC, который предположил, что технология будет разработана к </span><span class='s2'>2015 году</span><span class='s1'>, правда, не выразив при этом какой-либо уверенности,<span class='Apple-converted-space'> </span></span></p>\n" +
                        "<p class='p3'><span class='s1'>ведь для этого придётся решить немало проблем. Однако, по его мнению, ключевой технологией, которая может обслужить дальнейший рост трафика, станет одна</span></p>\n" +
                        "<p class='p3'><span class='s1'><span class='Apple-converted-space'> </span>из разработанных в предыдущем десятилетии — </span><span class='s2'>DWDM</span><span class='s1'>.<span class='Apple-converted-space'> </span></span></p>\n" +
                        "<p class='p3'><span class='s1'>«Чтобы реализовать Ethernet 1 Тбит/с, необходимо преодолеть множество ограничений, включая 1550-нанометровые лазеры и модуляцию с частотой 15 ГГц. Для будущей<span class='Apple-converted-space'> </span></span></p>\n" +
                        "<p class='p3'><span class='s1'>сети нужны новые схемы модуляции, а также новое оптоволокно, новые лазеры, в общем, всё новое, — сказал Меткалф. — Неясно также, какая сетевая архитектура<span class='Apple-converted-space'> </span></span></p>\n" +
                        "<p class='p3'><span class='s1'>потребуется для её поддержки. Возможно, оптические сети будущего должны будут использовать волокно с вакуумной сердцевиной или углеродные волокна вместо </span><span class='s2'>кварцевых</span><span class='s1'>.<span class='Apple-converted-space'> </span></span></p>\n" +
                        "<p class='p3'><span class='s1'>Операторы должны будут внедрять больше полностью оптических устройств и оптику в свободном пространстве (безволоконную). Боб Меткалф».<span class='Apple-converted-space'> </span></span></p>\n" +
                        "</body>\n" +
                        "</html>\n");

                    panel.add(Ethernet);

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
