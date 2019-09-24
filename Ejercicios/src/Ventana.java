import java.awt.event.WindowListener;

import javax.swing.JFrame;

public class Ventana extends JFrame{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;



	public Ventana() {
		
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.setSize(3500,500);
		this.setTitle("Nueva ventana");
		this.setVisible(true);
		
		
		
		
	}
	
	

	public static void main(String[] args) {
				Ventana v = new Ventana();

	}

}
