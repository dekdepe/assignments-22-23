package assignments.assignment3.nota;
import assignments.assignment3.nota.service.LaundryService;
import assignments.assignment3.user.Member;
public class Nota {
    private Member member;
    private String paket;
    private LaundryService[] services;
    private long baseHarga;
    private int sisaHariPengerjaan;
    private  int berat;
    private int id;
    private String tanggalMasuk;
    private boolean isDone;
    static public int totalNota;

    public Nota(Member member, int berat, String paket, String tanggal) {
        //TODO
    }

    public void addService(LaundryService service){
        //TODO
    }

    public String kerjakan(){
        // TODO
        return "";
    }
    public void toNextDay() {
        // TODO
    }

    public long calculateHarga(){
        // TODO
        return -1;
    }

    public String getNotaStatus(){
        // TODO
        return "";
    }

    @Override
    public String toString(){
        // TODO
        return "";
    }

    // Dibawah ini adalah getter

    public String getPaket() {
        return paket;
    }

    public int getBerat() {
        return berat;
    }

    public String getTanggal() {
        return tanggalMasuk;
    }

    public int getSisaHariPengerjaan(){
        return sisaHariPengerjaan;
    }
    public boolean isDone() {
        return isDone;
    }

    public LaundryService[] getServices(){
        return services;
    }
}
