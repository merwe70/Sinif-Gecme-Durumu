import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int mat, fizik, turkce, kimya, muzik, avarage;

        Scanner input=new Scanner(System.in);
        System.out.print("Matematik Ders Notunuzu Giriniz : ");
        mat=input.nextInt();

        System.out.print("Fizik Ders Notunuzu Giriniz : ");
        fizik=input.nextInt();

        System.out.print("Türkçe Ders Notunuzu Giriniz : ");
        turkce = input.nextInt();

        System.out.print("Kimya Ders Notunuzu Giriniz : ");
        kimya=input.nextInt();

        System.out.print("Müzik Ders Notunuzu Giriniz : ");
        muzik=input.nextInt();


        avarage = mat +  fizik + turkce + kimya + muzik;

        if (avarage>=0 || avarage<=100){

            System.out.print("Ortamalanız : " + avarage/5);
        }
        else {
            System.out.print("Ortamalaya giremediğinizden Hesaplama Yapılmadı");
        }

    }
}