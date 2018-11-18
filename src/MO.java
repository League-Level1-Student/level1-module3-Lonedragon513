import java.applet.AudioClip;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import java.util.Random;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


public class MO implements ActionListener {

public static void main(String[] args) {
	new MO().liphe();

}

	JFrame f = new JFrame ();
	JPanel p = new JPanel ();
	//JButton b = new JButton ();JButton b = new JButton ();JButton b = new JButton ();JButton b = new JButton ();JButton b = new JButton ();JButton b = new JButton ();JButton b = new JButton ();JButton b = new JButton ();JButton b = new JButton ();JButton b = new JButton ();JButton b = new JButton ();JButton b = new JButton ();
	void liphe () {
		f = new JFrame();
		f.setPreferredSize(new Dimension(400, 300));
		p= new JPanel();
		Random r =new Random ();
		int sd = r.nextInt(20);
		f.setVisible(true);
		f.add(p);
		for (int i = 0; i < 20; i++) {
			JButton b = new JButton ();
			if (i==sd) {
				b.setText("MO");
			}
			b.addActionListener(this);
			p.add(b);
		}
		
		
	
	}
	int kkkkk = 0;
	 Date timeAtSnd = new Date();
	 int kkk = 0;
	void LIPHENUMB2 () {
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton pre = (JButton) e.getSource();
		if(pre.getText().equals("MO")) {
			playSound("448226__inspectorj__explosion-8-bit-01.wav");
			kkk++;
		}
		else {
			speak("daaaada");
		}
		kkkkk++;
		
		if (kkkkk==10) {
			endGame(timeAtSnd,kkk);
			
			
			
		}
		f.dispose();
		liphe();
	}
	private void playSound(String fileName) {
	     AudioClip sound = JApplet.newAudioClip(getClass().getResource(fileName));
	     sound.play();
	}

	private void endGame(Date timeAtStart, int molesWhacked) {
	     Date timeAtEnd = new Date();
	     JOptionPane.showMessageDialog(null, "Your whack rate is "
	          + ((timeAtEnd.getTime() - timeAtStart.getTime()) / 1000.00 / molesWhacked)
	          + " moles per second.");
	}
	void speak(String words) {
	     try {
	          Runtime.getRuntime().exec("say " + words).waitFor();
	     } catch (Exception e) {
	          e.printStackTrace();
	     }
	}

}
