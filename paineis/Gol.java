package paineis;

import java.awt.Color;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

import botoes.Botao;

public class Gol extends JPanel {

	private Botao b;
	private Boolean variavel;
	// private ImageIcon image = new ImageIcon("bola.png");;
	// private ImageIcon im = new ImageIcon(image.getImage().getScaledInstance(36,
	// 36, Image.SCALE_SMOOTH));

	Options op = new Options(this);

	public Gol() {

		setLayout(new GridLayout(9, 17));
		variavel = false;

		if (variavel = true) {
			for (int i = 0; i < 9; i++) {
				for (int j = 0; j < 17; j++) {
					if (i == 1 && j >= 1 && j <= 15 || j == 1 && i >= 1 && i <= 8 || j == 15 && i >= 1 && i <= 8) {
						b = new Botao("T", Color.white);
						add(b);
					} else if (i == 0 && j >= 0 && j <= 16 || j == 0 && i >= 0 && i <= 8
							|| j == 16 && i >= 0 && i <= 8) {
						b = new Botao("0", Color.blue);
						add(b);
					} else {
						b = new Botao(".", Color.green);
						b.botaoComBorda();
						add(b);
					}
				}
				add(b);
			}
		} else {
			for (int i = 0; i < 9; i++) {
				for (int j = 0; j < 17; j++) {
					JButton b = new JButton("");
					add(b);
				}
			}
		}

	}

	public Boolean getVariavel() {
		return variavel;
	}

	public void setVariavel(Boolean variavel) {
		this.variavel = variavel;
	}

}
