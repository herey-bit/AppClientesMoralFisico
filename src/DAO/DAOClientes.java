package DAO;

import CONTROL.CONTROLClientes;
import DTO.Persona;
import DTO.PersonaFisica;
import DTO.PersonaMoral;

public class DAOClientes {
    
   
    private Persona[] arregloClientePersonas;
    private int posicion;
    private CONTROLClientes controlClientes;
    
    public DAOClientes (int eTamanio) {
    	arregloClientePersonas = new Persona[eTamanio];
    	this.posicion = -1;
    }
    

    public Object agregar(Object cliente){
    	
    	Object obj = null;
    	
    	if (cliente instanceof PersonaMoral) {
    		obj = (PersonaMoral)cliente;
    	} else {
    		obj = (PersonaFisica)cliente;
    	}
    	
    	
    	
    	
        if (binarySearch(((Persona) obj).getNombre()) == -1 && (this.posicion != arregloClientePersonas.length-1)){
            insertionSort(obj);
            return cliente;
        } else {
        	return "Registro no exitoso\n";
        }
    }
    
    
    public Object eliminar(String nombre){
        Object oCliente;
        int contador = binarySearch(nombre);

        if((contador > -1)){
            oCliente = arregloClientePersonas[contador];
            arregloClientePersonas[contador] = null;
            //this.posicion--;
            while (contador<posicion){
            	arregloClientePersonas[contador] = arregloClientePersonas[contador+1];
                contador++;
            }
            this.posicion--;
            //aClientes[posicion+1] = null;
            if (oCliente instanceof PersonaMoral){
                return ((PersonaMoral)oCliente).toString();
            } else {
                return ((PersonaFisica)oCliente).toString();
            }
        } else{
            return "No es posible borrar el registro";
        }

            
            
    }

    
    public Object modificar(Object cliente){
        
    }

    public Object buscar(String nombre){
        Object obj;
        int contador = binarySearch(nombre);

        if (contador > -1){
            if (arregloClientePersonas[contador] instanceof PersonaMoral){
                obj = (PersonaMoral) arregloClientePersonas[contador];
            } else {
                obj = (PersonaFisica) arregloClientePersonas[contador];
            }
            return obj;
        } else {
            return "No existe el registro";
        }


    }
    
    

    public void setControlClientes(CONTROLClientes controlClientes) {
        this.controlClientes = controlClientes;
    }

    public int binarySearch (String nombre){
        boolean flag;
        int inicio, mitad, ultimo, posicion;
        
        flag = false;
        posicion = -1;
        inicio = 0;
        ultimo = this.posicion;
        while ((inicio<=ultimo)&&(!flag)) {
            mitad = (inicio+ultimo)%2 == 0 ? ((inicio+ultimo)/2):((inicio+ultimo)/2)+1;
            if (arregloClientePersonas[mitad].getNombre().toLowerCase().equals(nombre.toLowerCase())){
                posicion = mitad;
                flag = true;
            }

            if (nombre.toLowerCase().compareTo(arregloClientePersonas[mitad].getNombre().toLowerCase()) < 0){
                ultimo = mitad - 1;

            } else {
                inicio =  mitad + 1;

            }

        }

        return posicion;
    }

    public void insertionSort (Object obj){
        String nombre;
        int ePosicion;
        PersonaFisica oCliente = null;
        PersonaMoral mCliente = null;
        if (obj instanceof PersonaMoral){
            mCliente = (PersonaMoral) obj;
            nombre = mCliente.getNombre();
        } else {
            oCliente = (PersonaFisica) obj;
            nombre = oCliente.getNombre();
        }

        

        ePosicion = this.posicion+1;
        while ((ePosicion > 0) && (nombre.compareTo(arregloClientePersonas[ePosicion-1].getNombre().toLowerCase())<0)){
            arregloClientePersonas[ePosicion] = arregloClientePersonas[ePosicion-1];
            ePosicion--;
        }
        this.posicion++;
        
        if (obj instanceof PersonaMoral){
            arregloClientePersonas[ePosicion] = new PersonaMoral(mCliente.getNombre(),mCliente.getGiro(),mCliente.getContacto(),mCliente.getFechaCreacion());
        } else {
            arregloClientePersonas[ePosicion] = new PersonaFisica(oCliente.getNombre(),oCliente.getAapellidoPaterno(),oCliente.getApellidoMaterno(),oCliente.getFechaNacimiento());
        }
    }

	public CONTROLClientes getControlClientes() {
		return controlClientes;
	}
	
	
    
}
