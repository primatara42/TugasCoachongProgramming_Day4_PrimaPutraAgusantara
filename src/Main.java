import java.util.Scanner;

public class Main
{
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args)
    {
        persegiPanjang();
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

    public static void persegiPanjang()
    {
        System.out.println("== Hitung Luas Persegi Panjang ==");
        double panjang, lebar, luas;
        System.out.print("Masukkan Panjang : ");
        panjang = input.nextDouble();
        System.out.print("Masukkan Lebar : ");
        lebar = input.nextDouble();
        luas = luasPersegiPanjang(panjang, lebar);
        System.out.println("Luas Persegi Panjang : " + luas);
    }

    public static double luasPersegiPanjang(double panjang, double lebar)
    {
        return panjang * lebar;
    }
}