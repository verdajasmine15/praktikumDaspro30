import java.util.Scanner;
public class StudiKasus1_30 {
    public static void main(String[] args) {
        Scanner mine = new Scanner (System.in);

        int hargaPerCup = 18000;
        int totalHarga, diskon, totalBayar;
        int kembalian, kurang;

        
        System.out.println("Masukkan jumlah Cup:");
        int jumlahCup = mine.nextInt();
        System.out.println("Masukkan Uang Bayar");
        int uangBayar = mine.nextInt();

        totalHarga = jumlahCup * hargaPerCup;
        diskon = 0;
        totalBayar = totalHarga - diskon;
        kembalian = uangBayar - totalBayar;
        kurang = totalBayar - uangBayar;
        System.out.println("Total Harga:" + totalHarga);
        System.out.println("Diskon:" + diskon);
        System.out.println("Total Bayar:" + totalBayar);



        if (totalHarga >= 100000) {
            diskon = totalHarga * 10 / 100;
        } 
        if (uangBayar >= totalBayar) {
            System.out.println("Kembalian:" + kembalian);
        } 
        else {
           System.out.println("Uang tidak cukup, kurang Rp" + kurang);
        }
    mine.close();
}
}
