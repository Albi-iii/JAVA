
package latihan.pkg5;

/**
 *
 * @author albi
 * NAMA : Moh.Albi Shihabudddin
 * KELAS : TI-1B
 * NIM : A2.1900107
 * Deskripsi Program : kambing global
 */
public class KambingGlobal {

    // variabel jumlahkambing menjadi variabel instance
    int jumlahKambing = 88;
    
    // method untuk menampilkan jumlah kambing 
    public void getJumlahKambing (){
        System.out.println("Jumlah Kambing : " + jumlahKambing);
        
    }
    
    public void tambahKambing (){
        jumlahKambing = jumlahKambing + 5;
        System.out.println("Jumlah kambing setelah ditambah :" + jumlahKambing);
        
    }
    
    public static void main(String[] args) {
        KambingGlobal kambingSusu = new KambingGlobal ();
        
        // menampilkan jumlah kambing yang ada saat program x berjalan
        kambingSusu.getJumlahKambing();
        
        // menambah satu kambing ();
        kambingSusu.tambahKambing();
        
        // menambah jumlah kambing yang ada
        kambingSusu.getJumlahKambing();
      
    }
    
}
