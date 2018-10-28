import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class a implements ActionListener {
	public static void main(String[] args) {
		a aqwerty = new a();
		aqwerty.life();
	}

	JFrame f = new JFrame();
	JPanel p = new JPanel();
	JButton a = new JButton();
	JButton s = new JButton();
	JButton m = new JButton();
	JButton d = new JButton();
	JTextField t = new JTextField(20);
	JTextField tt = new JTextField(20);
	int tp;
	int ttp;

	void life() {
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.add(p);
		p.add(a);
		p.add(s);
		p.add(m);
		p.add(d);
		p.add(t);
		p.add(tt);
		a.setText("add");
		a.addActionListener(this);
		s.setText("sub");
		s.addActionListener(this);
		m.setText("mul");
		m.addActionListener(this);
		d.setText("div");
		d.addActionListener(this);
		f.pack();

	}

	void asm() {
		int ansm = tp * ttp;
		JOptionPane.showMessageDialog(null, ansm);
	}

	void asd() {
		int ansd = tp / ttp;
		JOptionPane.showMessageDialog(null, ansd);
	}

	void asa() {
		int ansa = tp + ttp;
		JOptionPane.showMessageDialog(null, ansa);

	}

	void asas() {
		int anss = tp - ttp;
		JOptionPane.showMessageDialog(null, anss);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		tp = Integer.parseInt(t.getText());
		ttp = Integer.parseInt(tt.getText());
		JButton asfd = (JButton) e.getSource();

		if (asfd == a) {
			asa();
		}
		if (asfd == s) {
			asas();
		}
		if (asfd == m) {
			asm();
		}

		if (asfd == d) {
			asd();
		}

	}

}
