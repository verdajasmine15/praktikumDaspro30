import java.util.Scanner;
public class StudiKasus2_30 {
    public static void main(String[] args) {
        Scanner mine = new Scanner (System.in);

        System.out.println("Nama Mahasiswa:");
        String namaMahasiswa = mine.nextLine(). trim();
        System.out.println("Jenis Kegiatan (BELMAWA/BAKORMA/MANDIRI/PKM/LAINNYA):");
        String jenisKegiatan = mine.nextLine().trim();
        System.out.println("Jumlah dokumen yang diupload");
        int jumlahDokumen = mine.nextInt();
        System.out.println("Peringkat Juara:");
        int peringkatJuara = mine.nextInt();
        int dokumenKurang;


        dokumenKurang = 4 - jumlahDokumen;


        if (jenisKegiatan.equalsIgnoreCase("BELMAWA") || jenisKegiatan.equalsIgnoreCase("BAKORMA")
        || jenisKegiatan.equalsIgnoreCase("MANDIRI")) {
                if (peringkatJuara >= 1 || peringkatJuara <=3) {
                if (jumlahDokumen == 4){

                } else {
                    dokumenKurang = 4 - jumlahDokumen;
                    System.out.println("Dokumen Tidak Lengkap: kurang" + dokumenKurang);
                } 
            } else { 
                System.out.println("Peringkat juara tidak valid, dana tidak diberikan");

            } 
            
        } else if (jenisKegiatan.equalsIgnoreCase("PKM")) {
             System.out.println("Status Pendanaan: (lolos = 1 Tidak lolos = 0)");
                    int statusPendanaan = mine.nextInt();
                if (statusPendanaan == 1) {

                } else {
                    System.out.println("Status pendanaan tidak lolos, dana tidak diberikan");
                }
            } else { 
                System.out.println("Dana penghargaan tidak diberikan");
            }
         
        mine.close();

    
    }
}