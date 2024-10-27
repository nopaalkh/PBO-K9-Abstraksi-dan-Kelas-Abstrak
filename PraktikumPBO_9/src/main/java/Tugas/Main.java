/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas;

/**
 *
 * @author ASUS
 */
// Kelas abstrak Hewan
abstract class Hewan {
    // Metode abstrak yang harus diimplementasikan oleh kelas turunan
    abstract void suara();
}

// Kelas Kucing yang merupakan turunan dari Hewan
class Kucing extends Hewan {
    // Implementasi metode suara() untuk Kucing
    @Override
    void suara() {
        System.out.println("Kucing mengeluarkan suara: Meong");
    }
}

// Kelas Anjing yang merupakan turunan dari Hewan
class Anjing extends Hewan {
    // Implementasi metode suara() untuk Anjing
    @Override
    void suara() {
        System.out.println("Anjing mengeluarkan suara: Guk Guk");
    }
}

// Kelas utama untuk menjalankan program
public class Main {
    public static void main(String[] args) {
        // Membuat objek Kucing dan Anjing
        Hewan kucing = new Kucing();
        Hewan anjing = new Anjing();
        
        // Memanggil metode suara() untuk masing-masing hewan
        kucing.suara();
        anjing.suara();
    }
}

