package assignments.assignment1;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

public class NotaGenerator {
    private static final Scanner input = new Scanner(System.in);

    /**
     * method main, program utama kalian berjalan disini.
     */
    public static void main(String[] args) {
        while (true){
            printMenu();
            System.out.print("Pilihan : ");
            var command = input.next();
            System.out.println("================================");
            if(command.equals("1")){
                // TODO: Implment I/O untuk generate ID
                continue;
            }
            if(command.equals("2")){
                // TODO: Implment I/O untuk generate Nota
                continue;
            }
            if (command.equals("0")){
                break;
            }
            System.out.println("Perintah tidak dikenali.");
        }
        System.out.println("Terima kasih telah menggunakan NotaGenerator!");
    }

    /**
     * Method untuk menampilkan menu di NotaGenerator.
     */
    private static void printMenu() {
        System.out.println("Selamat datang di NotaGenerator!");
        System.out.println("==============Menu==============");
        System.out.println("[1] Generate ID");
        System.out.println("[2] Generate Nota");
        System.out.println("[0] Exit");
    }

    /**
     * Method untuk menampilkan paket.
     */
    private static void showPaket() {
        System.out.println("+-------------Paket-------------+");
        System.out.println("| Express | 1 Hari | 12000 / Kg |");
        System.out.println("| Fast    | 2 Hari | 10000 / Kg |");
        System.out.println("| Reguler | 3 Hari |  7000 / Kg |");
        System.out.println("+-------------------------------+");
    }

    /**
     * Method untuk membuat ID dari nama dan nomor handphone.
     * Parameter dan return type dari method ini tidak boleh diganti agar tidak mengganggu testing
     *
     * @return String ID anggota dengan format [NAMADEPAN]-[nomorHP]-[2digitChecksum]
     */
    public static String generateId(String nama, String nomorHP){
        // TODO: Implement generate ID sesuai soal.
        return null;
    }

    /**
     *
     * Method untuk membuat Nota.
     * Parameter dan return type dari method ini tidak boleh diganti agar tidak mengganggu testing.
     *
     * @return string nota dengan format di bawah:
     *         <p>ID    : [id]
     *         <p>Paket : [paket]
     *         <p>Harga :
     *         <p>[berat] Kg x [hargaPaketPerKg] = [totalHarga]
     *         <p>Tanggal Terima  : [tanggalSekarang]
     *         <p>Tanggal Selesai : [tanggalSekarang+LamaHariPaket]
     */

    public static String generateNota(String id, String paket, int berat){
        // TODO: Implement generate nota sesuai soal.
        return null;
    }
}
