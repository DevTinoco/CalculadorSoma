import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class ProgramaSoma extends JFrame {
	
	JTextField numero1 = new JTextField();
	JTextField numero2 = new JTextField();
	JLabel mais = new JLabel("   +");
	JLabel resultado = new JLabel();
	JButton soma = new JButton("=");
	
	Font fonte = new Font("Arial", Font.BOLD,50);//PARA AUMENTAR A FONTE.
		
	ProgramaSoma(){
		
		soma.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				int n1 = Integer.parseInt(numero1.getText());
				int n2 = Integer.parseInt(numero2.getText());
				int soma = n1+n2;
				resultado.setText(soma + "");
		}
	});
		
		//LAYOUT DA JANELA.
		setLayout(new GridLayout(1,6));
		add(numero1);
		add(mais);
		add(numero2);
		add(soma);
		add(resultado);
		
		//PARA AUMENTAR A FONTE.
		numero1.setFont(fonte);
		numero2.setFont(fonte);
		mais.setFont(fonte);
		soma.setFont(fonte);
		resultado.setFont(fonte);
		
		//TAMANHO DA CAIXA DA CALCAULADORA
		
		setSize(600,100);
		setTitle("PROGRAMA DE SOMA");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new ProgramaSoma();
	}

}
