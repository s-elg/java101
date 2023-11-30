package assignments;

import java.util.Scanner;
public class AtmProgrami {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String userName, password;
        int right = 3;
        int balance = 1500;
        int select;

        while (right > 0) {
            System.out.print("kullanıcı adınızı giriniz: ");
            userName = scan.nextLine();
            System.out.print("şifrenizi girinz: ");
            password = scan.nextLine();
            if (userName.equals("patika") && password.equals("dev123")) {
                System.out.println("tebrikler, başarıyla giriş yaptınız!");
                do {
                    System.out.println("1-para çekme\n" + "2-para yatırma\n" + "3-bakiye sorgulama\n" + "4-çıkış");
                    System.out.print("lütfen yapmak istediğiniz işlemi seçiniz: ");
                    select = scan.nextInt();
                    switch (select) {
                        case 1:
                            System.out.print("lütfen çekmek para miktarını giriniz: ");
                            int price = scan.nextInt();
                            if (balance < price) {
                                System.out.println("bakiyeniz yetersiz");
                            } else {
                                balance-=price;
                                System.out.println("işlem başarıyla tamamlandı");
                            }
                            break;
                        case 2:
                            System.out.print("lütfen yatırmak istediğiniz para miktarını giriniz: ");
                            int amount = scan.nextInt();
                            balance+=amount;
                            System.out.println("işlem başarıyla tamamlandı");
                            break;
                        case 3:
                            System.out.println("bakiyeniz: " + balance);
                            break;
                    }
                } while (select != 4);
                System.out.println("tebrikler, çıkış yaptınız.");
                break;
            } else {
                right--;
                if (right == 0) {
                    System.out.println("giriş hakkınız kalmadı ve hesabınız bloke edildi. lütfen bankanızla giriş yapınız.");
                } else {
                    System.out.println("yanlış bilgi giriniz. lütfen tekrar deneyiniz. (kalan giriş hakkınız: " + right + ")");
                }
            }
        }
    }
}
