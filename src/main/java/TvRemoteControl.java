import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/*
TV kumandası projesi
TV --> açma, kapatma
Ses --> arttırma, azaltma, kapatma, açma
kanal --> değiştirme (+ , -)
kanal --> ekleme, listeleme
kanala gitme --> kanal numarası girilecek
kanal uydu bilgisi --> Kanal adı: .........
                                    Uydu: ..................
                                    Frekans: .............
                                    Polarizasyon: .............
                                    Symbol Rate: ...............
                                    Fec: ....../......

ArrayList<String>[][] list = new ArrayList[][];
ArrayList<ArrayList<Integer> > array_list = new ArrayList<ArrayList<Integer> >();

[[kanal,uydu,frekans,polarizasyon,rate,fec],[kanal,uydu,frekans,polarizasyon,rate,fec],[kanal,uydu,frekans,polarizasyon,rate,fec]]
 */
public class TvRemoteControl {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int ses = 3;
        ArrayList<String> kanallar = new ArrayList<>(Arrays.asList("TRT","ATV","AHABER","TV8","FOX","SHOW"));
        int kanal = 1;
        System.out.println("*********Kumanda Menüsü********\n"+
                "Sesi Arttırma ve Azaltma --> 1\n" +
                "Kanal Değiştirmek İçin --> 2\n" +
                "Kanala Gitmek İçin     --> 3\n" +
                "Kanal Listesi İçin     --> 4\n" +
                "Kanal Eklemek İçin     --> 5\n" +
                "Kanal Uydu Bilgileri   --> 6\n" +
                "Çıkmak İçin            --> q\n" +
                "*******************************");
        while(true){

            System.out.print("Seçiminizi Giriniz : ");
            String secenek = input.next();
            if(secenek.equals("1")){
                System.out.println("Ses arttırmak için --> (+)\n" +
                        "Ses azaltmak için --> (-)\n" +
                        "Ses kapatmak için --> 0\n");
                String sesDurumu = input.next();
                if (sesDurumu.equals("+")){
                    ses ++;
                    System.out.println("Ses seviyesi : " + ses);
                } else if (sesDurumu.equals("-")) {
                    ses --;
                    System.out.println("Ses seviyesi : " + ses);
                } else if (sesDurumu.equals("0")) {
                    ses = 0;
                    System.out.println("TV sessize alındı.");
                }else {
                    System.out.println("Yanlış giriş.");
                }

            } else if (secenek.equals("2")) {
                System.out.println("Mevcut kanal : " + kanallar.get(kanal-1));
                System.out.print("Kanal değiştirmek için ( + / - ) : ");
                String kanalDegistirme = input.next();
                if (kanalDegistirme.equals("+")){
                    kanal ++;
                    System.out.println("Yeni Kanal : " + kanallar.get(kanal-1));
                }else if (kanalDegistirme.equals("-")){
                    kanal --;
                    System.out.println("Yeni Kanal : " + kanallar.get(kanal-1));
                }
            } else if (secenek.equals("3")) {
                System.out.println("kanala gidiliyor");
            } else if (secenek.equals("4")) {
                System.out.println("kanal listesi");
            } else if (secenek.equals("5")) {
                System.out.println("kanal ekleme");
            } else if (secenek.equals("6")) {
                System.out.println("kanal uydu bilgisi");
            } else if (secenek.equals("q")) {
                System.out.println("Çıkış yapıldı");
                break;
            }else{
                System.out.println("Yanlış Giriş Yaptınız");
            }
        }
    }
}

//muhammet branch oluşturdum değişiklikler kendi branchımda yapıldı .
///deneme yapiyorum stop
//muhammet değişiklik

// fatih degisiklik

// Ali Degisiklik
//sinem değişiklik
//beyza değişiklik
// fatih degisiklik
