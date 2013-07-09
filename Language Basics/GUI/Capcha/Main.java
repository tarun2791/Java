import java.awt.*;
import java.awt.image.*;
import javax.imageio.*;
import javax.swing.*;
import java.util.*;
class Capcha extends JFrame
{
	public Capcha()
	{
		setVisible(true);
		setSize(500,500);
		setLocation(550,150);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c=getContentPane();
		c.add(new DrawImage());
	}
	
}
class DrawImage extends JPanel
{
	public void paint(Graphics g1)
	{
		Graphics2D g=(Graphics2D)g1;
	//	BufferedImage image=new BufferedImage(200,70,BufferedImage.TYPE_INT_RGB);
		Graphics2D g2d=image.createGraphics();
		
		Random r=new Random();
		String token=Long.toString(Math.abs(r.nextLong()),36);
		String ch=token.substring(0,6);
		Color c=new Color(0.6662f, 0.4569f, 0.3232f);
		GradientPaint gp=new GradientPaint(30,30,c,15,25,Color.white,true);
		g2d.setPaint(gp);
		
		Font f=new Font("Verdana",Font.CENTER_BASELINE, 26);
		g2d.setFont(f);
		
		g2d.drawString(ch,70,20);
		g.drawImage(image, 200,20,this);
		//g2d.drawImage(image,2,20,this);
		
		
	
			
		
	}
}
public class Main
{
	
	
	public static void main(String args[])
	{
		new Capcha();
	}
}