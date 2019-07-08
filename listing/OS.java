package listing;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class OS
    {
        public OS()
            {

                JFrame frame = new JFrame();
                JPanel panel = new JPanel();
                JLabel ARCNET = new JLabel();

                ARCNET.setText("<html>\n" +
                        "<head>\n" +
                        "</head>\n" +
                        "<body>\n" +
                        "<p class='p1'><span class='s1'><b>Основы компьютерных сетей. Тема №1. Основные сетевые термины и сетевые модели<span class='Apple-converted-space'> </span></b></span></p>\n" +
                        "<p class='p2'><span class='s1'>Всем привет. На днях возникла идея написать статьи про основы компьютерных сетей, разобрать работу самых<span class='Apple-converted-space'> </span></span></p>\n" +
                        "<p class='p2'><span class='s1'>важных протоколов и как строятся сети простым языком. Заинтересовавшихся приглашаю под кат.</span></p>\n" +
                        "<p class='p3'><span class='s1'></span><br></p>\n" +
                        "<p class='p3'><span class='s1'></span><br></p>\n" +
                        "<p class='p2'><span class='s1'>Немного оффтопа: Приблизительно месяц назад сдал экзамен CCNA (на 980/1000 баллов) и осталось много материала</span></p>\n" +
                        "<p class='p2'><span class='s1'><span class='Apple-converted-space'> </span>за год моей подготовки и обучения. Учился я сначала в академии Cisco около 7 месяцев, а оставшееся время вел<span class='Apple-converted-space'> </span></span></p>\n" +
                        "<p class='p2'><span class='s1'>конспекты по всем темам, которые были мною изучены. Также консультировал многих ребят в области сетевых</span></p>\n" +
                        "<p class='p2'><span class='s1'><span class='Apple-converted-space'> </span>технологий и заметил, что многие наступают на одни и те же грабли, в виде пробелов по каким-то ключевым темам.<span class='Apple-converted-space'> </span></span></p>\n" +
                        "<p class='p2'><span class='s1'>На днях пару ребят попросили меня объяснить, что такое сети и как с ними работать. В связи с этим решил максимально<span class='Apple-converted-space'> </span></span></p>\n" +
                        "<p class='p2'><span class='s1'>подробно и простым языком описать самые ключевые и важные вещи. Статьи будут полезны новичкам, которые только</span></p>\n" +
                        "<p class='p2'><span class='s1'><span class='Apple-converted-space'> </span>встали на путь изучения. Но, возможно, и бывалые сисадмины подчеркнут из этого что-то полезное. Так как я буду идти<span class='Apple-converted-space'> </span></span></p>\n" +
                        "<p class='p2'><span class='s1'>по программе CCNA, это будет очень полезно тем людям, которые готовятся к сдаче. Можете держать статьи в виде<span class='Apple-converted-space'> </span></span></p>\n" +
                        "<p class='p2'><span class='s1'>шпаргалок и периодически их просматривать. Я во время обучения делал конспекты по книгам и периодически читал их,</span></p>\n" +
                        "<p class='p2'><span class='s1'><span class='Apple-converted-space'> </span>чтобы освежать знания.<span class='Apple-converted-space'> </span></span></p>\n" +
                        "<p class='p3'><span class='s1'></span><br></p>\n" +
                        "<p class='p2'><span class='s1'>Вообще хочу дать всем начинающим совет. Моей первой серьезной книгой, была книга Олиферов «Компьютерные сети».<span class='Apple-converted-space'> </span></span></p>\n" +
                        "<p class='p2'><span class='s1'>И мне было очень тяжело читать ее. Не скажу, что все было тяжело. Но моменты, где детально разбиралось, как работает</span></p>\n" +
                        "<p class='p2'><span class='s1'><span class='Apple-converted-space'> </span>MPLS или Ethernet операторского класса, вводило в ступор. Я читал одну главу по несколько часов и все равно многое оставалось загадкой.</span></p>\n" +
                        "<p class='p2'><span class='s1'>Если вы понимаете, что какие то термины никак не хотят лезть в голову, пропустите их и читайте дальше, но ни в коем случае не отбрасывайте<span class='Apple-converted-space'> </span></span></p>\n" +
                        "<p class='p2'><span class='s1'>книгу полностью. Это не роман или эпос, где важно читать по главам, чтобы понять сюжет. Пройдет время и то, что раньше было непонятным,</span></p>\n" +
                        "<p class='p2'><span class='s1'><span class='Apple-converted-space'> </span>в итоге станет ясно. Здесь прокачивается «книжный скилл». Каждая следующая книга, читается легче предыдущей книги. К примеру,<span class='Apple-converted-space'> </span></span></p>\n" +
                        "<p class='p2'><span class='s1'>после прочтения Олиферов «Компьютерные сети», читать Таненбаума «Компьютерные сети» легче в несколько раз и наоборот. Потому<span class='Apple-converted-space'> </span></span></p>\n" +
                        "<p class='p2'><span class='s1'>что новых понятий встречается меньше. Поэтому мой совет: не бойтесь читать книги. Ваши усилия в будущем принесут плоды.<span class='Apple-converted-space'> </span></span></p>\n" +
                        "<p class='p2'><span class='s1'>Заканчиваю разглагольствование и приступаю к написанию статьи.</span></p>\n" +
                        "<p class='p3'><span class='s1'></span><br></p>\n" +
                        "<p class='p2'><span class='s1'><b>Вот сами темы</b></span></p>\n" +
                        "<p class='p2'><span class='s1'>1) Основные сетевые термины, сетевая модель OSI и стек протоколов TCP/IP.</span></p>\n" +
                        "<p class='p4'><span class='s2'>2) </span><span class='s3'>Протоколы верхнего уровня.</span></p>\n" +
                        "<p class='p4'><span class='s2'>3) </span><span class='s3'>Протоколы нижних уровней (транспортного, сетевого и канального).</span></p>\n" +
                        "<p class='p4'><span class='s2'>4) </span><span class='s3'>Сетевые устройства и виды применяемых кабелей.</span></p>\n" +
                        "<p class='p4'><span class='s2'>5) </span><span class='s3'>Понятие IP адресации, масок подсетей и их расчет.</span></p>\n" +
                        "<p class='p4'><span class='s2'>6) </span><span class='s3'>Понятие VLAN, Trunk и протоколы VTP и DTP.</span></p>\n" +
                        "<p class='p4'><span class='s2'>7) </span><span class='s3'>Протокол связующего дерева: STP.</span></p>\n" +
                        "<p class='p4'><span class='s2'>8) </span><span class='s3'>Протокол агрегирования каналов: Etherchannel.</span></p>\n" +
                        "<p class='p2'><span class='s1'>9) Маршрутизация: статическая и динамическая на примере RIP, OSPF и EIGRP.</span></p>\n" +
                        "<p class='p2'><span class='s1'>10) Трансляция сетевых адресов: NAT и PAT.</span></p>\n" +
                        "<p class='p2'><span class='s1'>11) Протоколы резервирования первого перехода: FHRP.</span></p>\n" +
                        "<p class='p2'><span class='s1'>12) Безопасность компьютерных сетей и виртуальные частные сети: VPN.</span></p>\n" +
                        "<p class='p2'><span class='s1'>13) Глобальные сети и используемые протоколы: PPP, HDLC, Frame Relay.</span></p>\n" +
                        "<p class='p2'><span class='s1'>14) Введение в IPv6, конфигурация и маршрутизация.</span></p>\n" +
                        "<p class='p2'><span class='s1'>15) Сетевое управление и мониторинг сети.</span></p>\n" +
                        "<p class='p3'><span class='s1'></span><br></p>\n" +
                        "<p class='p2'><span class='s1'>P.S. Возможно, со временем список дополнится.</span></p>\n" +
                        "<p class='p3'><span class='s1'></span><br></p>\n" +
                        "<p class='p2'><span class='s1'>Итак, начнем с основных сетевых терминов.<span class='Apple-converted-space'> </span></span></p>\n" +
                        "<p class='p3'><span class='s1'></span><br></p>\n" +
                        "<p class='p2'><span class='s1'>Что такое сеть? Это совокупность устройств и систем, которые подключены друг к другу (логически или физически) и общающихся между собой.</span></p>\n" +
                        "<p class='p2'><span class='s1'><span class='Apple-converted-space'> </span>Сюда можно отнести сервера, компьютеры, телефоны, маршрутизаторы и так далее. Размер этой сети может достигать размера Интернета, а может<span class='Apple-converted-space'> </span></span></p>\n" +
                        "<p class='p2'><span class='s1'>состоять всего из двух устройств, соединенных между собой кабелем. Чтобы не было каши, разделим компоненты сети на группы:</span></p>\n" +
                        "<p class='p3'><span class='s1'></span><br></p>\n" +
                        "<p class='p2'><span class='s1'><b>1) Оконечные узлы:</b> Устройства, которые передают и/или принимают какие-либо данные. Это могут быть компьютеры, телефоны, сервера, какие-то<span class='Apple-converted-space'> </span></span></p>\n" +
                        "<p class='p2'><span class='s1'>терминалы или тонкие клиенты, телевизоры.</span></p>\n" +
                        "<p class='p3'><span class='s1'></span><br></p>\n" +
                        "<p class='p2'><span class='s1'><b>2) Промежуточные устройства:</b> Это устройства, которые соединяют оконечные узлы между собой. Сюда можно отнести коммутаторы, концентраторы,<span class='Apple-converted-space'> </span></span></p>\n" +
                        "<p class='p2'><span class='s1'>модемы, маршрутизаторы, точки доступа Wi-Fi.</span></p>\n" +
                        "<p class='p3'><span class='s1'></span><br></p>\n" +
                        "<p class='p2'><span class='s1'><b>3) Сетевые среды:</b> Это те среды, в которых происходит непосредственная передача данных. Сюда относятся кабели, сетевые карточки, различного рода<span class='Apple-converted-space'> </span></span></p>\n" +
                        "<p class='p2'><span class='s1'>коннекторы, воздушная среда передачи. Если это медный кабель, то передача данных осуществляется при помощи электрических сигналов.<span class='Apple-converted-space'> </span></span></p>\n" +
                        "<p class='p2'><span class='s1'>У оптоволоконных кабелей, при помощи световых импульсов. Ну и у беспроводных устройств, при помощи радиоволн.</span></p>\n" +
                        "<p class='p3'><span class='s1'></span><br></p>\n" +
                        "<p class='p2'><span class='s1'>Посмотрим все это на картинке:</span></p>\n" +
                        "<p class='p3'><span class='s1'></span><br></p>\n" +
                        "<p class='p5'><span class='s1'></span><br></p>\n" +
                        "<p class='p3'><span class='s1'></span><br></p>\n" +
                        "<p class='p3'><span class='s1'></span><br></p>\n" +
                        "<p class='p2'><span class='s1'>На данный момент надо просто понимать отличие. Детальные отличия будут разобраны позже.<span class='Apple-converted-space'> </span></span></p>\n" +
                        "<p class='p3'><span class='s1'></span><br></p>\n" +
                        "<p class='p2'><span class='s1'>Теперь, на мой взгляд, главный вопрос: Для чего мы используем сети? Ответов на этот вопрос много, но я освещу самые популярные, которые используются в повседневной жизни:</span></p>\n" +
                        "<p class='p3'><span class='s1'></span><br></p>\n" +
                        "<p class='p2'><span class='s1'><b>1) Приложения:</b> При помощи приложений отправляем разные данные между устройствами, открываем доступ к общим ресурсам. Это могут быть как консольные приложения,</span></p>\n" +
                        "<p class='p2'><span class='s1'><span class='Apple-converted-space'> </span>так и приложения с графическим интерфейсом.</span></p>\n" +
                        "<p class='p3'><span class='s1'></span><br></p>\n" +
                        "<p class='p2'><span class='s1'><b>2) Сетевые ресурсы:</b> Это сетевые принтеры, которыми, к примеру, пользуются в офисе или сетевые камеры, которые просматривает охрана, находясь в удаленной местности.</span></p>\n" +
                        "<p class='p3'><span class='s1'></span><br></p>\n" +
                        "<p class='p2'><span class='s1'><b>3) Хранилище:</b> Используя сервер или рабочую станцию, подключенную к сети, создается хранилище доступное для других. Многие люди выкладывают туда свои файлы, видео,<span class='Apple-converted-space'> </span></span></p>\n" +
                        "<p class='p2'><span class='s1'>картинки и открывают общий доступ к ним для других пользователей. Пример, который на ходу приходит в голову, — это google диск, яндекс диск и тому подобные сервисы.<span class='Apple-converted-space'> </span></span></p>\n" +
                        "<p class='p3'><span class='s1'></span><br></p>\n" +
                        "<p class='p2'><span class='s1'><b>4) Резервное копирование:</b> Часто, в крупных компаниях, используют центральный сервер, куда все компьютеры копируют важные файлы для резервной копии.<span class='Apple-converted-space'> </span></span></p>\n" +
                        "<p class='p2'><span class='s1'>Это нужно для последующего восстановления данных, если оригинал удалился или повредился. Методов копирования огромное количество: с предварительным сжатием, кодированием и так далее.<span class='Apple-converted-space'> </span></span></p>\n" +
                        "<p class='p3'><span class='s1'></span><br></p>\n" +
                        "<p class='p2'><span class='s1'><b>5) VoIP:</b> Телефония, работающая по протоколу IP. Применяется она сейчас повсеместно, так как проще, дешевле традиционной телефонии и с каждым годом вытесняет ее.</span></p>\n" +
                        "<p class='p3'><span class='s1'></span><br></p>\n" +
                        "<p class='p2'><span class='s1'>Из всего списка, чаще всего многие работали именно с приложениями. Поэтому разберем их более подробно. Я старательно буду выбирать только те приложения, которые как-то связаны с сетью.<span class='Apple-converted-space'> </span></span></p>\n" +
                        "<p class='p2'><span class='s1'>Поэтому приложения типа калькулятора или блокнота, во внимание не беру.</span></p>\n" +
                        "<p class='p3'><span class='s1'></span><br></p>\n" +
                        "<p class='p2'><span class='s1'><b>1) Загрузчики.</b> Это файловые менеджеры, работающие по протоколу FTP, TFTP. Банальный пример — это скачивание фильма, музыки, картинок с файлообменников или иных источников.<span class='Apple-converted-space'> </span></span></p>\n" +
                        "<p class='p2'><span class='s1'>К этой категории еще можно отнести резервное копирование, которое автоматически делает сервер каждую ночь. То есть это встроенные или сторонние программы и утилиты, которые</span></p>\n" +
                        "<p class='p2'><span class='s1'><span class='Apple-converted-space'> </span>выполняют копирование и скачивание. Данный вид приложений не требует прямого человеческого вмешательства. Достаточно указать место, куда сохранить и скачивание само начнется и закончится.</span></p>\n" +
                        "<p class='p3'><span class='s1'></span><br></p>\n" +
                        "<p class='p2'><span class='s1'>Скорость скачивания зависит от пропускной способности. Для данного типа приложений это не совсем критично. Если, например, файл будет скачиваться не минуту, а 10,<span class='Apple-converted-space'> </span></span></p>\n" +
                        "<p class='p2'><span class='s1'>то тут только вопрос времени, и на целостности файла это никак не скажется. Сложности могут возникнуть только когда нам надо за пару часов сделать резервную копию<span class='Apple-converted-space'> </span></span></p>\n" +
                        "<p class='p2'><span class='s1'>системы, а из-за плохого канала и, соответственно, низкой пропускной способности, это занимает несколько дней. Ниже приведены описания самых популярных протоколов данной группы:</span></p>\n" +
                        "<p class='p3'><span class='s1'></span><br></p>\n" +
                        "<p class='p2'><span class='s1'><i>FTP-</i> это стандартный протокол передачи данных с установлением соединения. Работает по протоколу TCP (этот протокол в дальнейшем будет подробно рассмотрен).<span class='Apple-converted-space'> </span></span></p>\n" +
                        "<p class='p2'><span class='s1'>Стандартный номер порта 21. Чаще всего используется для загрузки сайта на веб-хостинг и выгрузки его. Самым популярным приложением, работающим по этому</span></p>\n" +
                        "<p class='p2'><span class='s1'>протоколу — это Filezilla. Вот так выглядит само приложение:</span></p>\n" +
                        "<p class='p3'><span class='s1'></span><br></p>\n" +
                        "<p class='p5'><span class='s1'></span><br></p>\n" +
                        "<p class='p3'><span class='s1'></span><br></p>\n" +
                        "<p class='p2'><span class='s1'><i>TFTP-</i> это упрощенная версия протокола FTP, которая работает без установления соединения, по протоколу UDP. Применяется для загрузки образа бездисковыми рабочими станциями.<span class='Apple-converted-space'> </span></span></p>\n" +
                        "<p class='p2'><span class='s1'>Особенно широко используется устройствами Cisco для той же загрузки образа и резервных копий.</span></p>\n" +
                        "<p class='p3'><span class='s1'></span><br></p>\n" +
                        "<p class='p2'><span class='s1'><b>Интерактивные приложения.</b> Приложения, позволяющие осуществить интерактивный обмен. Например, модель «человек-человек». Когда два человека, при помощи</span></p>\n" +
                        "<p class='p2'><span class='s1'><span class='Apple-converted-space'> </span>интерактивных приложений, общаются между собой или ведут общую работу. Сюда относится: ICQ, электронная почта, форум, на котором несколько экспертов помогают<span class='Apple-converted-space'> </span></span></p>\n" +
                        "<p class='p2'><span class='s1'>людям в решении вопросов. Или модель «человек-машина». Когда человек общается непосредственно с компьютером. Это может быть удаленная настройка базы, конфигурация</span></p>\n" +
                        "<p class='p2'><span class='s1'><span class='Apple-converted-space'> </span>сетевого устройства. Здесь, в отличие от загрузчиков, важно постоянное вмешательство человека. То есть, как минимум, один человек выступает инициатором.<span class='Apple-converted-space'> </span></span></p>\n" +
                        "<p class='p2'><span class='s1'>Пропускная способность уже более чувствительна к задержкам, чем приложения-загрузчики. Например, при удаленной конфигурации сетевого устройства, будет тяжело</span></p>\n" +
                        "<p class='p2'><span class='s1'><span class='Apple-converted-space'> </span>его настраивать, если отклик от команды будет в 30 секунд.</span></p>\n" +
                        "<p class='p3'><span class='s1'></span><br></p>\n" +
                        "<p class='p2'><span class='s1'><b>Приложения в реальном времени.</b> Приложения, позволяющие передавать информацию в реальном времени. Как раз к этой группе относится IP-телефония,</span></p>\n" +
                        "<p class='p2'><span class='s1'><span class='Apple-converted-space'> </span>системы потокового вещания, видеоконференции. Самые чувствительные к задержкам и пропускной способности приложения. Представьте, что вы разговариваете<span class='Apple-converted-space'> </span></span></p>\n" +
                        "<p class='p2'><span class='s1'>по телефону и то, что вы говорите, собеседник услышит через 2 секунды и наоборот, вы от собеседника с таким же интервалом. Такое общение еще и приведет к тому,<span class='Apple-converted-space'> </span></span></p>\n" +
                        "<p class='p2'><span class='s1'>что голоса будут пропадать и разговор будет трудноразличимым, а в видеоконференция превратится в кашу. В среднем, задержка не должна превышать 300 мс.<span class='Apple-converted-space'> </span></span></p>\n" +
                        "<p class='p2'><span class='s1'>К данной категории можно отнести Skype, Lync, Viber (когда совершаем звонок).</span></p>\n" +
                        "<p class='p3'><span class='s1'></span><br></p>\n" +
                        "<p class='p2'><span class='s1'>Теперь поговорим о такой важной вещи, как топология. Она делится на 2 большие категории: <b>физическая</b> и <b>логическая</b>. Очень важно понимать их разницу.<span class='Apple-converted-space'> </span></span></p>\n" +
                        "<p class='p2'><span class='s1'>Итак, <b>физическая</b> топология — это как наша сеть выглядит. Где находятся узлы, какие сетевые промежуточные устройства используются и где они стоят, какие сетевые<span class='Apple-converted-space'> </span></span></p>\n" +
                        "<p class='p2'><span class='s1'>кабели используются, как они протянуты и в какой порт воткнуты. <b>Логическая</b> топология — это каким путем будут идти пакеты в нашей физической топологии.<span class='Apple-converted-space'> </span></span></p>\n" +
                        "<p class='p2'><span class='s1'>То есть физическая — это как мы расположили устройства, а логическая — это через какие устройства будут проходить пакеты.</span></p>\n" +
                        "<p class='p3'><span class='s1'></span><br></p>\n" +
                        "<p class='p2'><span class='s1'>Теперь посмотрим и разберем виды топологии:</span></p>\n" +
                        "<p class='p3'><span class='s1'></span><br></p>\n" +
                        "<p class='p2'><span class='s1'><b>1) Топология с общей шиной (англ. Bus Topology)</b></span></p>\n" +
                        "<p class='p3'><span class='s1'></span><br></p>\n" +
                        "<p class='p5'><span class='s1'></span><br></p>\n" +
                        "<p class='p3'><span class='s1'></span><br></p>\n" +
                        "<p class='p2'><span class='s1'>Одна из первых физических топологий. Суть состояла в том, что к одному длинному кабелю подсоединяли все устройства и организовывали локальную сеть.<span class='Apple-converted-space'> </span></span></p>\n" +
                        "<p class='p2'><span class='s1'>На концах кабеля требовались терминаторы. Как правило — это было сопротивление на 50 Ом, которое использовалось для того, чтобы сигнал не отражался в кабеле.<span class='Apple-converted-space'> </span></span></p>\n" +
                        "<p class='p2'><span class='s1'>Преимущество ее было только в простоте установки. С точки зрения работоспособности была крайне не устойчивой. Если где-то в кабеле происходил разрыв,<span class='Apple-converted-space'> </span></span></p>\n" +
                        "<p class='p2'><span class='s1'>то вся сеть оставалась парализованной, до замены кабеля.</span></p>\n" +
                        "<p class='p3'><span class='s1'></span><br></p>\n" +
                        "<p class='p2'><span class='s1'><b>2) Кольцевая топология (англ. Ring Topology)<span class='Apple-converted-space'> </span></b></span></p>\n" +
                        "<p class='p3'><span class='s1'></span><br></p>\n" +
                        "<p class='p5'><span class='s1'></span><br></p>\n" +
                        "<p class='p3'><span class='s1'></span><br></p>\n" +
                        "<p class='p2'><span class='s1'>В данной топологии каждое устройство подключается к 2-ум соседним. Создавая, таким образом, кольцо. Здесь логика такова, что с одного конца компьютер только принимает,</span></p>\n" +
                        "<p class='p2'><span class='s1'><span class='Apple-converted-space'> </span>а с другого только отправляет. То есть, получается передача по кольцу и следующий компьютер играет роль ретранслятора сигнала. За счет этого нужда в терминаторах<span class='Apple-converted-space'> </span></span></p>\n" +
                        "<p class='p2'><span class='s1'>отпала. Соответственно, если где-то кабель повреждался, кольцо размыкалось и сеть становилась не работоспособной. Для повышения отказоустойчивости,<span class='Apple-converted-space'> </span></span></p>\n" +
                        "<p class='p2'><span class='s1'>применяют двойное кольцо, то есть в каждое устройство приходит два кабеля, а не один. Соответственно, при отказе одного кабеля, остается работать резервный.</span></p>\n" +
                        "<p class='p3'><span class='s1'></span><br></p>\n" +
                        "<p class='p2'><span class='s1'><b>3) Топология звезда (англ. Star Topology)</b></span></p>\n" +
                        "<p class='p3'><span class='s1'></span><br></p>\n" +
                        "<p class='p5'><span class='s1'></span><br></p>\n" +
                        "<p class='p3'><span class='s1'></span><br></p>\n" +
                        "<p class='p2'><span class='s1'>Все устройства подключаются к центральному узлу, который уже является ретранслятором. В наше время данная модель используется в локальных сетях, когда<span class='Apple-converted-space'> </span></span></p>\n" +
                        "<p class='p2'><span class='s1'>к одному коммутатору подключаются несколько устройств, и он является посредником в передаче. Здесь отказоустойчивость значительно выше, чем в предыдущих двух.<span class='Apple-converted-space'> </span></span></p>\n" +
                        "<p class='p2'><span class='s1'>При обрыве, какого либо кабеля, выпадает из сети только одно устройство. Все остальные продолжают спокойно работать. Однако если откажет центральное звено, сеть станет неработоспособной.<span class='Apple-converted-space'> </span></span></p>\n" +
                        "<p class='p3'><span class='s1'></span><br></p>\n" +
                        "<p class='p2'><span class='s1'><b>4)Полносвязная топология (англ. Full-Mesh Topology)</b></span></p>\n" +
                        "<p class='p3'><span class='s1'></span><br></p>\n" +
                        "<p class='p5'><span class='s1'></span><br></p>\n" +
                        "<p class='p3'><span class='s1'></span><br></p>\n" +
                        "<p class='p2'><span class='s1'>Все устройства связаны напрямую друг с другом. То есть с каждого на каждый. Данная модель является, пожалуй, самой отказоустойчивой, так как не зависит от других.<span class='Apple-converted-space'> </span></span></p>\n" +
                        "<p class='p2'><span class='s1'>Но строить сети на такой модели сложно и дорого. Так как в сети, в которой минимум 1000 компьютеров, придется подключать 1000 кабелей на каждый компьютер.<span class='Apple-converted-space'> </span></span></p>\n" +
                        "<p class='p3'><span class='s1'></span><br></p>\n" +
                        "<p class='p2'><span class='s1'><b>5)Неполносвязная топология (англ. Partial-Mesh Topology)</b></span></p>\n" +
                        "<p class='p3'><span class='s1'></span><br></p>\n" +
                        "<p class='p5'><span class='s1'></span><br></p>\n" +
                        "<p class='p3'><span class='s1'></span><br></p>\n" +
                        "<p class='p2'><span class='s1'>Как правило, вариантов ее несколько. Она похожа по строению на полносвязную топологию. Однако соединение построено не с каждого на каждый, а через дополнительные узлы.</span></p>\n" +
                        "<p class='p2'><span class='s1'><span class='Apple-converted-space'> </span>То есть узел A, связан напрямую только с узлом B, а узел B связан и с узлом A, и с узлом C. Так вот, чтобы узлу A отправить сообщение узлу C, ему надо отправить сначала узлу<span class='Apple-converted-space'> </span></span></p>\n" +
                        "<p class='p2'><span class='s1'>B, а узел B в свою очередь отправит это сообщение узлу C. В принципе по этой топологии работают маршрутизаторы. Приведу пример из домашней сети.<span class='Apple-converted-space'> </span></span></p>\n" +
                        "<p class='p2'><span class='s1'>Когда вы из дома выходите в Интернет, у вас нет прямого кабеля до всех узлов, и вы отправляете данные своему провайдеру, а он уже знает куда эти данные нужно отправить.</span></p>\n" +
                        "<p class='p3'><span class='s1'></span><br></p>\n" +
                        "<p class='p2'><span class='s1'><b>6) Смешанная топология (англ. Hybrid Topology)</b></span></p>\n" +
                        "<p class='p3'><span class='s1'></span><br></p>\n" +
                        "<p class='p5'><span class='s1'></span><br></p>\n" +
                        "<p class='p3'><span class='s1'></span><br></p>\n" +
                        "<p class='p2'><span class='s1'>Самая популярная топология, которая объединила все топологии выше в себя. Представляет собой древовидную структуру, которая объединяет все топологии.<span class='Apple-converted-space'> </span></span></p>\n" +
                        "<p class='p2'><span class='s1'>Одна из самых отказоустойчивых топологий, так как если у двух площадок произойдет обрыв, то парализована будет связь только между ними, а все остальные<span class='Apple-converted-space'> </span></span></p>\n" +
                        "<p class='p2'><span class='s1'>объединенные площадки будут работать безотказно. На сегодняшний день, данная топология используется во всех средних и крупных компаниях.</span></p>\n" +
                        "<p class='p3'><span class='s1'></span><br></p>\n" +
                        "<p class='p2'><span class='s1'>И последнее, что осталось разобрать — это сетевые модели. На этапе зарождения компьютеров, у сетей не было единых стандартов. Каждый вендор использовал<span class='Apple-converted-space'> </span></span></p>\n" +
                        "<p class='p2'><span class='s1'>свои проприетарные решения, которые не работали с технологиями других вендоров. Конечно, оставлять так было нельзя и нужно было придумывать общее решение.<span class='Apple-converted-space'> </span></span></p>\n" +
                        "<p class='p2'><span class='s1'>Эту задачу взвалила на себя международная организация по стандартизации (ISO — International Organization for Standartization). Они изучали многие, применяемые на то время,<span class='Apple-converted-space'> </span></span></p>\n" +
                        "<p class='p2'><span class='s1'>модели и в результате придумали <b>модель OSI</b>, релиз которой состоялся в 1984 году. Проблема ее была только в том, что ее разрабатывали около 7 лет. Пока специалисты спорили,<span class='Apple-converted-space'> </span></span></p>\n" +
                        "<p class='p2'><span class='s1'>как ее лучше сделать, другие модели модернизировались и набирали обороты. В настоящее время модель OSI не используют. Она применяется только в качестве обучения сетям.<span class='Apple-converted-space'> </span></span></p>\n" +
                        "<p class='p2'><span class='s1'>Мое личное мнение, что модель OSI должен знать каждый уважающий себя админ как таблицу умножения. Хоть ее и не применяют в том виде, в каком она есть, принципы работы у всех моделей схожи с ней.<span class='Apple-converted-space'> </span></span></p>\n" +
                        "<p class='p3'><span class='s1'></span><br></p>\n" +
                        "<p class='p5'><span class='s1'></span><br></p>\n" +
                        "<p class='p3'><span class='s1'></span><br></p>\n" +
                        "<p class='p3'><span class='s1'></span><br></p>\n" +
                        "<p class='p2'><span class='s1'>Состоит она из 7 уровней и каждый уровень выполняет определенную ему роль и задачи. Разберем, что делает каждый уровень снизу вверх:</span></p>\n" +
                        "<p class='p3'><span class='s1'></span><br></p>\n" +
                        "<p class='p2'><span class='s1'><b>1) Физический уровень (Physical Layer):</b> определяет метод передачи данных, какая среда используется (передача электрических сигналов, световых импульсов или радиоэфир),<span class='Apple-converted-space'> </span></span></p>\n" +
                        "<p class='p2'><span class='s1'>уровень напряжения, метод кодирования двоичных сигналов.</span></p>\n" +
                        "<p class='p3'><span class='s1'></span><br></p>\n" +
                        "<p class='p2'><span class='s1'><b>2) Канальный уровень (Data Link Layer):</b> он берет на себя задачу адресации в пределах локальной сети, обнаруживает ошибки, проверяет целостность данных.<span class='Apple-converted-space'> </span></span></p>\n" +
                        "<p class='p2'><span class='s1'>Если слышали про MAC-адреса и протокол «Ethernet», то они располагаются на этом уровне.</span></p>\n" +
                        "<p class='p3'><span class='s1'></span><br></p>\n" +
                        "<p class='p2'><span class='s1'><b>3) Сетевой уровень (Network Layer):</b> этот уровень берет на себя объединения участков сети и выбор оптимального пути (т.е. маршрутизация).<span class='Apple-converted-space'> </span></span></p>\n" +
                        "<p class='p3'><span class='s1'></span><br></p>\n" +
                        "<p class='p2'><span class='s1'>Каждое сетевое устройство должно иметь уникальный сетевой адрес в сети. Думаю, многие слышали про протоколы IPv4 и IPv6. Эти протоколы работают на данном уровне.</span></p>\n" +
                        "<p class='p3'><span class='s1'></span><br></p>\n" +
                        "<p class='p2'><span class='s1'><b>4) Транспортный уровень (Transport Layer):</b> Этот уровень берет на себя функцию транспорта. К примеру, когда вы скачиваете файл с Интернета, файл в виде сегментов отправляется на</span></p>\n" +
                        "<p class='p3'><span class='s1'></span><br></p>\n" +
                        "<p class='p2'><span class='s1'><span class='Apple-converted-space'> </span>Ваш компьютер. Также здесь вводятся понятия портов, которые нужны для указания назначения к конкретной службе. На этом уровне работают протоколы TCP (с установлением соединения) и</span></p>\n" +
                        "<p class='p2'><span class='s1'><span class='Apple-converted-space'> </span>UDP (без установления соединения).</span></p>\n" +
                        "<p class='p3'><span class='s1'></span><br></p>\n" +
                        "<p class='p2'><span class='s1'><b>5) Сеансовый уровень (Session Layer):</b> Роль этого уровня в установлении, управлении и разрыве соединения между двумя хостами. К примеру, когда открываете страницу на веб-сервере,</span></p>\n" +
                        "<p class='p2'><span class='s1'><span class='Apple-converted-space'> </span>то Вы не единственный посетитель на нем. И вот для того, чтобы поддерживать сеансы со всеми пользователями, нужен сеансовый уровень.</span></p>\n" +
                        "<p class='p3'><span class='s1'></span><br></p>\n" +
                        "<p class='p2'><span class='s1'><b>6) Уровень представления (Presentation Layer):</b> Он структурирует информацию в читабельный вид для прикладного уровня. Например, многие компьютеры используют таблицу кодировки<span class='Apple-converted-space'> </span></span></p>\n" +
                        "<p class='p2'><span class='s1'>ASCII для вывода текстовой информации или формат jpeg для вывода графического изображения.</span></p>\n" +
                        "<p class='p3'><span class='s1'></span><br></p>\n" +
                        "<p class='p2'><span class='s1'><b>7) Прикладной уровень (Application Layer):</b> Наверное, это самый понятный для всех уровень. Как раз на этом уроне работают привычные для нас приложения — e-mail, браузеры по протоколу<span class='Apple-converted-space'> </span></span></p>\n" +
                        "<p class='p2'><span class='s1'>HTTP, FTP и остальное.</span></p>\n" +
                        "<p class='p3'><span class='s1'></span><br></p>\n" +
                        "<p class='p2'><span class='s1'>Самое главное помнить, что нельзя перескакивать с уровня на уровень (Например, с прикладного на канальный, или с физического на транспортный). Весь путь должен проходить<span class='Apple-converted-space'> </span></span></p>\n" +
                        "<p class='p2'><span class='s1'>строго с верхнего на нижний и с нижнего на верхний. Такие процессы получили название <b>инкапсуляция</b> (с верхнего на нижний) и <b>деинкапсуляция</b> (с нижнего на верхний).<span class='Apple-converted-space'> </span></span></p>\n" +
                        "<p class='p2'><span class='s1'>Также стоит упомянуть, что на каждом уровне передаваемая информация называется по-разному.<span class='Apple-converted-space'> </span></span></p>\n" +
                        "<p class='p3'><span class='s1'></span><br></p>\n" +
                        "<p class='p2'><span class='s1'>На прикладном, представления и сеансовым уровнях, передаваемая информация обозначается как PDU (Protocol Data Units). На русском еще называют блоки данных, хотя в моем круге их называют просто данные).<span class='Apple-converted-space'> </span></span></p>\n" +
                        "<p class='p3'><span class='s1'></span><br></p>\n" +
                        "<p class='p2'><span class='s1'>Информацию транспортного уровня называют сегментами. Хотя понятие сегменты, применимо только для протокола TCP. Для протокола UDP используется понятие<span class='Apple-converted-space'> </span></span></p>\n" +
                        "<p class='p2'><span class='s1'>— датаграмма. Но, как правило, на это различие закрывают глаза.<span class='Apple-converted-space'> </span></span></p>\n" +
                        "<p class='p2'><span class='s1'>На сетевом уровне называют IP пакеты или просто пакеты.</span></p>\n" +
                        "<p class='p3'><span class='s1'></span><br></p>\n" +
                        "<p class='p2'><span class='s1'>И на канальном уровне — кадры. С одной стороны это все терминология и она не играет важной роли в том, как вы будете называть передаваемые данные, но для экзамена эти понятия лучше знать.<span class='Apple-converted-space'> </span></span></p>\n" +
                        "<p class='p2'><span class='s1'>Итак, приведу свой любимый пример, который помог мне, в мое время, разобраться с процессом инкапсуляции и деинкапусуляции:</span></p>\n" +
                        "<p class='p3'><span class='s1'></span><br></p>\n" +
                        "<p class='p2'><span class='s1'>1) Представим ситуацию, что вы сидите у себя дома за компьютером, а в соседней комнате у вас свой локальный веб-сервер. И вот вам понадобилось скачать файл с него.<span class='Apple-converted-space'> </span></span></p>\n" +
                        "<p class='p2'><span class='s1'>Вы набираете адрес страницы вашего сайта. Сейчас вы используете протокол HTTP, которые работает на прикладном уровне. Данные упаковываются и спускаются на уровень ниже.</span></p>\n" +
                        "<p class='p3'><span class='s1'></span><br></p>\n" +
                        "<p class='p2'><span class='s1'>2) Полученные данные прибегают на уровень представления. Здесь эти данные структурируются и приводятся в формат, который сможет быть прочитан на сервере.<span class='Apple-converted-space'> </span></span></p>\n" +
                        "<p class='p2'><span class='s1'>Запаковывается и спускается ниже.</span></p>\n" +
                        "<p class='p3'><span class='s1'></span><br></p>\n" +
                        "<p class='p2'><span class='s1'>3) На этом уровне создается сессия между компьютером и сервером.<span class='Apple-converted-space'> </span></span></p>\n" +
                        "<p class='p3'><span class='s1'></span><br></p>\n" +
                        "<p class='p2'><span class='s1'>4) Так как это веб сервер и требуется надежное установление соединения и контроль за принятыми данными, используется протокол TCP.</span></p>\n" +
                        "<p class='p2'><span class='s1'><span class='Apple-converted-space'> </span>Здесь мы указываем порт, на который будем стучаться и порт источника, чтобы сервер знал, куда отправлять ответ. Это нужно для того, чтобы<span class='Apple-converted-space'> </span></span></p>\n" +
                        "<p class='p2'><span class='s1'>сервер понял, что мы хотим попасть на веб-сервер (стандартно — это 80 порт), а не на почтовый сервер. Упаковываем и спускаем дальше.</span></p>\n" +
                        "<p class='p3'><span class='s1'></span><br></p>\n" +
                        "<p class='p2'><span class='s1'>5) Здесь мы должны указать, на какой адрес отправлять пакет. Соответственно, указываем адрес назначения (пусть адрес сервера будет 192.168.1.2) и</span></p>\n" +
                        "<p class='p2'><span class='s1'><span class='Apple-converted-space'> </span>адрес источника (адрес компьютера 192.168.1.1). Заворачиваем и спускаем дальше.</span></p>\n" +
                        "<p class='p3'><span class='s1'></span><br></p>\n" +
                        "<p class='p2'><span class='s1'>6) IP пакет спускается вниз и тут вступает в работу канальный уровень. Он добавляет физические адреса источника и назначения, о которых подробно<span class='Apple-converted-space'> </span></span></p>\n" +
                        "<p class='p2'><span class='s1'>будет расписано в последующей статье. Так как у нас компьютер и сервер в локальной среде, то адресом источника будет являться MAC-адрес компьютера,<span class='Apple-converted-space'> </span></span></p>\n" +
                        "<p class='p2'><span class='s1'>а адресом назначения MAC-адрес сервера (если бы компьютер и сервер находились в разных сетях, то адресация работала по-другому). Если на верхних уровнях<span class='Apple-converted-space'> </span></span></p>\n" +
                        "<p class='p2'><span class='s1'>каждый раз добавлялся заголовок, то здесь еще добавляется концевик, который указывает на конец кадра и готовность всех собранных данных к отправке.</span></p>\n" +
                        "<p class='p3'><span class='s1'></span><br></p>\n" +
                        "<p class='p2'><span class='s1'>7) И уже физический уровень конвертирует полученное в биты и при помощи электрических сигналов (если это витая пара), отправляет на сервер.</span></p>\n" +
                        "<p class='p3'><span class='s1'></span><br></p>\n" +
                        "<p class='p2'><span class='s1'>Процесс деинкапсуляции аналогичен, но с обратной последовательностью:</span></p>\n" +
                        "<p class='p3'><span class='s1'></span><br></p>\n" +
                        "<p class='p2'><span class='s1'>1) На физическом уровне принимаются электрические сигналы и конвертируются в понятную битовую последовательность для канального уровня.</span></p>\n" +
                        "<p class='p3'><span class='s1'></span><br></p>\n" +
                        "<p class='p2'><span class='s1'>2) На канальном уровне проверяется MAC-адрес назначения (ему ли это адресовано). Если да, то проверяется кадр на целостность и отсутствие ошибок,<span class='Apple-converted-space'> </span></span></p>\n" +
                        "<p class='p2'><span class='s1'>если все прекрасно и данные целы, он передает их вышестоящему уровню.</span></p>\n" +
                        "<p class='p3'><span class='s1'></span><br></p>\n" +
                        "<p class='p2'><span class='s1'>3) На сетевом уровне проверяется IP адрес назначения. И если он верен, данные поднимаются выше. Не стоит сейчас вдаваться в подробности, почему у<span class='Apple-converted-space'> </span></span></p>\n" +
                        "<p class='p2'><span class='s1'>нас адресация на канальном и сетевом уровне. Это тема требует особого внимания, и я подробно объясню их различие позже. Главное сейчас понять, как данные упаковываются и распаковываются.</span></p>\n" +
                        "<p class='p3'><span class='s1'></span><br></p>\n" +
                        "<p class='p2'><span class='s1'>4) На транспортном уровне проверяется порт назначения (не адрес). И по номеру порта, выясняется какому приложению или сервису адресованы данные. У нас это веб-сервер и номер порта — 80.</span></p>\n" +
                        "<p class='p3'><span class='s1'></span><br></p>\n" +
                        "<p class='p2'><span class='s1'>5) На этом уровне происходит установление сеанса между компьютером и сервером.</span></p>\n" +
                        "<p class='p3'><span class='s1'></span><br></p>\n" +
                        "<p class='p2'><span class='s1'>6) Уровень представления видит, как все должно быть структурировано и приводит информацию в читабельный вид.</span></p>\n" +
                        "<p class='p3'><span class='s1'></span><br></p>\n" +
                        "<p class='p2'><span class='s1'>7) И на этом уровне приложения или сервисы понимают, что надо выполнить.</span></p>\n" +
                        "<p class='p3'><span class='s1'></span><br></p>\n" +
                        "<p class='p2'><span class='s1'>Много было написано про модель OSI. Хотя я постарался быть максимально краток и осветить самое важное. На самом деле про эту модель в Интернете и в<span class='Apple-converted-space'> </span></span></p>\n" +
                        "<p class='p2'><span class='s1'>книгах написано очень много и подробно, но для новичков и готовящихся к CCNA, этого достаточно. Из вопросов на экзамене по данной модели может быть 2 вопроса.</span></p>\n" +
                        "<p class='p2'><span class='s1'><span class='Apple-converted-space'> </span>Это правильно расположить уровни и на каком уровне работает определенный протокол.</span></p>\n" +
                        "<p class='p3'><span class='s1'></span><br></p>\n" +
                        "<p class='p2'><span class='s1'>Как было написано выше, модель OSI в наше время не используется. Пока разрабатывалась эта модель, все большую популярность получал стек протоколов TCP/IP.<span class='Apple-converted-space'> </span></span></p>\n" +
                        "<p class='p2'><span class='s1'>Он был значительно проще и завоевал быструю популярность.<span class='Apple-converted-space'> </span></span></p>\n" +
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
