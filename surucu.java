import java.util.Scanner;
public class surucu {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        int yas;

        System.out.println("Lütfen yaşınızı giriniz : ");
        yas = input.nextInt();

        if( yas > 18 ){
            System.out.println("Ehliyet için yeterli yaştasınız :)");
        }

        else{
            System.out.println("Maalesef ehliyet almak için yeterli yaşta değilsiniz :( ");
        }

    }

}