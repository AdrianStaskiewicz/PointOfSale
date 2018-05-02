import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Vector;

import java.awt.Font;
import java.awt.Insets;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class MainWindow extends JFrame implements ActionListener, KeyListener {

	JButton przycisk_wyjscie, przycisk_f1, przycisk_f2, przycisk_f3, przycisk_up;
	JButton przycisk_f4, przycisk_f5, przycisk_f6, przycisk_f7, przycisk_down;
	JButton przycisk_ilosc, przycisk_7, przycisk_8, przycisk_9, przycisk_czysc;
	JButton przycisk_cena, przycisk_4, przycisk_5, przycisk_6, przycisk_nazwa;
	JButton przycisk_znakp, przycisk_1, przycisk_2, przycisk_3, przycisk_razem;
	JButton przycisk_znakl, przycisk_0, przycisk_00, przycisk_kropka, przycisk_menu;

	JButton przycisk_wlacznik, przycisk_informacja ;

	JTextArea wyswietlacz;
	JTextArea paragon;

	CashRegister kasa = new CashRegister();

	public MainWindow() {

		setSize(505, 540);
		setTitle("Kasa fiskalna");

		setLayout(null);

		wyswietlacz = new JTextArea();
		wyswietlacz.setBounds(10, 10, 250, 50);
		wyswietlacz.setBackground(new Color(0, 100, 0));
		wyswietlacz.setFont(new Font("Arial", Font.BOLD, 11));
		wyswietlacz.setEditable(false);
		add(wyswietlacz);
		wyswietlacz.addKeyListener(this);

		paragon = new JTextArea();
		paragon.setBounds(280, 10, 200, 390);
		paragon.setBackground(Color.WHITE);
		paragon.setFont(new Font("Arial", Font.BOLD, 11));
		paragon.setMargin(new Insets(5, 5, 5, 5));
		paragon.setEditable(false);
		add(paragon);
		paragon.addKeyListener(this);

		przycisk_wyjscie = new JButton("ESC");
		przycisk_wyjscie.setBounds(10, 100, 50, 50);
		przycisk_wyjscie.setBackground(Color.RED);
		przycisk_wyjscie.setMargin(new Insets(1, 1, 1, 1));
		przycisk_wyjscie.setFont(new Font("Arial", Font.BOLD, 11));
		add(przycisk_wyjscie);
		przycisk_wyjscie.addActionListener(this);
		przycisk_wyjscie.addKeyListener(this);

		przycisk_f1 = new JButton("F1");
		przycisk_f1.setBounds(60, 100, 50, 50);
		przycisk_f1.setBackground(Color.LIGHT_GRAY);
		przycisk_f1.setMargin(new Insets(1, 1, 1, 1));
		przycisk_f1.setFont(new Font("Arial", Font.BOLD, 11));
		add(przycisk_f1);
		przycisk_f1.addActionListener(this);
		przycisk_f1.addKeyListener(this);

		przycisk_f2 = new JButton("F2");
		przycisk_f2.setBounds(110, 100, 50, 50);
		przycisk_f2.setBackground(Color.LIGHT_GRAY);
		przycisk_f2.setMargin(new Insets(1, 1, 1, 1));
		przycisk_f2.setFont(new Font("Arial", Font.BOLD, 11));
		add(przycisk_f2);
		przycisk_f2.addActionListener(this);
		przycisk_f2.addKeyListener(this);

		przycisk_f3 = new JButton("F3");
		przycisk_f3.setBounds(160, 100, 50, 50);
		przycisk_f3.setBackground(Color.LIGHT_GRAY);
		przycisk_f3.setMargin(new Insets(1, 1, 1, 1));
		przycisk_f3.setFont(new Font("Arial", Font.BOLD, 11));
		add(przycisk_f3);
		przycisk_f3.addActionListener(this);
		przycisk_f3.addKeyListener(this);

		przycisk_up = new JButton("/\\");
		przycisk_up.setBounds(210, 100, 50, 50);
		przycisk_up.setBackground(Color.LIGHT_GRAY);
		przycisk_up.setMargin(new Insets(1, 1, 1, 1));
		przycisk_up.setFont(new Font("Arial", Font.BOLD, 11));
		przycisk_up.setMnemonic(KeyEvent.VK_UP);
		add(przycisk_up);
		przycisk_up.addActionListener(this);
		przycisk_up.addKeyListener(this);

		przycisk_f4 = new JButton("F4");
		przycisk_f4.setBounds(10, 150, 50, 50);
		przycisk_f4.setBackground(Color.LIGHT_GRAY);
		przycisk_f4.setMargin(new Insets(1, 1, 1, 1));
		przycisk_f4.setFont(new Font("Arial", Font.BOLD, 11));
		add(przycisk_f4);
		przycisk_f4.addActionListener(this);
		przycisk_f4.addKeyListener(this);

		przycisk_f5 = new JButton("F5");
		przycisk_f5.setBounds(60, 150, 50, 50);
		przycisk_f5.setBackground(Color.LIGHT_GRAY);
		przycisk_f5.setMargin(new Insets(1, 1, 1, 1));
		przycisk_f5.setFont(new Font("Arial", Font.BOLD, 11));
		add(przycisk_f5);
		przycisk_f5.addActionListener(this);
		przycisk_f5.addKeyListener(this);

		przycisk_f6 = new JButton("F6");
		przycisk_f6.setBounds(110, 150, 50, 50);
		przycisk_f6.setBackground(Color.LIGHT_GRAY);
		przycisk_f6.setMargin(new Insets(1, 1, 1, 1));
		przycisk_f6.setFont(new Font("Arial", Font.BOLD, 11));
		add(przycisk_f6);
		przycisk_f6.addActionListener(this);
		przycisk_f6.addKeyListener(this);

		przycisk_f7 = new JButton("F7");
		przycisk_f7.setBounds(160, 150, 50, 50);
		przycisk_f7.setBackground(Color.LIGHT_GRAY);
		przycisk_f7.setMargin(new Insets(1, 1, 1, 1));
		przycisk_f7.setFont(new Font("Arial", Font.BOLD, 11));
		add(przycisk_f7);
		przycisk_f7.addActionListener(this);
		przycisk_f7.addKeyListener(this);

		przycisk_down = new JButton("\\/");
		przycisk_down.setBounds(210, 150, 50, 50);
		przycisk_down.setBackground(Color.LIGHT_GRAY);
		przycisk_down.setMargin(new Insets(1, 1, 1, 1));
		przycisk_down.setFont(new Font("Arial", Font.BOLD, 11));
		add(przycisk_down);
		przycisk_down.addActionListener(this);
		przycisk_down.addKeyListener(this);

		przycisk_ilosc = new JButton("Ilosc");
		przycisk_ilosc.setBounds(10, 200, 50, 50);
		przycisk_ilosc.setBackground(Color.LIGHT_GRAY);
		przycisk_ilosc.setMargin(new Insets(1, 1, 1, 1));
		przycisk_ilosc.setFont(new Font("Arial", Font.BOLD, 11));
		add(przycisk_ilosc);
		przycisk_ilosc.addActionListener(this);
		przycisk_ilosc.addKeyListener(this);

		przycisk_7 = new JButton("7");
		przycisk_7.setBounds(60, 200, 50, 50);
		przycisk_7.setBackground(Color.YELLOW);
		przycisk_7.setMargin(new Insets(1, 1, 1, 1));
		przycisk_7.setFont(new Font("Arial", Font.BOLD, 15));
		add(przycisk_7);
		przycisk_7.addActionListener(this);
		przycisk_7.addKeyListener(this);

		przycisk_8 = new JButton("8");
		przycisk_8.setBounds(110, 200, 50, 50);
		przycisk_8.setBackground(Color.YELLOW);
		przycisk_8.setMargin(new Insets(1, 1, 1, 1));
		przycisk_8.setFont(new Font("Arial", Font.BOLD, 15));
		add(przycisk_8);
		przycisk_8.addActionListener(this);
		przycisk_8.addKeyListener(this);

		przycisk_9 = new JButton("9");
		przycisk_9.setBounds(160, 200, 50, 50);
		przycisk_9.setBackground(Color.YELLOW);
		przycisk_9.setMargin(new Insets(1, 1, 1, 1));
		przycisk_9.setFont(new Font("Arial", Font.BOLD, 15));
		add(przycisk_9);
		przycisk_9.addActionListener(this);
		przycisk_9.addKeyListener(this);

		przycisk_czysc = new JButton("Czysc");
		przycisk_czysc.setBounds(210, 200, 50, 50);
		przycisk_czysc.setBackground(Color.LIGHT_GRAY);
		przycisk_czysc.setMargin(new Insets(1, 1, 1, 1));
		przycisk_czysc.setFont(new Font("Arial", Font.BOLD, 11));
		add(przycisk_czysc);
		przycisk_czysc.addActionListener(this);
		przycisk_czysc.addKeyListener(this);

		przycisk_cena = new JButton("Cena");
		przycisk_cena.setBounds(10, 250, 50, 50);
		przycisk_cena.setBackground(Color.LIGHT_GRAY);
		przycisk_cena.setMargin(new Insets(1, 1, 1, 1));
		przycisk_cena.setFont(new Font("Arial", Font.BOLD, 11));
		add(przycisk_cena);
		przycisk_cena.addActionListener(this);
		przycisk_cena.addKeyListener(this);

		przycisk_4 = new JButton("4");
		przycisk_4.setBounds(60, 250, 50, 50);
		przycisk_4.setBackground(Color.YELLOW);
		przycisk_4.setMargin(new Insets(1, 1, 1, 1));
		przycisk_4.setFont(new Font("Arial", Font.BOLD, 15));
		add(przycisk_4);
		przycisk_4.addActionListener(this);
		przycisk_4.addKeyListener(this);

		przycisk_5 = new JButton("5");
		przycisk_5.setBounds(110, 250, 50, 50);
		przycisk_5.setBackground(Color.YELLOW);
		przycisk_5.setMargin(new Insets(1, 1, 1, 1));
		przycisk_5.setFont(new Font("Arial", Font.BOLD, 15));
		add(przycisk_5);
		przycisk_5.addActionListener(this);
		przycisk_5.addKeyListener(this);

		przycisk_6 = new JButton("6");
		przycisk_6.setBounds(160, 250, 50, 50);
		przycisk_6.setBackground(Color.YELLOW);
		przycisk_6.setMargin(new Insets(1, 1, 1, 1));
		przycisk_6.setFont(new Font("Arial", Font.BOLD, 15));
		add(przycisk_6);
		przycisk_6.addActionListener(this);
		przycisk_6.addKeyListener(this);

		przycisk_nazwa = new JButton("Nazwa");
		przycisk_nazwa.setBounds(210, 250, 50, 50);
		przycisk_nazwa.setBackground(Color.LIGHT_GRAY);
		przycisk_nazwa.setMargin(new Insets(1, 1, 1, 1));
		przycisk_nazwa.setFont(new Font("Arial", Font.BOLD, 11));
		add(przycisk_nazwa);
		przycisk_nazwa.addActionListener(this);
		przycisk_nazwa.addKeyListener(this);

		przycisk_znakp = new JButton("Znak >");
		przycisk_znakp.setBounds(10, 300, 50, 50);
		przycisk_znakp.setBackground(Color.LIGHT_GRAY);
		przycisk_znakp.setMargin(new Insets(1, 1, 1, 1));
		przycisk_znakp.setFont(new Font("Arial", Font.BOLD, 11));
		add(przycisk_znakp);
		przycisk_znakp.addActionListener(this);
		przycisk_znakp.addKeyListener(this);

		przycisk_1 = new JButton("1");
		przycisk_1.setBounds(60, 300, 50, 50);
		przycisk_1.setBackground(Color.YELLOW);
		przycisk_1.setMargin(new Insets(1, 1, 1, 1));
		przycisk_1.setFont(new Font("Arial", Font.BOLD, 15));
		add(przycisk_1);
		przycisk_1.addActionListener(this);
		przycisk_1.addKeyListener(this);

		przycisk_2 = new JButton("2");
		przycisk_2.setBounds(110, 300, 50, 50);
		przycisk_2.setBackground(Color.YELLOW);
		przycisk_2.setMargin(new Insets(1, 1, 1, 1));
		przycisk_2.setFont(new Font("Arial", Font.BOLD, 15));
		add(przycisk_2);
		przycisk_2.addActionListener(this);
		przycisk_2.addKeyListener(this);

		przycisk_3 = new JButton("3");
		przycisk_3.setBounds(160, 300, 50, 50);
		przycisk_3.setBackground(Color.YELLOW);
		przycisk_3.setMargin(new Insets(1, 1, 1, 1));
		przycisk_3.setFont(new Font("Arial", Font.BOLD, 15));
		add(przycisk_3);
		przycisk_3.addActionListener(this);
		przycisk_3.addKeyListener(this);

		przycisk_razem = new JButton("Razem");
		przycisk_razem.setBounds(210, 300, 50, 50);
		przycisk_razem.setBackground(Color.LIGHT_GRAY);
		przycisk_razem.setMargin(new Insets(1, 1, 1, 1));
		przycisk_razem.setFont(new Font("Arial", Font.BOLD, 11));
		add(przycisk_razem);
		przycisk_razem.addActionListener(this);
		przycisk_razem.addKeyListener(this);

		przycisk_znakl = new JButton("Znak <");
		przycisk_znakl.setBounds(10, 350, 50, 50);
		przycisk_znakl.setBackground(Color.LIGHT_GRAY);
		przycisk_znakl.setMargin(new Insets(1, 1, 1, 1));
		przycisk_znakl.setFont(new Font("Arial", Font.BOLD, 11));
		add(przycisk_znakl);
		przycisk_znakl.addActionListener(this);
		przycisk_znakl.addKeyListener(this);

		przycisk_0 = new JButton("0");
		przycisk_0.setBounds(60, 350, 50, 50);
		przycisk_0.setBackground(Color.YELLOW);
		przycisk_0.setMargin(new Insets(1, 1, 1, 1));
		przycisk_0.setFont(new Font("Arial", Font.BOLD, 15));
		add(przycisk_0);
		przycisk_0.addActionListener(this);
		przycisk_0.addKeyListener(this);

		przycisk_00 = new JButton("00");
		przycisk_00.setBounds(110, 350, 50, 50);
		przycisk_00.setBackground(Color.YELLOW);
		przycisk_00.setMargin(new Insets(1, 1, 1, 1));
		przycisk_00.setFont(new Font("Arial", Font.BOLD, 15));
		add(przycisk_00);
		przycisk_00.addActionListener(this);
		przycisk_00.addKeyListener(this);

		przycisk_kropka = new JButton(".");
		przycisk_kropka.setBounds(160, 350, 50, 50);
		przycisk_kropka.setBackground(Color.YELLOW);
		przycisk_kropka.setMargin(new Insets(1, 1, 1, 1));
		przycisk_kropka.setFont(new Font("Arial", Font.BOLD, 15));
		add(przycisk_kropka);
		przycisk_kropka.addActionListener(this);
		przycisk_kropka.addKeyListener(this);

		przycisk_menu = new JButton("PLU");
		przycisk_menu.setBounds(210, 350, 50, 50);
		przycisk_menu.setBackground(Color.GREEN);
		przycisk_menu.setMargin(new Insets(1, 1, 1, 1));
		przycisk_menu.setFont(new Font("Arial", Font.BOLD, 11));
		add(przycisk_menu);
		przycisk_menu.addActionListener(this);
		przycisk_menu.addKeyListener(this);

		przycisk_wlacznik = new JButton("I/O");
		przycisk_wlacznik.setBounds(10, 440, 50, 50);
		przycisk_wlacznik.setBackground(Color.red);
		przycisk_wlacznik.setMargin(new Insets(1, 1, 1, 1));
		przycisk_wlacznik.setFont(new Font("Arial", Font.BOLD, 15));
		add(przycisk_wlacznik);
		przycisk_wlacznik.addActionListener(this);
		przycisk_wlacznik.addKeyListener(this);
		
		przycisk_informacja = new JButton("i");
		przycisk_informacja.setBounds(210, 440, 50, 50);
		przycisk_informacja.setBackground(Color.blue);
		przycisk_informacja.setMargin(new Insets(1, 1, 1, 1));
		przycisk_informacja.setFont(new Font("Arial", Font.BOLD, 17));
		przycisk_informacja.setForeground(Color.white);
		add(przycisk_informacja);
		przycisk_informacja.addActionListener(this);
		przycisk_informacja.addKeyListener(this);

	}

	// ===========================================================//

	public void obsluga_przycisku_informacja() {
		Guide instrukcja_obslugi = new Guide();
		instrukcja_obslugi.setVisible(true);
	}
	
	public void obsluga_przycisku_wlacznik() {
		if (kasa.stan_wlaczony == false) {
			kasa.stan_wlaczony = true;
			przycisk_wlacznik.setBackground(Color.green);
			wyswietlacz.setBackground(Color.green);
			wyswietlacz.setText("Witamy!");
		} else {
			kasa.stan_wlaczony = false;
			przycisk_wlacznik.setBackground(Color.red);
			wyswietlacz.setBackground(new Color(0, 100, 0));
			wyswietlacz.setText("");
			paragon.setText("");
		}
	}

	public void obsluga_przycisku_wyjscie() {
		System.out.println("LOG: BUTTON 1x1 [ESC] tapped");
		dispose();
	}

	public void obsluga_przycisku_f1() {
	}

	public void obsluga_przycisku_f2() {

	}

	public void obsluga_przycisku_f3() {

	}

	public void obsluga_przycisku_f4() {

	}

	public void obsluga_przycisku_f5() {

	}

	public void obsluga_przycisku_f6() {

	}

	public void obsluga_przycisku_f7() {

	}

	public void obsluga_przycisku_up() {
		if (kasa.tryb_czysc == true) {
			if (kasa.iterator_pozycji < kasa.zakupy.size() - 1) {
				kasa.iterator_pozycji++;
			} else {
				kasa.iterator_pozycji = 0;
			}
			wyswietlacz.setText("- " + kasa.zakupy.get(kasa.iterator_pozycji).nazwa);
		}

		if (kasa.tryb_kod == true) {
			for (int i = 0; i < kasa.lista_produktow.size(); i++) {
				if (kasa.skanowany_artykul.kod == kasa.lista_produktow.get(i).kod) {
					kasa.iterator_pozycji = i;
					break;
				}
			}
			if (kasa.iterator_pozycji < kasa.lista_produktow.size() - 1) {
				kasa.iterator_pozycji++;
			} else {
				kasa.iterator_pozycji = 0;
			}
			kasa.skanowany_artykul.kod = kasa.lista_produktow.get(kasa.iterator_pozycji).kod;
			kasa.skanowany_artykul.nazwa = kasa.lista_produktow.get(kasa.iterator_pozycji).nazwa;
			kasa.skanowany_artykul.cena = kasa.lista_produktow.get(kasa.iterator_pozycji).cena;
			wyswietlacz.setText("Kod: " + kasa.skanowany_artykul.kod + "   " + kasa.skanowany_artykul.nazwa);
		}

	}

	public void obsluga_przycisku_down() {
		if (kasa.tryb_czysc == true) {
			if (kasa.iterator_pozycji > 0) {
				kasa.iterator_pozycji--;
			} else {
				kasa.iterator_pozycji = kasa.zakupy.size() - 1;
			}
			wyswietlacz.setText("- " + kasa.zakupy.get(kasa.iterator_pozycji).nazwa);
		}
		if (kasa.tryb_kod == true) {
			for (int i = 0; i < kasa.lista_produktow.size(); i++) {
				if (kasa.skanowany_artykul.kod == kasa.lista_produktow.get(i).kod) {
					kasa.iterator_pozycji = i;
					break;
				}
			}
			if (kasa.iterator_pozycji > 0) {
				kasa.iterator_pozycji--;
			} else {
				kasa.iterator_pozycji = kasa.lista_produktow.size() - 1;
			}
			kasa.skanowany_artykul.kod = kasa.lista_produktow.get(kasa.iterator_pozycji).kod;
			kasa.skanowany_artykul.nazwa = kasa.lista_produktow.get(kasa.iterator_pozycji).nazwa;
			kasa.skanowany_artykul.cena = kasa.lista_produktow.get(kasa.iterator_pozycji).cena;
			wyswietlacz.setText("Kod: " + kasa.skanowany_artykul.kod + "   " + kasa.skanowany_artykul.nazwa);
		}
	}

	public static void obsluga_przycisku_znakp() {

	}

	public static void obsluga_przycisku_znakl() {

	}

	public void obsluga_przycisku_cena() {
		System.out.println("LOG: BUTTON 1x4 [CENA] tapped");

		kasa.stan_kropka = false;
		kasa.ktora_cyfra = 0;
		kasa.po_przecinku = 0;

		kasa.resetujTryby();
		kasa.tryb_cena = true;

		wyswietlacz.setText("Kod: " + kasa.skanowany_artykul.kod + "   " + kasa.skanowany_artykul.nazwa + "\nCena: "
				+ kasa.skanowany_artykul.cena);

	}

	public void obsluga_przycisku_ilosc() {
		System.out.println("LOG: BUTTON 1x3 [ILOSC] tapped");

		kasa.stan_kropka = false;
		kasa.ktora_cyfra = 0;
		kasa.po_przecinku = 0;

		kasa.resetujTryby();
		kasa.tryb_ilosc = true;

		wyswietlacz.setText("Kod: " + kasa.skanowany_artykul.kod + "   " + kasa.skanowany_artykul.nazwa + "\nIlosc: "
				+ kasa.skanowany_artykul.ilosc);
	}

	public void obsluga_przycisku_nazwa() {
		System.out.println("LOG: BUTTON 5x4 [NAZWA] tapped");

		kasa.stan_kropka = false;
		kasa.ktora_cyfra = 0;
		kasa.po_przecinku = 0;

		kasa.resetujTryby();
		kasa.tryb_nazwa = true;

		wyswietlacz.setText("Ilosc: " + kasa.skanowany_artykul.ilosc);

	}

	public void obsluga_przycisku_czysc() {
		System.out.println("LOG: BUTTON 5x3 [CZYSC] tapped");

		kasa.iterator_pozycji = 0;

		kasa.resetujTryby();
		if (kasa.zakupy.size() > 0) {
			kasa.tryb_czysc = true;
			wyswietlacz.setText("- " + kasa.zakupy.get(kasa.iterator_pozycji).nazwa);
		} else {
			wyswietlacz.setText("- Blad. Nie znaleziono zadnej pozycji!");
			kasa.tryb_kod = true;
		}
	}

	public void obsluga_przycisku_num(Character znak_pom) {

		if (kasa.tryb_nazwa == true) {
			kasa.skanowany_artykul.nazwa = kasa.skanowany_artykul.nazwa + znak_pom;
			wyswietlacz.setText("Nazwa: " + kasa.skanowany_artykul.nazwa);
		}

		if (kasa.tryb_kod == true) {
			kasa.pomocniczy = kasa.pomocniczy + znak_pom;

			kasa.skanowany_artykul.kod = kasa.dopelnijZerami(kasa.pomocniczy);

			for (int i = 0; i < kasa.lista_produktow.size(); i++) {
				if (kasa.lista_produktow.get(i).kod.equals(kasa.skanowany_artykul.kod) == true) {
					kasa.skanowany_artykul.nazwa = kasa.lista_produktow.get(i).nazwa;
					kasa.skanowany_artykul.cena = kasa.lista_produktow.get(i).cena;
					break;
				} else {
					kasa.skanowany_artykul.nazwa = "";
					kasa.skanowany_artykul.cena = 0.00;
				}
			}

			wyswietlacz.setText("Kod: " + kasa.skanowany_artykul.kod + "   " + kasa.skanowany_artykul.nazwa);
			kasa.ktora_cyfra++;
		}

		if (kasa.tryb_cena == true) {
			if (kasa.stan_kropka == true) {
				if (kasa.po_przecinku < 2) {
					kasa.pomocniczy = kasa.zamiana(kasa.pomocniczy, kasa.ktora_cyfra + 1, znak_pom);
					kasa.po_przecinku++;
					kasa.ktora_cyfra++;
				}
			} else {
				kasa.pomocniczy = kasa.zamiana(kasa.pomocniczy, kasa.ktora_cyfra, znak_pom);
				kasa.ktora_cyfra++;
			}
			kasa.skanowany_artykul.cena = Double.parseDouble(kasa.pomocniczy);
			wyswietlacz.setText("Kod: " + kasa.skanowany_artykul.kod + "   " + kasa.skanowany_artykul.nazwa + "\nCena: "
					+ String.format("%.2f", kasa.skanowany_artykul.cena));
		}

		if (kasa.tryb_ilosc == true) {
			if (kasa.stan_kropka == true) {
				if (kasa.po_przecinku < 3) {
					kasa.pomocniczy = kasa.zamiana(kasa.pomocniczy, kasa.ktora_cyfra + 1, znak_pom);
					kasa.po_przecinku++;
					kasa.ktora_cyfra++;
				}
			} else {
				kasa.pomocniczy = kasa.zamiana(kasa.pomocniczy, kasa.ktora_cyfra, znak_pom);
				kasa.ktora_cyfra++;
			}
			kasa.skanowany_artykul.ilosc = Double.parseDouble(kasa.pomocniczy);
			wyswietlacz.setText("Kod: " + kasa.skanowany_artykul.kod + "   " + kasa.skanowany_artykul.nazwa
					+ "\nIlosc: " + String.format("%.3f", kasa.skanowany_artykul.ilosc));

		}

		if (kasa.tryb_gotowka == true) {
			if (kasa.stan_kropka == true) {
				if (kasa.po_przecinku < 2) {
					kasa.pomocniczy = kasa.zamiana(kasa.pomocniczy, kasa.ktora_cyfra + 1, znak_pom);
					kasa.po_przecinku++;
					kasa.ktora_cyfra++;
				}
			} else {
				kasa.pomocniczy = kasa.zamiana(kasa.pomocniczy, kasa.ktora_cyfra, znak_pom);
				kasa.ktora_cyfra++;
			}
			kasa.gotowka = Double.parseDouble(kasa.pomocniczy);
			wyswietlacz.setText(
					"SUMA: " + String.format("%.2f", kasa.suma) + "\nGotowka: " + String.format("%.2f", kasa.gotowka));
		}
	}

	public void obsluga_przycisku_kropka() {
		System.out.println("LOG: BUTTON 2x5 [DOT] tapped");
		if (kasa.tryb_kod == true) {

		} else {
			if (kasa.ktora_cyfra == 0) {
				kasa.ktora_cyfra = 1;
			} else {

			}
			kasa.stan_kropka = true;
		}
	}

	public void obsluga_przycisku_razem() {
		System.out.println("LOG: BUTTON 5x5 [RAZEM] tapped");

		if (kasa.tryb_czysc == true) {
			kasa.wydruk = "NAZWA FIRMY sp. z.o.o.\nAdres firmy ul. ulica nr\nNIP 00-11-22-33-44\n\nPARAGON FISKALNY"
					+ "\n\n" + "ANULOWANO";
			kasa.suma = 0.0;
			kasa.resetujTryby();
			kasa.tryb_wydruk = true;
		} else {
			kasa.resetujTryby();
			kasa.tryb_gotowka = true;

			kasa.gotowka = kasa.suma;
			kasa.pomocniczy = "0.00";
			wyswietlacz.setText(
					"SUMA: " + String.format("%.2f", kasa.suma) + "\nGotowka: " + String.format("%.2f", kasa.gotowka));
		}

	}

	public void obsluga_przycisku_menu() {
		if (kasa.tryb_kod == true) {
			if(kasa.czyIstnieje(kasa.skanowany_artykul.kod)){
				kasa.resetujTryby();
				kasa.tryb_cena = true;

				kasa.stan_kropka = false;
				kasa.ktora_cyfra = 0;
				kasa.po_przecinku = 0;
				kasa.pomocniczy = "0.00";

				wyswietlacz.setText("Kod: " + kasa.skanowany_artykul.kod + "   " + kasa.skanowany_artykul.nazwa + "\nCena: "
						+ String.format("%.2f", kasa.skanowany_artykul.cena));
			}
			else{
				kasa.resetujTryby();
				kasa.tryb_kod = true;

				kasa.stan_kropka = false;
				kasa.ktora_cyfra = 0;
				kasa.po_przecinku = 0;
				kasa.pomocniczy = "";

				wyswietlacz.setText("Blad: Nie znaleziono produktu!\nWprowadz poprawny kod.");
			}

		} else if (kasa.tryb_cena == true) {

			kasa.resetujTryby();
			kasa.tryb_ilosc = true;

			kasa.stan_kropka = false;
			kasa.ktora_cyfra = 0;
			kasa.po_przecinku = 0;
			kasa.pomocniczy = "1.000";

			wyswietlacz.setText("Kod: " + kasa.skanowany_artykul.kod + "   " + kasa.skanowany_artykul.nazwa
					+ "\nIlosc: " + String.format("%.3f", kasa.skanowany_artykul.ilosc));

		} else if (kasa.tryb_ilosc == true) {

			kasa.resetujTryby();
			kasa.tryb_kod = true;

			kasa.stan_kropka = false;
			kasa.ktora_cyfra = 0;
			kasa.po_przecinku = 0;
			kasa.pomocniczy = "";

			kasa.skanowany_artykul.wartosc = kasa.skanowany_artykul.ilosc * kasa.skanowany_artykul.cena;
			kasa.suma = kasa.suma + kasa.skanowany_artykul.wartosc;
			kasa.suma = BigDecimal.valueOf(kasa.suma).setScale(2, RoundingMode.HALF_UP).doubleValue();

			kasa.zakupy.addElement(kasa.skanowany_artykul);

			kasa.wydruk = kasa.wydruk + kasa.skanowany_artykul.nazwa + "\t"
					+ String.format("%.3f", kasa.skanowany_artykul.ilosc) + "x"
					+ String.format("%.2f", kasa.skanowany_artykul.cena) + " "
					+ String.format("%.2f", kasa.skanowany_artykul.wartosc) + "\n";

			kasa.skanowany_artykul = new Article();

			wyswietlacz.setText("Kod: " + kasa.skanowany_artykul.kod + "   " + kasa.skanowany_artykul.nazwa);
		} else if (kasa.tryb_gotowka == true) {

			if (kasa.gotowka == 0) {
				kasa.gotowka = kasa.suma;
			}
			kasa.gotowka = BigDecimal.valueOf(kasa.gotowka).setScale(2, RoundingMode.HALF_UP).doubleValue();

			kasa.reszta = kasa.gotowka - kasa.suma;
			kasa.reszta = BigDecimal.valueOf(kasa.reszta).setScale(2, RoundingMode.HALF_UP).doubleValue();

			wyswietlacz.setText(
					"SUMA: " + String.format("%.2f", kasa.suma) + "\nReszta: " + String.format("%.2f", kasa.reszta));

			kasa.resetujTryby();
			kasa.tryb_wydruk = true;

		} else if (kasa.tryb_wydruk == true) {

			kasa.wydruk = kasa.wydruk + "\n\nSUMA:\t" + String.format("%.2f", kasa.suma) + "\nGotowka:\t"
					+ String.format("%.2f", kasa.gotowka) + "\nReszta:\t" + String.format("%.2f", kasa.reszta);

			paragon.setText(kasa.wydruk);

			kasa.zakupy.removeAllElements();

			kasa.skanowany_artykul.kod = "0000";
			kasa.skanowany_artykul.nazwa = "";
			kasa.skanowany_artykul.cena = 0.00;
			kasa.skanowany_artykul.ilosc = 1.000;
			kasa.skanowany_artykul.wartosc = 0.00;

			kasa.gotowka = 0.00;
			kasa.suma = 0.00;
			kasa.ktora_cyfra = kasa.po_przecinku = 0;
			kasa.pomocniczy = "";

			kasa.wydruk = "NAZWA FIRMY sp. z.o.o.\nAdres firmy ul. ulica nr\nNIP 00-11-22-33-44\n\nPARAGON FISKALNY"
					+ "\n\n";

			kasa.resetujTryby();
			kasa.tryb_kod = true;

			wyswietlacz.setText("Kod: " + kasa.skanowany_artykul.kod + "   " + kasa.skanowany_artykul.nazwa);

		} else if (kasa.tryb_czysc == true) {

			kasa.skanowany_artykul = new Article();

			kasa.skanowany_artykul.kod = kasa.zakupy.get(kasa.iterator_pozycji).kod;
			kasa.skanowany_artykul.nazwa = kasa.zakupy.get(kasa.iterator_pozycji).nazwa;
			kasa.skanowany_artykul.cena = kasa.zakupy.get(kasa.iterator_pozycji).cena;
			kasa.skanowany_artykul.ilosc = (-1) * kasa.zakupy.get(kasa.iterator_pozycji).ilosc;
			kasa.skanowany_artykul.wartosc = kasa.skanowany_artykul.cena * kasa.skanowany_artykul.ilosc;

			kasa.suma = kasa.suma + kasa.skanowany_artykul.wartosc;
			kasa.suma = BigDecimal.valueOf(kasa.suma).setScale(2, RoundingMode.HALF_UP).doubleValue();

			kasa.wydruk = kasa.wydruk + kasa.skanowany_artykul.nazwa + "\t"
					+ String.format("%.2f", kasa.skanowany_artykul.ilosc) + "x"
					+ String.format("%.2f", kasa.skanowany_artykul.cena) + " "
					+ String.format("%.2f", kasa.skanowany_artykul.wartosc) + "\n";

			kasa.zakupy.removeElementAt(kasa.iterator_pozycji);

			kasa.resetujTryby();
			kasa.tryb_kod = true;
			kasa.skanowany_artykul = new Article();

			wyswietlacz.setText("Kod: " + kasa.skanowany_artykul.kod + "   " + kasa.skanowany_artykul.nazwa);

		}
	}

	public static void main(String[] args) {
		Guide instrukcja_obslugi = new Guide();
		instrukcja_obslugi.setVisible(true);
		MainWindow okno_glowne = new MainWindow();
		okno_glowne.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		okno_glowne.setVisible(true);

	}

	@Override
	public void actionPerformed(ActionEvent e) {

		Object source = e.getSource();
		
		if (source == przycisk_informacja) {
			System.out.println("LOG: BUTTON 6x2 [INFO] tapped");
			obsluga_przycisku_informacja();
		}

		if (source == przycisk_wlacznik) {
			obsluga_przycisku_wlacznik();
		}

		if (kasa.stan_wlaczony == true) {

			if (source == przycisk_wyjscie) {
				obsluga_przycisku_wyjscie();
			}

			if (source == przycisk_f1) {
				obsluga_przycisku_f1();
			}

			if (source == przycisk_f2) {
				obsluga_przycisku_f2();
			}

			if (source == przycisk_f3) {
				obsluga_przycisku_f3();
			}

			if (source == przycisk_f4) {
				obsluga_przycisku_f4();
			}

			if (source == przycisk_f5) {
				obsluga_przycisku_f5();
			}

			if (source == przycisk_f6) {
				obsluga_przycisku_f6();
			}

			if (source == przycisk_f7) {
				obsluga_przycisku_f7();
			}

			if (source == przycisk_up) {
				obsluga_przycisku_up();
			}

			if (source == przycisk_down) {
				obsluga_przycisku_down();
			}

			if (source == przycisk_znakp) {
				obsluga_przycisku_znakp();
			}

			if (source == przycisk_znakl) {
				obsluga_przycisku_znakl();
			}

			if (source == przycisk_cena) {
				obsluga_przycisku_cena();
			}

			if (source == przycisk_ilosc) {
				obsluga_przycisku_ilosc();
			}

			if (source == przycisk_nazwa) {
				obsluga_przycisku_nazwa();
			}

			if (source == przycisk_czysc) {
				obsluga_przycisku_czysc();
			}

			if (source == przycisk_1 || source == przycisk_2 || source == przycisk_3 || source == przycisk_4
					|| source == przycisk_5 || source == przycisk_6 || source == przycisk_7 || source == przycisk_8
					|| source == przycisk_9 || source == przycisk_0 || source == przycisk_00) {

				Character znak_pom = '0';
				if (source == przycisk_1) {
					System.out.println("LOG: BUTTON 2x5 [NUM1] tapped");
					znak_pom = '1';
				} else {
					if (source == przycisk_2) {
						System.out.println("LOG: BUTTON 3x5 [NUM2] tapped");
						znak_pom = '2';
					} else {
						if (source == przycisk_3) {
							System.out.println("LOG: BUTTON 4x5 [NUM3] tapped");
							znak_pom = '3';
						} else {
							if (source == przycisk_4) {
								System.out.println("LOG: BUTTON 2x4 [NUM4] tapped");
								znak_pom = '4';
							} else {
								if (source == przycisk_5) {
									System.out.println("LOG: BUTTON 3x4 [NUM5] tapped");
									znak_pom = '5';
								} else {
									if (source == przycisk_6) {
										System.out.println("LOG: BUTTON 4x4 [NUM6] tapped");
										znak_pom = '6';
									} else {
										if (source == przycisk_7) {
											System.out.println("LOG: BUTTON 2x3 [NUM7] tapped");
											znak_pom = '7';
										} else {
											if (source == przycisk_8) {
												System.out.println("LOG: BUTTON 3x3 [NUM8] tapped");
												znak_pom = '8';
											} else {
												if (source == przycisk_9) {
													System.out.println("LOG: BUTTON 4x3 [NUM9] tapped");
													znak_pom = '9';
												} else {
													if (source == przycisk_0) {
														System.out.println("LOG: BUTTON 2x6 [NUM0] tapped");
														znak_pom = '0';
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}

				obsluga_przycisku_num(znak_pom);
			}

			if (source == przycisk_kropka) {
				obsluga_przycisku_kropka();
			}

			if (source == przycisk_razem) {
				obsluga_przycisku_razem();
			}

			if (source == przycisk_menu) {
				System.out.println("LOG: BUTTON 5x6 [PLU/MENU] tapped");
				obsluga_przycisku_menu();
			}
		}

	}

	@Override
	public void keyPressed(KeyEvent e) {
		int source = e.getKeyCode();
		
		if (source == KeyEvent.VK_H) {
			System.out.println("LOG: BUTTON 6x2 [INFO] tapped");
			obsluga_przycisku_informacja();
		}

		if (source == KeyEvent.VK_CONTROL || source == KeyEvent.VK_SPACE) {
			obsluga_przycisku_wlacznik();
		}

		if (kasa.stan_wlaczony == true) {

			if (source == KeyEvent.VK_ESCAPE) {
				obsluga_przycisku_wyjscie();
			}

			if (source == KeyEvent.VK_F1) {
				obsluga_przycisku_f1();
			}

			if (source == KeyEvent.VK_F2) {
				obsluga_przycisku_f2();
			}

			if (source == KeyEvent.VK_F3) {
				obsluga_przycisku_f3();
			}

			if (source == KeyEvent.VK_F4) {
				obsluga_przycisku_f4();
			}

			if (source == KeyEvent.VK_F5) {
				obsluga_przycisku_f5();
			}

			if (source == KeyEvent.VK_F6) {
				obsluga_przycisku_f6();
			}

			if (source == KeyEvent.VK_F7) {
				obsluga_przycisku_f7();
			}

			if (source == KeyEvent.VK_UP) {
				obsluga_przycisku_up();
			}

			if (source == KeyEvent.VK_DOWN) {
				obsluga_przycisku_down();
			}

			if (source == KeyEvent.VK_RIGHT) {
				obsluga_przycisku_znakp();
			}

			if (source == KeyEvent.VK_LEFT) {
				obsluga_przycisku_znakl();
			}

			if (source == KeyEvent.VK_C) {
				obsluga_przycisku_cena();
			}

			if (source == KeyEvent.VK_I) {
				obsluga_przycisku_ilosc();
			}

			if (source == KeyEvent.VK_N) {
				obsluga_przycisku_nazwa();
			}

			if (source == KeyEvent.VK_BACK_SPACE || source == KeyEvent.VK_DELETE) {
				obsluga_przycisku_czysc();
			}

			if (source == KeyEvent.VK_1 || source == KeyEvent.VK_NUMPAD1 || source == KeyEvent.VK_2
					|| source == KeyEvent.VK_NUMPAD2 || source == KeyEvent.VK_3 || source == KeyEvent.VK_NUMPAD3
					|| source == KeyEvent.VK_4 || source == KeyEvent.VK_NUMPAD4 || source == KeyEvent.VK_5
					|| source == KeyEvent.VK_NUMPAD5 || source == KeyEvent.VK_6 || source == KeyEvent.VK_NUMPAD6
					|| source == KeyEvent.VK_7 || source == KeyEvent.VK_NUMPAD7 || source == KeyEvent.VK_8
					|| source == KeyEvent.VK_NUMPAD8 || source == KeyEvent.VK_9 || source == KeyEvent.VK_NUMPAD9
					|| source == KeyEvent.VK_0 || source == KeyEvent.VK_NUMPAD0) {

				Character znak_pom = '0';
				if (source == KeyEvent.VK_1 || source == KeyEvent.VK_NUMPAD1) {
					System.out.println("LOG: BUTTON 2x5 [NUM1] tapped");
					znak_pom = '1';
				} else {
					if (source == KeyEvent.VK_2 || source == KeyEvent.VK_NUMPAD2) {
						System.out.println("LOG: BUTTON 3x5 [NUM2] tapped");
						znak_pom = '2';
					} else {
						if (source == KeyEvent.VK_3 || source == KeyEvent.VK_NUMPAD3) {
							System.out.println("LOG: BUTTON 4x5 [NUM3] tapped");
							znak_pom = '3';
						} else {
							if (source == KeyEvent.VK_4 || source == KeyEvent.VK_NUMPAD4) {
								System.out.println("LOG: BUTTON 2x4 [NUM4] tapped");
								znak_pom = '4';
							} else {
								if (source == KeyEvent.VK_5 || source == KeyEvent.VK_NUMPAD5) {
									System.out.println("LOG: BUTTON 3x4 [NUM5] tapped");
									znak_pom = '5';
								} else {
									if (source == KeyEvent.VK_6 || source == KeyEvent.VK_NUMPAD6) {
										System.out.println("LOG: BUTTON 4x4 [NUM6] tapped");
										znak_pom = '6';
									} else {
										if (source == KeyEvent.VK_7 || source == KeyEvent.VK_NUMPAD7) {
											System.out.println("LOG: BUTTON 2x3 [NUM7] tapped");
											znak_pom = '7';
										} else {
											if (source == KeyEvent.VK_8 || source == KeyEvent.VK_NUMPAD8) {
												System.out.println("LOG: BUTTON 3x3 [NUM8] tapped");
												znak_pom = '8';
											} else {
												if (source == KeyEvent.VK_9 || source == KeyEvent.VK_NUMPAD9) {
													System.out.println("LOG: BUTTON 4x3 [NUM9] tapped");
													znak_pom = '9';
												} else {
													if (source == KeyEvent.VK_0 || source == KeyEvent.VK_NUMPAD0) {
														System.out.println("LOG: BUTTON 2x6 [NUM0] tapped");
														znak_pom = '0';
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}

				obsluga_przycisku_num(znak_pom);
			}

			if (source == KeyEvent.VK_COMMA || source == KeyEvent.VK_PERIOD) {
				obsluga_przycisku_kropka();
			}

			if (source == KeyEvent.VK_R) {
				obsluga_przycisku_razem();
			}

			if (source == KeyEvent.VK_ENTER) {
				System.out.println("LOG: BUTTON 5x6 [PLU/MENU] tapped");
				obsluga_przycisku_menu();
			}
		}

	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub

	}
}
