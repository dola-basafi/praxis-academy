
public class Jadwal extends Siswa implements Kelas {

    int kodeKelas;
    String namaKelas;
    String tanggal;

    public Jadwal(){ 
        
    }

    public Jadwal (int idSiswa, String nama, String alamat, String email){
        super (idSiswa, nama, alamat , email);
    }

    public void ambilKelas(int kodeKelas, String namaKelas, String tanggal){
        this.tanggal = tanggal;
        this.kodeKelas = kodeKelas;
        this.namaKelas = namaKelas;
    }
    public void cetakJadwal() {
        System.out.println("\n");
        System.out.println("=============================================================");
        System.out.println("                          Jadwal                             ");
        System.out.println("=============================================================");
        System.out.println("ID Siswa                  : " + super.getIdSiswa());
        System.out.println("Nama                      : " + super.getNama());
        System.out.println("Alamat                    : " + super.getAlamat());
        System.out.println("Email                     : " + super.getEmail());

        System.out.println("Kode Kelas                : " + kodeKelas);
        System.out.println("Nama Kelas                : " + nama);
        System.out.println("Tanggal                   : " + tanggal);
        
        
        System.out.println("=============================================================");
        System.out.println("                          Terima kasih                       ");
        System.out.println("=============================================================");
    }

}
        
