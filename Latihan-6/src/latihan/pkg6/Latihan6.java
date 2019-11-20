
package latihan.pkg6;

/**
 *
 * @author albi
 * NAMA : Moh.Albi Shihabudddin
 * KELAS : TI-1B
 * NIM : A2.1900107
 * Deskripsi Program : kambing static & konstanta
 */



public class Latihan6 {
    // NAMA_KAMBING sebagai konstanta
    public static int jumlahKambing;

    // NAMA_KAMBING sebagai konstanta
    public static final String NAMA_KAMBING = "MIDUN";
    
    
    public static void main(String[] args) {
       
        Mamalia.jumlahKambing = 485000;
        System.out.println(NAMA_KAMBING + " memiliki kambing sebanyak " + Mamalia.jumlahKambing);
        
    }
    
}


