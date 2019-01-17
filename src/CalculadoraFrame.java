import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CalculadoraFrame extends JFrame {
	
	private final JTextField visor;
	
	private final JPanel teclado;
	private final String[] nomes = {"7", "8", "9", "/", "4", "5", "6", "*", "1", "2", "3", "-", "0", ".", "=", "+"};
	private final JButton[] botoes;
	
	public CalculadoraFrame(){
		
		super("Calculadora");
		
		visor = new JTextField();
		add(visor, BorderLayout.NORTH);
		
		teclado = new JPanel();
		teclado.setLayout(new GridLayout(4, 4, 5, 5));
		botoes = new JButton[16];
		
		for(int i = 0; i < nomes.length; i++) {
			
			botoes[i] = new JButton(nomes[i]);
			teclado.add(botoes[i]);
			
		}
		
		add(teclado);
		
		
	}

}
