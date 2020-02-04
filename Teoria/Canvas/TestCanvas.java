package Interfaces_Graficas.Canvas;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;

public class TestCanvas extends Canvas{
	
	public TestCanvas() {
		setBackground(Color.gray);//Con el setBackground le metemos el color al fondo del jframe
	}

	@Override
	public void paint(Graphics g) {
		g.setColor(Color.red);//Color del interior de la figura
		//con fill nombre de la figura, asi es como difinomos la forma de la figura. Fill es para el cuerpo de la figura
		g.fillRect(10, 10, 30, 50);//x, y, width, height        en px
		
		g.setColor(Color.GREEN);//Color del borde
		g.drawRect(30, 20, 50, 100);//con draw definimos el borde de la figura
	
		g.setColor(Color.blue);
		g.drawString("Hola mundo", 200, 200);
	}
	
	
	
}
