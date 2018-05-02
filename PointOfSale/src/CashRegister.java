import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.Vector;

public class CashRegister {

	String wydruk = "NAZWA FIRMY sp. z.o.o.\nAdres firmy ul. ulica nr\nNIP 00-11-22-33-44\n\nPARAGON FISKALNY" + "\n\n",
			raport_dobowy = "";

	Article skanowany_artykul = new Article();

	Vector<Product> lista_produktow = new Vector<Product>();

	Vector<Article> zakupy = new Vector<Article>();

	Boolean tryb_ilosc = false, tryb_cena = false, tryb_kod = true, tryb_nazwa = false, tryb_gotowka = false,
			tryb_wydruk = false, tryb_czysc = false, tryb_skan = false;
	Boolean stan_kropka = false, stan_wlaczony = false;

	Integer po_przecinku = 0, ktora_cyfra = 0, iterator_pozycji = 0;

	Double gotowka = 0.0, suma = 0.0, reszta = 0.0;

	String pomocniczy = "";

	public CashRegister() {
		loadProducts();
	}
	
	Boolean czyIstnieje(String wartosc_kod){
		for(int i=0;i<lista_produktow.size();i++){
			if(lista_produktow.get(i).kod.equals(wartosc_kod)){
				return true;
			}
		}
		return false;
	}

	String dopelnijZerami(String napis) {
		String pomocniczy = "";
		for (int i = 0; i < 4 - napis.length(); i++) {
			pomocniczy = pomocniczy + '0';
		}
		pomocniczy = pomocniczy + napis;
		return pomocniczy;
	}

	public void resetujTryby() {
		tryb_kod = tryb_nazwa = tryb_cena = tryb_ilosc = tryb_gotowka = tryb_wydruk = tryb_czysc = false;
	}

	public void loadProducts() {
		Product wprowadzany_produkt = new Product();
		try (BufferedReader br = new BufferedReader(new FileReader("src\\ProductsList"))) {

			String sCurrentLine;

			Integer linia = 1;
			while ((sCurrentLine = br.readLine()) != null) {
				System.out.println(sCurrentLine);
				if (linia == 1) {
					linia++;
					wprowadzany_produkt.kod = sCurrentLine;
				} else {
					if (linia == 2) {
						linia++;
						wprowadzany_produkt.nazwa = sCurrentLine;
					} else {
						if (linia == 3) {
							linia = 1;
							wprowadzany_produkt.cena = Double.parseDouble(sCurrentLine);
							lista_produktow.addElement(wprowadzany_produkt);
							wprowadzany_produkt = new Product();
						}
					}

				}

			}

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	String zamiana(String s, Integer i, Character value) {
		String pom = "";
		if (i >= s.length()) {
			pom = s + value;
		} else {
			for (int j = 0; j < i; j++) {
				pom = pom + s.charAt(j);
			}
			if (s.charAt(i) == '.') {
				pom = pom + value + '.';
			} else {
				pom = pom + value;
			}

			for (int j = i + 1; j < s.length(); j++) {
				pom = pom + s.charAt(j);
			}
		}

		return pom;
	}

}
