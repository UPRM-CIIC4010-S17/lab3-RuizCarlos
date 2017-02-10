import javax.swing.JFrame;
import java.awt.Rectangle;

public class Lab3Exercises {
	public static void main(String[] args) {
		JFrame myFrame = new JFrame("Carlos Ruiz");
		myFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		myFrame.setLocation(550, 300);
		myFrame.setSize(250, 173);
		MyPanelClass myPanel = new MyPanelClass();
        myFrame.getContentPane().add(myPanel);
		myFrame.setVisible(true);
		//Same as the previous commit but with the push
	}
}