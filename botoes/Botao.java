package botoes;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Objects;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class Botao extends JButton implements ActionListener {

//	 private ImageIcon image = new ImageIcon(Objects.requireNonNull(getClass().getResource("/imagem/bola.png")));
//	 private ImageIcon im = new ImageIcon(image.getImage().getScaledInstance(36,36, Image.SCALE_SMOOTH));

	public Botao(String simbolo, Color cor) {
		this.setPreferredSize(new Dimension(50,50));
		setText(simbolo);
		setBackground(cor);
		setForeground(Color.black);
		this.setBounds(0, 0, 100, 100);
		this.addActionListener(this);

	}

	public void botaoComBorda() {
		setBorder(BorderFactory.createLineBorder(Color.white, 2));
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		ImageIcon image = new ImageIcon(Objects.requireNonNull(getClass().getResource("/imagem/bola.png")));
		ImageIcon im = new ImageIcon(image.getImage().getScaledInstance(50,50, Image.SCALE_SMOOTH));

		setIcon(im);
		// setBackground(Color.red);

	}

}
