package controller;

import personel.Personel;
import dataStructure.BagliListe;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class ekleController {
	@FXML
	private Button onaylaButon;
	@FXML
	private TextField isimTextField;
	@FXML
	private TextField soyisimTextField;
	@FXML
	private TextField maasTextField;
	@FXML
	private TextField pozisyonTextField;
	@FXML
	private TextField yasTextField;
	
	
	@FXML
	public void onaylaButonKod() {
		// TextField'dan alınan değerleri uygun türlere dönüştür
	    long maas = Long.parseLong(maasTextField.getText());
	    String isim = isimTextField.getText().toUpperCase();
	    String soyisim = soyisimTextField.getText().toUpperCase();
	    String pozisyon = pozisyonTextField.getText().toUpperCase();
	    int yas = Integer.parseInt(yasTextField.getText());
	    
	    // Personel nesnesi oluşturuluyor
	    Personel yeniPersonel = new Personel(isim, soyisim, pozisyon, yas,maas);
	    BagliListe bagliListe = new BagliListe();
	    bagliListe.Ekle(yeniPersonel);
	    yeniPersonel.getTerfiListesi().add(yeniPersonel.getTerfiBilgileri());
	    // observable liste yenii personeli ekle
	    Controller.personelList.add(yeniPersonel);
	    bagliListe.listeYazdir();
	    //Controller controller=new Controller();
	    //controller.tableView.setItems(Controller.personelList);
	    
		// onaylaButon'un bulunduğu stage'i kapat
		Stage kapastage = (Stage) onaylaButon.getScene().getWindow(); // onaylaButon'un bulunduğu stage'i bir nesneye atama
		kapastage.close(); // alınan stage'i kapatma
		
		
	}
	
	
	
}
