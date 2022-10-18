public class MataPelajaran extends Guru{
    String nama;

    MataPelajaran(String nama){
        super(nama);
        this.nama = nama;
    }

    void info(){
        System.out.println("Mata Pelajaran \t : " + this.nama);
    }
}