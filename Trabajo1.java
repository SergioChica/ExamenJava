import java.util.ArrayList;
import java.util.HashMap;

import javax.swing.JOptionPane;

public class Trabajo1 {
	
	HashMap<String, ArrayList<String>> mapEstudiante;
	ArrayList<String> listEstudiante = new ArrayList<String>();
	String fecha,hora,ciudad;
	
	public Trabajo1() {
		mapEstudiante = new HashMap<>();
		listEstudiante = new ArrayList<>();
		
		menu();
	}

	public void menu() {
		// TODO Auto-generated method stub
		String menu = "1. Ingresar Estudiante\n";
		menu += "2. Imprimir todos los estudiante\n";
		menu += "3. Salir\n\n";
		int opc = 0;
		do {
            opc = Integer.parseInt(JOptionPane.showInputDialog(menu));
			
			switch (opc) {
			case 1:
				registro();
				comprobarViaje();
				break;
				
			case 2:
                imprimirDatos();
				break;
				
			case 3:
                System.out.println("Salio");
				break;
				
			default:
				break;
			}
			
		} while (opc != 3);
	}
	
	
	public void registro() {
		
		ArrayList<String> estudiante = new ArrayList<String>();
		
		int documento = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su numero de documento"));
		String nombre = JOptionPane.showInputDialog("Ingrese su nombre");
		int telefono = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su numero de telefono"));
		int codigoCiudad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el codigo de la ciudad"));
		
		if (codigoCiudad == 1) {
			ciudad = "Medellin";
			fecha = "6 de agosto";
			hora = "9 am";
		}else if (codigoCiudad == 2) {
			ciudad = "Bogota";
			fecha = "8 de octubre";
			hora = "10 am";
		}else if (codigoCiudad == 3) {
			ciudad = "Quindio";
			fecha = "24 de noviembre";
			hora = "4 pm";
		}else if (codigoCiudad == 4) {
			ciudad = "Cali";
			fecha = "30 de enero";
			hora = "12 am";
		}else {
			System.out.println("El codigo no existe");
		}
		
		
		estudiante.add(documento+"");
		estudiante.add(nombre);
		estudiante.add(telefono+"");
		estudiante.add(codigoCiudad+"");
		estudiante.add(ciudad);
		estudiante.add(fecha);
		estudiante.add(hora);
		
		listEstudiante.addAll(estudiante);
		guardarDatos(estudiante);
	}

	public void guardarDatos(ArrayList<String> estudiante) {
		// TODO Auto-generated method stub
		mapEstudiante.put(estudiante.get(0), estudiante);
		JOptionPane.showMessageDialog(null, "Ingreso Exitoso");
	}
	
	public void comprobarViaje() {
		for (String documento: mapEstudiante.keySet()) {
			ArrayList<String> estudiante = mapEstudiante.get(documento);
			int documentoEstudiante = Integer.parseInt(estudiante.get(0));
			String nombreEstudiante = estudiante.get(1);
			int telefonoEstudiante = Integer.parseInt(estudiante.get(2));
			int codigoEstudiante = Integer.parseInt(estudiante.get(3));
			String ciudadEstudiante = estudiante.get(4);
			String fechaEstudiante = estudiante.get(5);
			String horaEstudiante =estudiante.get(6);
			
			System.out.println("\nEstudiante registrado: \n"
					+ "Documento: "+ documentoEstudiante +"\n"
					+ "Nombre: "+ nombreEstudiante +"\n"
					+ "Telefono: "+ telefonoEstudiante +"\n"
					+ "Codigo: "+ codigoEstudiante +"\n"
					+ "Ciudad: "+ ciudadEstudiante +"\n" 
					+ "Fecha: "+ fechaEstudiante +"\n" 
					+ "Hora: "+ horaEstudiante+"\n\n"
					+ "_____________________________________________________");
		}
	}
	
	public void imprimirDatos() {
		System.out.println("\n\nESTUDIANTES TOTALES:");
		for (String documento: mapEstudiante.keySet()) {
			ArrayList<String> estudiante = mapEstudiante.get(documento);
			int documentoEstudiante = Integer.parseInt(estudiante.get(0));
			String nombreEstudiante = estudiante.get(1);
			int telefonoEstudiante = Integer.parseInt(estudiante.get(2));
			int codigoEstudiante = Integer.parseInt(estudiante.get(3));
			String ciudadEstudiante = estudiante.get(4);
			String fechaEstudiante = estudiante.get(5);
			String horaEstudiante =estudiante.get(6);
			
			System.out.println("\nDocumento: "+ documentoEstudiante +"\n"
					+ "Nombre: "+ nombreEstudiante +"\n"
					+ "Telefono: "+ telefonoEstudiante +"\n"
					+ "Codigo: "+ codigoEstudiante +"\n"
					+ "Ciudad: "+ ciudadEstudiante +"\n" 
					+ "Fecha: "+ fechaEstudiante +"\n" 
					+ "Hora: "+ horaEstudiante+"\n\n"
					+ "_____________________________________________________");
		}
	}
	
	
	
	

}
