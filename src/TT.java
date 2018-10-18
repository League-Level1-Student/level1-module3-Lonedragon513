import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class TT implements KeyListener{
	
	
	char currentLetter;
public static void main(String[] args) {
	TT tt = new TT();
	tt.t();
	}

JFrame f = new JFrame ();
JLabel l = new JLabel();

void t () {
	f.setVisible(true);
	f.setTitle("Type or Die");
	i();
	f.addKeyListener(this);
}

void i () {
	

	currentLetter = generateRandomLetter();
	
	
	l.setText(""+currentLetter);
	l.setFont(l.getFont().deriveFont(28.0f));
	l.setHorizontalAlignment(JLabel.CENTER);
	f.add(l);
	f.pack();
	}

char generateRandomLetter() {
	      Random r = new Random();
	      return (char) (r.nextInt(26) + 'a');
}
@Override
public void keyTyped(KeyEvent e) {
	// TODO Auto-generated method stub
	if(e.getKeyChar()==currentLetter) {
		System.out.println("correct");
		System.out.println("u typed " + currentLetter);
		f.setBackground(Color.green);
	}
	else {
		System.out.println("wrong");
		System.out.println("u typed " + currentLetter);
		f.setBackground(Color.red);
	}
	f.remove(l);
	i();

	
}
@Override
public void keyPressed(KeyEvent e) {
	// TODO Auto-generated method stub
	
}
@Override
public void keyReleased(KeyEvent e) {
	// TODO Auto-generated method stub
	
}
}
