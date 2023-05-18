import java.util.Scanner;

public class KanalDegistirme {
    public static void kanalDegistirme(){
        System.out.println("Mevcut kanal : " + Kanallar.kanallar[Units.kanal-1]);
        System.out.print("Kanal değiştirmek için ( + / - ) : ");
        Scanner input = new Scanner(System.in);
        String kanalDegistirme = input.next();
        if (kanalDegistirme.equals("+")){
            Units.kanal ++;
            System.out.println("Yeni Kanal : " + Kanallar.kanallar[Units.kanal-1]);
        }else if (kanalDegistirme.equals("-")){
            Units.kanal --;
            System.out.println("Yeni Kanal : " + Kanallar.kanallar[Units.kanal-1]);
        }
    }
}
