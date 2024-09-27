import java.util.Scanner;

public class Kafe24 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        boolean keanggotaan;
        int jmlKopi, jmlTeh, JmlRoti;
        double hargaKopi = 12000.0, hargaTeh = 7000.0, hargaRoti = 20000.0, totalHarga, nominalBayar;
        float diskon = 10 / 100f;

        System.out.print("Masukkan keanggotaan (true/false): ");
        keanggotaan = input.nextBoolean();
        System.out.print("Masukkan jumlah pembelian kopi: ");
        jmlKopi = input.nextInt();
        System.out.print("Masukkan jumlah pembelian teh: ");
        jmlTeh = input.nextInt();
        System.out.print("Masukkan jumlah pembelian roti: ");
        JmlRoti = input.nextInt();

        totalHarga = (jmlKopi * hargaKopi) + (jmlTeh * hargaTeh) + (JmlRoti * hargaRoti);

        nominalBayar = totalHarga - (diskon * totalHarga);

        System.out.println("Keanggotaan pelanggan " + keanggotaan);
        System.out.println("Item pembelian " + jmlKopi + " kopi, " + jmlTeh + " teh, " + JmlRoti + " roti");
        System.out.println("Nominal bayar Rp " + nominalBayar);
    }
}