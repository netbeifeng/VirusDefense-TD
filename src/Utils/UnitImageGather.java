package Utils;

import java.awt.Image;
import java.awt.Toolkit;

public class UnitImageGather {
	public static Image routeUnits[] = new Image[] {
			Toolkit.getDefaultToolkit().getImage(".\\res\\img\\routeunits\\1.png"),
			Toolkit.getDefaultToolkit().getImage(".\\res\\img\\routeunits\\2.png"),
			Toolkit.getDefaultToolkit().getImage(".\\res\\img\\routeunits\\3.png"),
			Toolkit.getDefaultToolkit().getImage(".\\res\\img\\routeunits\\4.png"),
	};
	
	public static Image cpuStates[] = new Image[] {
			Toolkit.getDefaultToolkit().getImage(".\\res\\img\\cpu\\64.png"),
			Toolkit.getDefaultToolkit().getImage(".\\res\\img\\cpu\\50.png"),
			Toolkit.getDefaultToolkit().getImage(".\\res\\img\\cpu\\38.png"),
			Toolkit.getDefaultToolkit().getImage(".\\res\\img\\cpu\\28.png"),
			Toolkit.getDefaultToolkit().getImage(".\\res\\img\\cpu\\20.png"),
			Toolkit.getDefaultToolkit().getImage(".\\res\\img\\cpu\\12.png")
	};
}
