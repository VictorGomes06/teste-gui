package br.senai.sp.jandira.ui;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Tela {
	
	public void criarTela() {
		
		JFrame minhaTela = new JFrame();
		
		minhaTela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		minhaTela.setSize(300, 200);
		minhaTela.setTitle("Cálculo de IMC");
		minhaTela.setLayout(null);
		
		//Criar componentes da tela 
		
		JLabel lblIdade = new JLabel();
		lblIdade.setText("Qual sua idade?");
		lblIdade.setBounds(20, 20, 100, 10);
		
		JTextField txtIdade = new JTextField();
		txtIdade.setBounds(20, 45, 50, 35);
		
		JButton btnVerificar = new JButton();
		btnVerificar.setText("Verificar");
		btnVerificar.setBounds(80, 45, 85, 35);
		
		JLabel lblResultado = new JLabel("Resultado");
		lblResultado.setBounds(20, 80, 100, 35);
		
		
		minhaTela.getContentPane().add(btnVerificar);
		minhaTela.getContentPane().add(lblIdade);
		minhaTela.getContentPane().add(txtIdade);
		minhaTela.getContentPane().add(lblResultado);
	
		
		minhaTela.setVisible(true);
		
		
		//Listeners
		
		txtIdade.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				System.out.println("soltou");
				
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				System.out.println("Apertei o botão!");
				
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				System.out.println("sai!");
				
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				System.out.println("entrei!");
				
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		
		txtIdade.addKeyListener(new KeyListener() {
			
			@Override
			public void keyTyped(KeyEvent e) {
				
				
			}
			
			@Override
			public void keyReleased(KeyEvent e) {
				
				
			}
			
			@Override
			public void keyPressed(KeyEvent e) {
				System.out.println(e.getKeyChar());
				System.out.println(e.getKeyCode());
			}
		});
		
	}
 
}
