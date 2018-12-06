import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;
import java.util.Random;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Slo implements ActionListener{
public static void main(String[] args) {
	new Slo().liphe();
}
void liphe() {
	f.add(p);
	f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	f.setVisible(true);
	f.pack();
	// I CAN FLY
	LIF();
	b.addActionListener(this);
	
}
void LIF () {
	int num1 = r.nextInt(3);
	int num2 = r.nextInt(3);
	int num3 = r.nextInt(3);
	
	if (num1 == 0) {
		l = loadImageFromComputer("up.jpg");
	}
	else if (num1 == 1) {
		l = loadImageFromComputer("right.jpg");
	}
	else if (num1 == 2) {
		l = loadImageFromComputer("life.jpg");
	}
	if (num2 == 0) {
		ll = loadImageFromComputer("up.jpg");
	}
	else if (num2 == 1) {
		ll = loadImageFromComputer("right.jpg");
	}
	else if (num2 == 2) {
		ll= loadImageFromComputer("life.jpg");
	}
	if (num3 == 0) {
		lll = loadImageFromComputer("up.jpg");
	}
	else if (num3 == 1) {
		lll = loadImageFromComputer("right.jpg");
	}
	else if (num3 == 2) {
		lll = loadImageFromComputer("life.jpg");
		
	}
	
if (num1 == num2) {
	if (num3 == num2) {
		win();
	}
}
	p.remove(l);
	p.remove(ll);
	p.remove(lll);
	p.removeAll();
	p.add(l);
	p.add(ll);
	p.add(lll);
	p.add(b);
	f.pack();
	
}
void win () {
	JOptionPane.showMessageDialog(null, "u won");
}
JFrame f = new JFrame ();
JPanel p = new JPanel ();
JLabel l =new JLabel();JLabel ll =new JLabel();JLabel lll =new JLabel();
JButton b = new JButton();
Random r = new Random();

public JLabel loadImageFromComputer(String fileName) {
	URL imageURL = getClass().getResource(fileName);
	Icon icon = new ImageIcon(imageURL);
	return new JLabel(icon);
}
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	LIF();
	
}
}
