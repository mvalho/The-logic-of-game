package com.mvalho.study.games.logicofgames.cap01;

import javax.swing.Jframe;
import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Color;

public class AnimacaoTela extends JFrame {
	private JPanel tela;
	private int fps = 1000 / 20;
	private int count;
	private boolean animate = true;

	public void iniciaAnimacao() {
		long prxAtualizacao = 0;
		while(animate) {
			if(System.currentTime >= prxAtualizacao) {
				count++;
				tela.repaint();

				prxAtualizacao = System.currentTimeMillis() + fps;

				if(count == 100) {
					animate = false;
				}
			}
		}
	}

	public AnimacaoTela() {
		tela = new JPanel() {
			@Override
			public void paintComponent(Graphic g) {
				g.setColor(Color.WHITE);
				g.fillRect(0, 0, tela.getWidth(), tela.getHeight());
				g.drawLine(0, 240 + count, 640, 240 + count);
				g.drawRect(10, 25 + count, 20, 20);
				g.drawOval(30 + count, 20, 40, 30);
				g.setColor(Color.YELLOW);
				g.drawLine(320 - count, 0, 320 + count, 480);
				g.fillRect(110, 125, 120 - count, 120 - count);
				g.fillOval(230, 220, 240 + count, 230);
				g.setColor(Color.RED);
				g.drawString("Eu seria um ótimo Score!" + count, 5, 10);
			}
		};

		super.getContentPane().add(tela);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(640, 480);
		setVisible(true);
		tela.repaint();
	}

	public static void main(String[] args) {
		AnimacaoTela anima = new AnimacaoTela();
		anima.iniciaAnimacao();
	}
}
