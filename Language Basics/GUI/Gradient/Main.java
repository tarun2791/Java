import java.awt.*;
import javax.swing.*;
import java.util.*;
public class Main extends JPanel
{
	protected void paintComponent(Graphics g)
	{
		Graphics2D g2d=(Graphics2D)g;
		
		GradientPaint gp=new GradientPaint(0,0,Color.red, 200,200,Color.green,true);
		g2d.setPaint(gp);
		
		g2d.fillRect(0,0,250,250);
		
		RandomString.drawRandomString(g);
		
	}
	public static void main(String args[])
	{
	for(int k=0;k<15;k++){
		JFrame frame=new JFrame();
		RandomString rs=new RandomString();
		Main panel=new Main();
		frame.add(panel);
		frame.setSize(250,250);
		frame.setVisible(true);
		frame.setLocation(400,400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		}
	}
}

class RandomString
{
	public static void drawRandomString(Graphics g)
	{
		String str[]={"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z","1","2","3","4","5","6","7","8","9"};
		Random rd=new Random();
		
		
		
		
	
		Graphics2D g2d2=(Graphics2D)g;
		
		GradientPaint gp2=new GradientPaint(10,10,Color.blue, 20,20,Color.cyan,true);
		g2d2.setPaint(gp2);
		g2d2.setFont(new Font("Comic Sans MS",Font.BOLD,48));
		for(int j=10;j<23;j++)
		{
			if(j==11||j==12||j==14||j==15||j==17||j==18||j==20||j==21)
			{
				continue;
			}
			int i=rd.nextInt(34);
			String rndString=new String(str[i]);
			g2d2.drawString(rndString,(rd.nextInt(10*j)+(20)),(rd.nextInt(10*j)+(30)));
		}
		
	}
}