package listing;
import javax.swing.*;
import java.awt.*;

public class X_25
    {

        public X_25()
            {
                JFrame frame = new JFrame();
                JPanel panel = new JPanel();
                JLabel X_25 = new JLabel();

                X_25.setText("<html>\n" +
                        "<head>\n" +
                        "</head>\n" +
                        "<body>\n" +
                        "<p class='p1'><span class='s1'><b>X.25</b></span></p>\n" +
                        "<p class='p2'><span class='s1'></span><br></p>\n" +
                        "<p class='p3'><span class='s1'><b>X.25</b> — стандарт </span><span class='s2'>канального уровня</span><span class='s1'> </span><span class='s2'>сетевой модели OSI</span><span class='s1'>. Предназначался для организации </span><span class='s2'>WAN</span><span class='s1'> на основе телефонных сетей с линиями с</span></p>\n" +
                        "<p class='p3'><span class='s1'><span class='Apple-converted-space'> </span>достаточно высокой частотой ошибок, поэтому содержит развитые механизмы коррекции ошибок. Ориентирован на работу с<span class='Apple-converted-space'> </span></span></p>\n" +
                        "<p class='p3'><span class='s1'>установлением соединений. Исторически является предшественником протокола </span><span class='s2'>Frame Relay</span><span class='s1'>.<span class='Apple-converted-space'> </span></span></p>\n" +
                        "<p class='p3'><span class='s1'>X.25 обеспечивает множество независимых виртуальных каналов (Permanent Virtual Circuits, PVC и Switched Virtual Circuits, </span><span class='s2'>SVC</span><span class='s1'>) в<span class='Apple-converted-space'> </span></span></p>\n" +
                        "<p class='p3'><span class='s1'>одной линии связи, идентифицируемых в X.25-сети по идентификаторам подключения к соединению, идентификаторам логического<span class='Apple-converted-space'> </span></span></p>\n" +
                        "<p class='p3'><span class='s1'>канала (Logical Channel Identifier, LCI) или номеру логического канала (Logical Channel Number, LCN).<span class='Apple-converted-space'> </span></span></p>\n" +
                        "<p class='p3'><span class='s1'>Благодаря надёжности протокола и его работе поверх телефонных сетей общего пользования X.25 широко использовался как в корпоративных<span class='Apple-converted-space'> </span></span></p>\n" +
                        "<p class='p3'><span class='s1'>сетях, так и во всемирных специализированных сетях предоставления услуг, таких как </span><span class='s2'>SWIFT</span><span class='s1'> (банковская платёжная система, прекратили использование<span class='Apple-converted-space'> </span></span></p>\n" +
                        "<p class='p3'><span class='s1'>в 2005 году) и SITA (</span><span class='s2'>фр.</span><span class='s1'> <i>Société Internationale de Télécommunications Aéronautiques</i> — система информационного обслуживания воздушного транспорта),</span></p>\n" +
                        "<p class='p3'><span class='s1'><span class='Apple-converted-space'> </span>однако в настоящее время X.25 вытесняется другими технологиями канального уровня (</span><span class='s2'>Frame Relay</span><span class='s1'>, </span><span class='s2'>ISDN</span><span class='s1'>, </span><span class='s2'>ATM</span><span class='s1'>) и протоколом </span><span class='s2'>IP</span><span class='s1'>, оставаясь, однако,</span></p>\n" +
                        "<p class='p3'><span class='s1'><span class='Apple-converted-space'> </span>достаточно распространённым в странах и территориях с неразвитой телекоммуникационной инфраструктурой.<span class='Apple-converted-space'> </span></span></p>\n" +
                        "<p class='p3'><span class='s2'>MTU</span><span class='s1'> для X.25 равно 576 байт. Также это число считается минимальным размером дейтаграммы, которую должен уметь принять и обработать любой хост в интернете.</span></p>\n" +
                        "<p class='p4'><span class='s1'><b>Содержание</b></span></p>\n" +
                        "<ul class='ul1'>\n" +
                        "<li class='li5'><span class='s3'></span><span class='s4'>1 История и стандартизация</span></li>\n" +
                        "<li class='li5'><span class='s3'></span><span class='s4'>2 Архитектура</span></li>\n" +
                        "<li class='li5'><span class='s3'></span><span class='s4'>3 Режимы и типы пакетов X.25</span></li>\n" +
                        "<li class='li5'><span class='s3'></span><span class='s4'>4 Стандарты ГОСТ</span></li>\n" +
                        "<li class='li5'><span class='s3'></span><span class='s4'>5 См. также</span></li>\n" +
                        "</ul>\n" +
                        "<p class='p4'><span class='s1'><b>История и стандартизация</b></span></p>\n" +
                        "<p class='p3'><span class='s1'>Разработан Study Group VII Международного союза электросвязи (</span><span class='s2'>ITU</span><span class='s1'>) в качестве пакетного протокола передачи данных в телефонных сетях принят<span class='Apple-converted-space'> </span></span></p>\n" +
                        "<p class='p3'><span class='s1'>в 1976 г. и стал основой всемирной системы PSPDN (</span><span class='s2'>англ.</span><span class='s1'> <i>Packet-Switched Public Data Networks</i>), то есть </span><span class='s2'>WAN</span><span class='s1'>. Существенные дополнения к протоколу<span class='Apple-converted-space'> </span></span></p>\n" +
                        "<p class='p3'><span class='s1'>были приняты в 1984 г., в настоящее время действует стандарт ISO 8208 протокола X.25, стандартизовано также и применение X.25 в локальных сетях (стандарт ISO 8881).<span class='Apple-converted-space'> </span></span></p>\n" +
                        "<p class='p3'><span class='s1'>По мере распространения IP-сетей </span><span class='s2'>IETF</span><span class='s1'> стандартизовал ряд RFC, описывающих работу и взаимодействие X.25 и </span><span class='s2'>TCP/IP</span><span class='s1'>:<span class='Apple-converted-space'> </span></span></p>\n" +
                        "<ul class='ul1'>\n" +
                        "<li class='li6'><span class='s5'></span><span class='s2'>RFC 887</span><span class='s1'> A Standard for the Transmission of IP Datagrams Over Public Data Networks</span></li>\n" +
                        "<li class='li6'><span class='s5'></span><span class='s2'>RFC 1086</span><span class='s1'> ISO-TP0 bridge between TCP and X.25</span></li>\n" +
                        "<li class='li6'><span class='s5'></span><span class='s2'>RFC 1090</span><span class='s1'> SMTP on X.25</span></li>\n" +
                        "<li class='li6'><span class='s5'></span><span class='s2'>RFC 1356</span><span class='s1'> Multiprotocol Interconnect on X.25 and ISDN in the Packet Mode</span></li>\n" +
                        "<li class='li6'><span class='s5'></span><span class='s2'>RFC 1381</span><span class='s1'> SNMP MIB Extension for X.25 LAPB</span></li>\n" +
                        "<li class='li6'><span class='s5'></span><span class='s2'>RFC 1381</span><span class='s1'> SNMP MIB Extension for the X.25 Packet Layer</span></li>\n" +
                        "<li class='li6'><span class='s5'></span><span class='s2'>RFC 1461</span><span class='s1'> SNMP MIB extension for Multiprotocol Interconnect over X.25</span></li>\n" +
                        "<li class='li6'><span class='s5'></span><span class='s2'>RFC 1598</span><span class='s1'> PPP in X.25</span></li>\n" +
                        "<li class='li6'><span class='s5'></span><span class='s2'>RFC 1613</span><span class='s1'> Cisco Systems X.25 over TCP (XOT)</span></li>\n" +
                        "</ul>\n" +
                        "<p class='p4'><span class='s1'><b>Архитектура</b></span></p>\n" +
                        "<p class='p7'><span class='s1'><span class='Apple-converted-space'>                                                               </span>.------.</span></p>\n" +
                        "<p class='p7'><span class='s1'><span class='Apple-converted-space'>                                                               </span>| HOST |</span></p>\n" +
                        "<p class='p7'><span class='s1'><span class='Apple-converted-space'>    </span>.---------. <span class='Apple-converted-space'>    </span>.-----. <span class='Apple-converted-space'>    </span>.-----.<span class='Apple-converted-space'>            </span>.-----. <span class='Apple-converted-space'>    </span>|---.<span class='Apple-converted-space'>  </span>|</span></p>\n" +
                        "<p class='p7'><span class='s1'><span class='Apple-converted-space'>    </span>| </span><span class='s6'>Терм</span><span class='s1'>. <span class='Apple-converted-space'>  </span>|-----| DTE |=====| DCE |____________| DCE |=====|PAD|<span class='Apple-converted-space'>  </span>|</span></p>\n" +
                        "<p class='p7'><span class='s1'><span class='Apple-converted-space'>    </span>| USER<span class='Apple-converted-space'>    </span>|<span class='Apple-converted-space'>  </span>^<span class='Apple-converted-space'>  </span>| PAD | <span class='Apple-converted-space'>    </span>`-----'<span class='Apple-converted-space'>            </span>`-----' <span class='Apple-converted-space'>    </span>|---'<span class='Apple-converted-space'>  </span>|</span></p>\n" +
                        "<p class='p7'><span class='s1'><span class='Apple-converted-space'>    </span>`---------'<span class='Apple-converted-space'>  </span>|<span class='Apple-converted-space'>  </span>`-----'<span class='Apple-converted-space'>    </span> : <span class='Apple-converted-space'>                      </span> : <span class='Apple-converted-space'>    </span>`------'</span></p>\n" +
                        "<p class='p7'><span class='s1'><span class='Apple-converted-space'>                 </span>|<span class='Apple-converted-space'>              </span>:<span class='Apple-converted-space'>                        </span>:</span></p>\n" +
                        "<p class='p7'><span class='s1'><span class='Apple-converted-space'>           </span>'NATIVE' <span class='Apple-converted-space'>            </span>:---- </span><span class='s6'>Пакетная</span><span class='s1'> </span><span class='s6'>сеть</span><span class='s1'><span class='Apple-converted-space'>  </span>----:</span></p>\n" +
                        "<p class='p7'><span class='s1'><span class='Apple-converted-space'>           </span>PROTOCOL</span></p>\n" +
                        "<p class='p4'><span class='s1'><b>Режимы и типы пакетов X.25</b></span></p>\n" +
                        "<ol class='ol1'>\n" +
                        "<li class='li6'><span class='s1'>Режим установления соединения (Call setup mode) используется при установлении соединения SVC между DTE-устройствами. В этом режиме на уровне<span class='Apple-converted-space'> </span></span></li>\n" +
                        "<li class='li6'><span class='s3'></span><span class='s1'>PLP используется схема адресации X.121 для установления виртуального соединения. Режим установления соединения работает на уровне виртуальных<span class='Apple-converted-space'> </span></span></li>\n" +
                        "<li class='li6'><span class='s3'></span><span class='s1'>каналов, то есть в пределах одного физического </span><span class='s2'>DTE-устройства</span><span class='s1'> одни SVC могут быть в состоянии установления соединения, а другие — в режиме передачи<span class='Apple-converted-space'> </span></span></li>\n" +
                        "<li class='li6'><span class='s3'></span><span class='s1'>данных или разрыва соединения. Режим установления соединения используется только в случае установления SVC, но не PVC.</span></li>\n" +
                        "<li class='li6'><span class='s1'>Режим передачи данных (Data transfer mode) используется при передаче данных по виртуальному каналу. При этом X.25 PLP ответственен за сегментацию</span></li>\n" +
                        "<li class='li6'><span class='s3'></span><span class='s1'> данных в пакеты и сборку пакетов, управление передачей данных и коррекцию ошибок. Режим передачи данных работает на уровне виртуальных каналов и<span class='Apple-converted-space'> </span></span></li>\n" +
                        "<li class='li6'><span class='s3'></span><span class='s1'>используется в случае как SVC, так и PVC.</span></li>\n" +
                        "<li class='li6'><span class='s1'>Режим ожидания (Idle mode) характеризуется отсутствием передачи данных при установленном виртуальном канале. Работает на уровне виртуальных каналов и</span></li>\n" +
                        "<li class='li6'><span class='s3'></span><span class='s1'> используется только в случае установления SVC, но не PVC.</span></li>\n" +
                        "<li class='li6'><span class='s1'>Режим разрыва соединения (Call clearing mode) используется при разрыве соединения SVC между DTE-устройствами. Работает на уровне виртуальных каналов<span class='Apple-converted-space'> </span></span></li>\n" +
                        "<li class='li6'><span class='s3'></span><span class='s1'>и используется только в случае разрыва SVC, но не PVC.</span></li>\n" +
                        "<li class='li6'><span class='s1'>Режим перезапуска (Restarting mode) используется для переустановки соединений между DTE-устройством и локально работающих с ним </span><span class='s2'>DCE-устройствами</span><span class='s1'>.<span class='Apple-converted-space'> </span></span></li>\n" +
                        "<li class='li6'><span class='s3'></span><span class='s1'>В отличие от других режимов, выполняется в пределах одного физического DTE-устройства, что сопровождается разрывом всех виртуальных каналов, установленных с этим DTE.</span></li>\n" +
                        "</ol>\n" +
                        "<p class='p8'><span class='s1'>Типы пакетов X.25<span class='Apple-converted-space'> </span></span></p>\n" +
                        "<table cellspacing='0' cellpadding='0'>\n" +
                        "<tbody>\n" +
                        "<tr>\n" +
                        "<td valign='middle' class='td1'>\n" +
                        "<p class='p8'><span class='s1'><b>Packet Type<span class='Apple-converted-space'> </span></b></span></p>\n" +
                        "</td>\n" +
                        "<td valign='middle' class='td2'>\n" +
                        "<p class='p8'><span class='s1'><b>DCE<span class='Apple-converted-space'>  </span>DTE<span class='Apple-converted-space'> </span></b></span></p>\n" +
                        "</td>\n" +
                        "<td valign='middle' class='td3'>\n" +
                        "<p class='p8'><span class='s1'><b>DTE<span class='Apple-converted-space'>  </span>DCE<span class='Apple-converted-space'> </span></b></span></p>\n" +
                        "</td>\n" +
                        "<td valign='middle' class='td4'>\n" +
                        "<p class='p8'><span class='s1'><b>Service<span class='Apple-converted-space'> </span></b></span></p>\n" +
                        "</td>\n" +
                        "<td valign='middle' class='td5'>\n" +
                        "<p class='p8'><span class='s1'><b>VC<span class='Apple-converted-space'> </span></b></span></p>\n" +
                        "</td>\n" +
                        "<td valign='middle' class='td6'>\n" +
                        "<p class='p8'><span class='s1'><b>PVC<span class='Apple-converted-space'> </span></b></span></p>\n" +
                        "</td>\n" +
                        "</tr>\n" +
                        "<tr>\n" +
                        "<td valign='middle' class='td1'>\n" +
                        "<p class='p6'><span class='s1'>Установление и разрыв соединений<span class='Apple-converted-space'> </span></span></p>\n" +
                        "</td>\n" +
                        "<td valign='middle' class='td2'>\n" +
                        "<p class='p6'><span class='s1'>Incoming Call<span class='Apple-converted-space'> </span></span></p>\n" +
                        "</td>\n" +
                        "<td valign='middle' class='td3'>\n" +
                        "<p class='p6'><span class='s1'>CALL REQ Запрос соединения<span class='Apple-converted-space'> </span></span></p>\n" +
                        "</td>\n" +
                        "<td valign='middle' class='td4'>\n" +
                        "<p class='p2'><span class='s1'></span><br></p>\n" +
                        "</td>\n" +
                        "<td valign='middle' class='td5'>\n" +
                        "<p class='p6'><span class='s1'>X<span class='Apple-converted-space'> </span></span></p>\n" +
                        "</td>\n" +
                        "<td valign='middle' class='td6'>\n" +
                        "<p class='p2'><span class='s1'></span><br></p>\n" +
                        "</td>\n" +
                        "</tr>\n" +
                        "<tr>\n" +
                        "<td valign='middle' class='td1'>\n" +
                        "<p class='p2'><span class='s1'></span><br></p>\n" +
                        "</td>\n" +
                        "<td valign='middle' class='td2'>\n" +
                        "<p class='p6'><span class='s1'>Call Connected<span class='Apple-converted-space'> </span></span></p>\n" +
                        "</td>\n" +
                        "<td valign='middle' class='td3'>\n" +
                        "<p class='p6'><span class='s1'>CALL ACC Вызов принят<span class='Apple-converted-space'> </span></span></p>\n" +
                        "</td>\n" +
                        "<td valign='middle' class='td4'>\n" +
                        "<p class='p2'><span class='s1'></span><br></p>\n" +
                        "</td>\n" +
                        "<td valign='middle' class='td5'>\n" +
                        "<p class='p6'><span class='s1'>X<span class='Apple-converted-space'> </span></span></p>\n" +
                        "</td>\n" +
                        "<td valign='middle' class='td6'>\n" +
                        "<p class='p2'><span class='s1'></span><br></p>\n" +
                        "</td>\n" +
                        "</tr>\n" +
                        "<tr>\n" +
                        "<td valign='middle' class='td1'>\n" +
                        "<p class='p2'><span class='s1'></span><br></p>\n" +
                        "</td>\n" +
                        "<td valign='middle' class='td2'>\n" +
                        "<p class='p6'><span class='s1'>Clear Indication<span class='Apple-converted-space'> </span></span></p>\n" +
                        "</td>\n" +
                        "<td valign='middle' class='td3'>\n" +
                        "<p class='p6'><span class='s1'>CLR REQ Запрос разрыва<span class='Apple-converted-space'> </span></span></p>\n" +
                        "</td>\n" +
                        "<td valign='middle' class='td4'>\n" +
                        "<p class='p2'><span class='s1'></span><br></p>\n" +
                        "</td>\n" +
                        "<td valign='middle' class='td5'>\n" +
                        "<p class='p6'><span class='s1'>X<span class='Apple-converted-space'> </span></span></p>\n" +
                        "</td>\n" +
                        "<td valign='middle' class='td6'>\n" +
                        "<p class='p2'><span class='s1'></span><br></p>\n" +
                        "</td>\n" +
                        "</tr>\n" +
                        "<tr>\n" +
                        "<td valign='middle' class='td1'>\n" +
                        "<p class='p2'><span class='s1'></span><br></p>\n" +
                        "</td>\n" +
                        "<td valign='middle' class='td2'>\n" +
                        "<p class='p6'><span class='s1'>Clear Confirmation<span class='Apple-converted-space'> </span></span></p>\n" +
                        "</td>\n" +
                        "<td valign='middle' class='td3'>\n" +
                        "<p class='p6'><span class='s1'>CLR CNF Подтверждение разрыва<span class='Apple-converted-space'> </span></span></p>\n" +
                        "</td>\n" +
                        "<td valign='middle' class='td4'>\n" +
                        "<p class='p2'><span class='s1'></span><br></p>\n" +
                        "</td>\n" +
                        "<td valign='middle' class='td5'>\n" +
                        "<p class='p6'><span class='s1'>X<span class='Apple-converted-space'> </span></span></p>\n" +
                        "</td>\n" +
                        "<td valign='middle' class='td6'>\n" +
                        "<p class='p2'><span class='s1'></span><br></p>\n" +
                        "</td>\n" +
                        "</tr>\n" +
                        "<tr>\n" +
                        "<td valign='middle' class='td1'>\n" +
                        "<p class='p6'><span class='s1'>Данные и прерывания<span class='Apple-converted-space'> </span></span></p>\n" +
                        "</td>\n" +
                        "<td valign='middle' class='td2'>\n" +
                        "<p class='p6'><span class='s1'>Data<span class='Apple-converted-space'> </span></span></p>\n" +
                        "</td>\n" +
                        "<td valign='middle' class='td3'>\n" +
                        "<p class='p6'><span class='s1'>Data Пакет данных<span class='Apple-converted-space'> </span></span></p>\n" +
                        "</td>\n" +
                        "<td valign='middle' class='td4'>\n" +
                        "<p class='p2'><span class='s1'></span><br></p>\n" +
                        "</td>\n" +
                        "<td valign='middle' class='td5'>\n" +
                        "<p class='p6'><span class='s1'>X<span class='Apple-converted-space'> </span></span></p>\n" +
                        "</td>\n" +
                        "<td valign='middle' class='td6'>\n" +
                        "<p class='p6'><span class='s1'>X<span class='Apple-converted-space'> </span></span></p>\n" +
                        "</td>\n" +
                        "</tr>\n" +
                        "<tr>\n" +
                        "<td valign='middle' class='td1'>\n" +
                        "<p class='p2'><span class='s1'></span><br></p>\n" +
                        "</td>\n" +
                        "<td valign='middle' class='td2'>\n" +
                        "<p class='p6'><span class='s1'>Interrupt<span class='Apple-converted-space'> </span></span></p>\n" +
                        "</td>\n" +
                        "<td valign='middle' class='td3'>\n" +
                        "<p class='p6'><span class='s1'>INT REQ Запрос прерывания<span class='Apple-converted-space'> </span></span></p>\n" +
                        "</td>\n" +
                        "<td valign='middle' class='td4'>\n" +
                        "<p class='p2'><span class='s1'></span><br></p>\n" +
                        "</td>\n" +
                        "<td valign='middle' class='td5'>\n" +
                        "<p class='p6'><span class='s1'>X<span class='Apple-converted-space'> </span></span></p>\n" +
                        "</td>\n" +
                        "<td valign='middle' class='td6'>\n" +
                        "<p class='p6'><span class='s1'>X<span class='Apple-converted-space'> </span></span></p>\n" +
                        "</td>\n" +
                        "</tr>\n" +
                        "<tr>\n" +
                        "<td valign='middle' class='td1'>\n" +
                        "<p class='p2'><span class='s1'></span><br></p>\n" +
                        "</td>\n" +
                        "<td valign='middle' class='td2'>\n" +
                        "<p class='p6'><span class='s1'>Interrupt Confirmation<span class='Apple-converted-space'> </span></span></p>\n" +
                        "</td>\n" +
                        "<td valign='middle' class='td3'>\n" +
                        "<p class='p6'><span class='s1'>INT CNF Подтверждение прерывания<span class='Apple-converted-space'> </span></span></p>\n" +
                        "</td>\n" +
                        "<td valign='middle' class='td4'>\n" +
                        "<p class='p2'><span class='s1'></span><br></p>\n" +
                        "</td>\n" +
                        "<td valign='middle' class='td5'>\n" +
                        "<p class='p6'><span class='s1'>X<span class='Apple-converted-space'> </span></span></p>\n" +
                        "</td>\n" +
                        "<td valign='middle' class='td6'>\n" +
                        "<p class='p6'><span class='s1'>X<span class='Apple-converted-space'> </span></span></p>\n" +
                        "</td>\n" +
                        "</tr>\n" +
                        "<tr>\n" +
                        "<td valign='middle' class='td1'>\n" +
                        "<p class='p5'><span class='s4'>Flow Control</span><span class='s7'> and Reset<span class='Apple-converted-space'> </span></span></p>\n" +
                        "</td>\n" +
                        "<td valign='middle' class='td2'>\n" +
                        "<p class='p6'><span class='s1'>Reciever Ready<span class='Apple-converted-space'> </span></span></p>\n" +
                        "</td>\n" +
                        "<td valign='middle' class='td3'>\n" +
                        "<p class='p6'><span class='s1'>RR Приемник готов<span class='Apple-converted-space'> </span></span></p>\n" +
                        "</td>\n" +
                        "<td valign='middle' class='td4'>\n" +
                        "<p class='p2'><span class='s1'></span><br></p>\n" +
                        "</td>\n" +
                        "<td valign='middle' class='td5'>\n" +
                        "<p class='p6'><span class='s1'>X<span class='Apple-converted-space'> </span></span></p>\n" +
                        "</td>\n" +
                        "<td valign='middle' class='td6'>\n" +
                        "<p class='p6'><span class='s1'>X<span class='Apple-converted-space'> </span></span></p>\n" +
                        "</td>\n" +
                        "</tr>\n" +
                        "<tr>\n" +
                        "<td valign='middle' class='td1'>\n" +
                        "<p class='p2'><span class='s1'></span><br></p>\n" +
                        "</td>\n" +
                        "<td valign='middle' class='td2'>\n" +
                        "<p class='p6'><span class='s1'>Reciever Not Ready<span class='Apple-converted-space'> </span></span></p>\n" +
                        "</td>\n" +
                        "<td valign='middle' class='td3'>\n" +
                        "<p class='p6'><span class='s1'>RNR Приемник не готов<span class='Apple-converted-space'> </span></span></p>\n" +
                        "</td>\n" +
                        "<td valign='middle' class='td4'>\n" +
                        "<p class='p2'><span class='s1'></span><br></p>\n" +
                        "</td>\n" +
                        "<td valign='middle' class='td5'>\n" +
                        "<p class='p6'><span class='s1'>X<span class='Apple-converted-space'> </span></span></p>\n" +
                        "</td>\n" +
                        "<td valign='middle' class='td6'>\n" +
                        "<p class='p6'><span class='s1'>X<span class='Apple-converted-space'> </span></span></p>\n" +
                        "</td>\n" +
                        "</tr>\n" +
                        "<tr>\n" +
                        "<td valign='middle' class='td1'>\n" +
                        "<p class='p2'><span class='s1'></span><br></p>\n" +
                        "</td>\n" +
                        "<td valign='middle' class='td2'>\n" +
                        "<p class='p2'><span class='s1'></span><br></p>\n" +
                        "</td>\n" +
                        "<td valign='middle' class='td3'>\n" +
                        "<p class='p6'><span class='s1'>REJ Отказ<span class='Apple-converted-space'> </span></span></p>\n" +
                        "</td>\n" +
                        "<td valign='middle' class='td4'>\n" +
                        "<p class='p2'><span class='s1'></span><br></p>\n" +
                        "</td>\n" +
                        "<td valign='middle' class='td5'>\n" +
                        "<p class='p6'><span class='s1'>X<span class='Apple-converted-space'> </span></span></p>\n" +
                        "</td>\n" +
                        "<td valign='middle' class='td6'>\n" +
                        "<p class='p6'><span class='s1'>X<span class='Apple-converted-space'> </span></span></p>\n" +
                        "</td>\n" +
                        "</tr>\n" +
                        "<tr>\n" +
                        "<td valign='middle' class='td1'>\n" +
                        "<p class='p2'><span class='s1'></span><br></p>\n" +
                        "</td>\n" +
                        "<td valign='middle' class='td2'>\n" +
                        "<p class='p6'><span class='s1'>Reset Indication<span class='Apple-converted-space'> </span></span></p>\n" +
                        "</td>\n" +
                        "<td valign='middle' class='td3'>\n" +
                        "<p class='p6'><span class='s1'>RES REQ Запрос сброса<span class='Apple-converted-space'> </span></span></p>\n" +
                        "</td>\n" +
                        "<td valign='middle' class='td4'>\n" +
                        "<p class='p2'><span class='s1'></span><br></p>\n" +
                        "</td>\n" +
                        "<td valign='middle' class='td5'>\n" +
                        "<p class='p6'><span class='s1'>X<span class='Apple-converted-space'> </span></span></p>\n" +
                        "</td>\n" +
                        "<td valign='middle' class='td6'>\n" +
                        "<p class='p6'><span class='s1'>X<span class='Apple-converted-space'> </span></span></p>\n" +
                        "</td>\n" +
                        "</tr>\n" +
                        "<tr>\n" +
                        "<td valign='middle' class='td1'>\n" +
                        "<p class='p2'><span class='s1'></span><br></p>\n" +
                        "</td>\n" +
                        "<td valign='middle' class='td2'>\n" +
                        "<p class='p6'><span class='s1'>Reset Confirmation<span class='Apple-converted-space'> </span></span></p>\n" +
                        "</td>\n" +
                        "<td valign='middle' class='td3'>\n" +
                        "<p class='p6'><span class='s1'>RES CNF Подтверждение сброса<span class='Apple-converted-space'> </span></span></p>\n" +
                        "</td>\n" +
                        "<td valign='middle' class='td4'>\n" +
                        "<p class='p2'><span class='s1'></span><br></p>\n" +
                        "</td>\n" +
                        "<td valign='middle' class='td5'>\n" +
                        "<p class='p6'><span class='s1'>X<span class='Apple-converted-space'> </span></span></p>\n" +
                        "</td>\n" +
                        "<td valign='middle' class='td6'>\n" +
                        "<p class='p6'><span class='s1'>X<span class='Apple-converted-space'> </span></span></p>\n" +
                        "</td>\n" +
                        "</tr>\n" +
                        "<tr>\n" +
                        "<td valign='middle' class='td1'>\n" +
                        "<p class='p6'><span class='s1'>Restart<span class='Apple-converted-space'> </span></span></p>\n" +
                        "</td>\n" +
                        "<td valign='middle' class='td2'>\n" +
                        "<p class='p6'><span class='s1'>Restart Indication<span class='Apple-converted-space'> </span></span></p>\n" +
                        "</td>\n" +
                        "<td valign='middle' class='td3'>\n" +
                        "<p class='p6'><span class='s1'>RSTR REQ Запрос перезапуска<span class='Apple-converted-space'> </span></span></p>\n" +
                        "</td>\n" +
                        "<td valign='middle' class='td4'>\n" +
                        "<p class='p2'><span class='s1'></span><br></p>\n" +
                        "</td>\n" +
                        "<td valign='middle' class='td5'>\n" +
                        "<p class='p6'><span class='s1'>X<span class='Apple-converted-space'> </span></span></p>\n" +
                        "</td>\n" +
                        "<td valign='middle' class='td6'>\n" +
                        "<p class='p6'><span class='s1'>X<span class='Apple-converted-space'> </span></span></p>\n" +
                        "</td>\n" +
                        "</tr>\n" +
                        "<tr>\n" +
                        "<td valign='middle' class='td1'>\n" +
                        "<p class='p2'><span class='s1'></span><br></p>\n" +
                        "</td>\n" +
                        "<td valign='middle' class='td2'>\n" +
                        "<p class='p6'><span class='s1'>Restart Confirmation<span class='Apple-converted-space'> </span></span></p>\n" +
                        "</td>\n" +
                        "<td valign='middle' class='td3'>\n" +
                        "<p class='p6'><span class='s1'>RSTR CNF Подтверждение перезапуска<span class='Apple-converted-space'> </span></span></p>\n" +
                        "</td>\n" +
                        "<td valign='middle' class='td4'>\n" +
                        "<p class='p2'><span class='s1'></span><br></p>\n" +
                        "</td>\n" +
                        "<td valign='middle' class='td5'>\n" +
                        "<p class='p6'><span class='s1'>X<span class='Apple-converted-space'> </span></span></p>\n" +
                        "</td>\n" +
                        "<td valign='middle' class='td6'>\n" +
                        "<p class='p6'><span class='s1'>X<span class='Apple-converted-space'> </span></span></p>\n" +
                        "</td>\n" +
                        "</tr>\n" +
                        "<tr>\n" +
                        "<td valign='middle' class='td1'>\n" +
                        "<p class='p6'><span class='s1'>Diagnostic<span class='Apple-converted-space'> </span></span></p>\n" +
                        "</td>\n" +
                        "<td valign='middle' class='td2'>\n" +
                        "<p class='p6'><span class='s1'>DIAG Диагностика<span class='Apple-converted-space'> </span></span></p>\n" +
                        "</td>\n" +
                        "<td valign='middle' class='td3'>\n" +
                        "<p class='p2'><span class='s1'></span><br></p>\n" +
                        "</td>\n" +
                        "<td valign='middle' class='td4'>\n" +
                        "<p class='p2'><span class='s1'></span><br></p>\n" +
                        "</td>\n" +
                        "<td valign='middle' class='td5'>\n" +
                        "<p class='p6'><span class='s1'>X<span class='Apple-converted-space'> </span></span></p>\n" +
                        "</td>\n" +
                        "<td valign='middle' class='td6'>\n" +
                        "<p class='p6'><span class='s1'>X<span class='Apple-converted-space'> </span></span></p>\n" +
                        "</td>\n" +
                        "</tr>\n" +
                        "<tr>\n" +
                        "<td valign='middle' class='td1'>\n" +
                        "<p class='p6'><span class='s1'>Registration<span class='Apple-converted-space'> </span></span></p>\n" +
                        "</td>\n" +
                        "<td valign='middle' class='td2'>\n" +
                        "<p class='p6'><span class='s1'>REG CNF Подтверждение регистрации<span class='Apple-converted-space'> </span></span></p>\n" +
                        "</td>\n" +
                        "<td valign='middle' class='td3'>\n" +
                        "<p class='p6'><span class='s1'>REG REQ Запрос регистрации<span class='Apple-converted-space'> </span></span></p>\n" +
                        "</td>\n" +
                        "<td valign='middle' class='td4'>\n" +
                        "<p class='p2'><span class='s1'></span><br></p>\n" +
                        "</td>\n" +
                        "<td valign='middle' class='td5'>\n" +
                        "<p class='p6'><span class='s1'>X<span class='Apple-converted-space'> </span></span></p>\n" +
                        "</td>\n" +
                        "<td valign='middle' class='td6'>\n" +
                        "<p class='p6'><span class='s1'>X<span class='Apple-converted-space'> </span></span></p>\n" +
                        "</td>\n" +
                        "</tr>\n" +
                        "</tbody>\n" +
                        "</table>\n" +
                        "<p class='p3'><span class='s1'><br>\n" +
                        "</span></p>\n" +
                        "</body>\n" +
                        "</html>\n");

                    panel.add(X_25);

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
