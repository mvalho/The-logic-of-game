package com.mvalho.study.games.logicofgames.cap01;
import javax.swing.Jframe;
import javax.swing.JPanel;
import java.awt.Graphics;

public class Janela extends JFrame {
	private JPanel tela;

	public Janela() {
		tela = new JPanel() {
			@Override
			public void paintComponent(Graphic g) {
				
			}
		};

		super.getContentPane().add(tela);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(640, 480);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Janela();
	}
}
