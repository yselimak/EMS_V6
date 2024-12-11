package dataStructure;

import personel.Personel;

public class BagliListe {
		Personel bas;
		Personel son;

		
		public BagliListe(){
			bas=null;
			son=null;
		}
		
		public void Sil(Personel silPersonel) {
			if (bas == null) {
				System.out.println("kardes zaten bos bu");
			}else {
				Personel temp = bas;
				
				 while(temp!= null) {
	
					 if(temp.getMaas() == silPersonel.getMaas()) {
						temp.onceki.sonraki=temp.sonraki;
						temp.sonraki.onceki=temp.onceki;
				 }
					 temp=temp.sonraki;
				 
				 }
			}
			
		}
		
		public void Ekle(Personel yeni) {
			
			if(bas==null) {//liste boşsa
				bas=yeni;
				son=yeni;
				return;
			}
			//liste boş değil
			
			son.sonraki=yeni;
			son.onceki=son;
			son=yeni;
			 
		}
		
		public void guncelleme(int personelIndex) {
			Personel temp = bas;
			while(temp !=null) {
				if(personelIndex == temp.getMaas()) {
					//temp.setIsim();
					/*
					long personelNo = Long.parseLong(personelNoTextField.getText());
				    String isim = isimTextField.getText().toUpperCase();
				    String soyisim = soyisimTextField.getText().toUpperCase();
				    String pozisyon = pozisyonTextField.getText().toUpperCase();
				    int yas = Integer.parseInt(yasTextField.getText());
				    */
				}
			}
		}
		
		
		
		
		
		public void listeYazdir() {
			
			Personel temp =bas;
			while(temp!=null) {
				
				System.out.println(temp.getMaas());
				temp = temp.sonraki;
				
			}
			System.out.println("--------------------");
		}
		 

}