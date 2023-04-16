package assignments.assignment3.nota.service;

public interface LaundryService {
    /**
     * Akan mengembalikan String yang menandakan bahwa Nota tersebut sedang dikerjakan.
     * Jika pernah dipanggil minimal sekali akan membuat method isDone mengembalikan true.
     *
     * @return String yang menandakan bahwa sedang dikerjakan.
     */
    String doWork();

    /**
     * Akan bernilai true ketika method doWork() pernah dipanggil minimal sekali, selain itu akan bernilai false.
     *
     * @return boolean yang menandakan apakah service sudah selesai atau belum.
     */
    boolean isDone();

    /**
     * Akan mengkalkulasi harga berdasarkan berat dari argumen yang masuk.
     *
     * @param berat -> berat dari cucian.
     * @return hasil kalkulasi harga dan berat dalam. Dalam long untuk antisipasi overflow.
     */
    long getHarga(int berat);

    /**
     * Akan mengembalikan nama dari service.
     *
     * @return nama service.
     */
    String getServiceName();
}