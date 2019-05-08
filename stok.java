/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas4;


public class stok extends Tugas4 {
    private int stok;
    protected String namaclass= "stok";
    
    protected void setstok(String stok){
        this.stok = Integer.parseInt(stok);
        stok = null;
    }
    protected long getstok(){
        return stok;
    }
    protected String keterangan ()
    {// mengakses atribut/veriable & method parent (class induk)
        return super.namaclass+" : "+super.keterangan();
    }        
    
    public String keterangan_induk()
    {
        return super.namaclass+" : "+super.keterangan();
    }
    protected void hapus()
    { //menghapus variable dari memory
        stok=0;
        //menhapus variable private parent (class induk)
        super.hapus();
        
    }
    
}
