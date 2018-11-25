import java.net.URL;
import java.util.Random;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Slo {
public static void main(String[] args) {
	new Slo().liphe();
}
void liphe() {
	f.add(p);
	f.setVisible(true);
	// I CAN FLY
	if (num1 == 0) {
		l = loadImageFromComputer("fortune teller.png");
	}
	else if (num1 == 1) {
		l = loadImageFromComputer("life.jpg");
	}
	else if (num1 == 2) {
		l = loadImageFromComputer("life.jpg");
	}
	if (num1 == 0) {
		ll = loadImageFromComputer("fortune teller.png");
	}
	else if (num1 == 1) {
		ll = loadImageFromComputer("life.jpg");
	}
	else if (num1 == 2) {
		ll= loadImageFromComputer("life.jpg");
	}
	if (num1 == 0) {
		lll = loadImageFromComputer("fortune teller.png");
	}
	else if (num1 == 1) {
		lll = loadImageFromComputer("life.jpg");
	}
	else if (num1 == 2) {
		lll = loadImageFromComputer("life.jpg");
	}
	
	

	
	p.add(l);
	p.add(ll);
	p.add(lll);
	p.add(b);
	f.pack();
	
}

JFrame f = new JFrame ();
JPanel p = new JPanel ();
JLabel l =new JLabel();JLabel ll =new JLabel();JLabel lll =new JLabel();
JButton b = new JButton();
Random r = new Random();
int num1 = r.nextInt(3);
int num2 = r.nextInt(3);
int num3 = r.nextInt(3);

public JLabel loadImageFromComputer(String fileName) {
	URL imageURL = getClass().getResource(fileName);
	Icon icon = new ImageIcon(imageURL);
	return new JLabel(icon);
}
}
