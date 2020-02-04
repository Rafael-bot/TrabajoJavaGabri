package Interfaces_Graficas.Canvas;

import javax.swing.JFrame;

public class TestVent extends JFrame{
	
	public void test() {
		setSize(300, 200);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//El EXIT_ON_CLOSE significa que cuando se pulsa el boton de cierre se cerrara el programa
		add(new TestCanvas());
	}
	

}


