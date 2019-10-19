package oop.view;

import java.awt.GridLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.SpinnerNumberModel;

import oop.model.Figura;

public class FiguraViewOld extends JFrame {
	private static final long serialVersionUID = 1L;

	private JLabel figuraLabel;
	private JComboBox<Figura> figuraComboBox;
	private JLabel simboloLabel;
	private JTextField simboloTextField;
	private JLabel alturaLabel;
	private JSpinner alturaSpinner;
	private JLabel larguraLabel;
	private JSpinner larguraSpinner;
	private JButton desenharButton;
	private JButton limparButton;

	public FiguraViewOld() {
		super();
		initComponents();
		initView();
		init();
	}

	private void escolherFigura() {

	}

	private void desenharFigura() {

	}

	private void limparFigura() {

	}

	// DEFINE O ESTADO INICIAL DA TELA
	private void init() {
		/*
		 * EventoInterno evento = new EventoInterno();
		 * 
		 */
		
		
		desenharButton.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		
		desenharButton.addKeyListener(new KeyListener() {
			
			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void keyPressed(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
		});

		this.setTitle("Impacta Figura");
		this.setSize(280, 150);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setResizable(false);
	}

	// ORGANIZA O LAYOUT QUE DEVE SER EXIBIDO
	private void initView() {
		JPanel painel = new JPanel(new GridLayout(0, 2));
		painel.add(figuraLabel);
		painel.add(figuraComboBox);
		painel.add(simboloLabel);
		painel.add(simboloTextField);
		painel.add(alturaLabel);
		painel.add(alturaSpinner);
		painel.add(larguraLabel);
		painel.add(larguraSpinner);
		painel.add(desenharButton);
		painel.add(limparButton);

		this.add(painel);
	}

	// INICIALIZA OS ATRIBUTOS(COMPONENTES)
	private void initComponents() {
		figuraLabel = new JLabel("Figura: ");
		figuraComboBox = new FiguraComboBox();
		simboloLabel = new JLabel("Simbolo: ");
		simboloTextField = new JTextField("*");
		alturaLabel = new JLabel("Altura: ");
		alturaSpinner = new JSpinner(new SpinnerNumberModel(5, 0, 50, 1));
		larguraLabel = new JLabel("Largura: ");
		larguraSpinner = new JSpinner(new SpinnerNumberModel(9, 0, 50, 1));
		desenharButton = new JButton("Desenhar: ");
		limparButton = new JButton("Limpar: ");

	}
}

/*
 * class EventoInterno implements MouseListener, KeyListener {
 * 
 * @Override public void keyTyped(KeyEvent e) { // TODO Auto-generated method
 * stub
 * 
 * }
 * 
 * @Override public void keyPressed(KeyEvent e) { // TODO Auto-generated method
 * stub
 * 
 * }
 * 
 * @Override public void keyReleased(KeyEvent e) { // TODO Auto-generated method
 * stub
 * 
 * }
 * 
 * @Override public void mouseClicked(MouseEvent e) { // TODO Auto-generated
 * method stub
 * 
 * }
 * 
 * @Override public void mousePressed(MouseEvent e) { // TODO Auto-generated
 * method stub
 * 
 * }
 * 
 * @Override public void mouseReleased(MouseEvent e) { // TODO Auto-generated
 * method stub
 * 
 * }
 * 
 * @Override public void mouseEntered(MouseEvent e) { // TODO Auto-generated
 * method stub
 * 
 * }
 * 
 * @Override public void mouseExited(MouseEvent e) { // TODO Auto-generated
 * method stub
 * 
 * }
 * 
 * }
 */
