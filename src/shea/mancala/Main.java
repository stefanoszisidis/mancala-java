package shea.mancala;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

/**
 * Set up the GUI
 * @author Shea Bunge
 */
public class Main {

	/**
	 * This method is run when the program starts
	 * @param args arguments passed to the program
	 */
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				createAndShowGUI();
			}
		});
	}

	/**
	 * Create and display the GUI
	 */
	public static void createAndShowGUI() {
		JFrame frame = new JFrame("Mancala");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		frame.add(new MancalaGame());

		frame.pack();
		frame.setVisible(true);
	}
}
