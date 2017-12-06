import java.awt.Color;
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Settings
{
	private Rectangle currentMaxScore = new Rectangle(100, 100, 400, 50);
	private Rectangle minusMaxScore = new Rectangle(50, 100, 50, 50);
	private Rectangle plusMaxScore = new Rectangle(450, 100, 50, 50);
	private Fonts fonts;

	public Settings(Fonts fonts)
	{
		this.fonts = fonts;
	}
	
	public void render(Graphics g)
	{		
		String maxSpeed = "Max Score: " + Score.MAX_SCORE;
		String minus = "-";
		String plus = "+";
		String goBackToMenu = "[Esc] to return to menu";
		Graphics2D g2d = (Graphics2D)g;

		g.setColor(new Color(92, 240, 225));
		g.setFont(fonts.getFont2());
        g2d.draw(currentMaxScore);
        g2d.draw(minusMaxScore);
        g2d.draw(plusMaxScore);
        g.drawString("Game Settings", 50, 50);
        g.drawString(maxSpeed, currentMaxScore.x + 60, currentMaxScore.y + 35);
        g.drawString(minus, minusMaxScore.x + 15, minusMaxScore.y + 40);
        g.drawString(plus, plusMaxScore.x + 15, plusMaxScore.y + 40);
        g.drawString(goBackToMenu, 10, Game.W_HEIGHT - 10);
	}
}
