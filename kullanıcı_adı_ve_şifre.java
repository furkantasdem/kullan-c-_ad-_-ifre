package days.day4;

import java.util.Scanner;

public class kullanıcı_adı_ve_şifre {
    public static void main(String[] args) {
        String sys_kul_adı = "tekel";

        String parola = "furkan";

        Scanner scan = new Scanner(System.in);
        System.out.println("kulanıcı adı");

        String kulanıcı_adı = scan.nextLine();
        System.out.println("parola");
        String kul_parola = scan.nextLine();
         if ( !(sys_kul_adı.equals(kulanıcı_adı)) && ! (parola.equals(kul_parola))) {
             System.out.println("kulanıcı adı ve parola yanlış");

         }
         else if ((sys_kul_adı.equals(kulanıcı_adı)) && ! (parola.equals(kul_parola))) {
             System.out.println(" parola yanlış");
         }

         else if (! ((sys_kul_adı.equals(kulanıcı_adı)) &&  (parola.equals(kul_parola)))) {
             System.out.println("kulanıcı adı yanlış ");
         }
         else {
             System.out.println("giriş başaırlı......");
         }
    }
    }

