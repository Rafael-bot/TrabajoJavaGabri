package Interfaces_Graficas;

import Interfaces_Graficas.JFrameHerencias.*;

public class main {

	public static void main(String[] args) {
		TestConHerencia test1 = new TestConHerencia();//Asi llamamos a la ventana, le tendremos que insertar los valores.
		
		//Con setBounds le indicamos la posicion la altura y la anchura del objeto
		test1.setBounds(0,0,400,550);//PosIzquierda,PosAltura,Anchura y Altura. Se mide en px.         Esta es la ventana.
		//Con setVisible si ponemos true hacemos que el objeto se vea y si ponemos un false no se va ver.
		test1.setVisible(true);
		//Con setLocationRelativaTo si le introducimos null se va a posicionar en el centro de la pantalla, es decir va a olvidar PosIzquierda y PosAltura
		test1.setLocationRelativeTo(null);
		//Con steResizable con true le estamos dando permisos a que pueda editar el tamaño de la ventana y si le damos a false se lo denegamos
		test1.setResizable(false);

	}

}
