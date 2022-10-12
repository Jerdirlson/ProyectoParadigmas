/*package Paquete1;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;

public class Juego extends JFrame implements ActionListener{

	
	/**
	 * 
	 */
/*
	private static final long serialVersionUID = 1L;
	//Vamos a necesitar una ventana para darle la parte grafica 

	JLabel fondoPanel, fondoPanelGeneral, tituloGeneral;
	JLabel boton, nombreJugador, tipoDificultad, tipoModo,fondoPanelJuego;
	

	
	
	public Juego() {
		//Propiedades ventana
		
		this.setTitle("Juego de memoria");
		this.setSize(1440,800);  //Aqui va el tamaño de la ventana
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		//Al cerrar nuestro programa al cerrarlo no se ejecute en segundo plano
		this.setResizable(false);	//Desabilita el boton de maximizar la ventana
		this.setLayout(null);	//Esto nos permite colocar los demas componentes donde queramos
		this.setBackground(Color.white);
		componentes();
	}
	
	
	
	
	@SuppressWarnings({ "removal", "null" })
	public void componentes() {
	
		
			//Panel donde va a tener el tiempo y el nombre del jugador
		
			JLayeredPane panelGeneral = new JLayeredPane();
			panelGeneral.setSize(400,600);
			panelGeneral.setLayout(null);
			panelGeneral.setLocation(50,95);
			this.getContentPane().add(panelGeneral, new Integer(2));
			
			//Porpiedades panelGeneral
			
			//Fondo panelGeneral
			
			fondoPanelGeneral = new JLabel();
			fondoPanelGeneral.setSize(500, 600);
			fondoPanelGeneral.setIcon(new ImageIcon("Imagenes/FondoBlanco.jpg"));
			fondoPanelGeneral.setLocation(0,0);
			panelGeneral.add(fondoPanelGeneral, new Integer(1));
			
			tipoDificultad = new JLabel();
			tipoDificultad.setBounds(65, 20, 500, 100);
			tipoDificultad.setFont(new Font("Showcard Gothic", Font.PLAIN, 45));
			panelGeneral.add(tipoDificultad, new Integer(3));
			
			
			tipoModo = new JLabel();
			tipoModo.setBounds(200,20,500,100);
			tipoModo.setFont(new Font("Showcard Gothic", Font.PLAIN, 45));
			panelGeneral.add(tipoModo, new Integer(4));
			
			
			nombreJugador = new JLabel();
			nombreJugador.setBounds(50, 100, 500, 100);
			nombreJugador.setFont(new Font("Showcard Gothic", Font.PLAIN, 35));
			panelGeneral.add(nombreJugador, new Integer(2));
			
			Tableros tablero = new Tableros();
			tablero.setSize(getPreferredSize());
			
			
			
			//Panel de juego
			JLayeredPane panelJuego = new JLayeredPane();
			panelJuego.setSize(800,700);
			panelJuego.setLayout(null);
			panelJuego.setLocation(550,35);
			this.getContentPane().add(panelJuego, new Integer(2));
			
			
			//Propiedades panelJugador
			
			fondoPanelJuego = new JLabel();
			fondoPanelJuego.setSize(900, 700);
			fondoPanelJuego.setIcon(new ImageIcon("Imagenes/FondoBlanco.jpg"));
			fondoPanelJuego.setLocation(0,0);
			panelJuego.add(fondoPanelJuego, new Integer(3));

			
			//Propiedades JPanel
			JLayeredPane panel = new JLayeredPane();
			panel.setLayout(null);	//Esto nos permite colocar los demas componentes donde queramos
			panel.setSize(1440, 800);  //Aqui va el tamaño del panel, en este caso va a variar con el tamaño que tenga la ventana
			panel.setLocation(0,0);		//Esto nos permite definir de donde va a empezar nuestro panel
			this.getContentPane().add(panel, new Integer(1));	//Aqui lo agregamos a el panel a la ventana
			
			
			//Fondo de presentacion
			
			fondoPanel = new JLabel();
			fondoPanel.setSize(1440, 800);		//Se le da el tamaño de la ventana
			fondoPanel.setIcon(new ImageIcon("Imagenes/Fondo Juego.png")); 		//Se le indica donde va a estar la imagen de fondo 
			fondoPanel.setLocation(0,0);			//nos permite definir desde donde va a empezar la imagen 
			panel.add(fondoPanel, new Integer(1));		//Agregamos el fondo al panelPresentacion
			
			
			
			//visibilidad
			panel.setVisible(true);	
			panelGeneral.setVisible(true);
			
			

		}



	@Override
	public void actionPerformed(ActionEvent e) {
		
		// TODO Auto-generated method stub
		
	}
	
}
	
*/	

