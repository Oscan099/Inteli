import javax.swing.*;
import static javax.swing.JOptionPane.*;
public class HelloWorld {
    public static void main(String[] arg) {
        showMessageDialog(null, "Hello, you know what?");
        showMessageDialog(null, "Have you heard of...");
        String h = showInputDialog(null, "Sugma?");

        if (h.equals("What is sugma?")) {
            JOptionPane.showMessageDialog(null, "SUGMA NUTS LMAO");

        } else {
            String k = showInputDialog(null, "Huh?");
            if (k.equals("I said Sawcon")) {

                JOptionPane.showMessageDialog(null, "SECRET ENDING: You get a ticket to sawcon");
            }

        }
    }
}