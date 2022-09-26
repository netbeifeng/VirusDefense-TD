package Utils;

import java.awt.Image;
import java.awt.Toolkit;

public class UserInterfaceImageGather {

	public static Image backgroundImg[] = new Image[] {
		Toolkit.getDefaultToolkit().getImage(".\\res\\img\\menu.png"),
		Toolkit.getDefaultToolkit().getImage(".\\res\\img\\VIRUS.png"),
		Toolkit.getDefaultToolkit().getImage(".\\res\\img\\DEFENSE.png"),
	};
	
	public static Image startImg[] = new Image[] {
		Toolkit.getDefaultToolkit().getImage(".\\res\\img\\play.png"),
		Toolkit.getDefaultToolkit().getImage(".\\res\\img\\play_mouse_on.png")
	};	
	
	public static Image helpImg[] = new Image[] {
		Toolkit.getDefaultToolkit().getImage(".\\res\\img\\help.png"),
		Toolkit.getDefaultToolkit().getImage(".\\res\\img\\help_mouse_on.png"),
	};
	
	public static Image quitImg[] = new Image[] {
		Toolkit.getDefaultToolkit().getImage(".\\res\\img\\quit.png"),
		Toolkit.getDefaultToolkit().getImage(".\\res\\img\\quit_mouse_on.png"),
		Toolkit.getDefaultToolkit().getImage(".\\res\\img\\quit_mouse_pressed.png"),
	};
	
	
	public static Image default_window = Toolkit.getDefaultToolkit().getImage(".\\res\\img\\default_window.png");
	
	public static Image backImg[] = new Image[] {
		Toolkit.getDefaultToolkit().getImage(".\\res\\img\\back.png"),
		Toolkit.getDefaultToolkit().getImage(".\\res\\img\\back_mouse_on.png"),
	};
	
	public static Image arrow[] = new Image[] {
		Toolkit.getDefaultToolkit().getImage(".\\res\\img\\left_button.png"),
		Toolkit.getDefaultToolkit().getImage(".\\res\\img\\left_button_mouse_on.png"),
		Toolkit.getDefaultToolkit().getImage(".\\res\\img\\left_button_not_ava.png"),
		Toolkit.getDefaultToolkit().getImage(".\\res\\img\\right_button.png"),
		Toolkit.getDefaultToolkit().getImage(".\\res\\img\\right_button_mouse_on.png"),
		Toolkit.getDefaultToolkit().getImage(".\\res\\img\\right_button_not_ava.png"),
	};
	
	public static Image towerStaticDisplay[] = new Image[] {
		Toolkit.getDefaultToolkit().getImage(".\\res\\img\\towers\\nor.png"),
		Toolkit.getDefaultToolkit().getImage(".\\res\\img\\towers\\nod.png"),
		Toolkit.getDefaultToolkit().getImage(".\\res\\img\\towers\\mcf.png"),
		Toolkit.getDefaultToolkit().getImage(".\\res\\img\\towers\\atv.png"),
		Toolkit.getDefaultToolkit().getImage(".\\res\\img\\towers\\avg.png"),
		Toolkit.getDefaultToolkit().getImage(".\\res\\img\\towers\\kapa.png"),
	};
	
	public static Image virusesDynamicDisplay[] = new Image[] {
		Toolkit.getDefaultToolkit().getImage(".\\res\\img\\viruses\\yellow_sypbot.gif"),
		Toolkit.getDefaultToolkit().getImage(".\\res\\img\\viruses\\brrow_rootkit.gif"),
		Toolkit.getDefaultToolkit().getImage(".\\res\\img\\viruses\\green_worm.gif"),
		Toolkit.getDefaultToolkit().getImage(".\\res\\img\\viruses\\blue_torjam.gif"),
		Toolkit.getDefaultToolkit().getImage(".\\res\\img\\viruses\\purple_exploit.gif"),
		Toolkit.getDefaultToolkit().getImage(".\\res\\img\\viruses\\pink_iloveu.gif"),
	};
	
	public static Image right_interface = Toolkit.getDefaultToolkit().getImage(".\\res\\img\\right_menu\\right_interface.png");
	
	public static Image right_interface_tower_panel = Toolkit.getDefaultToolkit().getImage(".\\res\\img\\right_menu\\tower_panel.png");
	public static Image right_interface_price_panel = Toolkit.getDefaultToolkit().getImage(".\\res\\img\\right_menu\\price_panel.png");
	public static Image right_interface_price_led = Toolkit.getDefaultToolkit().getImage(".\\res\\img\\right_menu\\led.png");
	
	public static Image right_interface_towers[] = new Image[] {
			Toolkit.getDefaultToolkit().getImage(".\\res\\img\\right_menu\\nor.png"),
			Toolkit.getDefaultToolkit().getImage(".\\res\\img\\right_menu\\nod.png"),
			Toolkit.getDefaultToolkit().getImage(".\\res\\img\\right_menu\\mcf.png"),
			Toolkit.getDefaultToolkit().getImage(".\\res\\img\\right_menu\\atv.png"),
			Toolkit.getDefaultToolkit().getImage(".\\res\\img\\right_menu\\avg.png"),
			Toolkit.getDefaultToolkit().getImage(".\\res\\img\\right_menu\\kapa.png"),
	};
	
	public static Image right_interface_sp_buttons[] = new Image[] {
			Toolkit.getDefaultToolkit().getImage(".\\res\\img\\right_menu\\start.png"),
			Toolkit.getDefaultToolkit().getImage(".\\res\\img\\right_menu\\stop.png"),
	};
	
	public static Image right_interface_music_buttons[] = new Image[] {
			Toolkit.getDefaultToolkit().getImage(".\\res\\img\\right_menu\\music_on.png"),
			Toolkit.getDefaultToolkit().getImage(".\\res\\img\\right_menu\\music_off.png"),
	};
	
	public static Image right_interface_back_buttons[] = new Image[] {
			Toolkit.getDefaultToolkit().getImage(".\\res\\img\\right_menu\\back_button.png"),
			Toolkit.getDefaultToolkit().getImage(".\\res\\img\\right_menu\\back_button_mouse_on.png"),
			Toolkit.getDefaultToolkit().getImage(".\\res\\img\\right_menu\\back_button_mouse_pressed.png"),
	};
}

