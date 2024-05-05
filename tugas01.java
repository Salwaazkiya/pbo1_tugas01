import java.util.Scanner;

public class tugas01{
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        int pilihan;

        System.out.println("Selamat Datang di Toko Alat Tulis");
        System.out.println("Pilihan : ");
        System.out.println("1. Pensil");
        System.out.println("2. Pulpen");
        System.out.println("3. Penggaris");
        System.out.println("4. Penghapus");
        System.out.println("");

        System.out.println("Masukkan pilihan Anda : ");
        pilihan = scanner.nextInt();

        switch (pilihan) {
            case 1:
                System.out.println("Anda memilih Pensil");   
                break;
            case 2:
                System.out.println("Anda memilih Pulpen");   
                break;
            case 3:
                System.out.println("Anda memilih Penggaris");   
                break;
            case 4:
                System.out.println("Anda memilih Penghapus");   
                break;
            default:
                System.out.println("Pilihan tidak tersedia.");
        }

        if (pilihan == 1) {
            System.out.println("Harga Pensil : Rp. 2000");
        }else if (pilihan == 2) {
            System.out.println("Harga Pulpen : Rp. 3000");
        }else if (pilihan == 3) {
            System.out.println("Harga Penggaris : Rp. 2000");
        }else if (pilihan == 4) {
            System.out.println("Harga Penghapus : Rp. 1000");
        }else {
            System.out.println("Maaf, harga tidak tersedia untuk pilihan tersebut.");
        }
    }    
}