	import java.awt.*;
	import javax.swing.*;
	
	public class RGB_Slider {
		public static void main(String[] args) {
			JFrame frame = new JFrame("Slide RGB Colors");
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.getContentPane().add(new RGB_Sliders_Panel());
			frame.pack();
			frame.setVisible(true);
		}
	}