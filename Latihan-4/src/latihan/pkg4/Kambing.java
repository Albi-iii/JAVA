
package latihan.pkg4;

/**
 *
 * @author albi
 * NAMA : Moh.Albi Shihabudddin
 * KELAS : TI-1B
 * NIM : A2.1900107
 * Deskripsi Program : Kambing
 */
public class Kambing {

    
    public void tambahKambing() {
        // Deklarasi variabel lokal
        int jumlahKambing = 0;
        
        jumlahKambing = jumlahKambing + 5;
        System.out.println("jumlah Kambing Setelah ditambah :" + jumlahKambing);
        
        
        
    }
    
    public static void main(String [] args) {
        Kambing kambingJantan = new Kambing ();
        kambingJantan.tambahKambing ();
    }
}
