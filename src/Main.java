import java.util.Scanner;

public class Main
{
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args)
    {
        persegi();
    }

    public static void persegi()
    {
        double panjangSisi = 0;
        System.out.println("== Hitung Luas Persegi ==");
        System.out.print("Masukkan Panjang Sisi : ");
        panjangSisi = input.nextDouble();
        double luasPersegi = luasPersegi(panjangSisi);
        System.out.println("Luas Persegi : " + luasPersegi);
    }

    public static double luasPersegi(double panjangSisi)
    {
        double luasPersegi = panjangSisi * panjangSisi;
        return luasPersegi;
    }


}