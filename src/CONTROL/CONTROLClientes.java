package CONTROL;

import DAO.DAOClientes;
import IGU.IGUMenu;


public class CONTROLClientes {

    private DAOClientes daoClientes;
    private IGUMenu iguMenu;
    
    public CONTROLClientes() {
    	this.iguMenu = new IGUMenu();
    	this.iguMenu.setControlClientes(this);
    	this.daoClientes = new DAOClientes(iguMenu.numeroClientes());
    	this.daoClientes.setControlClientes(this);
    	this.iguMenu.Menu();
    }
   

    public static void main(String[] args) {
        new CONTROLClientes();
        
    }
    
    public Object agregar(Object cliente) {
    	return this.daoClientes.agregar(cliente);
    }
	
	public Object buscar(String nombre){
		return this.daoClientes.buscar(nombre);
	}
    
   
    
	public DAOClientes getDaoClientes() {
		return daoClientes;
	}

	public void setDaoClientes(DAOClientes daoClientes) {
		this.daoClientes = daoClientes;
	}

}
