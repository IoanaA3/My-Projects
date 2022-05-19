package observer_design_pattern;

public class Abonat implements Observer {
	/**
	 * Parametru ce va fi folosit pentru a retine numele clientului
	 */

	private String name;
	/**
	 * Constructor
	 * 
	 * @param a_name parametru ce va retine numele clientilor
	 */
	
	Abonat(String a_name){
		name = a_name;
	}
	//----------------------------------//
	/**
	 * metoda ce permite ca un observer sa se aboneze la magazin
	 *  cu conditia ca acesta sa nu existe deja in lista de abonati
	 *  
	 * @param mag parametru ce va permite apelarea metodei addObserver pt a adauga in lista noul abonat
	 */
	
	public void Subscribe(Magazin mag){
		boolean flag =
		mag.addObserver(this);
		
		if(flag)
		System.out.print("\n" + name +" s-a abonat la magazin!" + "\n");
		else
			System.out.println(" Exista deja persoana abonata");
	}
	/**
	 * Metoda ce permite ca un observer sa se dezaboneze de la magazin
	 * 
	 * @param mag parametru ce va permite apelarea metodei deleteObserver pt a elimina din lista abonatul dorit
	 */
	public void Unsubscribe(Magazin mag){
		boolean flag =
				mag.deleteObserver(this);
		
		if(flag)
		System.out.print("\n" + name + " s-a dezabonat de la magazin!" + "\n");
		else
			System.out.println("\nNu exista persoana in lista de abonati\n");
	}
	
	
	/**
	 * metoda afiseaza un mesaj ce va fi primit de fiecare abonat in parte cand apar reduceri in magazin
	 * Va fi apelata in clasa Magazin, in functie notifyObserver, care va parcurge toata lista abonatilor
	 * si va trimite fiecaruia mesajul din functia update
	 */
	@Override
	
	public void update(String msg) {
		System.out.print("\n"+ name +" reducere valabila de: " + msg + "\n");
	}
	
	/**
	 * 
	 * @return Metoda returneaza un string, numele abonatului
	 */
	
	public String getName() {
    	return name;
  	}
}
