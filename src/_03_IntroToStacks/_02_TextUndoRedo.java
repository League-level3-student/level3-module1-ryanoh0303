package _03_IntroToStacks;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Stack;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class _02_TextUndoRedo implements KeyListener {
	Stack<Character> stc= new Stack<Character>();
	JFrame jframe;
	JPanel jpanel;
	JLabel jlabel;
    static String string= "";
	
	
	public static void main(String[] args) {
		_02_TextUndoRedo text= new _02_TextUndoRedo();
		text.add();
	}

	public void add() {
		jframe= new JFrame();
	    jpanel= new JPanel();
	    jlabel= new JLabel();
		jframe.addKeyListener(this);
		jpanel.add(jlabel);
		jframe.add(jpanel);
		jframe.setSize(800,800);
		jframe.setVisible(true);
	}
	
	
	/* 
	 * Create a JFrame with a JPanel and a JLabel.
	 

	 * 
	 * Every time a key is pressed, add that character to the JLabel. It should look like a basic text editor.
	 * 
	 * Make it so that every time the BACKSPACE key is pressed, the last character is erased from the JLabel.
	 * Save that deleted character onto a Stack of Characters.
	 * 
	 * Choose a key to be the Undo key. Make it so that when that key is pressed, the top Character is popped 
	 * off the Stack and added back to the JLabel.
	 * 
	 * */

	@Override
	public void keyTyped(KeyEvent e) {
		
	}
		
	

	@Override
	public void keyPressed(KeyEvent e) {
			
		if(e.getKeyCode()==KeyEvent.VK_BACK_SPACE) {
			stc.push(string.charAt(string.length()-1));
			string=string.substring(0, string.length()-1);
			
		}
		else if(e.getKeyCode()==KeyEvent.VK_ENTER) {
			string=string+stc.pop();
		}
		else {
			string=string+e.getKeyChar();
		}
		jlabel.setText(string);
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	
}
