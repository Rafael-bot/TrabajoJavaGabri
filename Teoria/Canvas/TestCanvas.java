package Interfaces_Graficas.Canvas;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;

public class TestCanvas extends Canvas{
	
	public TestCanvas() {
		setBackground(Color.black);//Con el setBackground le metemos el color al fondo del jframe
	}

	@Override
	public void paint(Graphics g) {
		g.setColor(Color.red);//Color del interior de la figura
		//con fill nombre de la figura, asi es como difinomos la forma de la figura. Fill es para el cuerpo de la figura
		g.fillRect(10, 10, 30, 50);//x, y, width, height        en px
		
		g.setColor(Color.GREEN);//Color del borde
		g.drawRect(10, 10, 30, 50);//con draw definimos el borde de la figura	x, y, width, height
	
		g.setColor(Color.PINK);
		g.fillOval(60, 10, 30, 50);
		
		g.setColor(Color.blue);
		g.drawOval(60, 10, 30, 50);
		
		
		g.setColor(Color.blue);//Color del borde
		g.drawString("Hola mundo", 20, 100);//Texto, x y y
	}
	
	
	
}
