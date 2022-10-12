package Paquete1;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class MenuModo2 extends JFrame implements ActionListener{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private JLayeredPane panel;
	
	private JLabel fondoPanel, etiquetaTitulo, etiquetaNombreJugador;
	
	public JTextField txtNomJugador;
	
	private JButton iniciarJuego;
	
	
	
	
	
	public  MenuModo2() {
		
		this.setTitle("Modo 2");
		this.setSize(1440,800) ;		//Definimos el tamaño
		this.setLocationRelativeTo(null);		//definimos que se centre en la pantalla 
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);		//para que el programa despues de cerrado no se ejecute en segundo plano 
        this.setResizable(false);		//Quita el poder maximizar la pantalla
        this.setLayout(null);
		
        componentes();
	}

	@SuppressWarnings("removal")
	public void componentes() {
		
		panel = new JLayeredPane();
		panel.setLayout(null);
		panel.setSize(1440, 800);
		panel.setLocation(0,0);
		panel.setVisible(true);
		
		this.getContentPane().add(panel);
		
		fondoPanel = new JLabel();
		fondoPanel.setSize(1500, 1000);   //ImagenPrueba3 (1500,1000) check			-- 
		fondoPanel.setLocation(0,0);
		fondoPanel.setIcon(new ImageIcon("Imagenes/ImagenPrueba3.jpg"));
		panel.add(fondoPanel, new Integer(1));
		
		etiquetaTitulo = new JLabel ("Segundo Jugador");  //Se establece lo que debe contener la etiqueta 
		etiquetaTitulo.setBounds(470, 80, 600, 70);		//Se utiliza para definir un rectangulo delimitador para la etiqueta 
		etiquetaTitulo.setFont(new Font("Showcard Gothic", Font.PLAIN, 60));		//se usa para definir el tipo de letra y el tamaño
		
		
		etiquetaNombreJugador = new JLabel ("Inserte segundo nombre: ");
		etiquetaNombreJugador.setBounds(570,200,600,70);
		etiquetaNombreJugador.setFont(new Font("Cooper Black", Font.PLAIN, 30));
		
		//Caja de texto donde se coloca el nombre del jugador
		
		txtNomJugador = new JTextField();
		txtNomJugador.setBounds(540,300,400,40);
		txtNomJugador.setHorizontalAlignment(JTextField.CENTER);			//Se utilizar para centrar el texto
		txtNomJugador.setFont(new Font("Lucida Sans Unicode", Font.PLAIN, 20));
		
		iniciarJuego = new JButton("Iniciar juego");
		iniciarJuego.setBounds(590,400,300,45);
		iniciarJuego.setFont(new Font("Cooper Black", Font.PLAIN, 15));
		iniciarJuego.addActionListener(this);					//Para detectar y manejar los eventos de una accion, osea presionarlo
		
		panel.add(etiquetaTitulo, new Integer(2));
		panel.add(etiquetaNombreJugador, new Integer(3));
		panel.add(txtNomJugador, new Integer(4));
		panel.add(iniciarJuego, new Integer(5));
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == iniciarJuego) {			//getsource saber si el boton esta presionado 
			
			if (txtNomJugador.getText().equals("")) {		//Esto se hace para comprobar si la casilla de nombre tiene algo
				JOptionPane.showMessageDialog(null, "Colocar nombre de jugador");
			}
			else {
				//De lo contrario se debe iniciar el juego de memoria
				
				this.setVisible(false);
				
				
				
			}
		}
		
	}
}
