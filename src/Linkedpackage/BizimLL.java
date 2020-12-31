package Linkedpackage;

public class BizimLL {
	Eleman bas;
	Eleman son;
	public BizimLL() {
		bas=null; //listenini ba��n� null yapt�k ��nk� bi listeyi yeni olu�turuken listenin i�i bo�tur
		son=null;
	}
	
	public void basaEkle(int sayi) {
		//eleman eklerken her hangi bir �eyi geri d�nd�rmek istemiyoruz
	//eleman ekledi�imiz i�in int sayi yazd�k
		//ge�ici de�i�ken i�inde eleman� olu�tural�m
		Eleman yeniEleman= new Eleman(sayi);
		if(doluMu()) {
			//liste dolu
			yeniEleman.siradaki=bas;
			bas=yeniEleman;
		}
		else {
			bas=yeniEleman;
			son=yeniEleman;
			
		}
	}
	
	public void sonaEkle(int sayi) {
		Eleman yeniEleman= new Eleman( sayi );
		if(doluMu()) {
			//liste dolu ise
			son.siradaki= yeniEleman;
			//son dedi�imiz nodun siradakini yeni eleman yap�yoruz
			//art�k son yeni eleman oluyor
			son= yeniEleman;
		}
		else {
			bas=yeniEleman;
		son=yeniEleman;
			
		} 
		}
	public void indekseEkle(int sayi,int indeks) {
		Eleman yeniEleman= new Eleman( sayi );
		//se�ilen indekse eleman ekleme
		if(doluMu()) {
			//liste dolu ise
			if(indeks==0) {// dolu bir listenini en ba��na eleman eklemek istiyoruz
				yeniEleman.siradaki=bas;
				bas=yeniEleman;
				//(ba�aekle ile ayn� bu k�s�m)
			}
			else {
				//ortada bir yere ekliyoruz
				Eleman isaretci1=null;
				Eleman isaretci2=bas;
				
				int mevcutIndeks=0; 
				while(isaretci2!= null&& mevcutIndeks<indeks) {
				
					isaretci1=isaretci2;
					isaretci2=isaretci2.siradaki;
					mevcutIndeks++;
				}
				if(isaretci2== null)//2 null ise listenini sonuna ekliyoruz demek
				{
					son.siradaki= yeniEleman;
					//son dedi�imiz nodun siradakini yeni eleman yap�yoruz
					//art�k son yeni eleman oluyor
					son= yeniEleman;}
				else {
					//ortada bir yere ekliyoruz
					yeniEleman.siradaki=isaretci2;
					isaretci1.siradaki=yeniEleman;
				}
				
			}
			
		}
		else {//liste bo� ise
			bas=yeniEleman;
		son=yeniEleman;
			
		} 
		 
	}
	public void bastanSil(){
		if(doluMu()) {
			if(bas== son) {
				//listede tek eleman var
			
				bas=null;
				son=null;
			}
			else {
				Eleman yeniBas=bas.siradaki;
				bas.siradaki=null;
				bas=yeniBas;
				//en �ndeki eleman� sildik
			}
		}
		
	}
	public void sondanSil() {
		if(doluMu()) {
			if(bas== son) {
				//listede tek eleman var
			
				bas=null;
				son=null;
			}
			else {
				Eleman isaretci=bas;
				while(isaretci.siradaki != son) {
					isaretci=isaretci.siradaki;
				}
				isaretci.siradaki=null;
				son = isaretci;
			}
		}
	}
	public void indekstenSil(int indeks) {
		if(doluMu() && indeks>=0) {
			if(bas== son) {
				//listede tek eleman var
			
				bas=null;
				son=null;
			}
			else {
				//en az iki eleman var 
				if(indeks ==0) {
					//ba�takini sil
					Eleman yeniBas=bas.siradaki;
					bas.siradaki=null;
					bas=yeniBas;
				}
				else { // en az iki eleman var ve sildi�imiz ba�ta de�il
					Eleman isaretci1 = null;
					Eleman isaretci2=bas;//silmek istedi�imiz eleman
					
					int mevcutIndeks=0;
					while(isaretci2!=null && mevcutIndeks < indeks) {
						
						isaretci1=isaretci2;
						isaretci2= isaretci2.siradaki;
						mevcutIndeks++;
					}
					if(isaretci2 != null ){
						if(isaretci2== son) {
							//sondan silme
							son=isaretci1;
							isaretci1.siradaki=null;
						}
						else {
							//ortadan silme
							Eleman isaretci3=isaretci2.siradaki;
							isaretci2.siradaki=null;
							isaretci1.siradaki=isaretci3;
						}
					}
				}
			}
			}
		
	}
	public void verilenDegrElmnSil(int sayi) {
		//verilen de�erde eleman sil
		if(doluMu()) {
			if(bas== son) {
				//listede tek eleman var
			if(bas.sayi==sayi) {
				bas=null;
				son=null;
			}
			}
			else {
				//en az iki eleman var 
				if(bas.sayi==sayi) {
					//ba�takini sil
					Eleman yeniBas=bas.siradaki;
					bas.siradaki=null;
					bas=yeniBas;
				}
				else { 
					// en az iki eleman var ve 
					//sildi�imiz ba�ta de�il
					Eleman isaretci1 = null;
					Eleman isaretci2=bas;//silmek istedi�imiz eleman
					
					
					while(isaretci2 !=null && isaretci2.sayi !=sayi) {
						//isaretci2 null oldu�unda verilen say� listede yok demek
						isaretci1=isaretci2;
						isaretci2= isaretci2.siradaki;
						
					}
					if(isaretci2 != null ){
						if(isaretci2== son) {
							//sondan silme
							son=isaretci1;
							isaretci1.siradaki=null;
						}
						else {
							//ortadan silme
							Eleman isaretci3=isaretci2.siradaki;
							isaretci2.siradaki=null;
							isaretci1.siradaki=isaretci3;
						}
					}
				}
			}
			}
		
	}
	
	
		public void listeyiYazdir() {
			Eleman isaretci=bas;
			int elemanSayisi=0;
			while(isaretci!= null) {
				System.out.print( isaretci.sayi+" ");
				isaretci=isaretci.siradaki;
				elemanSayisi++;
			}
			System.out.println();
			System.out.println( "eleman sayisi:"+ elemanSayisi);
			System.out.println();
		}
		
		public void verilenDegHepsiniSil(int sayi) {
			//verilen de�erde eleman sil
			if(doluMu()) {
				if(bas== son) {
					//listede tek eleman var
				if(bas.sayi==sayi) {
					bas=null;
					son=null;
				}
				}
				
				else { 
						
						Eleman isaretci1 = null;
						Eleman isaretci2=bas;//silmek istedi�imiz eleman
						
						
						while(isaretci2 !=null ) {
							if(isaretci2.sayi==sayi) {
								if(bas==isaretci2) {
									//ba�tan silme olur
									bas=isaretci2.siradaki;
									isaretci2.siradaki=null;
									isaretci2=bas;
								}else {
									if(isaretci2==son) {
										//sondan silme
										son=isaretci1;
										isaretci1.siradaki=null;
										isaretci2=null;
									}else {
										//ortadan sil 
										Eleman isaretci3=isaretci2.siradaki;
										isaretci2.siradaki=null;
										isaretci1.siradaki=isaretci3;
										isaretci2=isaretci3;
									}
									}
								 }
							
							else {
								//eleman silmiyorsak
								//i�aret�ileri g�ncelleriz
								isaretci1=isaretci2;
								isaretci2= isaretci2.siradaki;
							}
							
							
						}
					}
				}	
			}
			
			
		
	public boolean doluMu() {
		if(bas!= null) {
			return true;
		}
		else {
			return false;
		}
	}
}
