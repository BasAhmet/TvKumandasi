import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class TvRemoteControl {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        ArrayList<String> kanallar = new ArrayList<>(Arrays.asList("TRT","ATV","AHABER","TV8","FOX","SHOW"));

        KumandaMenusu.kumandaMenusu(); // Kumanda Menüsü

        while(true){

            System.out.print("Seçiminizi Giriniz : ");
            String secenek = input.next();
            if(secenek.equals("1")){

                SesDurumu.sesDurumu();

            } else if (secenek.equals("2")) {

                KanalDegistirme.kanalDegistirme();

            } else if (secenek.equals("3")) {

                GidilecekKanal.gidilecekKanal();

            } else if (secenek.equals("4")) {
                System.out.println("************ Kanal Listesi ***********");
                int kanalNo = 1;
                for (String w : kanallar ) {
                    System.out.println(kanalNo + ". Kanal : " + w);
                    kanalNo ++;
                }
            }
            /*
                else if (secenek.equals("5")) {
                System.out.println("*** Kanal Ekleme Sayfası ***");

                System.out.print("Kanal Adı : ");
                String kanalAdi = input.next();

                System.out.print("Kanal Uydusu : ");
                String kanalUydusu = input.next();


                System.out.println("kanal ekleme");
            } */
            else if (secenek.equals("6")) {
                try {
                    Kanallar.kanalBilgileri();
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
                /*
                System.out.println("**** Kanal Biligileri ****");
                for (int i = 0 ; i < kanalBilgileri.length ; i++){
                    System.out.print("\nKanal Adı : " + kanalBilgileri[i][0]);
                    System.out.print("\nUydu Adı : " + kanalBilgileri[i][1]);
                    System.out.print("\nFrekans : " + kanalBilgileri[i][2]);
                    System.out.print("\nPolarizasyon : " + kanalBilgileri[i][3]);
                    System.out.print("\nSymbol : " + kanalBilgileri[i][4]);
                    System.out.print("\nFec : " + kanalBilgileri[i][5]);
                    System.out.println("\n**********************");
                }
                */
            } else if (secenek.equals("q")) {
                System.out.println("Çıkış yapıldı");
                break;
            }else{
                System.out.println("Yanlış Giriş Yaptınız");
            }
        }
    }
}
 //Değişiklik yok

