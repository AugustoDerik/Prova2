package paineis;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class Options extends JPanel {
	
	public Options(Gol g) {
		setLayout(new FlowLayout(FlowLayout.CENTER));
		
		JButton b1 = new JButton("Iniciar");
		b1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				g.setVariavel(true);
				
			}
		});
		add(b1);
	}
}
