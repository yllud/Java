package type;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class CastingGraphic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JFrame f=new JFrame();
		f.setSize(300,500);
		
		//FlowLayout flow=new FlowLayout();
		f.setLayout(new FlowLayout());
		f.add(new JButton("button"));
		f.add(new JLabel("Label"));
		
		
		f.setVisible(true);
		
	}

}
