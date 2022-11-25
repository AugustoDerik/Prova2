package janelas;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridBagLayout;

import javax.swing.JFrame;

import paineis.Gol;
import paineis.Options;

public class Janela extends JFrame {

	public Janela() {
		setSize(300, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		orgalizarLayout();
		setVisible(true);
	}
	
	public void orgalizarLayout() {
		setLayout(new BorderLayout());
		
		Gol gol = new Gol();
		add(gol, BorderLayout.NORTH);
		
		Options op = new Options(gol);
		add(op, BorderLayout.CENTER);
	}
}
