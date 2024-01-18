import java.util.Scanner;

public class RestoranMenu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan nama Anda: ");
        String nama = scanner.nextLine();

        int totalPembelian = 0;

        while (true) {
            System.out.println("\nSelamat datang, " + nama + "!");
            System.out.println("Menu:");
            System.out.println("1. Nasi Goreng - Rp 15,000");
            System.out.println("2. Mie Goreng - Rp 10,000");
            System.out.println("3. Bakso - Rp 13,000");
            System.out.println("4. Selesai Memesan");

            System.out.print("Pilih menu (1-4): ");
            int pilihan = scanner.nextInt();

            if (pilihan == 4) {
                break;
            }

            System.out.print("Masukkan jumlah " + getMenuNama(pilihan) + " yang ingin Anda beli: ");
            int jumlah = scanner.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.println("Anda memesan " + jumlah + " Nasi Goreng seharga Rp " + (15000 * jumlah));
                    totalPembelian += (15000 * jumlah);
                    break;
                case 2:
                    System.out.println("Anda memesan " + jumlah + " Mie Goreng seharga Rp " + (10000 * jumlah));
                    totalPembelian += (10000 * jumlah);
                    break;
                case 3:
                    System.out.println("Anda memesan " + jumlah + " Bakso seharga Rp " + (13000 * jumlah));
                    totalPembelian += (13000 * jumlah);
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Harap pilih menu yang benar.");
                    break;
            }
        }

        System.out.println("Total Pembelian untuk " + nama + ": Rp " + totalPembelian);

        System.out.println("Terima kasih atas kunjungan Anda, " + nama + "! Sampai jumpa!");
        scanner.close();
    }

    private static String getMenuNama(int pilihan) {
        switch (pilihan) {
            case 1:
                return "Nasi Goreng";
            case 2:
                return "Mie Goreng";
            case 3:
                return "Bakso";
            default:
                return "Menu tidak valid";
        }
    }
}
