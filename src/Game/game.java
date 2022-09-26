package Game;

import java.awt.CardLayout;
import java.awt.Cursor;
import java.awt.FontFormatException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.Timer;

import Panel.gamePanel;
import Panel.helpPanel;
import Panel.mainPanel;
import Utils.FontUtil;


public class game extends JFrame{
	private static final long serialVersionUID = -1L;
	mainPanel mp;
	helpPanel hp;
	gamePanel gp;
	FontUtil fg;
	CardLayout cl = new CardLayout();
	
	public game() throws FontFormatException, IOException {
		setLayout(cl);
		
		hp = new helpPanel();
		gp = new gamePanel();
		mp = new mainPanel(hp,gp);
		fg = new FontUtil();
		setResizable(false);
		setSize(1000,650);
		add(mp);
		add(hp);
		add(gp);
		addWindowListener(new WindowAdapter(){ 
            @Override
            public void windowClosing(WindowEvent e) {
                System.out.println("windowClosing");
                exit();
            }
        });
		addKeyListener(new KeyAdapter(){  
            public void keyPressed(KeyEvent e){  
                char charA=e.getKeyChar();  
                System.out.println(charA + " pressed.");  
                if(charA == 27) {
                	exit();
                }
                
            }  
        }); 
		int delay=90;    //time delay unit is ms
		ActionListener taskPerformer=new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				mp.repaint();
				hp.repaint();
				
			}
		};
		
		new Timer(delay,taskPerformer).start();
	}
	
	public void exit() {
		setCursor(new Cursor(Cursor.WAIT_CURSOR));
		try {
			Thread.sleep(500);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		System.exit(0);
	}
	
	public static void main(String args[]) throws FontFormatException, IOException {
		game myGame = new game();
		myGame.setTitle("Virus Defense");
		myGame.setVisible(true);
	}
}
