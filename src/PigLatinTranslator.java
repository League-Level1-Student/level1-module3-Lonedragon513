import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PigLatinTranslator implements ActionListener {

	
	JFrame f = new JFrame ();
	JPanel p = new JPanel ();
	JButton b = new JButton ();
	JTextField t = new JTextField();
	JTextField tt = new JTextField();
	
public static void main(String[] args) {
	new PigLatinTranslator(). liphe();
}
	
	
void liphe () {
	f.add(p);
	p.add(t);
	p.add(b);
	p.add(tt);
	f.setVisible(true);
	f.pack();
	t.setPreferredSize(new Dimension (200, 25));
	tt.setPreferredSize(new Dimension (200, 25));
	b.addActionListener(this);
	f.pack();
}
	
void ddddddddddddddd () {
	
	
	String s = t.getText();
	String ss = translate(s,f);
	tt.setText(ss);
	f.pack();
}
	
	
	
	
	
	
	
	
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	ddddddddddddddd ();
	f.pack();
}
	
	
	


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
     /**
     * Method to test whether a character is a letter or not.
     * @param c The character to test
     * @return True if it's a letter
     */
     private static boolean isLetter(char c) {
          return ( (c >= 'A' && c <= 'Z') || (c >='a' && c <= 'z') );
     }

     /**
     * Method to translate one word into pig latin.
     * @param word The word in english
     * @return The pig latin version
     */
     private static String pigWord(String word, JFrame f) {
          int split = firstVowel(word, f);
          return word.substring(split)+"-"+word.substring(0, split)+"ay";
     }

     /**
      Method to translate a sentence word by word.
     * @param s The sentence in English
     * @return The pig latin version
     */
     public String translate(String s, JFrame f) {
          String latin = "";
          int i = 0;
          while (i < s.length()) {

     // Take care of punctuation and spaces
          while (i < s.length() && !isLetter(s.charAt(i))) {
               latin = latin + s.charAt(i);
               i++;
          }

     // If there aren't any words left, stop.
          if (i>=s.length()) break;

     // Otherwise we're at the beginning of a word.
          int begin = i;
          while (i < s.length() && isLetter(s.charAt(i))) {
               i++;
          }
     // Now we're at the end of a word, so translate it.
          int end = i;
          latin = latin + pigWord(s.substring(begin, end), f);
          }
      	f.pack();
          return latin;
     }
        
     /**
     * Method to find the index of the first vowel in a word.
     * @param word The word to search
     * @return The index of the first vowel
     */
     	private static int firstVowel(String word, JFrame f) {
          word = word.toLowerCase();
f.pack();
          for (int i=0; i < word.length(); i++)
               if (word.charAt(i)=='a' || word.charAt(i)=='e' ||
                    word.charAt(i)=='i' || word.charAt(i)=='o' ||
                    word.charAt(i)=='u')
                    return i;
               return 0;
        
     }


}
