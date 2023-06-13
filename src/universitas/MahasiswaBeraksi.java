
package universitas;


public class MahasiswaBeraksi {
    public static void main (String[] args){
         // Membuat objek mahasiswa
        Mahasiswa mhs = new Mahasiswa("12345", "John Doe", "Informatika");

        // Mengakses dan mencetak informasi mahasiswa
        System.out.println("NPM: " + mhs.getNpm());
        System.out.println("Nama: " + mhs.getNama());
        System.out.println("Prodi: " + mhs.getProdi());

        // Mengubah informasi mahasiswa menggunakan setter
        mhs.setNpm("54321");
        mhs.setNama("Muhammad siddiq");
        mhs.setProdi("Tekologi Informasi");

        // Mencetak informasi mahasiswa setelah diubah
        System.out.println("NPM: " + mhs.getNpm());
        System.out.println("Nama: " + mhs.getNama());
        System.out.println("Prodi: " + mhs.getProdi());
    
    }
}
