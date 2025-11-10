import java.util.Scanner;

public class BangunDatar {
    public static void main(String[] args){
        Scanner in = new Scanner (System.in);
        Segitiga s = new Segitiga ();
        Persegi p = new Persegi ();
        Lingkaran l = new Lingkaran ();

        System.out.println("LUAS & KELILING SEGITIGA");
        System.out.print("Masukkan a: ");
        s.setAlas(in.nextDouble());
        System.out.print("Masukkan t: ");
        s.setTinggi(in.nextDouble());

        System.out.println("Alas: " + s.getAlas());
        System.out.println("Tinggi: " + s.getTinggi());
        System.out.printf("Luas: %.2f" , s.getLuas());
        System.out.printf("\nKeliling: %.2f" , s.getKeliling());

        System.out.println("\n\nLUAS & KELILING PERSEGI");
        System.out.print("Masukkan s: ");
        p.setSisi(in.nextDouble());

        System.out.println("Sisi persegi: " + p.getSisi());
        System.out.println("Luas: " + p.getLuas());
        System.out.println("Keliling: " + p.getKeliling());

        System.out.println("\nLUAS & KELILING LINGKARAN");
        System.out.print("Masukkan r: ");
        l.setJari(in.nextDouble());

        System.out.println("Jari-jari Lingkaran: " + l.getJari());
        System.out.printf("Luas: %.2f" , l.getLuas());
        System.out.printf("\nKeliling: %.2f" , l.getKeliling());
    }
}
