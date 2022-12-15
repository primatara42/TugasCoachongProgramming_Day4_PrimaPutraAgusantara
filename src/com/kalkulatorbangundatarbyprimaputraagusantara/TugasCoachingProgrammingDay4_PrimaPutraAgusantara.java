package com.kalkulatorbangundatarbyprimaputraagusantara;

import java.text.DecimalFormat;
import java.util.Scanner;

class Main
{
    static Scanner input = new Scanner(System.in);
    static DecimalFormat df = new DecimalFormat("0.00");

    public static void main(String[] args)
    {
        int pilihan;
        String ulang;

        do
        {
            System.out.println("== Hitung Luas Bangun Datar ==");
            System.out.println("1. Persegi");
            System.out.println("2. Persegi Panjang");
            System.out.println("3. Segitiga");
            System.out.println("4. Lingkaran");

            System.out.print("Masukkan Input : ");
            pilihan = input.nextInt();

            menu(pilihan);

            System.out.print("Apakah anda ingin menghitung lagi? (Y/N): ");
            ulang = input.next();

            if(ulang.equalsIgnoreCase("N"))
            {
                System.out.println("Terima Kasih telah menggunakan kalkulator bangun datar.");
            }
        } while(ulang.equalsIgnoreCase("y"));
    }

    public static void menu(int pilihan)
    {
        switch (pilihan)
        {
            case 1 ->
            {
                Persegi persegiInstance = new Persegi();
                persegiInstance.persegi();
            }
            case 2 ->
            {
                PersegiPanjang persegiPanjangInstance = new PersegiPanjang();
                persegiPanjangInstance.persegiPanjang();
            }
            case 3 ->
            {
                Segitiga segitigaInstance = new Segitiga();
                segitigaInstance.segitiga();
            }
            case 4 ->
            {
                Lingkaran lingkaranInstance = new Lingkaran();
                lingkaranInstance.lingkaran();
            }
        }
    }
}

class Persegi
{
    public void persegi()
    {
        double panjangSisi, luas;

        System.out.println("== Hitung Luas Persegi ==");
        System.out.print("Masukkan Panjang Sisi : ");
        panjangSisi = Main.input.nextDouble();
        luas = getLuasPersegi(panjangSisi);
        luas = Double.parseDouble(Main.df.format(luas));
        System.out.println("Luas Persegi : " + luas);
    }

    public static double getLuasPersegi(double panjangSisi)
    {
        return panjangSisi * panjangSisi;
    }
}

class PersegiPanjang
{
    public void persegiPanjang()
    {
        double panjang, lebar, luas;

        System.out.println("== Hitung Luas Persegi Panjang ==");
        System.out.print("Masukkan Panjang : ");
        panjang = Main.input.nextDouble();
        System.out.print("Masukkan Lebar : ");
        lebar = Main.input.nextDouble();

        luas = getLuasPersegiPanjang(panjang, lebar);
        luas = Double.parseDouble(Main.df.format(luas));
        System.out.println("Luas Persegi Panjang : " + luas);
    }

    public static double getLuasPersegiPanjang(double panjang, double lebar)
    {
        return panjang * lebar;
    }
}

class Segitiga
{
    public void segitiga()
    {
        System.out.println("== Hitung Luas Segitiga ==");
        double alas, tinggi, luas;

        System.out.print("Masukkan Alas : ");
        alas = Main.input.nextDouble();

        System.out.print("Masukkan Tinggi : ");
        tinggi = Main.input.nextDouble();

        luas = getLuasSegitiga(alas, tinggi);
        luas = Double.parseDouble(Main.df.format(luas));
        System.out.println("Luas Segitiga : " + luas);
    }

    public static double getLuasSegitiga(double alas, double tinggi)
    {
        return (alas * tinggi) / 2;
    }
}

class Lingkaran
{
    public void lingkaran()
    {
        System.out.println("== Hitung Luas Lingkaran ==");
        double jari2, luas;

        System.out.print("Masukkan Jari-Jari : ");
        jari2 = Main.input.nextDouble();
        luas = getLuasLingkaran(jari2);
        luas = Double.parseDouble(Main.df.format(luas));
        System.out.println("Luas Lingkaran : " + luas);
    }

    public static double getLuasLingkaran(double jari2)
    {
        return 3.14 * jari2 * jari2;
    }
}

