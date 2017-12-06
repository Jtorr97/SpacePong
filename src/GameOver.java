import java.awt.Color;
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.io.File;
import java.io.IOException;

public class GameOver
{
	private Rectangle playAgainButton = new Rectangle(Game.W_WIDTH / 2 - 275, 300, 250, 50);
	private Rectangle quitToMenuButton = new Rectangle(Game.W_WIDTH / 2 + 50, 300, 250, 50);
	private Score score;
	private Fonts fonts;
	
	public GameOver(Score score, Fonts fonts)
	{
		this.score = score;
		this.fonts = fonts;
	}
	
	public void render(Graphics g)
	{
        Graphics2D g2d = (Graphics2D) g;
 
        // If the player wins, they get a message
        if(score.getPlayerScore() == Score.MAX_SCORE)
        {
        	String winMsg = "YOU WIN";
        	g.setFont(fonts.getFont1());
            FontMetrics fm = g2d.getFontMetrics();
            int x = ((Game.W_WIDTH - fm.stringWidth(winMsg)) / 2);
            int y = 200;
            g.setColor(Color.WHITE);
            g.drawString(winMsg, x, y);
        }
        else if(score.getComputerScore() == Score.MAX_SCORE)
        {
        	// Game Over message
        	String gameOverText = "GAME OVER";
            g.setFont(fonts.getFont1());
            FontMetrics fm = g2d.getFontMetrics();
            int x = ((Game.W_WIDTH - fm.stringWidth(gameOverText)) / 2);
            int y = 200;
            g.setColor(Color.WHITE);
            g.drawString(gameOverText, x, y);
        }
        
        // For drawing the buttons
        g.setFont(fonts.getFont2());
        g2d.draw(playAgainButton);
        g.drawString("Play Again", playAgainButton.x + 35, playAgainButton.y + 35);
        g2d.draw(quitToMenuButton);
        g.drawString("Quit", quitToMenuButton.x + 90, quitToMenuButton.y + 35);
	}
}
