package _01_IntroToArrayLists;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


//Copyright The League of Amazing Programmers, 2015

public class _06_IPodShuffle implements ActionListener{
	static ArrayList<String> arr= new ArrayList<String>();
	static Song song;
	public _06_IPodShuffle() {
		// 1. Use the Song class the play the demo.mp3 file.
		
		arr.add("demo.mp3");
		arr.add("oof.mp3");
		arr.add("scary.mp3");
		arr.add("rock.mp3");
		
		
		
		
				
				
		/**
		 * 2. Congratulations on completing the sound check! * Now we want to make an
		 * iPod Shuffle that plays random music. * Create an ArrayList of Songs and a
		 * "Surprise Me!" button that will play a random song when it is clicked. * If
		 * you're really cool, you can stop all the songs, before playing a new one on
		 * subsequent button clicks.
		 */
		
	}
	public void add() {
		JFrame jframe=  new JFrame("IPOD SHUFFLE");
		JPanel jpanel = new JPanel();
		JButton jbutton = new JButton("SURPRISE ME!");
		
		
		
		jbutton.setSize(300,100);
		jpanel.add(jbutton);
		jframe.add(jpanel);
		jframe.setSize(800,800);
		jbutton.addActionListener(this);
		jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jframe.setVisible(true);
		
	}
	public static void main(String[] args) {
		_06_IPodShuffle ipod= new _06_IPodShuffle();
		ipod.add();
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		
		Random rand= new Random();
		int x = rand.nextInt(arr.size());
	    song= new Song(arr.get(x));
		song.play();
		
	}
}