/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas4;


import javax.swing.JOptionPane;
public class child extends stok {
public static void main (String []args){
    child ob = new child();
      String judul,aktor,sutradara,publisher,kategori,stok,ulang;
      do{
      judul = JOptionPane.showInputDialog("JUDUL FILM");
      ob.setjudul(judul);
      ob.tampil("Judul Film : "+ob.getjudul());
      
      aktor = JOptionPane.showInputDialog("NAMA AKTOR");
      ob.setaktor(aktor);
      ob.tampil("Nama Aktor : "+ob.getaktor());
      
      sutradara = JOptionPane.showInputDialog("SUTRADARA");
      ob.setsutradara(sutradara);
      ob.tampil("Sutradara  : "+ob.getsutradara());
      
      publisher = JOptionPane.showInputDialog("PUBLISHER");
      ob.setpublisher(publisher);
      ob.tampil("Publisher  : "+ob.getpublisher());
      
      kategori = JOptionPane.showInputDialog("KATEGORI");
      ob.setkategori(kategori);
      ob.tampil("Kategori Film : "+ob.getkategori());
      
      stok = JOptionPane.showInputDialog("JUMLAH STOK");
      ob.setstok(stok);
      ob.tampil("Stok Film  : "+ob.getstok());

      ob.tampil("====================================");
      ulang = JOptionPane.showInputDialog(null,"Apakah Anda Ingin Mengulang\n 1. Ya\n 2. Tidak");
      }while("1".equals(ulang));
      
      ob.hapus();
  
      judul=null;
      aktor=null;
      sutradara=null;
      publisher=null;
      kategori=null;
      stok=null;
      ob=null;
      
      System.exit(0);
  }  
}