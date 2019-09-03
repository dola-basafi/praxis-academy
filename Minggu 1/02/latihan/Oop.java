import java.util.Scanner;
public class Oop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //var temporary
        int tempNoId = 0;
        String tempNama = "";
        String tempAlamat = "";
        int tempKodeBarang = 0;
        int tempHarga = 0;
        String tempNamaBarang = "";
        int tempKodeTransaksi = 0;
        int tempBanyak = 0;

        //Proses menerima masukan
        System.out.println("======================================================");
        System.out.println("               Input data penjualan                   ");
        System.out.println("======================================================");
        System.out.print("Id Pelanggan : ");
        tempNoId = sc.nextInt();
        
        tempNama = sc.nextLine();
        System.out.print("Nama Pelanggan : ");
        tempNama = sc.nextLine();

        System.out.print("Alamat Pelanggan : ");
        tempAlamat = sc.nextLine();
        
        System.out.print("\nKode Barang : ");
        tempKodeBarang = sc.nextInt();
        
        tempNamaBarang = sc.nextLine();
        System.out.print("Nama Barang : ");
        tempNamaBarang = sc.nextLine();

        System.out.print("Harga Barang : ");
        tempHarga = sc.nextInt();

        System.out.print("\nKode Transaksi : ");
        tempKodeTransaksi = sc.nextInt();

        System.out.print("Banyak Barang : ");
        tempBanyak = sc.nextInt();

        //eksekusi
        Transaksi t = new Transaksi(tempNoId, tempNama, tempAlamat);
        t.setBarang(tempKodeBarang, tempNamaBarang, tempHarga);
        t.setTransaksi(tempKodeTransaksi, tempBanyak);

        //output hasil masukan dan mengeluarkan total belanja
        t.cetakStruk();
    }
}