import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class NasS implements ActionListener {
	public static void main(String[] args) {
		new NasS().hi();
	}

	JFrame f = new JFrame();
	JPanel p = new JPanel();
	JButton b = new JButton();
	JButton bb = new JButton();

	private void hi() {

		p.setVisible(true);

		b.setText("Trick");
		bb.setText("Treat");

		f.add(p);
		p.add(b);
		p.add(bb);

		b.addActionListener(this);
		bb.addActionListener(this);
		f.pack();
		f.setVisible(true);
	}

	private void showPictureFromTheInternet(String imageUrl) {
		try {

			URL url = new URL(imageUrl);
			Icon icon = new ImageIcon(url);
			JLabel imageLabel = new JLabel(icon);
			JFrame frame = new JFrame();
			frame.add(imageLabel);
			frame.setVisible(true);

			frame.pack();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton h = (JButton) e.getSource();

		if ( h == b) {

			showPictureFromTheInternet("http://cdn.akc.org/content/article-body-image/shiba_inu_cute_puppies.jpg");
		}

		if (h == bb) {
			showPictureFromTheInternet("http://livedoor.blogimg.jp/jin115/imgs/1/f/1fa12cd3.jpg");
		}
		f.pack();

	}
}
