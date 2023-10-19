import java.util.ArrayList;
import java.util.HashMap;

import javax.swing.JOptionPane;

public class Trabajo3 {
	
	HashMap<String, ArrayList<String>> mapTrabajador;
	ArrayList<String> listTrabajador = new ArrayList<String>();
	int precioHoras=2000;
	double salario;
	
	public Trabajo3() {
		// TODO Auto-generated constructor stub
		mapTrabajador = new HashMap<>();
		listTrabajador = new ArrayList<>();
		
		menu();
	}
	
	public void menu() {
		// TODO Auto-generated method stub
		String menu = "1. Ingresar Trabajador\n";
		menu += "2. Salir\n\n";
		int opc = 0;
		do {
            opc = Integer.parseInt(JOptionPane.showInputDialog(menu));
			
			switch (opc) {
			case 1:
				registro();
				calcularSalario();
				break;
				
			case 2:
                System.out.println("Salio");
				break;
				
			default:
				break;
			}
			
		} while (opc != 2);
	}
	
	public void registro() {
		
		int documento = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su numero de documento"));
		String nombre = JOptionPane.showInputDialog("Ingrese su nombre");
		int años = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de años que lleva trabajando"));
		int cantidadHoras = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de horas trabajadas"));
		
		ArrayList<String> trabajadores = new ArrayList<String>();
		
		salario = cantidadHoras * precioHoras;
		
		trabajadores.add(documento+"");
		trabajadores.add(nombre);
		trabajadores.add(años+"");
		trabajadores.add(salario+"");
		
		listTrabajador.addAll(trabajadores);
		guardarDatos(trabajadores);
	}

	public void guardarDatos(ArrayList<String> trabajadores) {
		// TODO Auto-generated method stub
		mapTrabajador.put(trabajadores.get(0), trabajadores);
		JOptionPane.showMessageDialog(null, "Ingreso Exitoso");
	}
	
	public void calcularSalario() {
		for (String documento : mapTrabajador.keySet()) {
			ArrayList<String> trabajador = mapTrabajador.get(documento);
			
			int documentoTrabajador = Integer.parseInt(trabajador.get(0));
			String nombreTrabajador = trabajador.get(1);
			int añosTrabajador = Integer.parseInt(trabajador.get(2));
			double salarioTrabajador = Double.parseDouble(trabajador.get(3));
			
			if (añosTrabajador > 4) {
				salarioTrabajador = salarioTrabajador - salarioTrabajador * 0.1;
			}
			
			System.out.println("\nTrabajador registrado: \n"
					+ "Documento: "+ documentoTrabajador +"\n"
					+ "Nombre: "+ nombreTrabajador +"\n"
					+ "Años trabajando: "+ añosTrabajador +"\n"
					+ "Salario: "+ salarioTrabajador +"\n"
					+ "_____________________________________________________");	
			
		}
	}

}
