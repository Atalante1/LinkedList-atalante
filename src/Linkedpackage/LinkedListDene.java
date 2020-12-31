package Linkedpackage;

public class LinkedListDene {

	public static void main(String[] args) {
	BizimLL list= new BizimLL();
	
	list.indekseEkle(55, 2);
	list.listeyiYazdir();
	list.bastanSil();
	list.listeyiYazdir();
	list.bastanSil();
	list.listeyiYazdir();
	
	list.basaEkle(2);
	list.basaEkle(4);
	list.basaEkle(6);
	list.listeyiYazdir();
//listeyiYazdir() fonksiyonunda system.out.println kullandýðýmýz için bir kere
	//daha yazmamýza gerek yok aslýnda
	System.out.println();
	list.sonaEkle(8);
	list.listeyiYazdir();
	
	
	System.out.println();
	list.basaEkle(11);
	list.listeyiYazdir();
	

	System.out.println();
	list.indekseEkle(-1,0);
	list.listeyiYazdir();
	
	System.out.println();
	list.indekseEkle(-4,33);// aþan deðeri sona eklemesi gerekiyor
	list.listeyiYazdir();
	
	System.out.println();
	list.indekseEkle(0,2);
	list.listeyiYazdir();
	
	list.bastanSil();
	list.listeyiYazdir();
	
	list.sondanSil();
	list.listeyiYazdir();
	
	list.sondanSil();
	list.listeyiYazdir();
	
	list.indekstenSil(0);
	list.listeyiYazdir();
	
	list.indekstenSil(2);
	list.listeyiYazdir();
	
	list.indekstenSil(9);//aþan indekste eleman silmez
	list.listeyiYazdir();
	
	list.sonaEkle(9);
	list.listeyiYazdir();
	
	list.verilenDegrElmnSil(6);
	list.listeyiYazdir();
	
	list.verilenDegrElmnSil(9);
	list.listeyiYazdir();
	
	list.basaEkle(4);
	list.sonaEkle(4);
	list.indekseEkle(4,3);
	list.listeyiYazdir();
	
	list.verilenDegHepsiniSil(4);
	list.listeyiYazdir();
	
	list.basaEkle(1);
	list.sonaEkle(10);
	list.listeyiYazdir();
	
	}

}
