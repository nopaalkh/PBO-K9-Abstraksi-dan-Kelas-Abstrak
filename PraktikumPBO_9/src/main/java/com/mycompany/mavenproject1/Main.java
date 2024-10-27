/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject1;

/**
 *
 * @author ASUS
 */
// Definisi kelas abstrak
abstract class Kendaraan {
    // Metode abstrak
    abstract void berjalan();
    
    // Metode dengan implementasi
    void info() {
        System.out.println("Ini adalah kendaraan.");
    }
}

// Kelas turunan dari Kendaraan
class Mobil extends Kendaraan {
    @Override
    void berjalan() {
        System.out.println("Mobil sedang berjalan dengan cepat.");
    }
}

class Sepeda extends Kendaraan {
    @Override
    void berjalan() {
        System.out.println("Sepeda sedang berjalan dengan pelan.");
    }
}

// Kelas turunan baru
class Motor extends Kendaraan {
    @Override
    void berjalan() {
        System.out.println("Motor sedang melaju dengan kecepatan sedang.");
    }
}

// Kode utama untuk pengujian
public class Main {
    public static void main(String[] args) {
        Kendaraan mobil = new Mobil();
        Kendaraan sepeda = new Sepeda();
        Kendaraan motor = new Motor(); // Objek baru dari kelas Motor
        
        mobil.berjalan();
        mobil.info();
        
        sepeda.berjalan();
        sepeda.info();
        
        motor.berjalan();
        motor.info(); // Menggunakan metode info() dari kelas Kendaraan
    }
}
