/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas4;


import javax.swing.JOptionPane;
public class MainInheritance extends stok {
public static void main (String []args){
      MainInheritance ob = new MainInheritance();
      String judul,aktor,sutradara,publisher,kategori,stok,ulang = null;
      boolean ulangi =true;
      
     
//      do{
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
      
      
      ulang = JOptionPane.showInputDialog(null,"Apakah Anda Ingin Mengulang\n Ya\n Tidak");
          
      if(ulang.equalsIgnoreCase("Ya")){
//           ulang = JOptionPane.showInputDialog(null,"Apakah Anda Ingin Mengulang\n 1. Ya\n 2. Tidak");
            //  pemangilan kelas rental dan methode pilihan 
            //nama class.nama methode
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
            JOptionPane.showInputDialog("Apakah Anda Ingin Mengulang\n Ya\n Tidak");
           
     
         }while(ulangi);
      }
      ob.hapus();
  
//      judul=null;
//      aktor=null;
//      sutradara=null;
//      publisher=null;
//      kategori=null;
//      stok=null;
//      ob=null;
//      
      System.exit(0);
   
}
}