package Interfaces_Graficas.JFrameButtonHerencias;

import javax.swing.*;//Con esta libreria creamos el diseño de la interfaz

import Interfaces_Graficas.main;
import java.awt.event.*;// Agregamos las funcionalidades a los componentes creados

public class Test extends JFrame implements ActionListener{//Con el ActionListener se activara el evento con cuando detecto que se ha activado en el JFrame
	
	JButton boton1;

	public Test(){
		
		setLayout(null); //Este metodo le indicamos donde se va a posicionar el objeto indicado. Null significa que no tiene valor hasta que le demos una orden de posicionamiento
		
		boton1 = new JButton("Cerrar");//Para ponerle un texto al boton lo hacemos con new JButton("Texto")
		boton1.setBounds(300,480,100,30);//PosIzquierda,PosAltura,Anchura y Altura del boton
		add(boton1);//Con este metodo hacemos que aparezca el boton
		boton1.addActionListener(this);//Con addActionListener (Debe estar agregado con el implements) le agregamos una acción al boton    
		
	}

	public void actionPerformed(ActionEvent e) {//Esto es para que se guarde el evento, es decir el evento o la acción se va a guardar en la "e"
		
		if (e.getSource() == boton1) {//getSource() este metodo recupera el evento que se guardo en la variable destras del punto, en nuestro caso es la "e"
			System.exit(0);//Este metodo cierra la interfaz
		}
	
	}
	
	public static void main(String[] args) {
		Test test1 = new Test();
		
		test1.setBounds(0,0,450,550);
		test1.setVisible(true);
		test1.setLocationRelativeTo(null);
		test1.setResizable(false);
		
	}
	
	
}

//https://www.youtube.com/watch?v=6PMMn62pf78