public class PersegiPanjangDemo {
    public static void main(String[] args) {

        // Instansiasi objek PersegiPanjang
        PersegiPanjang p1 = new PersegiPanjang();
        p1.panjang = 10;
        p1.lebar = 5;

        // Menampilkan informasi
        p1.displayInfo();
        System.out.println("Luas     : " + p1.getLuas());
        System.out.println("Keliling : " + p1.getKeliling());
    }
}