import java.util.Scanner;

public class SesDurumu {
    static int ses = 3;
    public static int sesDurumu(){

        Scanner input = new Scanner(System.in);
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
        return ses;
    }
}
