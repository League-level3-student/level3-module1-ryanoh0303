package _01_IntroToArrayLists;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class _02_GuestBook implements ActionListener {
	JFrame jframe= new JFrame("GUEST BOOK");
	JPanel jpanel = new JPanel();
	// Create a GUI with two buttons. One button reads "Add Name" and the other button reads "View Names". 
	ArrayList<String> names= new ArrayList<String>();
	JButton addname= new JButton("ADD NAME");
	JButton view= new JButton("VIEW NAMES");
	// When the add name button is clicked, display an input dialog that asks the user to enter a name. Add
	public static void main(String[] args) {
		_02_GuestBook guest= new _02_GuestBook();
		guest.add();
	}
	public void add() {
		addname.setSize(300,100);
		view.setSize(300,100);
		addname.addActionListener(this);
		view.addActionListener(this);
		jpanel.add(addname);
		jpanel.add(view);
		jframe.add(jpanel);
		jframe.setSize(800,800);
		jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jframe.setVisible(true);
	}
	// that name to an ArrayList. When the "View Names" button is clicked, display a message dialog that displays
	// all the names added to the list. Format the list as follows:
	// Guest #1: Bob Banders
	// Guest #2: Sandy Summers
	// Guest #3: Greg Ganders
	// Guest #4: Donny Doners
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==addname) {
			String input = JOptionPane.showInputDialog("What name would you like to enter?");
			names.add(input);
		}
		if(e.getSource()==view) {
			for(int i=0; i<names.size(); i++) {
				System.out.println("Guest #"+(i+1)+": "+names.get(i));
			}
		}
		
	}
	
	
	
}
