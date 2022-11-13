import java.util.Scanner;

public class Main {
    public static Scanner inp=new Scanner(System.in);
    static void plus()
    {
        int number,i=1,result=0;
        System.out.println("Sonucu almak için 0 değerini giriniz..!!");
        while(true)
        {
            System.out.print(i++ +". sayı: ");
            number=inp.nextInt();

            if (number==0)
                break;

            result+=number;
        }
        System.out.println("Sonuç: "+result);
    }
    static void minus()
    {
        int number,result=0,counter;
        System.out.print("Kaç adet sayı gireceksiniz: ");
        counter=inp.nextInt();

        for (int i=1; i<=counter; i++)
        {
            System.out.print(i+". sayı: ");
            number=inp.nextInt();
            if (i==1)
            {
                result=number;
                continue;
            }
                result-=number;
        }
        System.out.println("Sonuç: "+result);
    }
    static void times()
    {
        int number, result=1,i=1;
        System.out.println("Sonuç almak için 0 değerini giriniz..!!");
        while (true)
        {
            System.out.print(i++ +". sayı: ");
            number=inp.nextInt();
            if (number==0)
                break;
            result*=number;
        }
        System.out.println("Sonuç: "+result);
    }
    static void divided()
    {
        int counter;
        double number, result=0;
        System.out.print("Kaç adet sayı gireceksiniz: ");
        counter=inp.nextInt();
        for (int i=1; i<=counter; i++)
        {
            System.out.print(i+". sayı: ");
            number=inp.nextDouble();
            if (i!=1 && number==0)
            {
                System.out.println("Böleni 0 girmeyiniz..!!");
                continue;
            }
            if (i==1)
            {
                result=number;
                continue;
            }
            result/=number;
        }
        System.out.println("Sonuç: "+result);
    }
    static void power()
    {
        System.out.print("Taban değeri giriniz: ");
        int base=inp.nextInt();
        System.out.print("Üs değeri giriniz: ");
        int exponent=inp.nextInt();
        int result=1;
        for (int i=0; i<exponent; i++)
        {
            result*=base;
        }
        System.out.println("Sonuç: "+result);
    }
    static void factorial()
    {
        System.out.print("Faktoriyeli alınacak sayıyı giriniz: ");
        int number=inp.nextInt();
        int result=1;
        for (int i=1;i<=number;i++)
        {
            result*=i;
        }
        System.out.println("Sonuç: "+result);
    }
    static void mod()
    {
        System.out.print("İlk sayıyı giriniz: ");
        int n1=inp.nextInt();
        System.out.print("İkinci sayıyı giriniz: ");
        int n2=inp.nextInt();
        int result=n1%n2;
        System.out.println(n1+" sayısının "+n2+" sayısına bölümünden kalan: "+result);
    }
    static void rectangle()
    {
        System.out.print("Uzun kenar: ");
        int lSide=inp.nextInt();
        System.out.print("Kısa kenar: ");
        int sSide=inp.nextInt();
        System.out.println("Girilen kenar uzunluklarına göre dikdörtgenin alanı: "+(lSide*sSide));
        System.out.println("Girilen kenar uzunluklarına göre dikdörtgenin Çevresi: "+2*(lSide+sSide));
    }
    public static void main(String[] args) {

        int select;
        do {
            System.out.println("");
            System.out.println("------ İşlemler ------");
            System.out.println("1-Toplama\n" +
                    "2-Çıkarma\n" +
                    "3-Çarpma\n" +
                    "4-Bölme\n" +
                    "5-Üslü Sayı Hesaplama\n" +
                    "6-Faktöriyel Hesaplama\n" +
                    "7-Mod Alma\n" +
                    "8-Dikdörtgen Alan ve Çevre Hesabı\n" +
                    "0-Çıkış");
            System.out.print("Lütfen bir işlem seçiniz: ");
            select = inp.nextInt();
            switch (select) {
                case 1:
                    System.out.println("");
                    plus();
                    break;
                case 2:
                    System.out.println("");
                    minus();
                    break;
                case 3:
                    System.out.println("");
                    times();
                    break;
                case 4:
                    System.out.println("");
                    divided();
                    break;
                case 5:
                    System.out.println("");
                    power();
                    break;
                case 6:
                    System.out.println("");
                    factorial();
                    break;
                case 7:
                    System.out.println("");
                    mod();
                    break;
                case 8:
                    System.out.println("");
                    rectangle();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Hatalı giriş yaptınız. Lütfen tekrar deneyiniz..!!");
            }
        } while (select!=0);
        System.out.println("");
        System.out.println("Çıkış yapılıyor. İyi günler dileriz...");

    }
}