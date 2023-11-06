import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        String ad="Arda";
        Scanner scn = new Scanner(System.in);
        System.out.println("Adınızı Giriniz : ");
        String h = scn.nextLine();
        System.out.println("Hoşgeldin" + h);

        System.out.println(yas);
        System.out.println(ad);
        System.out.println(soyad);
        System.out.println(sinifi);
        System.out.println(memleket);
        System.out.println("Ehliyet Almak İçin Yaş Giriniz");

        int yas = scn.nextInt();

        if (yas > 18){
            System.out.println("Ehliyet almak için uygun yaştasın");

    }
        else {
            System.out.println("Maalesef ehliyet alamazsın");
        }

        System.out.println("Sayı Giriniz");
        int gun = scn.nextInt();
        switch (gun){
            case 1:
                System.out.println("Pazartesi");
                break;
            case 2:
                System.out.println("Salı");
                break;
            case 3:
                System.out.println("Çarşamba");
                break;
            case 4:
                System.out.println("Perşembe");
                break;
            case 5:
                System.out.println("Cuma");
                break;
            case 6:
                System.out.println("Cumartesi");
                break;
            case 7:
                System.out.println("Pazar");
                break;
        }
    }
}