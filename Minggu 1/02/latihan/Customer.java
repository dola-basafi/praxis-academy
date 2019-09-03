
public class Customer {

    private int noId;
    private String nama;
    private String alamat;

    
    public Customer() {
    }

    public Customer(int noId, String nama, String alamat) {
        this.noId = noId;
        this.nama = nama;
        this.alamat = alamat;
    }

    
    public int getNoId() {
        return noId;
    }

    public void setNoId(int noId) {
        this.noId = noId;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
}