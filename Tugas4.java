/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas4;

/**
 *
 * @author ASUS X453MA
 */
public class Tugas4 {
    private String  judul,aktor,sutradara,publisher,kategori;
    protected String namaclass = "induk";
    
    protected void setjudul(String judul){
        this.judul = judul;
        judul = null;
    }
    
    protected String getjudul() {
        return judul;
    }
    
    protected void setaktor(String aktor) {
        this.aktor = aktor;
        aktor = null;
    }
    
    protected String getaktor() {
        return aktor;
    }
    
    protected void setsutradara(String sutradara) {
        this.sutradara = sutradara;
        sutradara = null;
    }
    
    protected String getsutradara() {
        return sutradara;
    }
    
    protected void setpublisher(String publisher) {
        this.publisher = publisher;
        publisher = null;
    }
    
    protected String getpublisher() {
        return publisher;
    }
    
    protected void setkategori(String kategori) {
        this.kategori = kategori;
        kategori = null;
    }
    
    protected String getkategori() {
        return kategori;
    }
    
    protected void tampil(String a)
    {    System.out.println(a);
         a = null;
    }
    
    protected String keterangan()
    {   return ("ini adalah nama class"+namaclass);
    }
    
    protected void  hapus()
    {
        judul = null;
        aktor = null;
        sutradara = null;
        publisher = null;
        kategori = null;
        namaclass = null;
    }

    
}
