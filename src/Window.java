import java.awt.Dimension;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class Window 
{
	public Window(int width, int height, String title, Game game)
	{
		game.setPreferredSize(new Dimension(width, height));
		JFrame frame = new JFrame(title);
		frame.add(game);
		//frame.setExtendedState(JFrame.MAXIMIZED_BOTH); 
		//frame.setUndecorated(true);
		frame.setIconImage(new ImageIcon("assets/icon.png").getImage());
		frame.pack();
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		game.start();
	}
}
