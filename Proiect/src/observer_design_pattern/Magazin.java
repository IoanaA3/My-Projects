package observer_design_pattern;

import java.util.*;

public class Magazin implements Subject{
	/**
	 * parametru ce reprezinta o lista in care vor fi stocati abonatii magazinului
	 */

	private List<Observer> obs = new ArrayList<>(); 
	
	/**
	 * Returneaza TRUE daca clientul ce urmeaza sa se aboneze nu se mai regaseste in lista
	 * FALSE daca se gaseste
	 */
	@Override
	
	public boolean addObserver(Observer o) {
		for(int i=0;i < obs.size();i++)
		{			
			if(((Abonat)obs.get(i)).getName().equals(((Abonat)o).getName())){
				return false;
			}			
		}
		obs.add(o);
			return true;
	}
	/**
	 * Returneaza TRUE daca clientul care doreste sa se dezaboneze se regateste in lista
	 * FALSE daca nu
	 */
	@Override
	public boolean deleteObserver(Observer o) {		
		for(int i=0;i < obs.size();i++)
		{			
			if(((Abonat)obs.get(i)).getName().equals(((Abonat)o).getName())){					
				obs.remove((Abonat)obs.get(i));				
				return true;
			}
		}
		return false;
	}
	
	//----------------------------------//
	/**
	 * Metoda parcurge lista de abonati si ii notifica pe care dintre ei cu un mesaj atunci cand
	 * apar reduceri in magazin
	 */
	@Override
	public void notifyObserver(String text) {
		for (Observer observer : obs) {
            observer.update(text);
        }
	}
	//---------------------------------------------//
	/**
	 * 
	 * @return Metoda returneza lista cu toti abonatii magazinului
	 */
	public String getList(){
		String lista = new String();
		
		for(int i=0;i < obs.size();i++)
		lista = lista + "  " + ((Abonat)obs.get(i)).getName() + "\n";
		
		return lista;
	}
}
