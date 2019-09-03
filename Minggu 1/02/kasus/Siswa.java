
public class Siswa {

    int idSiswa;
    String nama;
    String alamat;
    String email;

    public Siswa(){

    }
    public Siswa( int idSiswa, String nama, String alamat, String email){
        this.idSiswa = idSiswa;
        this.nama = nama;
        this.alamat = alamat;
        this.email  = email;
    }

    public void setIdSiswa(int idSiswa){
        this.idSiswa = idSiswa;
    }
    public void setNama(String nama){
        this.nama = nama;
    }
    public void setAlamat(String alamat){
        this.alamat = alamat;
    }
    public void setEmail(string email){
        this.email = email;
    }
    public int getIdSiswa(){
        return idSiswa;
    }
    public String getNama(){
        return nama;
    }
    public String getAlamat(){
        return alamat;
    }
    public String getEmail(){
        return email;
    }
}