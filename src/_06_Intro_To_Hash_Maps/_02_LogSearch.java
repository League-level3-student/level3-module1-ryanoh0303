package _06_Intro_To_Hash_Maps;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class _02_LogSearch implements ActionListener {
	JFrame jframe;
	JPanel jpanel;
	JLabel jlabel;
	JButton jbutton1;
	JButton jbutton2;
	JButton jbutton3;
	JButton jbutton4;
	static HashMap<Integer,String> hash;
  /* 
	 * Crate a HashMap of Integers for the keys and Strings for the values.
	 * Create a GUI with three buttons. 
	 * Button 1: Add Entry
	 * 				When this button is clicked, use an input dialog to ask the user to enter an ID number.
	 * 				After an ID is entered, use another input dialog to ask the user to enter a name.
	 * 				Add this information as a new entry to your HashMap.
	 * 
	 * Button 2: Search by ID
	 * 				When this button is clicked, use an input dialog to ask the user to enter an ID number.
	 * 				If that ID exists, display that name to the user.
	 * 				Otherwise, tell the user that that entry does not exist.
	 * 
	 * Button 3: View List
	 * 				When this button is clicked, display the entire list in a message dialog in the following format:
	 * 				ID: 123  Name: Harry Howard
	 * 				ID: 245  Name: Polly Powers
	 * 				ID: 433  Name: Oliver Ortega
	 * 				etc...
	 * 
	 * When this is complete, add a fourth button to your window.
	 * Button 4: Remove Entry
	 * 				When this button is clicked, prompt the user to enter an ID using an input dialog.
	 * 				If this ID exists in the HashMap, remove it. Otherwise, notify the user that the ID
	 * 				is not in the list. 
	 *
	 * */
	public static void main(String[] args) {
		
		_02_LogSearch LogSearch= new _02_LogSearch();
		LogSearch.add();
		hash= new HashMap<Integer,String>();
	}
	
	public void add() {
		jframe= new JFrame("LOGSEARCH");
		jpanel= new JPanel();
		jlabel= new JLabel();
		jbutton2= new JButton("SEARCH BY ID");
		jbutton3= new JButton("VIEW LIST");
		jbutton4= new JButton("REMOVE ENTRY");

		jbutton1= new JButton("ADD ENTRY");
		jbutton1.addActionListener(this);
		jbutton2.addActionListener(this);
		jbutton3.addActionListener(this);
	    jbutton4.addActionListener(this);
		
		jframe.add(jpanel);
		
		jpanel.add(jbutton1);
		jpanel.add(jbutton2);
		jpanel.add(jbutton3);
		jpanel.add(jbutton4);
		jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jframe.setVisible(true);
		jframe.setSize(800,800);
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==jbutton1) {
			String input= JOptionPane.showInputDialog("ENTER ID NUMBER");
			int id= Integer.parseInt(input);
			String input2= JOptionPane.showInputDialog("ENTER A NAME");
			hash.put(id, input2);
		}
		if(e.getSource()==jbutton2) {
			System.out.println("SDFSDF");
			String input= JOptionPane.showInputDialog("ENTER THE ID  NUMBER for name");
			int id= Integer.parseInt(input);
			if(hash.containsKey(id)) {
				JOptionPane.showMessageDialog(null,"NAME: " +hash.get(id));
			}
			else {
				JOptionPane.showMessageDialog(null, "THE ID DOES NOT EXIST");
			}
		}
		
		if(e.getSource()==jbutton3) {
			for (Integer key : hash.keySet())  
	            System.out.println("ID: "+ key+" Name: " + hash.get(key)); 
		
		}
		if(e.getSource()==jbutton4) {
			int id= Integer.parseInt(JOptionPane.showInputDialog("What id do you want to remove?"));
			if(hash.containsKey(id)) {
				hash.remove(id);
			}
			else {
				JOptionPane.showMessageDialog(null, "The ID does not EXIST!!");
			}
		
		
		
	
	
}
}
}
