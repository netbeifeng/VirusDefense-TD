package Utils;

import java.awt.AlphaComposite;
import java.awt.Color;
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.io.File;
import java.io.IOException;


public class FontUtil {
	private static Font bold;
	private static Font normal;
	public FontUtil() throws FontFormatException, IOException  {
		bold = Font.createFont(Font.TRUETYPE_FONT, new File(".\\res\\font\\Bold.ttf"));
		normal = Font.createFont(Font.TRUETYPE_FONT, new File(".\\res\\font\\Normal.ttf"));
		bold = this.setFontSize(bold, 38f);
		normal = this.setFontSize(normal, 26f);
		System.out.print("Init completed.");
	}
	
	public Font setFontSize(Font f,float size) {
		return f.deriveFont(size);
	}
	
	public static Font getFont(int index) throws FontFormatException, IOException{
//		System.out.println("A:" + normal.getFontName());
//		System.out.println("B:"+bold.getFontName());
		if(index == 0) 
			return normal;
		else
			return bold;
		
	}
	
	/**
	 * 绘制外发光文字
	 * @param g
	 * @param font 字体
	 * @param text 要绘制的文本
	 * @param fontSize 字体大小
	 * @param x 绘制位置
	 * @param y 绘制位置
	 * @param shadowWidth 阴影宽带
	 * @param shadowColor 阴影颜色
	 * @param fontColor 字体颜色
	 */
	public static void drawShadowString(Graphics g, Font font, String text, int x, int y, int shadowWidth, Color shadowColor, Color fontColor){
		g.setFont(font);
		g.setColor(shadowColor);
		Graphics2D g2d = (Graphics2D) g;
		g2d.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_OFF);
		for(int i=1; i<=shadowWidth; i++){
			g2d.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, 0.1f+0.2f*(shadowWidth-i)/shadowWidth));
			for(int j=0; j<8; j++){
				int offsetX = j%3 -1;
				int offsetY = j/3 -1;
				g.drawString(text, x+offsetX*i, y+offsetY*i);
			}
		}
		g2d.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
		g2d.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, 1f));
		g.setColor(fontColor);
		g.drawString(text, x, y);
	}
	
}
