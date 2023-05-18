import java.util.Scanner;

public class GidilecekKanal {
    public static void gidilecekKanal(){
        int kanalNo = 1;
        for (String w : Kanallar.kanallar ) {
            System.out.println(kanalNo + ". Kanal : " + w);
            kanalNo ++;
        }
        System.out.print("Gitmek istediğiniz kanalın numarasını giriniz : ");
        Scanner input = new Scanner(System.in);
        int kanalNumarasi = input.nextInt();
        Units.kanal = kanalNumarasi;
        System.out.println("Seçtiğiniz kanal : " + Kanallar.kanallar[Units.kanal-1]);
    }
}
