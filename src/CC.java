import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


public class  CC implements ActionListener {
	public static void main (String[] args) {
		CC c = new CC();
		c.makeButtons();
	}
JButton b  = new JButton();
	 		
		JButton bb  = new JButton();
	
	void makeButtons() {
		JFrame f = new JFrame();
		f.setVisible(true);
		JPanel p = new JPanel();

		p.add(b);	
		p.add(bb);
		b.setText("joke");
		bb.setText("punchline");
		f.add(p);
		f.pack();
		b.addActionListener(this);
		bb.addActionListener(this);

	}



	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == b) {
			JOptionPane.showMessageDialog(null, "Q: Why did the chewing gum cross the road?\n" + 
					"\n" + 
					"A: He was stuck to the chicken's foot.\n");
		}
		
		if(e.getSource() == bb) {
			JOptionPane.showMessageDialog(null, "boyao!");
		}
	}
	

}
