import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class TT {
public static void main(String[] args) {
	
	TT t = new TT();
	}


void t () {
	JFrame f = new JFrame ();
	f.setVisible(true);
	f.setTitle("Type or Die");
	
	char currentLetter;

	currentLetter = generateRandomLetter();

	JLabel l = new JLabel();
	}

char generateRandomLetter() {
	      Random r = new Random();
	      return (char) (r.nextInt(26) + 'a');
}
}
