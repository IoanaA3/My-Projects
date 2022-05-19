package observer_design_pattern;

/**
 * Aceasta interfata va fi implementata de catre clasa Abonat. Acea clasa va mosteni metodele acestei
 * interfete, dar va avea si ea metode proprii
 * @author Ioana Axinte
 *
 */

public interface Observer {
	/**
	 * Functie care este suprascrisa in clasa Abonat
	 * @param msg afiseaza un mesaj ce va contine informatii despre reducerile din magazin
	 */

	public void update(String msg);
}
