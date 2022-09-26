package Panel;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.io.IOException;
import java.util.Random;

import javax.swing.JPanel;
import javax.swing.Timer;

import Animation.GreenRedLightControl;
import Utils.FontUtil;
import Utils.MusicPlayer;
import Utils.UnitImageGather;
import Utils.UserInterfaceImageGather;

public class gamePanel extends JPanel  implements  Runnable,MouseListener,MouseMotionListener{
	
	int backState = 0;
	int musicState = 0;
	int pauseState = 0;
	MusicPlayer musicPlayer;
	
	Font normal;
	
	Cursor hand = new Cursor(Cursor.HAND_CURSOR);
	Cursor arrow = new Cursor(Cursor.DEFAULT_CURSOR);
	
	int randomArray[] = new int[75];
	Random r = new Random();
	int index = 0;
	
	public gamePanel() {
		// TODO Auto-generated constructor stub
		for(int i = 0; i < 75; i++) {
			randomArray[i] = r.nextInt(4);
		}
		setVisible(false);
		setBackground(Color.black);
		setBounds(new Rectangle(1000, 650, 0, 0));
		addMouseMotionListener(this);
		addMouseListener(this);
	}
	
	@Override
	public void paint(Graphics g) {
		setOpaque(false);	
		super.paint(g);

		Image image= UserInterfaceImageGather.backgroundImg[0];
		g.drawImage(image, 0, 0, 1000, 650,this);
		
		paintRoad(g);
		index = 0;
		paintCPU(g);
		
		try {
			normal = FontUtil.getFont(0);
		} catch (FontFormatException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Image right_interface= UserInterfaceImageGather.right_interface;
		g.drawImage(right_interface, 790, 3, 200, 615,this);
		Image tower_panel = UserInterfaceImageGather.right_interface_tower_panel;
		g.drawImage(tower_panel, 840, 143, 130, 172,this);
		Image price_panel = UserInterfaceImageGather.right_interface_price_panel;
		g.drawImage(price_panel, 853, 184, 106, 140,this);
		
		g.drawImage(UserInterfaceImageGather.right_interface_towers[0], 861, 147, 20, 36,this);
		g.drawImage(UserInterfaceImageGather.right_interface_sp_buttons[pauseState],828,492,98,73,this);
		g.drawImage(UserInterfaceImageGather.right_interface_music_buttons[musicState],931,535,53,30,this);
		
		g.drawImage(UserInterfaceImageGather.right_interface_back_buttons[backState],930,500,53,36,this);
		g.drawImage(UserInterfaceImageGather.right_interface_price_led,824,67,15,15,this);
		
		FontUtil.drawShadowString(g, normal.deriveFont(24f), "100", 909, 77, 1, new Color(234,85,98), new Color(249,92,104));
		FontUtil.drawShadowString(g, normal.deriveFont(24f), "1000", 901, 55, 1, new Color(219,158,66), new Color(246,177,70));
		FontUtil.drawShadowString(g, normal.deriveFont(24f), "1000", 901, 31, 1, new Color(51,141,196), new Color(54,150,208));

		
		FontUtil.drawShadowString(g, normal.deriveFont(40f), "100", 643, 605, 2, new Color(51,141,196), new Color(54,150,208));

	}
	
	public void paintCPU(Graphics g) {
		g.drawImage(UnitImageGather.cpuStates[0], 529, 560, 217, 67,this);
	}
	
	public void paintRoad(Graphics g) {
		int pointX = 760;
		int pointY = 38;
		for(int i = 0; i < 14; i++) {
			drawRoadUnit(pointX,pointY,g);
			pointX -= 48;
		}
		
		for(int i = 0; i < 5; i++) {
			drawRoadUnit(pointX,pointY,g);
			pointY += 39;
		}
		drawRoadUnit(232,196,g);
		for(int i = 0; i < 4; i++) {
			drawRoadUnit(pointX,pointY,g);
			pointX += 48;
		}
		

		pointX = 280;
		pointY = 196;
		
		for(int i = 0; i < 8; i++) {
			drawRoadUnit(pointX,pointY,g);
			pointX += 48;
		}
		
		for(int i = 0; i < 5; i++) {
			drawRoadUnit(pointX,pointY,g);
			pointY += 39;
		}
		pointY -= 39;
		for(int i = 0; i < 2; i++) {
			drawRoadUnit(pointX,pointY,g);
			pointX -= 48;
		}
		pointY -= 39;
		for(int i = 0; i < 2; i++) {
			drawRoadUnit(pointX,pointY,g);
			pointY += 39;
		}
		pointX -= 48;
		pointY -= 39*2;
		for(int i = 0; i < 4; i++) {
			drawRoadUnit(pointX,pointY,g);
			pointX -= 48;
		}
		pointX += 48;
		pointY += 39;
		for(int i = 0; i < 7; i++) {
			drawRoadUnit(pointX,pointY,g);
			pointX -= 48;
		}
		pointX += 48;
		for(int i = 0; i < 5; i++) {
			drawRoadUnit(pointX,pointY,g);
			pointY += 39;
		}
		
		drawRoadUnit(328,469,g);
		pointY -= 39;
		for(int i = 0; i < 6; i++) {
			drawRoadUnit(pointX,pointY,g);
			pointX += 48;
		}
		pointX = 328+48;
		pointY = 469;
		for(int i = 0; i < 6; i++) {
			drawRoadUnit(pointX,pointY,g);
			pointX += 48;
		}
		pointX -=48;
		pointY +=39;
//		System.out.println(pointX+ "   " + pointY);
		drawRoadUnit(pointX,pointY,g);
		pointY +=39;
		drawRoadUnit(pointX,pointY,g);
	}
	
	public void drawRoadUnit(int dix1, int dix2,Graphics g) {
		g.drawImage(UnitImageGather.routeUnits[randomArray[index]],dix1,dix2,48,48,this);
		index++;
	}

	public void run() {
		// TODO Auto-generated method stub

	}
	
	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		if(e.getX()>932&&e.getX()<983&&e.getY()>502&&e.getY()<532) {
			backState = 1;
			setCursor(hand);
		} else if(e.getX() > 836 && e.getX() < 916 && e.getY() > 493 && e.getY() < 554 ) {
			setCursor(hand);
		} else if(e.getX()>934&&e.getX()<981&&e.getY()>541&&e.getY()<563) {
			setCursor(hand);
		}
		else {
			backState = 0;
			setCursor(arrow);
		}
		repaint();

	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("X: "+ e.getX() + ", Y: " + e.getY() );
		if(e.getX()>934&&e.getX()<981&&e.getY()>541&&e.getY()<563) {
			musicPlayer.play(1, 0);
			if(musicState == 1) {
				musicState = 0;
			} else {
				musicState = 1;
			}	
			musicPlayer.play(1, 2);
			repaint();
		} else if(e.getX() > 836 && e.getX() < 916 && e.getY() > 493 && e.getY() < 554 ) {
			musicPlayer.play(1, 0);
			if(pauseState == 1) {
				pauseState = 0;
			} else {
				pauseState = 1;
			}	
			musicPlayer.play(1, 2);
			repaint();
		}
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		if(e.getX()>932&&e.getX()<983&&e.getY()>502&&e.getY()<532) {
			backState = 2;
			musicPlayer.play(1, 0);
			repaint();
			musicPlayer.play(1, 2);
		} 
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		if(e.getX()>932&&e.getX()<983&&e.getY()>502&&e.getY()<532) {
			pauseState = 0;
			backState = 1;
			musicState = 0;
			this.setVisible(false);
			repaint();
		} 			
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
}
