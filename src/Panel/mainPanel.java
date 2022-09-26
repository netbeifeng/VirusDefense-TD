package Panel;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.io.IOException;

import javax.swing.JPanel;
import Animation.GreenRedLightControl;
import Utils.AnimationGather;
import Utils.FontUtil;
import Utils.MusicPlayer;
import Utils.UserInterfaceImageGather;

public class mainPanel extends JPanel implements MouseListener,MouseMotionListener{
	/**
	 * 
	/**
	 * 
	 */
	private static final long serialVersionUID = -7519041191253239448L;
	int helpState=0;                            
	int startState=0;            				
	int quitState=0;
	int greenState=0;
	int redState=1;
	MusicPlayer musicPlayer;
	Cursor hand = new Cursor(Cursor.HAND_CURSOR);
	Cursor arrow = new Cursor(Cursor.DEFAULT_CURSOR);
	int greenLength = AnimationGather.greenLightAni.length;
	int redLength = AnimationGather.redLightAni.length;
	
	helpPanel hp;
	gamePanel gp;
	
	Font normal;
	
	
	public mainPanel(helpPanel hp,gamePanel gp) {
		this.hp = hp;
		this.gp = gp;
		musicPlayer = new MusicPlayer();
		setLayout(null);
		setSize(1000,650);	
		setVisible(true);
		this.addMouseListener(this);
		this.addMouseMotionListener(this);
	}
	
	public void setGreenState(int greenState) {
		this.greenState = greenState;
	}
	
	public void setRedState(int redState) {
		this.redState = redState;
	}
	
	@Override
	public void paint(Graphics g) {
		setOpaque(true);
		super.paint(g);

		Image image= UserInterfaceImageGather.backgroundImg[0];
		g.drawImage(image, 0, 0, 1000, 650,this);
		//bg
		//g.drawImage(UserInterfaceImageGather.backgroundImg[1],355,40,299,70,this);
		//g.drawImage(UserInterfaceImageGather.backgroundImg[2],250,105,493,92,this);
		
		try {
			normal = FontUtil.getFont(0);
		} catch (FontFormatException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		FontUtil.drawShadowString(g, normal.deriveFont(120f), "VIRUS", 365, 95, 4, new Color(225,129,133), Color.white);
		FontUtil.drawShadowString(g, normal.deriveFont(110f), "DEFENSE", 310, 185, 4, new Color(225,129,133), new Color(84,84,84));
		
		g.drawImage(UserInterfaceImageGather.startImg[startState], 380, 290, 232, 66, this);
		//help
		g.drawImage(UserInterfaceImageGather.helpImg[helpState], 380, 390, 232, 66, this);
		//quit
		g.drawImage(UserInterfaceImageGather.quitImg[quitState], 880, 520, 72, 72, this);
		
		GreenRedLightControl.drawAnimation(g,this);
		//g.drawRect(380, 290, 232, 66);
	}
	
	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}


	@SuppressWarnings("static-access")
	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		
		if(e.getX()>380&&e.getX()<612&&e.getY()>290&&e.getY()<356) {
			//enter Start Button
			setCursor(hand);
			musicPlayer.play(0, 0);
			startState=1;
		}
		else if(e.getX()>380 && e.getX()<612 && e.getY()>390 && e.getY()<456) {
			//enter Help Button
			setCursor(hand);
			musicPlayer.play(0, 0);
			helpState=1;	
		}
		else if(e.getX()>880 && e.getX()<952 && e.getY()>520 && e.getY()<592) {
			//enter Quit Button
			setCursor(hand);
			musicPlayer.play(0, 0);
			quitState=1;
		}
		else {
			setCursor(arrow);
			musicPlayer.play(0, 2);
			startState=0;
			quitState=0;
			helpState=0;
		}
	}


	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		if(e.getX()>380 && e.getX()<612 && e.getY()>390 && e.getY()<456) {
			setCursor(arrow);
			musicPlayer.play(1, 0);
			setVisible(false);
			helpState=0;                            
			hp.setVisible(true);
			musicPlayer.play(1, 2);
		} else if(e.getX()>380&&e.getX()<612&&e.getY()>290&&e.getY()<356) {
			setCursor(arrow);
			musicPlayer.play(1, 0);
            startState=0;            				
			setVisible(false);
			gp.setVisible(true);
			musicPlayer.play(1, 2);
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


	@SuppressWarnings("static-access")
	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		if(e.getX()>880 && e.getX()<952 && e.getY()>520 && e.getY()<592) {
			setCursor(new Cursor(Cursor.WAIT_CURSOR));
			musicPlayer.play(1, 0);
			quitState=2;
			repaint();
			try {
				Thread.sleep(500);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			System.exit(0);
		}
	}


	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		if(e.getX()>880 && e.getX()<952 && e.getY()>520 && e.getY()<592) {
			musicPlayer.play(1, 2);
			quitState=0;
			setCursor(arrow);
			repaint();
		}
	}
}
