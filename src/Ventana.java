import java.text.DecimalFormat;
import java.util.Arrays;

import javax.swing.JOptionPane;

public class Ventana {

	public static void main(String[] args) throws Exeption {
		
		 boolean regresarPantallaPrincipal = false;

	        do {
		
		 String[] opciones = {"Conversor de Moneda", "Conversor de Temperatura", "Salir del Programa"};

		 
	        // Mostrar ventana de opciones
	        String opcion = (String) JOptionPane.showInputDialog(
	                null, // Componente padre (en este caso, nulo para una ventana independiente)
	                "Selecciona una opción de conversion", // Mensaje de la ventana
	                "Menu", // Título de la ventana
	                JOptionPane.QUESTION_MESSAGE, // Tipo de mensaje
	                null, // Icono personalizado (en este caso, nulo para usar el icono predeterminado)
	                opciones, // Opciones de la lista desplegable
	                opciones[0] // Opción predeterminada seleccionada
	                );

	        
	    
	        // Procesar la opción seleccionada
	        if (opcion != null) {
	        	if (opcion.equals("Salir del Programa")) {
	        	 JOptionPane.showMessageDialog(null, "Salir del Programa");
	        	 System.out.println("Opción seleccionada: " + opcion);
	        	 System.exit(0);     
	        	 
	        }   else if (opcion.equals("Conversor de Moneda")) {
	        	System.out.println("Opción seleccionada: " + opcion);
	        	
	        	double input = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese la cantidad a convertir:"));
	        	
	        	
	        	String [] conversion = {"De Pesos a Dolares","De Pesos a Euros","De Pesos a Yenes",
	        			"De Pesos a Lira Turca","De Pesos a Rupias"};
	        		
	        		String conversionSeleccionada = (String) JOptionPane.showInputDialog(
	        			null, "Eliga una opcion", "Conversor de Moneda", JOptionPane.QUESTION_MESSAGE, 
	        			null, conversion,  conversion[0] );
	        	
	        		int actividad = Arrays.asList(conversion).indexOf(conversionSeleccionada);
	        	
	        	
	        	//JOptionPane.showMessageDialog(null, "ACTIVIDAD " + actividad );

	        	double resultado;
				switch (actividad){
	            case 0:	
	                resultado = input * 0.059;  // Factor de conversión de pesos a dólares
	                JOptionPane.showMessageDialog(null, "Tienes $" + resultado + " en dólares." );
	                break;
	            case 1:
	                resultado = input * 0.053;  // Factor de conversión de pesos a euros
	                JOptionPane.showMessageDialog(null, "Tienes $" + resultado + " en euros.");
	                break;
	            case 2:
	                resultado = input * 8.24;  // Factor de conversión de pesos a yenes
	                JOptionPane.showMessageDialog(null, "Tienes $" + resultado + " en yenes.");
	                break;
	            case 3:
	                resultado = input * 1.53;  // Factor de conversión de pesos a liras
	                JOptionPane.showMessageDialog(null, "Tienes $" + resultado + " en liras.");
	                break;
	            case 4:
	                resultado = input * 4.83;  // Factor de conversión de pesos a rupias
	                JOptionPane.showMessageDialog(null, "Tienes $" + resultado + " en rupias.");
	                break;
	                
	            default:
	                System.out.println("Opción de conversión no válida.");
			
	        		System.exit(0);
	        }
	        	}  else if (opcion.equals("Conversor de Temperatura")) {
	        		
	        		double input = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese la cantidad de temperatura a convertir:"));
		        	
		        	
		        	String [] conversion = {"De Celsius a Farenheiet","De Celsius a Kelvin","De Farenheiet a Celsius",
		        			"De Farenheiet a Kelvin","De Kelvin a Farenheiet","De Kelvin a Celsius"};
		        		
		        		String conversionSeleccionada = (String) JOptionPane.showInputDialog(
		        			null, "Eliga una opcion", "Conversor de Temperatura", JOptionPane.QUESTION_MESSAGE, 
		        			null, conversion,  conversion[0] );
		        	
		        		int actividad = Arrays.asList(conversion).indexOf(conversionSeleccionada);
		        	
		        	
		        	//JOptionPane.showMessageDialog(null, "ACTIVIDAD " + actividad );

		        	double resultado;
					switch (actividad){
		            case 0:	
		                resultado = input * 0.059;  // Factor de conversión de Celsius a Farenheiet
		                JOptionPane.showMessageDialog(null, "Tienes $" + resultado + " en dólares." );
		                break;
		            case 1:
		                resultado = input * 0.053;  // Factor de conversión de Celsius a Kelvin
		                JOptionPane.showMessageDialog(null, "Tienes $" + resultado + " en dólares.");
		                break;
		            case 2:
		                resultado = input * 8.24;  // Factor de conversión de Farenheiet a Celsius
		                JOptionPane.showMessageDialog(null, "Tienes $" + resultado + " en dólares.");
		                break;
		            case 3:
		                resultado = input * 1.53;  // Factor de conversión de Farenheiet a Kelvin
		                JOptionPane.showMessageDialog(null, "Tienes $" + resultado + " en dólares.");
		                break;
		            case 4:
		                resultado = input * 4.83;  // Factor de conversión de Kelvin a Farenheiet
		                JOptionPane.showMessageDialog(null, "Tienes $" + resultado + " en dólares.");
		                break;
		            case 5:
		                resultado = input * 4.83;  // Factor de conversión de Kelvin a Celsius
		                JOptionPane.showMessageDialog(null, "Tienes $" + resultado + " en dólares.");
		                break;
		                
		            default:
		                System.out.println("Opción de conversión no válida.");
		                System.exit(0);
					} 	
	        	}
	        }
					 if (!opcion.equals("Salir del Programa")) {
			                int seleccion = JOptionPane.showConfirmDialog(null, "¿Desea regresar a la pantalla principal?", "Confirmar", JOptionPane.YES_NO_OPTION);
			                regresarPantallaPrincipal = (seleccion == JOptionPane.YES_OPTION);
			            }
			        } while (regresarPantallaPrincipal);

			        JOptionPane.showMessageDialog(null, "¡Gracias por usar el programa!");
	        }
	    }
	
