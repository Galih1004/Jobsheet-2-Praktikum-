public class PembelianAC_Demo {
    public static void main(String[] args) {
        // Instansiasi objek AC
        AC ac1 = new AC("Panasonic", "Cool", 16);
        AC ac2 = new AC("Samsung", "Fan", 20);

        // Informasi AC ke-1
        System.out.println("--- AC ke-1 ---");
        ac1.tampilkanMerk();
        ac1.tambahSuhu(2);
        ac1.pilihMode("Dry");
        ac1.tampilkanStatus();
        System.out.println();

        // Informasi AC ke-2
        System.out.println("--- AC ke-2 ---");
        ac2.tampilkanMerk();
        ac2.tambahSuhu(2);
        ac2.pilihMode("Cool");
        ac2.tampilkanStatus();
        System.out.println();
    }
}