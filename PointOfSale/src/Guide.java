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

public class Guide extends JFrame implements ActionListener, KeyListener {

	JButton przycisk_wyjscie;

	JTextArea wyswietlacz;

	public Guide() {

		setSize(850, 540);
		setTitle("Instrukcja");
		setLocation(500,0);

		setLayout(null);

		wyswietlacz = new JTextArea();
		wyswietlacz.setBounds(70, 10, 750, 480);
		wyswietlacz.setMargin(new Insets(5, 5, 5, 5));
		wyswietlacz.setBackground(new Color(255, 255, 255));
		wyswietlacz.setFont(new Font("Arial", Font.BOLD, 11));
		wyswietlacz.setEditable(false);
		add(wyswietlacz);
		wyswietlacz.addKeyListener(this);
		wyswietlacz.setText(
				"INSTRUKCJA OBSLUGI\n\n"+"1. Aby uruchomic kase fiskalna wcisnij przycisk [I/O] lub [SPACJA].\n"
						+"2. Kasa automatycznie przejdzie w tryb sprzedazy.\n"
						+"3. Aby recznie wprowadzic kod produktu wystarczy zaczac wpisywac kod korzystajac z klawiatury numerycznej lub przyciskow [NUM].\n"
						+"UWAGA! Dla ulatwienia kody zostaly skrocone do 4 cyfr i maja format: ####\n"
						+"4. Przyciski [UP]/[DOWN] pozwalaja na przewijanie po liscie dostepnych produktow.\n"
						+"5. Kod nalezy zatwierdzic przyciskiem [PLU] lub [ENTER].\n"
						+"6. Kolejne tryby (cena, ilosc) dzialaja analogicznie. Po wpisaniu wartosci zatwierdzamy przyciskiem [PLU] lub [ENTER].\n"
						+"7. Aby usunac produkt z paragonu nalezy uzyc przycisku [CZYSC] lub klawisza [BACKSPACE].\n"
						+"8. Przyciski [UP]/[DOWN] pozwalaja na przewijanie po liscie zeskanowanych produktow.\n"
						+"9 W celu zakonczenia transakcji nalezy wcisnac przycisk [RAZEM] lub klawisz [R].\n"
						+"10. Po przejsciu do podsumowania mozna wprowadzic kwote otrzymana od klienta i zatwierdzic operacje.\n"
						+"11. Kolejne wcisniecie przycisku [ENTER] lub [PLU] spowoduje wydruk paragonu.\n"
						+"12. Aby rozpoczac kolejna transakcje wystarczy wprowadzic kod lub zeskanowac produkt.\n"
						+"13. Anulowanie calej transakcji jest mozliwe za pomoca przyciskow [CZYSC] -> [RAZEM] -> [ENTER].\n"
						+"\nSTEROWANIE \n\nUruchomienie kasy\t>>>  [PRZYCISK I/O] / [SPACJA] / [CTRL]\n"
						+ "Wybor cyfry\t\t>>>  [PRZYCISKI NUM] / [NUM] / [NUMPAD]\n"
						+ "Przecinek\t\t>>>  [PRZYCISK '.'] / [KROPKA]\n"
						+ "Tryb cena\t\t>>>  [PRZYCISK CENA] / [C]\n"
						+ "Tryb ilosc\t\t>>>  [PRZYCISK ILOSC] / [I]\n"
						+ "Tryb czysc\t\t>>>  [PRZYCISK CZYSC] / [BACKSPACE]\n"
						+ "Podsumowanie\t\t>>>  [PRZYCISK RAZEM]/[R]\n"
						+ "Zatwierdzanie\t\t>>>  [PRZYCISK PLU]/[ENTER]\n"
						+ "Przeskakiwanie pozycji w gore\t>>>  [PRZYCISK '/\\']/[UP]\n"
						+ "Przeskakiwanie pozycji w dol\t>>>  [PRZYCISK '\\/']/[DOWN]\n"
						+"\nUWAGA! \n\nPrzyciski [NAZWA]/[N], [ZNAK <]/[LEFT], [ZNAK >]/[RIGHT] oraz [F1-F7] s¹ niedostêpne. Ich wcisniecie nie powoduje zadnej akcji.");

		przycisk_wyjscie = new JButton("ESC");
		przycisk_wyjscie.setBounds(10, 10, 50, 50);
		przycisk_wyjscie.setBackground(Color.RED);
		przycisk_wyjscie.setMargin(new Insets(1, 1, 1, 1));
		przycisk_wyjscie.setFont(new Font("Arial", Font.BOLD, 11));
		add(przycisk_wyjscie);
		przycisk_wyjscie.addActionListener(this);
		przycisk_wyjscie.addKeyListener(this);
	}

	// ===========================================================//

	public void obsluga_przycisku_wyjscie() {
		System.out.println("LOG: BUTTON 1x1 [ESC] tapped");
		dispose();
	}

	@Override
	public void keyPressed(KeyEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object source = e.getSource();
		if (source == przycisk_wyjscie) {
			obsluga_przycisku_wyjscie();
		}

	}
}
