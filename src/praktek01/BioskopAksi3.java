/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktek01;

/**
 *
 * @author Rizqy
 */
public class BioskopAksi3 {
    public static void main(String[] args) {
        Bioskop Cineplex = new Bioskop();
        
        Cineplex.Nama_Bioskop="Cineplex Balikpapan";
        Cineplex.Jadwal="Rabu";
        Cineplex.Harga=50000;
        Cineplex.Tempat_Duduk="B7";
        Cineplex.Jenis_Film="Romantis";
        
        Cineplex.cetakInfo();
    }
}
