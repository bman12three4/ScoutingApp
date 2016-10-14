package com.roarbotics.window;

import javax.swing.JCheckBox;
import javax.swing.JPanel;

import com.roarbotics.Options;

public class OptionsPanel {
	
	public static JPanel optionsPanel(){
		JPanel optionsPanel = new JPanel();
		JCheckBox exist = new JCheckBox(Options.robotAttributes[0] + "?");
		optionsPanel.add(exist);
		JCheckBox[] robotAttributes = new JCheckBox[Options.robotAttributes.length];
		for (int i = 0; i < robotAttributes.length; i++){
			robotAttributes[i] = new JCheckBox(Options.robotAttributes[i]);
			optionsPanel.add(robotAttributes[i]);
		}
		
		
		return optionsPanel;
		
		
		
	}
}