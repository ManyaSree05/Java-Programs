import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class FactorialCalculator{
	public static void main(String[] args)
	{
		JFrame frame=new JFrame("Factorial");
		frame.setSize(400,400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new GridLayout(4,2,10,10));
		JLabel ilabel=new JLabel("Enter number: ");
		JTextField itext=new JTextField();
		JLabel olabel=new JLabel("Factorial: ");
		JTextField otext=new JTextField();
		otext.setEditable(false);
		JButton button=new JButton("Compute");
		button.addActionListener(new ActionListener()  {
			public void actionPerformed(ActionEvent e)
			{
				try {
					int num=Integer.parseInt(itext.getText());
					if(num<0)
						otext.setText("Invalid input");
					else {
					long fact=1;
					for(int i=1;i<=num;i++)
						fact*=i;
					otext.setText(String.valueOf(fact));
				}
			}
				catch(NumberFormatException ex) {
				otext.setText("Invalid input");
			}
			}	
		});
		frame.add(ilabel);
		frame.add(itext);
		frame.add(olabel);
		frame.add(otext);
		frame.add(button);
		frame.setVisible(true);
	}
}   