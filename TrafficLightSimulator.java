import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

@SuppressWarnings("unused")
public class TrafficLightSimulator{
	public static void main(String[] args)
	{
		JFrame frame=new JFrame("Traffic Signal Simulator");
		frame.setSize(300,200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new BorderLayout());
	
		
		JLabel msglabel=new JLabel("");
		frame.add(msglabel,BorderLayout.NORTH);
		
		
		JRadioButton redb=new JRadioButton("red");
		JRadioButton yellowb=new JRadioButton("yellow");
		JRadioButton greenb=new JRadioButton("green");
		
		ButtonGroup group=new ButtonGroup();
		group.add(redb);
		group.add(yellowb);
		group.add(greenb);
		
		JPanel panel=new JPanel();
		panel.add(redb);
		panel.add(yellowb);
		panel.add(greenb);
		
		frame.add(panel,BorderLayout.CENTER);
		
		redb.addActionListener(e->
		{
		msglabel.setText("Stop");
		msglabel.setForeground(Color.RED);
		});
		
		yellowb.addActionListener(e->
		{
		msglabel.setText("Ready");
		msglabel.setForeground(Color.YELLOW);
		});
		
		greenb.addActionListener(e->
		{
		msglabel.setText("Go");
		msglabel.setForeground(Color.GREEN);
		});
		
		frame.setVisible(true);
		
		
	}
}


   