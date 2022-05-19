package observer_design_pattern;

import java.awt.EventQueue;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JRadioButton;

public class Main_proiect {

	/**
	 * creare frame
	 */
	private JFrame frmMagazin;
	/**
	 * Grupeaza butoanele radio - ca doar 1 buton sa poata fi bifat la un moment dat
	 * 
	 */

	private ButtonGroup group = new ButtonGroup();

	//----------------------------------//
	private Magazin mag = new Magazin();
	private Abonat p = new Abonat("");					
	//----------------------------------//
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main_proiect window = new Main_proiect();
					window.frmMagazin.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Main_proiect() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmMagazin = new JFrame();
		frmMagazin.setTitle("Magazin abonamente");
		frmMagazin.setBounds(100, 100, 600, 420);
		frmMagazin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmMagazin.getContentPane().setLayout(null);
		
		//----------------------------------//
		
		/**
		 * In acest TextArea vor fi afisati fiecare abonat(lista de abonati)
		 */
		JTextArea textArea = new JTextArea();
		textArea.setEditable(false);
		textArea.setBounds(12, 45, 225, 280);
		frmMagazin.getContentPane().add(textArea);
		
		//----------------------------------//
		 /**
		  * Casuta unde se adauga/sterge abonatul dorit
		  * "Ioana" nu e tot aia cu "ioana" spre exemplu
		  */
		JTextField names = new JTextField();
		names.setBounds(335, 74, 150, 22);
		frmMagazin.getContentPane().add(names);
		names.setColumns(10);
		
		JButton btnAdd = new JButton("Add");
		btnAdd.setBounds(360, 109, 100, 25);
		frmMagazin.getContentPane().add(btnAdd);

		JButton btnRemove = new JButton("Remove");
		btnRemove.setBounds(360, 147, 100, 25);
		frmMagazin.getContentPane().add(btnRemove);
		//---------------------------------//
		/**
		 * Cand apasam pe butonul "Add" se adauga in lista abonat si acesta va aparea in fereastra din stanga
		 */
		
		btnAdd.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String theName = names.getText();
				if(!theName.isEmpty()){
				p = new Abonat(theName);
				p.Subscribe(mag);
				
				}
				names.setText("");
				textArea.setText(mag.getList());
			}
		});
		//----------------Remove------------------//
		/**
		 * Cand apasam butonul "Remove" se elimina din lista abonatul, acest lucru se poate observa prin 
		 * eliminarea lui din lista ce apare in fereastra din stanga
		 */
		btnRemove.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				String theName = names.getText();
				if(!theName.isEmpty()){
				p = new Abonat(theName);
				p.Unsubscribe(mag);
				}
				
				names.setText("");
				
				textArea.setText(mag.getList());
			}
		});
		//----------------------------------//
		/**
		 * Adaugare Labels pentru a sugera mai bine ce rol are fiecare casuta/buton in parte
		 */
		JLabel lblAdaugastergeAbonati = new JLabel("Adauga/Sterge abonati");
		lblAdaugastergeAbonati.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblAdaugastergeAbonati.setBounds(315, 45, 195, 16);
		frmMagazin.getContentPane().add(lblAdaugastergeAbonati);
		
		JLabel lblListaAbonati = new JLabel("Lista abonati");
		lblListaAbonati.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblListaAbonati.setBounds(12, 16, 225, 16);
		frmMagazin.getContentPane().add(lblListaAbonati);
		
		JLabel lblNewLabel = new JLabel("Reduceri");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblNewLabel.setBounds(249, 185, 115, 16);
		frmMagazin.getContentPane().add(lblNewLabel);
		
		//---------------RadioButton-------------------//
	/**
	 * RadioButton - ce contine diferite tipuri de reduceri, de la mici la mari
	 * dand click pe unul din ele, fiecare abonat din lista de abonati va fi notificat cu privire
	 * la aceste noi reduceri
	 */
		JRadioButton radioButton_1 = new JRadioButton("20 - 30 %");
		radioButton_1.setBounds(245, 240, 127, 25);
		frmMagazin.getContentPane().add(radioButton_1);
		
		JRadioButton radioButton_2 = new JRadioButton("40 - 50 %");
		radioButton_2.setBounds(245, 270, 127, 25);
		frmMagazin.getContentPane().add(radioButton_2);
		
		JRadioButton radioButton_3 = new JRadioButton("50 - 75 %");
		radioButton_3.setBounds(245, 300, 127, 25);
		frmMagazin.getContentPane().add(radioButton_3);
		
		JRadioButton radioButton_4 = new JRadioButton("25 %");
		radioButton_4.setBounds(376, 240, 127, 25);
		frmMagazin.getContentPane().add(radioButton_4);
		
		JRadioButton radioButton_5 = new JRadioButton("35 %");
		radioButton_5.setBounds(376, 270, 127, 25);
		frmMagazin.getContentPane().add(radioButton_5);
		
		JRadioButton radioButton_6 = new JRadioButton("60 %");
		radioButton_6.setBounds(376, 300, 127, 25);
		frmMagazin.getContentPane().add(radioButton_6);
		
		//----------------------------------//
		group.add(radioButton_1);
		group.add(radioButton_2);
		group.add(radioButton_3);
		group.add(radioButton_4);
		group.add(radioButton_5);
		group.add(radioButton_6);
		//----------------------------------//
		
		//----------------------------------//
		/**
		 * Un singur listener pentru toate butoanele(aceeasi actiune indiferent pe care buton apasam)
		 */
	ActionListener listener = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
        	
        	
            JRadioButton btn = (JRadioButton) e.getSource();
            
            mag.notifyObserver(btn.getText());
        }
    };
    	//---------------------------------// 
   
     /**
      * Actiuni butoane - cand click pe unul din butoane se va trimite mesaj cu reducere la fiecare abonat
      * functia care face acelasi tip de actiune pentru toate butoanele poate fi vazut mai sus
      */
		radioButton_1.addActionListener(listener);
		radioButton_2.addActionListener(listener);
		radioButton_3.addActionListener(listener);
		radioButton_4.addActionListener(listener);
		radioButton_5.addActionListener(listener);
		radioButton_6.addActionListener(listener);		
		
	}
}
