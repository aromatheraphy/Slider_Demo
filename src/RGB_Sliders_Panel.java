	import java.awt.*;
	import javax.swing.*;
	import javax.swing.event.*;
	public class RGB_Sliders_Panel extends JPanel{
		public JPanel control_panel , color_panel;
		public JSlider red_slider, green_slider, blue_slider;
		public JLabel red_label, green_label, blue_label;
		
		public RGB_Sliders_Panel() {
			
			red_slider = new JSlider (JSlider.HORIZONTAL,0,255,0);
			red_slider.setMinorTickSpacing(10);
			red_slider.setMajorTickSpacing(50);
			red_slider.setPaintTicks(true);
			red_slider.setPaintLabels(true);
			red_slider.setAlignmentX(Component.LEFT_ALIGNMENT);
			green_slider = new JSlider (JSlider.HORIZONTAL,0,255,0);
			green_slider.setMinorTickSpacing(10);
			green_slider.setMajorTickSpacing(50);
			green_slider.setPaintTicks(true);
			green_slider.setPaintLabels(true);
			green_slider.setAlignmentX(Component.LEFT_ALIGNMENT);
			blue_slider = new JSlider (JSlider.HORIZONTAL,0,255,0);
			blue_slider.setMinorTickSpacing(10);
			blue_slider.setMajorTickSpacing(50);
			blue_slider.setPaintTicks(true);
			blue_slider.setPaintLabels(true);
			blue_slider.setAlignmentX(Component.LEFT_ALIGNMENT);
			Slider_Listener listener = new Slider_Listener();
			red_slider.addChangeListener(listener);
			green_slider.addChangeListener(listener);
			blue_slider.addChangeListener(listener);
			red_label = new JLabel("Red:0");
			red_label.setAlignmentX(Component.LEFT_ALIGNMENT);
			green_label = new JLabel("Green:0");
			green_label.setAlignmentX(Component.LEFT_ALIGNMENT);
			blue_label = new JLabel("Blue:0");
			blue_label.setAlignmentX(Component.LEFT_ALIGNMENT);
			control_panel = new JPanel();
			control_panel.setLayout(new BoxLayout(control_panel, BoxLayout.Y_AXIS));
			control_panel.add(red_label);
			control_panel.add(red_slider);
			control_panel.add(Box.createRigidArea(new Dimension(0,30)));
			control_panel.add(green_label);
			control_panel.add(green_slider);
			control_panel.add(Box.createRigidArea(new Dimension(0,30)));
			control_panel.add(blue_label);
			control_panel.add(blue_slider);
			color_panel = new JPanel();
			color_panel.setPreferredSize(new Dimension (150,150));
			color_panel.setBackground(new Color(0,0,0));
			add(control_panel);
			add(color_panel);
		}
		
		public class Slider_Listener implements ChangeListener {
			
			int red, green,blue;
			public void stateChanged(ChangeEvent event) {
				red=red_slider.getValue();
				green=green_slider.getValue();
				blue=blue_slider.getValue();
				
				red_label.setText("Red:"+red);
				green_label.setText("Green:"+green);
				blue_label.setText("Blue:"+blue);
				color_panel.setBackground(new Color(red,green,blue));
			}
		}
	}
