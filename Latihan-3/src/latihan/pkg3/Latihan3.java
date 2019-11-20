
package latihan.pkg3;

import java.util.Scanner;

/**
 *
 * @author albi
 * NAMA : Moh.Albi Shihabudddin
 * KELAS : TI-1B
 * NIM : A2.1900107
 * Deskripsi Program : Memasukan Nilai dari Keyboard
 */
public class Latihan3 {

    
    public static void main(String[] args) {
     System.out.print("Masukan nama anda: ");
        Scanner scanner = new Scanner (System.in);
        
        String nama = scanner.next();
        System.out.println("Nama anda adalah " + nama);
     
    }
    
}
