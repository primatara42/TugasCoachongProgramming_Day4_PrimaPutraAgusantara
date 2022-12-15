package com.kalkulatorbangundatarbyprimaputraagusantara;

import java.text.DecimalFormat;
import java.util.Scanner;

class Main1
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
            System.out.println("1. com.kalkulatorbangundatarbyprimaputraagusantara.Persegi");
            System.out.println("2. com.kalkulatorbangundatarbyprimaputraagusantara.Persegi Panjang");
            System.out.println("3. com.kalkulatorbangundatarbyprimaputraagusantara.Segitiga");
            System.out.println("4. com.kalkulatorbangundatarbyprimaputraagusantara.Lingkaran");

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

        System.out.println("== Hitung Luas com.kalkulatorbangundatarbyprimaputraagusantara.Persegi ==");
        System.out.print("Masukkan Panjang Sisi : ");
        panjangSisi = Main1.input.nextDouble();
        luas = getLuasPersegi(panjangSisi);
        luas = Double.parseDouble(Main1.df.format(luas));
        System.out.println("Luas com.kalkulatorbangundatarbyprimaputraagusantara.Persegi : " + luas);
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

        System.out.println("== Hitung Luas com.kalkulatorbangundatarbyprimaputraagusantara.Persegi Panjang ==");
        System.out.print("Masukkan Panjang : ");
        panjang = Main1.input.nextDouble();
        System.out.print("Masukkan Lebar : ");
        lebar = Main1.input.nextDouble();

        luas = getLuasPersegiPanjang(panjang, lebar);
        luas = Double.parseDouble(Main1.df.format(luas));
        System.out.println("Luas com.kalkulatorbangundatarbyprimaputraagusantara.Persegi Panjang : " + luas);
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
        System.out.println("== Hitung Luas com.kalkulatorbangundatarbyprimaputraagusantara.Segitiga ==");
        double alas, tinggi, luas;

        System.out.print("Masukkan Alas : ");
        alas = Main1.input.nextDouble();

        System.out.print("Masukkan Tinggi : ");
        tinggi = Main1.input.nextDouble();

        luas = getLuasSegitiga(alas, tinggi);
        luas = Double.parseDouble(Main1.df.format(luas));
        System.out.println("Luas com.kalkulatorbangundatarbyprimaputraagusantara.Segitiga : " + luas);
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
        System.out.println("== Hitung Luas com.kalkulatorbangundatarbyprimaputraagusantara.Lingkaran ==");
        double jari2, luas;

        System.out.print("Masukkan Jari-Jari : ");
        jari2 = Main1.input.nextDouble();
        luas = getLuasLingkaran(jari2);
        luas = Double.parseDouble(Main1.df.format(luas));
        System.out.println("Luas com.kalkulatorbangundatarbyprimaputraagusantara.Lingkaran : " + luas);
    }

    public static double getLuasLingkaran(double jari2)
    {
        return 3.14 * jari2 * jari2;
    }
}

