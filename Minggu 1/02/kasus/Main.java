import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int inIdSiswa, inKodeKelas;
        String inNamaKelas, inTanggal, inNama, inAlamat, inEmail;

        Scanner input = new Scanner(System.in);
        System.out.println("Input Jadwal Kelas Siswa");
        System.out.print("Masukkan ID Siswa = ");
        inIdSiswa = input.nextInt();
        input.nextLine();
        System.out.print("Masukan Nama Siswa = ");
        inNama = input.nextLine();
        System.out.print("Masukkan Alamat Siswa = ");
        inAlamat = input.nextLine();
        System.out.print("Masukkan Email Siswa = ");
        inEmail = input.nextLine();
        System.out.print("Masukkan Kode Kelas = ");
        inKodeKelas = input.nextInt();
        input.nextLine();
        System.out.print("Masukkan Nama Kelas = ");
        inNamaKelas = input.nextLine();
        System.out.print("Masukkan Tanggal = ");
        inTanggal = input.nextLine();

        Jadwal murid = new Jadwal(inIdSiswa, inNama, inAlamat, inEmail);
        murid.ambilKelas(inKodeKelas,inNamaKelas,inTanggal);
        murid.cetakJadwal();       
    }
}