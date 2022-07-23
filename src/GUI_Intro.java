import javax.swing.JOptionPane;

public class GUI_Intro {
        public static void main(String[] args) {
                String name = JOptionPane.showInputDialog("Please, enter your name.");
                JOptionPane.showMessageDialog(null, "Welcome " + name + ".");

                int age = Integer.parseInt(JOptionPane.showInputDialog("Please, enter your age."));
                JOptionPane.showMessageDialog(null, "You are " + age + " years old.");

                String country = JOptionPane.showInputDialog("Please, enter your country.");
                JOptionPane.showMessageDialog(null, "You are from " + country);
        }
}
