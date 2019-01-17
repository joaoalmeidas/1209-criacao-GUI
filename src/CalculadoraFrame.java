import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JTextField;

public class CalculadoraFrame extends JFrame {
	
	private final JTextField visor;
	
	public CalculadoraFrame(){
		
		super("Calculadora");
		
		visor = new JTextField();
		add(visor, BorderLayout.NORTH);
		
	}

}
