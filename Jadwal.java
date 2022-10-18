public class Jadwal {

    public static void main(String[] args) {
        //Pemanggilan Overriding

        Siswa swa = new Siswa("Dava Febrian");
        swa.info();

        swa = new Guru("Abi Fajar s.kom");
        swa.info();

        swa = new MataPelajaran("Matematika");
        swa.info();

        waktu(100);
        waktu("10 Desember 2022");
        waktu("Rabu",7, "Pagi");
    }

    // =========== Overloading ==============
    static void waktu(int Wkt){
        System.out.println("Waktu Belajar/M \t : " + Wkt);
    }

    static void waktu(String Wkt){
        System.out.println("Pada Tanggal \t : " + Wkt);
    }

    static void waktu(String hari, int Wkt, String waktu){
        System.out.println("Waktu \t\t\t : " + hari + ", Pukul " + Wkt + " " + waktu);
    }


}