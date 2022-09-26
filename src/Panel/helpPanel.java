package Panel;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.io.IOException;

import javax.swing.JPanel;

import Animation.GreenRedLightControl;
import Utils.FontUtil;
import Utils.MusicPlayer;
import Utils.UserInterfaceImageGather;

public class helpPanel extends JPanel implements MouseListener,MouseMotionListener{
	/**
	 * 
	 */
	private static final long serialVersionUID = -1L;
	int backState = 0;
	int leftArrowState = 2;
	int rightArrowState = 3;
	int pageState = 0;
	Font bold;
	Font normal;
	Cursor hand = new Cursor(Cursor.HAND_CURSOR);
	Cursor arrow = new Cursor(Cursor.DEFAULT_CURSOR);
	
	public helpPanel() {
		// TODO Auto-generated constructor stub
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

		Image window= UserInterfaceImageGather.default_window;
		g.drawImage(window, 240, 30, 519, 470,this);

		g.drawImage(UserInterfaceImageGather.backImg[backState],385,535,232,60,this);
		GreenRedLightControl.drawAnimationForHelp(g,this);
		
		drawHelpPage(pageState,g);
		
		g.drawImage(UserInterfaceImageGather.arrow[leftArrowState],100,290,69,80,this);
		g.drawImage(UserInterfaceImageGather.arrow[rightArrowState],830,290,69,80,this);
	}
	
	
	public void drawHelpPage(int page,Graphics g) {
		try {
			normal = FontUtil.getFont(0);
			bold = FontUtil.getFont(1);
		} catch (FontFormatException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		switch(page) {
			case 0:		{

				System.out.println("Page 0");
				g.setFont(bold);
				
				g.setColor(new Color(61, 166, 227,255));
				g.drawString("ANTIVIREN WEHRTURM", 343, 83);
				
				g.drawImage(UserInterfaceImageGather.towerStaticDisplay[0], 275, 100, 34, 52,this);
				g.drawImage(UserInterfaceImageGather.towerStaticDisplay[1], 271, 166, 38, 47,this);
				g.drawImage(UserInterfaceImageGather.towerStaticDisplay[2], 244, 220, 91, 67,this);
				g.drawImage(UserInterfaceImageGather.towerStaticDisplay[3], 272, 296, 34, 43,this);
				g.drawImage(UserInterfaceImageGather.towerStaticDisplay[4], 270, 350, 36, 46,this);
				g.drawImage(UserInterfaceImageGather.towerStaticDisplay[5], 271, 415, 30, 46,this);
				
				g.setFont(normal);
				
				g.drawString("NORTON: TEST TEST　TEST TEST TEST.", 325, 136);
				g.drawString("WENIGE  VERLETZUNG.",414,160);
				g.drawString("NOD 32: TEST TEST　TEST TEST TEST.", 325, 200);
				g.drawString("GERINGE VERLETZUNG.",408,224);
				g.drawString("MCAFEE: TEST TEST　TEST TEST TEST.", 325, 265);
				g.drawString("GERINGE VERLETZUNG.",414,289);
				g.drawString("ANTIVIR: SEHR  HOCHE  VERLETZUNG", 325, 329);
				g.drawString("ZU  ALLEM  VIREN  IM  BEREICH.",416,353);
				g.drawString("AVAST: NUR  VIREN  VERLANGSAMEN.", 325, 387);
				g.drawString("KEINE  VERLETZUNG.",402,412);
				g.drawString("KAPERSKY: SINNLOS. ", 325, 447);
				
				
				break;
			}
			
			case 1:		{

				System.out.println("Page 1");
				g.setFont(bold);
				
				g.setColor(new Color(61, 166, 227,255));
				g.drawString("VIRENTYP", 415, 83);
				
				g.drawImage(UserInterfaceImageGather.virusesDynamicDisplay[0], 275, 100, 33, 38,this);
				g.drawImage(UserInterfaceImageGather.virusesDynamicDisplay[1], 271, 166, 38, 39,this);
				g.drawImage(UserInterfaceImageGather.virusesDynamicDisplay[2], 265, 229, 49, 41,this);
				g.drawImage(UserInterfaceImageGather.virusesDynamicDisplay[3], 272, 296, 31, 46,this);
				g.drawImage(UserInterfaceImageGather.virusesDynamicDisplay[4], 270, 359, 37, 32,this);
				g.drawImage(UserInterfaceImageGather.virusesDynamicDisplay[5], 271, 415, 35, 42,this);
				
				g.setFont(normal);
				
				g.drawString("BACKDOOR: TEST TEST　TEST TEST.", 325, 136);
				g.drawString("123456.",414,160);
				g.drawString("ROOTSPY: TEST TEST　TEST TEST.", 325, 200);
				g.drawString("123456.",408,224);
				g.drawString("SQL SLAMMER: TEST TEST　TEST.", 325, 265);
				g.drawString("ABCDF.",414,289);
				g.drawString("WannaCry: SEHR  HOCHE  VERLETZUNG", 325, 329);
				g.drawString("!$%&()?.",416,353);
				g.drawString("ExploitMe: NUR  VIREN  VERLANGSAMEN.", 325, 387);
				g.drawString("9876540.",402,412);
				g.drawString("ILOVEYOU: SINNLOS. ", 325, 447);
				
				
				break;
			}
			
			case 2:		{

				System.out.println("Page 2");
				g.setFont(bold);
				
				g.setColor(new Color(61, 166, 227,255));
				g.drawString("TEST", 343, 83);
				
				g.drawImage(UserInterfaceImageGather.towerStaticDisplay[2], 275, 100, 34, 52,this);
			
				g.setFont(normal);
				
				g.drawString("NORTON: TEST TEST　TEST TEST TEST.", 325, 136);
				g.drawString("WENIGE  VERLETZUNG.",414,160);
								
				break;
			}	
			default: break;
		}						
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		if(e.getX()>385&&e.getX()<617&&e.getY()>535&&e.getY()<595) {
			//enter Start Button
			setCursor(hand);
			MusicPlayer.play(0, 0);
			backState = 1;
			//repaint();
		} else if(e.getX()>100&&e.getX()<169&&e.getY()>290&&e.getY()<370) {
			//enter leftArrow Button
			if(pageState == 0) {} else {
				setCursor(hand);
				MusicPlayer.play(0, 0);
				leftArrowState = 1;
				//repaint();
			}
		} else if(e.getX()>830&&e.getX()<899&&e.getY()>290&&e.getY()<370) {
			//enter rightArrow Button
			if(pageState == 2) {} else {
				setCursor(hand);
				MusicPlayer.play(0, 0);
				rightArrowState = 4;
				//repaint();
			}
		} else {
			setCursor(arrow);
			MusicPlayer.play(0, 2);
			backState = 0;
			switch(pageState) {
				case 0: leftArrowState = 2; rightArrowState = 3; break;
				case 1: leftArrowState = 0; rightArrowState = 3; break;
				case 2: leftArrowState = 0; rightArrowState = 5; break;
			}
			
		}
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
		if(e.getX()>385&&e.getX()<617&&e.getY()>535&&e.getY()<595) {
			//enter back Button
			backState = 0;
			leftArrowState = 2;
			rightArrowState = 3;
			pageState = 0;
			MusicPlayer.play(0, 2);
			this.setVisible(false);
		} else if(e.getX()>100&&e.getX()<169&&e.getY()>290&&e.getY()<370) {
			
			MusicPlayer.play(0, 2);
			if (pageState >= 1) {
				pageState--;
			} 
			switch(pageState) {
				case 0: leftArrowState = 2; rightArrowState = 3;  setCursor(arrow); break;
				case 1: leftArrowState = 1; rightArrowState = 3; break;
			}
			repaint();
		} else if(e.getX()>830&&e.getX()<899&&e.getY()>290&&e.getY()<370) {
			MusicPlayer.play(0, 2);
			if (pageState <= 1) {
				pageState++;
			} 
			switch(pageState) {
				case 1: leftArrowState = 0; rightArrowState = 4; break;
				case 2: leftArrowState = 0; rightArrowState = 5; setCursor(arrow); break;
			}
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

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
}
