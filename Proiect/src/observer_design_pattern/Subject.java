package observer_design_pattern;

/**
 * Aceasta interfata va fi implementata de catre clasa Magazin. Acea clasa va mosteni metodele acestei
 * interfete, dar va avea si ea metode proprii
 * @author Ioana Axinte
 *
 */

public interface Subject {
	/**
	 *  Functie care este suprascrisa in clasa Magazin
	 *  
	 * @param o reprezinta abonatul ce doreste sa se aboneze la magazin
	 * 
	 * @return returneaza true daca nu se afla in lista, false altfel
	 */

	public boolean addObserver(Observer o);
	
	/**
	 *  Functie care este suprascrisa in clasa Magazin
	 *  
	 * @param o reprezinta abonatul ce doreste sa se dezaboneze de la magazin
	 * 
	 * @return returneaza true daca exista persoana in lista, false altfel
	 */
	public boolean deleteObserver(Observer o);
	
	/**
	 * Functie care este suprascrisa in clasa Magazin
	 * 
	 * @param text notifica fiecare abonat cu privire la ce reduceri sunt in magazin
	 */
	public void notifyObserver(String text);
}
