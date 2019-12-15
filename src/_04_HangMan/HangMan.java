package _04_HangMan;

import java.util.Random;
import java.util.Stack;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class HangMan{
	static String blank="";
	static int life=20;
	static int number;
	static JFrame jframe= new JFrame("Hang Man");
	static JPanel jpanel= new JPanel();
	static JLabel jlabel= new JLabel();
	public static void main(String[] args) {
		Stack<String> stack= new Stack<String>();
		 number= Integer.parseInt(JOptionPane.showInputDialog("What number do you want?"));
		Utilities util= new Utilities();
		for(int i=0; i<number; i++) {
			if(!stack.contains(util.readRandomLineFromFile("dictionary.txt"))) {
				stack.push(util.readRandomLineFromFile("dictionary.txt"));
			}
			
		}
		String word = stack.pop();
		
		for(int i=0; i<word.length(); i++) {
			blank= blank+"_";
		}
		HangMan hang= new HangMan();
		hang.add();
		while(life>0 && number>0) {
			String guess= JOptionPane.showInputDialog("What is your guess");
			System.out.println(word);
			if(number<=0) {
				JOptionPane.showMessageDialog(null, "YOU WIN");
			}
			if(life<=0) {
				JOptionPane.showMessageDialog(null, "GAME OVER. THE WORD WAS "+ word);
			}
			for(int i=0; i<word.length(); i++) {
				if(blank.equals(word)) {
					blank="";
					word=stack.pop();
					number-=1;
					for(int j=0; j<word.length(); j++) {
						blank= blank+"_";
					}
					jlabel.setText(blank);
				}
				if((""+word.charAt(i)).equals(guess)) {
					System.out.println(life);
					if(i==0) {
						blank=guess+blank.substring(i+1);	
					}
					if(i==word.length()-1) {
						blank=blank.substring(0,blank.length()-1)+guess;
					}
					else {
						blank=blank.substring(0,i)+guess+blank.substring(i+1);
					}
					jlabel.setText(blank);
					
				}
				
			}
			if(!word.contains(guess)) {
				life-=1;
			}
			
			
			
		}
		
		}
	public void add() {
		
		jframe.setSize(800,800);
		jframe.add(jpanel);
		jlabel.setText(blank);
		jpanel.add(jlabel);
		jframe.setVisible(true);
		jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
}
