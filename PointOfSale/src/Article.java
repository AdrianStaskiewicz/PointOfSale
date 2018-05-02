import java.math.BigDecimal;
import java.math.RoundingMode;

public class Article {
	String nazwa;
	String kod;
	Double cena;
	Double ilosc;
	Double wartosc;

	public Article() {
		nazwa = "";
		kod = "0000";
		cena = 0.00;
		ilosc = 1.000;
		wartosc = ilosc * cena;
	}
}
