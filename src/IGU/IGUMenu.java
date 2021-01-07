package IGU;

import java.util.Scanner;

import CONTROL.CONTROLClientes;
import DTO.MiFecha;
import DTO.PersonaFisica;
import DTO.PersonaMoral;

public class IGUMenu {
	
	private CONTROLClientes controlClientes;
	private static final Scanner entrada = new Scanner(System.in);
	
	public IGUMenu() {
		//Menu();
	}
	
	public void Menu () {
		 

	        int opcion;
			do {
	            System.out.print("\n\tCRUD DE CLIENTES\n" +
	                    "(1) Registrar Cliente (2) Consultar Cliente\n" +
	                    "(3) Listar Clientes (4) Actualizar Cliente\n" +
	                    "(5) Borrar Cliente (6) Salir\n" +
	                    "Opcion: ");
	            opcion = entrada.nextInt();
	            //entrada.nextLine();
				seleccionaOpcion(opcion);
	        } while (opcion != 6);
	}

	public int seleccionaCliente(){
		int opcion;
		do{
			System.out.println("Selecciona cliente| (1)Persona Moral |  (2) Persona Fisica | \n");
			opcion = entrada.nextInt();
		} while (opcion != 1 && opcion != 2);
		entrada.nextLine();
		return opcion; 
	}

	public void accionAgregarCliente (int numCliente){
		if (numCliente == 1){
			imprimir(controlClientes.agregar(capturarPersonaMoral()));
		} else {
			imprimir(controlClientes.agregar(capturarPersonaFisica()));
		}
	}

	public void accionModificarCliente(String  nombre){
		Object obj = controlClientes.buscar(nombre);
		String cadena1, cadena2;
		MiFecha fecha;
		if (obj instanceof String) {
			
		} else {
			obj = (obj instanceof PersonaMoral) ? (PersonaMoral)obj: (PersonaFisica)obj;
			imprimir(obj);
			
		}
	}
	
	public void capturarDatos(String cadena1, String cadena2, MiFecha fecha) {
		int opcion;
		
		
		if (obj instanceof PersonaMoral) {
			
			do {
				imprimir("|(1)Giro|(2)Contacto|(3)Fecha|(4)Salir|");
				opcion = entrada.nextInt();
				entrada.nextLine();
				switch(opcion) {
					case 1 -> cadena1 = giro();
					case 2 -> cadena2 = contacto();
					case 3 -> fecha = fechaCreacion();
					case 4 -> imprimir("No se ha realizado la operacion");
					default -> imprimir("Elija una opcion valida");
				}
			}(opcion != 4);
			
			if(opcion != 4) {
				imprimir("Guardar los cambios?\n");
				
			}
			
			
		} else {
			
		}
	}

	public void imprimir(Object objeto){
		Object obj = null;
		
		if (objeto instanceof String){System.out.println((String)objeto);}
		if (objeto instanceof PersonaMoral){obj = (PersonaMoral) objeto;
			System.out.println(obj.toString());}

		if (objeto instanceof PersonaFisica){obj = (PersonaFisica) objeto;
			System.out.println(obj.toString());}
	}
	
	public void seleccionaOpcion (int opcion){

		int seleccionaCliente = seleccionaCliente();

		switch (opcion) {

			case 1 -> accionAgregarCliente(seleccionaCliente);
			/*case 2 -> printFormato(aClientes.consultar(leerNombre()));
			case 3 -> printFormato(aClientes.listar());
			case 4 -> {
				nombre = leerNombre();
				mensaje = aClientes.consultar(nombre);
				printFormato(mensaje);
				if (!mensaje.contains("MENSAJE")){
					if (confirmar())
						printFormato(aClientes.actualizar(enviar(nombre)));
				}
			}
			case 5 -> {
				nombre = leerNombre();
				mensaje = aClientes.consultar(nombre);
				printFormato(mensaje);
				if (!mensaje.contains("MENSAJE")){
					if (confirmar())
						printFormato(aClientes.eliminar(nombre));
				}
			}*/
			case 6 -> System.out.println("Adios");
			default -> System.out.println("Selecciona una opcion valida");
		}
	}

	public PersonaFisica capturarPersonaFisica() {
		//entrada.next();
		return new PersonaFisica(nombre(), apellidoPaterno(), apellidoMaterno(), fechaCreacion());
	}
	
	public PersonaMoral capturarPersonaMoral() {
		//entrada.next();
		return new PersonaMoral(nombre(), giro(), contacto(), fechaCreacion());
	}
	
	public String contacto() {
		System.out.println("Ingresa el numero de contacto: \n");
		return entrada.nextLine();
	}

	public String giro() {
		System.out.println("Ingresa el giro: \n");
		return entrada.nextLine();
	}
	public String nombre() {
		System.out.println("Ingresa el nombre: \n");
		return entrada.nextLine();
	}

	public String apellidoMaterno() {
		System.out.println("Ingresa el apellido materno: \n");
		return entrada.nextLine();
	}

	public String apellidoPaterno() {
		System.out.println("Ingresa el apellido paterno: \n");
		return entrada.nextLine();
	}

	public MiFecha fechaNacimiento(){
		int dia, mes, anio;
		System.out.println("Ingresa la fecha de nacimiento \n");
		System.out.println("Ingresa el dia\n");
		dia = entrada.nextInt();
		System.out.println("Ingresa el mes\n");
		mes = entrada.nextInt();
		System.out.println("Ingresa el a\u00f1o\n");
		anio = entrada.nextInt();
		return new MiFecha(dia,mes,anio);
	}

	public MiFecha fechaCreacion(){
		int dia, mes, anio;
		System.out.println("Ingresa la fecha de creacion \n");
		System.out.println("Ingresa el dia\n");
		dia = entrada.nextInt();
		System.out.println("Ingresa el mes\n");
		mes = entrada.nextInt();
		System.out.println("Ingresa el ano\n");
		anio = entrada.nextInt();
		return new MiFecha(dia,mes,anio);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	public int numeroClientes() {
        int opcion;
        do {
            System.out.println("Ingresa el numero de clientes para administrar: ");
            opcion = entrada.nextInt();
        } while (opcion < 1);

        return opcion;
    }

	
	public void setControlClientes(CONTROLClientes controlClientes) {
		this.controlClientes = controlClientes;
	}
	
	
}
