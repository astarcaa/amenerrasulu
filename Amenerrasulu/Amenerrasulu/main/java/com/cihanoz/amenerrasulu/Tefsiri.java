package com.cihanoz.amenerrasulu;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

public class Tefsiri extends AppCompatActivity {
    TextView tv_tefsiri;
    String fazilet_metin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tefsiri);

        tv_tefsiri=(TextView)findViewById(R.id.tv_tefsiri);
        fazilet_metin="\n" +
                "Peygamberlerin Risaletlerine İman Ve Tarata Göre Mükellefiyet\n" +
                "\n" +
                "\n" +
                "285- O Peygamber kendisine Rabbin-den indirilene iman etti, müminler de. Onların her biri Allah'a, O'nun meleklerine, kitaplarına, peygamberlerine iman etti. \"Peygamberlerinden hiç birini diğerinden ayırmayız. Dinledik, itaat ettik. Rabbimiz, senden mağfiret dileriz; dönüş ancak sanadır\" dediler.\n" +
                "\n" +
                "286- Allah hiç bir kimseye gücünün yeteceğinden başkasını yüklemez. Kazandığı kendisine, yaptığı da aleyhinedir. Rabbimiz, unuttuk yahut yanıldıy-sak bizi sorguya çekme. Rabbimiz, bizden öncekilere yüklediğin gibi üzerimize ağır yük yükleme. Rabbimiz, güç yetiremeyeceğimiz şeyi bize yükleme. Bizi affet, bize mağfiret buyur ve bize merhamet eyle. Sensin bizim mevlâ-mız. Kâfirler topluluğuna karşı da bize yardım et. \n" +
                "\n" +
                "\n" +
                "\n" +
                "I'râb:\n" +
                "\n" +
                "\n" +
                "\"Müminler de\" ifadesi ya \"peygamber\" buyruğuna atfedilmiştir ve \"peygamber ve müminler de iman etti\" denilmiş gibidir; ya da bu buyruk birinci müpteda, \"her biri\" ikinci müptedadır, \"Allah'a ... iman ettik\" ifadesi de haber olur. O vakit ifadenin takdiri de şöyle olur: Onların hepsi... Allah'a iman etti. [148] \n" +
                "\n" +
                "\n" +
                "\n" +
                "Belagat:\n" +
                "\n" +
                "\n" +
                "Hayır hakkında kullanılan (kesebet= kazandığı) ile şer hakkında kullanılan (iktesebet= yaptığı) buyrukları arasında tıbâk vardır. Aynı şekilde \"iman etti... müminler\" buyrukları arasında iştikak bakımından cinas vardır. Yüce Allah'ın, \"Peygamberlerinden hiç birini diğerinden ayırmayız\" buyruğunda itnâb ve \"müminler de\" buyruğunda hazf ile îcâz vardır. Onlar da Allah'a, Rasulleri-ne, peygamberlerine iman ettiler, demektir. [149] \n" +
                "\n" +
                "\n" +
                "\n" +
                "Kelime ve İbareler:\n" +
                "\n" +
                "\n" +
                "\"O peygamber\" Resulullah (s.a.), \"kendisine Rabbinden indirilene\" Kur\"an-ı Kerim'e \"iman etti.\" yani onu tasdik etti. Onlar derler ki: \"Peygamberlerinden hiç birini diğerinden ayırmayız.\" Risalet ve teşrî bakımından aralarında fark gözetmeyiz. Bu hususta birini diğerinden üstün kabul ederek kimisine iman edip kimisini inkâr etmeyiz. \"Dinledik\" yani bize verilen emri kabul ve üzerinde düşünmek üzere işitip dinledik. \"Dönüş\" öldükten sonra dirilerek gelmek \"ancak sanadır.\"\n" +
                "\n" +
                "\"Allah kimseye gücünün yeteceğinden\" takatinden. Takat herhangi bir zorluk ve sıkıntı olmaksızın insanın iş yapabilme kapasitesidir, \"başkasını yükle-mez.\"\n" +
                "\n" +
                "Hayırdan ve onun sevabı olan şeylerden \"kazandığı kendisine\", serden yani onun günahından \"yaptığı da onun aleyhinedir.\" Kimse kimsenin günahından dolayı sorumlu tutulmaz ve kimse içindeki vesvese gibi kazanmadığı şeylerden dolayı da sorumlu tutulmaz. \"Unuttuk yahut yanıldıysak\" yani kasdî olmayarak doğruyu terk edersek bizden öncekileri sorumlu tuttuğun gibi \"bizi sorguya çekme.\" \"Rabbimiz, bizden öncekilere yüklediğin gibi üzerimize ağır yük yükleme.\" Bize taşıması ağır gelecek yahut zor gelecek şeyler yükleme. Bizden öncekilerden kasıt İsrailoğulları'dır. Tevbe için kişinin kendisini öldürmesi, zekât olmak üzere malın dörtte birinin verilmesi, necaset bulaşmış yerin elbiseden kesilmesi gibi ağır sorumluluklar...\n" +
                "\n" +
                "\"Rabbimiz, güç yetiremeyeceğimiz şeyi\" yani altından kalkamayacağımız mükellefiyet ve belâları \"bizeyükleme.\" Buna göre güç yetirilen şeylerle mükellef tutmak (et-teklîfu bimâ yutak) katlanılabilen ve mutad bir meşakkat ile olsa dahi, yerine getirilmesi mümkün olan şeylerle mükellef tutmaktır. Güç yeti-rilemeyen şeylerle mükellef tutmak (et-teklîfu bimâ la-yutâk) ise alışılmadık ve ancak bir güç harcanmadan ve insanın imkân ve gücü çerçevesinde yapılması imkânsız olan mükellefiyetlerdir.\n" +
                "\n" +
                "\"Bizi affet, bize mağfiret buyur ve bize merhamet eyle.\" Rahmet mağfiretten ayrı bir şeydir. \"Sensin bizim mevlâmız.\" Malikimiz, efendimiz ve işlerimizin mutlak sahibi sensin.\n" +
                "\n" +
                "Müslim'in İbni Abbas'tan rivayet ettiği hadis-i şerifte şöyle denilmektedir: \"Bu ayet-i kerime nazil olunca Resulullah (s.a.) onu okudu, Allah da her bir (dua) kelime (şi)nin arkasından, \"Ben de yaptım\" diye buyurdu.\" [150]\n" +
                "\n" +
                "\n" +
                "\n" +
                "Nüzul Sebebi\n" +
                "\n" +
                "\n" +
                "Bundan önceki ayet-i kerimede, \"Ayetlerden Çıkan Hükümler\" başlığı altında Müslim ve Ahmed'in Ebu Hureyre'den yaptıkları rivayette bu ayetin nüzul sebebi açıklanmıştır. Müslim ve başkaları da İbni Abbas'tan buna yakın bir rivayette bulunmuşlardır. [151] \n" +
                "\n" +
                "\n" +
                "\n" +
                "Ayetler Arası İlişki\n" +
                "\n" +
                "\n" +
                "Şanı Yüce Allah bu sureyi, Kur'an-ı Kerim, müminler, müminlerin kâfirlerle karşılaştırılması ve özellikle de Yahudilere dair haberlerle başlattı. Arkasından oruç, hac ve boşama gibi bir çok hükümlere ve sapıklarla tartışmaya dair irşatlarda bulundu. Sure, Allah'ın rasulü Muhammed (s.a.)'in ve müminlerin semavî kitaplara ve peygamberlere aralarında bir fark gözetmeksizin imanlarından söz ederek sona erdi. Surenin güzel bir şekilde sona ermesi, Yüce Allah'ın bu ümmete lütfettiği darlığı ve sıkıntısı bulunmayan, kolay ve müsamahakâr mükellefiyetler ile imanın ve iman ehli olanların küfre ve onun yardımcılarına karşı muzaffer kılınacaklarının belirtilmesiyle gerçekleşmiş oldu. Elbette ki onun için kararlarının samimi olması-, ihlâsa sahip olmaları, doğru olmaları ve şer\"î hükümleri de uygulamaları gerekir. [152]\n" +
                "\n" +
                "\n" +
                "\n" +
                "Bu İki Ayet-i Kerimenin Fazileti:\n" +
                "\n" +
                "\n" +
                "Sünnet-i Nevebiyyede bu iki ayetin faziletine işaret eden pek çok hadis-i şerif varit olmuştur. Bunlardan birisi Buharî'nin İbni Mes'ud'dan yaptığı şu rivayettir: İbni Mes'ud dedi ki: Resulullah (s.a.) şöyle buyurdu: \"Her kim bir gecede Bakara suresinin sonundaki iki ayeti okursa o iki ayet ona yeter.\" Müslim bunu Ebu Mes'ud el-Ensarî'den şu lafızla rivayet etmiştir: \"Her kim bir gecede Bakara suresinin sonundan bu iki ayeti okursa o iki ayet ona yeter.\"\n" +
                "\n" +
                "Bu hadislerden birisini de İmam Ahmed, Ebu Zerr'den rivayet etmektedir. Ebu Zerr dedi ki: Resulullah (s.a.) şöyle buyurdu: \"Bakara suresinin son ayetleri bana Arş'ın altındaki bir hazineden verildi. Benden önce onlar bir peygambere verilmiş değildir.\" îbni Merdûveyh de Hz. Ali'den şöyle dediğini rivayet etmektedir: \"İslâm'ı akletmiş bir kimsenin Ayetü'l-Kürsî ile Bakara suresinin sonlarını okumadan uyuyacağını zannetmiyorum. Çünkü bunlar Peygamberimiz (salat ve selâm ona)'e Arşın altındaki bir hazineden verilmiştir.\"\n" +
                "\n" +
                "Bir diğer hadis-i şerifi Müslim, İbni Abbas'tan rivayet etmektedir. İbni Ab-bas dedi ki: Resulullah (s.a.) Cebrail'in de yanında olduğu bir sırada yukarlar-dan bir ses işitti. Cebrail gözünü semaya kaldırdı ve dedi ki: Bu semadaki şimdiye kadar asla açılmamış bir kapıdır. O kapıdan bir melek indi, Resulullah (s.a.)'ın yanına geldi, ona dedi ki: \"Senden önce hiç bir peygambere verilmemiş olan ve ancak sana verilen iki nurun müjdesini veriyorum. Bunlar Fâtihatül-Kitâb ile Bakara suresinin sonlarıdır. Bunlardan bir harf okudun mu mutlaka sana verilir (oradaki istekler sana bağışlanır).\" [153] \n" +
                "\n" +
                "\n" +
                "\n" +
                "Açıklaması\n" +
                "\n" +
                "\n" +
                "Yüce Allah peygamberinden ve müminlerden inancın esaslarına iman. ettiklerinden söz edip haber vermekte ve şöyle buyurmaktadır: Allah'ın peygamberi Muhammed ve onun risaletine iman edenler, Muhammed'in kalbine Rabbi tarafından indirilen itikada dair buyruklara ve hükümlere kat'î bir bilgi ve tam bir itminan ile inandılar, tasdik ettiler. el-Hakim'in Müstedrek'inde rivayet ettiğine göre bu ayet-i kerime Resulullah (s.a.)'a nazil olunca, \"İman etmesi onun için bir haktır\" diye buyurmuştur.\n" +
                "\n" +
                "Onların her birisi, Allah'ın varlığına, birliğine, yaratmadaki hikmetinin eksiksizliğine, Allah ve rasulleri arasında vahiy getirmek ve elçilik yapmak gibi bir çok görevleri bulunan meleklerin varlığına, insanları hidayete erdirmek için Allah'ın üzerlerine kitaplar, sahifeler indirmiş olduğu şerefli rasullerine iman etmişlerdir. Hepsi de şöyle derlemimiz ilke itibariyle risalet ve teşri bakımından peygamberler arasında fark gözetmeyiz ve onların davetleri birdir. Bu da Allah'ın varlığını, birliğini kabul etmek, ahlâkın üstün değerlerine çağırmaktır. Bundan önceki bir ayet-i kerimede geçen, \"İşte biz bu peygamberlerin bazısını bazısına üstün kıldık.\" (Bakara, 2/253) buyruğundaki peygamberler arasında fazilet farkına gelince, bu, risalet ve teşriin dışında kalan diğer bir takım meziyetler hakkında söz konusudur. Ayrıca bu buyrukta Muhammed'e iman eden müminlerin, bazı peygamberlere iman edip diğer bir kısmını inkâr eden Kitap Ehl'inden üstün bir fazilete sahip olduklarına da bir işaret vardır.\n" +
                "\n" +
                "Müminler dediler ki: Rasul bize vahyi tebliğ etmiştir. Biz onun sözünü üzerinde durup düşünerek, anlayarak, kabul ederek dinledik, verilen emirlere boyun eğerek, bağlanarak itaat ettik. Bütün emir ve yasakların dünya ve ahi-ret mutluluğu için olduğuna inanarak bunu yaptık.\n" +
                "\n" +
                "Onlar Yüce Allah'tan, dünyada günahları örtülerek, ahirette de cezalarının verilmesini umarak mağfiret dilerler. Adeta, \"Bütün işlerimizde tasarruf sahibi sensin, dönüş sanadır, senin huzuruna varılacaktır. Sen bize dilediğini yaparsın\" derler. Hz. Cebrail dedi ki: \"Muhakkak Allah sana ve ümmetine güzel bir şekilde övgüde bulunmuştur. İşte sana isteğin verilecektir.\" Bunun üzerine Hz. Peygamber, \"Allah hiç bir kimseye gücünün yeteceğinden başkasını yüklemez\" ayetini okudu ve oradaki dileklerin verilmesini istedi.\n" +
                "\n" +
                "Allah kimseye takatinden fazlasını yüklemez. Bu Yüce Allah'ın onlara olan lütuf ve merhametinden dolayıdır. Yüce Allah'ın, \"İçinizdekini açıklasınız da gizleseniz de Allah onunla sizi hesaba çeker\" buyruğunda Ashab-ı kiram'm korkup çekindikleri şeyi açıklayan işte bu ayet-i kerimedir. Yani Yüce Allah eğer hesaba çekecek ve soracak olursa, böyle hesaba çeker ve sorar. Fakat O, ancak kulunun def etme ve yapmama imkânı bulduğu şeyler dolayısıyla azap verir. Kulunun savma gücü olmayan vesvese ve nefsî telkinlere gelince, hiç bir kimse bundan mükellef tutulmaz. Şunu bilmek de gerekir ki, kötü vesveseden nefret duymak imandan gelir.\n" +
                "\n" +
                "Ağır tekliflerin yapılmayacağına, kolay tekliflerin yapılacağına ise Kur\"an-ı Kerim'in bir çok ayetinde işaret edilmiştir. Yüce Allah'ın şu buyrukları bunlara misaldir: Allah size kolaylığı diler, sizin için güçlük dilemez.\" (Bakara, 2/185); \"Ye dinde sizin için herhangi bir zorluk konmamıştır.\" (Hac, 22/78).\n" +
                "\n" +
                "İnsan ruhunun, ağır olmayan ve katlanüabilen teklifin sınırları içerisine giren bir takım amelleri vardır; hayır kabilinden kazançları veya kötülüklerden aleyhine elde ettiklerini gerçekleştirirken yaptığı türden ameller... Buna karşılık hasardan kazançları için sevap vardır. Masiyetlerden elde ettiği serler için de cezalandırılması söz konusudur.\n" +
                "\n" +
                "Kötülük kazanmak için \"iktisâb\" tabirinin kullanılması, kötülük işlemek için insanın kendisini zorlaması, sıkıntıya katlanması, plan kurması, tabiat ve örflerle çatışmasını gerektirdiğindendir. Hayrın kazanılması için fazla bir gayrete ihtiyaç yoktur. Çünkü Yüce Allah'ın insan tabiatına yerleştirdiği şey hayırdır, hayır işlerine temayülüdür. Hayır işlemekle nefis rahat eder. Hayır işlemek için korkmaya, tedbirler almaya gerek yoktur. Ruhunu arındıran ve yaratanın önünde zayıflığını, o büyük imtihan gününde ona muhtaç olduğunu, Allah'ın ve insanların önünde korkunç, kapsamlı ve inceden inceye hesabın sıkıntılarından kurtulma ihtiyacı hisseden insan hayra yönelir.\n" +
                "\n" +
                "Daha sonra Yüce Allah kullarına şu duayı yapma irşadında bulunmaktadır; ayrıca bu duayı kabul edeceğini de onlara garantilemiştir. Bu dua şudur: \"Rabbimiz, unuttuk yahut yanıldıysak bizi sorguya çekme!\" Yani unutarak bir farzı terk eder yahut bir haram işler veya şerî yönünü bilmediğimiz için amelimizde doğru olanın hangisi olduğunu yanılarak tespit edemezsek, bundan dolayı bizi cezalandırma! Bunu İbni Mace, Beyhakî, Taberanî ve Hâkim'in Ebu Zerr, İbni Abbas ve Sevbân'dan rivayet ettikleri Resulullah (s.a.)'ın şu buyruğu da desteklemektedir: \"Muhakkak Yüce Allah ümmetimin yanılmasını, unutmasını ve yapmak üzere zorlandıkları şeyleri bana bağışlamıştır.\"\n" +
                "\n" +
                "\"Rabbimiz, bizden öncekilere yüklediğin gibi bize ağır yük yükleme!\" Yani İs-railoğullan gibi bizden önce geçmiş ümmetlere yüklediğin gibi -güç yetirecek olsak dahi- ağır işler yapmayı bize yükleme. Meselâ İsrailoğullan'nın tevbesinin kabulü tevbe eden kimsenin kendini öldürmesi ile oluyordu. Zekât olarak malın dörtte birini vermeleri, necis olduğu vakit elbiseden necasetin bulaştığı yeri kesmeleri istenmişti. Resulullah (s.a.)'m risaletinde ise hafifletme, kolaylaştırma, müsamaha ve kolaylık vardır. Çünkü o bütün ümmetlere bağışlanmış rahmet peygamberidir. el-Hatîb ve başkalarının Hz. Cabir'den rivayetine göre Resulullah (s.a.) şöyle buyurmuştur: \"Ben müsamahakâr, Hanîfdini ile gönderilmiş bulunuyorum.\"\n" +
                "\n" +
                "\"Rabbimiz güç yetiremeyeceğimiz şeyi bize yükleme.\" Yani altından kalkamayacağımız sorumluluklarla musibet ve belâlarla bizi yükümlü tutma. Güç yetiremeyeceğimiz fitnelere bizi müptelâ kılma. \"Bizi affet!\" Senin bildiğin bizimle senin arandaki kusur ve yanılmalarımızı affet! \"Bize mağfiret buyur!\" Bizimle senin kulların arasındaki günahları bağışla! Onları kusurlarımıza ve çirkin amellerimize muttali kılma. \"Bize merhamet eyle!\" Gelecekte karşılaşacağımız hallerde sen tevfikinde bizleri bir diğer günaha düşmekten koru!\n" +
                "\n" +
                "Dikkat edilecek olursa, unutma ve yanılmadan dolayı sorumlu tutulmamak arkasından affedilmeyi, ağır yükün yükletilmemesi de mağfireti gerektirir. Güç yetirilemeyen şeylerin yükletilmemesi de merhameti gerektirir.\n" +
                "\n" +
                "\"Sensin bizim Mevlâmız!\" İşlerimizin maliki ve yardımcımız sensin. Sana güvenip dayandık. Yardımı senden isteriz. Dayanağımız sensin. Bütün güç ve takatimiz ancak seninledir.\n" +
                "\n" +
                "\"Kâfirler topluluğuna karşı da bize yardım et!\" Senin dinini reddeden, vahdaniyetini ve peygamberinin risaletini inkâr eden, senden başkasına ibadet eden, seninle birlikte kullarının bir kısmını sana ortak koşanlara karşı bizlere yardım et, bizi onlara karşı muzaffer kıl! Dünya ve ahirette onlara karşı güzel akıbet bizim olsun. Muaz (r.a.) bu sureyi bitirdiğinde \"âmin\" derdi.\n" +
                "\n" +
                "Yüce Allah bu duayı kabul edeceğine dair teminat vermiştir. Müslim'in Sahih'iade Ebu Hureyre'den Resulullah (s.a.)'ın şöyle buyurduğu rivayet edilmiştir: \"Allah, (Evet) kabul ettim, diye buyurdu.\" İbni Abbas'tan da şöyle rivayet edilmiştir: Resulullah (s.a.) dedi ki: \"Allah, 'Bunu yaptım (duanızı kabul ettim)'diye buyurdu.\" [154] \n" +
                "\n" +
                "\n" +
                "\n" +
                "Ayetlerden Çıkan Hüküm Ve Hikmetler \n" +
                "\n" +
                "\n" +
                "Bu iki ayet-i kerime aşağıdaki hususlara delâlet etmektedir:\n" +
                "\n" +
                "1- İman parçalanma kabul etmez. Müminin Allah'ın vahiy olarak bildirdiği her şeye iman etmesi gerekir. Müminler Allah'ın bir, ehad, tek ve samed olduğuna, O'ndan başka ilâh, O'nun dışında rab olmadığına iman ederler. Bütün peygamberlere, rasullere, semadan Allah'ın rasullerine ve peygamberlerine indirilen kitaplara iman ederler, onları tasdik ederler. Peygamberlerden birini diğerinden ayırarak kimine iman edip kimini inkâr etmezler. Aksine onlara göre bütün peygamberler doğru söylemiştir ve iyilik getirmişlerdir. Doğru yoldadırlar, hidayet bulmuşlardır ve insanları hayır yollarına iletenlerdir.\n" +
                "\n" +
                "Müminler peygamberlerin kimine iman edip kimisini inkâr eden Yahudi ve Hristiyanlar gibi değillerdir.\n" +
                "\n" +
                "2- İman itaat etmeyi gerektirir. Allah'a iman eden kimse O'nun huzuruna çıkılacağının doğruluğuna inanır, O'nun emirlerini dinler, itaat eder, yasaklarından kaçınır. Farzları işlemekte kusur etmez, herhangi bir masiyete gömülmez. Çünkü böylesi bir hareket iman ile çatışır.\n" +
                "\n" +
                "3- İslâm kolaylık dinidir. Mükellefiyetlerin, farzların, vaciplerin fazlalığı, buna karşılık mükellefiyetlerin kolaylığı, zor ameller ile mükellef tutmaması gibi özelliklere ve üstünlüklere sahiptir. Takatin üstünde bir mükellefiyet yoktur. Mükellefiyet güç ve kudret oranındadır. İtaat de takat ölçüsündedir. Yüce Allah bir dereceye kadar zorluk bulunan bazı işleri yapmakla mükellef tutabilir; fakat bunlar âdeten güç yetirilebilen ve katlanılabilen zorluklardır. Müslümanların az oldukları zamanlarda, İslâm'ın ilk dönemlerinde on kâfire karşı tek bir Müslümanın sebat göstermesi, insanın hicret etmesi ve vatanından çıkması, ailesinden, vatanından, âdetlerinden ayrılması gibi. Ağır gelen zorluklar ve acı veren işler ise bizden kaldırılmıştır. Bizden önceki ümmetlere bunların bir kısmı mükellefiyet olarak verilmiştir. Tevbe dolayısıyla kendilerini öldürmek ve sidik vb. bulaşmış necasetli yerleri elbiselerinden ve derilerinden kesmekle mükellef tutulmaları gibi. Hamd Allah'adır, minnet duygularımız O'na-dır, lütuf ve nimet O'ndandır.\n" +
                "\n" +
                "Kısacası, Yüce Allah'ın, \"Allah hiç bir kimseye gücünün yeteceğinden başkasını yüklemez\" buyruğu Yüce Allah'ın hiç bir kimseye, güç yetiremeyeceği, altından kalkamayacağı şeylerle yükümlü tutmayacağına dair açık bir nastır. Herhangi bir kimseye güç yetiremeyeceği bir teklifte bulunacak olsaydı, Yüce Allah o kimsenin gücü çerçevesinde olmayan şeyleri yapmakla onu mükellef tutmuş olurdu. Bu(nun böyle olmaması) dinin önemli bir esasıdır ve İslâm hükümlerinden önemli bir hükümdür.\n" +
                "\n" +
                "Bu fiilen vaki olan durum açısından böyledir. Aklen bunun caiz olup olmamasına gelince: Eş'ariler (aklen) güç yetirilemeyenin teklifinin imkânsız olmadığı görüşündedirler. Şeran böyle bir şey vuku bulmamış olsa bile bu, aklen mümkündür, derler.\n" +
                "\n" +
                "4- Şahsî Mes'uliyet. Yüce Allah'ın, \"Kazandığı kendisine, yaptığı da onun aleyhinedir\" buyruğuna göre kazandıkları iyilikler insanın lehine, kazandığı kötülükler ise aleyhinedir. Yüce Allah'ın şu buyruğunda olduğu gibi: \"Hiç bir yük yüklenen (nefis) diğerinin yükünü yüklenmez.\" (En'âm, 6/164); \"Her nefis (günahtan) ne kazanırsa ancak kendi aleyhine kazanır.\" (En'âm, 6/164).\n" +
                "\n" +
                "İbni Merdûveyh, İbni Abbas'tan şöyle dediğini rivayet etmektedir: Resulullah (s.a.) Bakara suresinin sonu ile Ayetül-Kürsî'yi okuduğu vakit güler ve şöyle derdi: \"Bunlar Arşın altında Rahman'ın hazinesindendir. Her kim bir kötülük işlerse onun karşılığını görür.\" (Nisa, 4/123) ile \"İnsan için çalıştığından başkası yoktur. Onun çalışmasının karşılığı) görülecektir; sonra da onun karşılığı eksiksiz bir şekilde ona verilecektir.\" (Necm, 53/39-41). Bunları okuyunca da istircada bulunur (innâ lillâh ve innâ ileyhi râciûn) der ve huzurla boyun eğerdi.\"\n" +
                "\n" +
                "5- \"Kazandığı kendisine, yaptığı da onun aleyhinedir\" buyruğu kulların fiilleri hakkında \"kesb (mealdeki ifadesiyle kazanmak)\" ve \"iktisâb (aleyhte kazanç)\" tabirlerinin kullanılacağını göstermektedir. Ayrıca taş ve ağaç parçası gibi ağır bir şey ile başkasmı öldürenin yahut bir şeyle boğarak veya suda boğarak öldürenin kısas veya diyet ile bu suçunun cezasını çekeceğine delildir.\n" +
                "\n" +
                "Ancak bu, bir cinayetin diyetinin âkile (kabile, meslek grubu v.s. yakınları tarafından) ödenmesini öngören Ebu Hanife'nin görüşüne muhaliftir. Ayrıca onun bu görüşü zahire de aykırıdır. Yine bu ayet-i kerime, oğlunu öldüren babadan kısasın düşmesinin, cinayette ona ortaklık edenden de cezanın düşmesini gerektirmediğini göstermektedir. Yine Ebu Hanife'ye hilâfen, Malikîlerin görüşüne göre, babanın ortağına da kısas icap eder. Şafiî ve Ebu Hanife'ye hilâfen hata yoluyla öldürene ortak olana da kısas düşer. Yine ayet-i kerime bir deliye kendisini teslim ettiği takdirde âkil ve baliğ kadına haddi uygulamanın vacip olduğuna da delildir.\n" +
                "\n" +
                "6- Unutmak ve yanılmaktan dolayı günahın kaldırılması. Ayet-i kerime unutma ve yanılma hallerinde günahın kaldırıldığının delilidir. Bunlarla alâkalı dünyevî hükümlere gelince; doğru olan, vakıalara göre farklılık gösterebilecekleridir. Bir kısım hükümler ittifakla kalkmaz; tazminatlar, diyetler, farz namazlar gibi. Bir kısmı da ittifakla düşer; kısas ve küfür sözünü söylemek gibi. Üçüncü bir kısım hakkında ise görüş ayrılığı vardır. Ramazan ayında unutarak yemek yiyen yahut unutarak yeminini bozan gibi. Bu kullara dair hükümler ile insanlara dair hakların, -Nisa suresinde de açıklanacağı üzere- sabit olduğunu göstermektedir \n" +

                  "\n";
        tv_tefsiri.setText(fazilet_metin);


        AdView mAdView = (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
    }
}
