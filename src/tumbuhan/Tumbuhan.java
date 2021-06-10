
package tumbuhan;

/**
 *
 * @author zulfarm
 */
public class Tumbuhan {

    public static void main(String[] args) {
        //Membuat objek
        Jenis x = new Jenis();
        //Menggunakan Method setter
        x.setBunga("Melati");
        x.setumur("3 Bulan");
        x.setPohon("Cemara");
        x.setUmur("1 Tahun");
        // menggunakan method getter
        System.out.println("Data Tumbuhan");
        System.out.println("=============================");
        System.out.println("Nama Bunga : "+x.getBunga());
        System.out.println("Umur Bunga :"+ x.getumur());
        System.out.println("=============================");
        System.out.println("Nama Pohon :"+x.getPohon());
        System.out.println("Umur Pohon :"+x.getUsia());
    }
    
}
