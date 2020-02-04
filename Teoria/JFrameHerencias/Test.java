package Interfaces_Graficas.JFrameHerencias;

import javax.swing.JFrame;

public class Test extends JFrame{//

	public void Ventana() {
		setLayout(null);//Este metodo le indicamos donde se va a posicionar el objeto indicado. Null significa que no tiene valor hasta que le demos una orden de posicionamiento
	}
	
	public static void main(String[] args) {//Aquí le estamos dando el valor al setLayout
		//Creamos un objeto que es la clase donde esta el JFrame. En este caso seria Test
		Test test1 = new Test();
		
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


//https://www.youtube.com/watch?v=VOGula26mMM