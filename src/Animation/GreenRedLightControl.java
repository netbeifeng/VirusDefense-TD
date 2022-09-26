package Animation;

import java.awt.Graphics;
import java.awt.image.ImageObserver;

import Utils.AnimationGather;

public class GreenRedLightControl {
	static int greenState=0;
	static int redState=1;
	static int greenLength = AnimationGather.greenLightAni.length;
	static int redLength = AnimationGather.redLightAni.length;
	public static void drawAnimation(Graphics g, ImageObserver im) {
		//left green
		
		g.drawImage(AnimationGather.greenLightAni[greenState%greenLength],36,226,29,29,im);
		g.drawImage(AnimationGather.greenLightAni[(greenState+2)%greenLength],36,246,29,29,im);
		g.drawImage(AnimationGather.greenLightAni[(greenState+4)%greenLength],82,226,29,29,im);
		g.drawImage(AnimationGather.greenLightAni[(greenState+6)%greenLength],106,246,29,29,im);
		g.drawImage(AnimationGather.greenLightAni[(greenState+8)%greenLength],106,226,29,29,im);
		g.drawImage(AnimationGather.greenLightAni[(greenState+10)%greenLength],82,246,29,29,im);
		
		//right green			
		g.drawImage(AnimationGather.greenLightAni[greenState%greenLength],724,219,29,29,im);
		g.drawImage(AnimationGather.greenLightAni[(greenState+3)%greenLength],724,239,29,29,im);
		g.drawImage(AnimationGather.greenLightAni[(greenState+4)%greenLength],745,219,29,29,im);
		g.drawImage(AnimationGather.greenLightAni[(greenState+5)%greenLength],745,239,29,29,im);
		g.drawImage(AnimationGather.greenLightAni[(greenState+6)%greenLength],795,219,29,29,im);
		g.drawImage(AnimationGather.greenLightAni[(greenState+7)%greenLength],795,239,29,29,im);
		g.drawImage(AnimationGather.greenLightAni[(greenState+8)%greenLength],840,219,29,29,im);
		g.drawImage(AnimationGather.greenLightAni[(greenState+9)%greenLength],840,239,29,29,im);		
		greenState++;
		
		//red
		g.drawImage(AnimationGather.redLightAni[(redState+7)%redLength],401,191,39,39,im );
		g.drawImage(AnimationGather.redLightAni[(redState+12)%redLength],732,372,39,39,im );
		g.drawImage(AnimationGather.redLightAni[(redState+1)%redLength],308,560,39,39,im );
		redState++;
	}
	
	public static void drawAnimationForHelp(Graphics g, ImageObserver im) {
		//left green
		
		g.drawImage(AnimationGather.greenLightAni[greenState%greenLength],36,226,29,29,im);
		g.drawImage(AnimationGather.greenLightAni[(greenState+2)%greenLength],36,246,29,29,im);
		g.drawImage(AnimationGather.greenLightAni[(greenState+4)%greenLength],82,226,29,29,im);
		g.drawImage(AnimationGather.greenLightAni[(greenState+6)%greenLength],106,246,29,29,im);
		g.drawImage(AnimationGather.greenLightAni[(greenState+8)%greenLength],106,226,29,29,im);
		g.drawImage(AnimationGather.greenLightAni[(greenState+10)%greenLength],82,246,29,29,im);
					
		//right green
		g.drawImage(AnimationGather.greenLightAni[(greenState+6)%greenLength],795,219,29,29,im);
		g.drawImage(AnimationGather.greenLightAni[(greenState+7)%greenLength],795,239,29,29,im);
		g.drawImage(AnimationGather.greenLightAni[(greenState+8)%greenLength],840,219,29,29,im);
		g.drawImage(AnimationGather.greenLightAni[(greenState+9)%greenLength],840,239,29,29,im);		
		greenState++;
		
		//red
		g.drawImage(AnimationGather.redLightAni[(redState+1)%redLength],308,560,39,39,im );
		redState++;
	}
}
