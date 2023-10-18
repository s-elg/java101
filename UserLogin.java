package assignments;

import java.util.Scanner;

public class UserLogin {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        String userName, password; //değişkenler tanımlandı
        int choice;


        System.out.print("lütfen kullanıcı adınızı giriniz: "); //kullanıcıdan kullanıcı adı istendi
        userName = input.nextLine();

        System.out.print("lütfen şifrenizi giriniz: "); //kullanıcıdan şifre istendi
        password = input.nextLine();

        if (userName.equals("william") && password.equals("java321")) { //doğru olması durumunda yapılacaklar
            System.out.println("sisteme başarıyla giriş yaptınız!");
        } else if (!(userName.equals("william")) && password.equals("java321")) { //sadece kullanıcı adı yanlış olması durumunda yapılması gerekenler
            System.out.println("kullanıcı adınızı yanlış girdiniz. lütfen tekrar deneyiniz!");
        } else if (!(userName.equals("william")) && !(password.equals("java321"))) { //iki verinin de yanlış olması durumunda yapılması gerekenler
            System.out.println("kullanıcı adınızı ve şifrenizi yanlış girdiniz. lütfen tekrar deneyiniz!");
        } else if (userName.equals("william") && !(password.equals("java321"))) { //şifresi yanlış olduğunda yapılması gerekenler. kullanıcının önüne iki seçenek sunuyoruz. eğer seçenek 1'i seçerse, şifre değişimine gidilecek, eğer 2'yi seçerse anasayfaya geri döndürülecek
            System.out.println("şifrenizi yanlış girdiniz! değiştirmek isterseniz 1'i, anasayfaya dönmek için 2'yi girinz.");
            System.out.print("seçiminiz: ");
            choice = input.nextInt();
            input.nextLine(); //int türünde kullanıcıdan veri alındığında aşağıdaki şifreyi alma kısmını okumuyordu. stackoverflowda çözümü böyle verilmişti.

            if (choice == 1) {
                System.out.print("yeni şifrenizi giriniz: "); //yeni şifre alındı
                String newPassword = input.nextLine();

                if (newPassword.equals("java321")) {
                    System.out.println("girdiğiniz şifre eski şifrenizle aynı olmamalıdır."); //aynı şifre girildiğinde uyarı veriyoruz.
                } else {
                    System.out.println("şifreniz başarıyla değiştirilmiştir!");
                }
            } else if (choice == 2) {
                System.out.println("anasayfaya yönlendiriliyorsunuz. "); //şifreyi değiştirmemeyi tercih ettilerse anasayfaya dönüyor.
            } else {
                System.out.println("lütfen 1 ya da 2'yi tuşlayınız."); //kullanıcının 1 ve 2 dışında bir şeyi seçmemesini istiyoruz.
            }
        }
    }
}
