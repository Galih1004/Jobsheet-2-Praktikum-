public class AC {
    // Deklarasi atribut AC
    private String merk;
    private String mode;
    private int suhu;

    // Konstruktor
    public AC(String merk, String mode, int suhu) {
        this.merk = merk;
        this.mode = mode;
        this.suhu = suhu;
    }

    // Method untuk menambah suhu
    public void tambahSuhu(int nilaiTambah) {
        this.suhu += nilaiTambah;
        System.out.println("Suhu ditambah sebesar " + nilaiTambah
                + " derajat. Suhu sekarang: " + this.suhu + " C");
    }

    // Method untuk memilih mode AC
    public void pilihMode(String modeBaru) {
        this.mode = modeBaru;
        System.out.println("Mode AC diganti menjadi: " + this.mode);
    }

    // Method untuk menampilkan merk AC
    public void tampilkanMerk() {
        System.out.println("Merk AC yang dipilih: " + this.merk);
    }

    // Method untuk menampilkan status AC
    public void tampilkanStatus() {
        System.out.println("Merk   : " + this.merk);
        System.out.println("Mode   : " + this.mode);
        System.out.println("Suhu   : " + this.suhu + " C");
    }

    // Getter methods
    public String getMerk() { return merk; }
    public String getMode() { return mode; }
    public int getSuhu() { return suhu; }
}