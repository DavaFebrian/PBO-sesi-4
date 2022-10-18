public class Guru extends Siswa {
    String nama;

    Guru(String nama){
        super(nama);
        this.nama = nama;
    }

    void info(){
        System.out.println("Nama Guru \t\t : " + this.nama);
    }
}