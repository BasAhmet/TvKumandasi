import java.util.Scanner;

public class KanalDegistirme {
    public static int kanal = 1;
    public static void kanalDegistirme(){
        System.out.println("Mevcut kanal : " + Kanallar.kanallar[kanal-1]);
        System.out.print("Kanal değiştirmek için ( + / - ) : ");
        Scanner input = new Scanner(System.in);
        String kanalDegistirme = input.next();
        if (kanalDegistirme.equals("+")){
            kanal ++;
            System.out.println("Yeni Kanal : " + Kanallar.kanallar[kanal-1]);
        }else if (kanalDegistirme.equals("-")){
            kanal --;
            System.out.println("Yeni Kanal : " + Kanallar.kanallar[kanal-1]);
        }
    }
}
