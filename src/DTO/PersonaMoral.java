package DTO;

public class PersonaMoral extends Persona{

    private String giro;
    private String contacto;
    private MiFecha fechaCreacion;

    public PersonaMoral(String nombre, String giro, String contacto, MiFecha fechaCreacion) {
        super(nombre);
        this.giro = giro;
        this.contacto = contacto;
        this.fechaCreacion = fechaCreacion;
    }

    @Override
    public String getNombre(){
        return super.getNombre();
    }

    public PersonaMoral (){}

    public String getGiro() {
        return giro;
    }

    public void setGiro(String giro) {
        this.giro = giro;
    }

    public String getContacto() {
        return contacto;
    }

    public void setContacto(String contacto) {
        this.contacto = contacto;
    }

    public MiFecha getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(MiFecha fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    @Override
    public String toString() {
        return "PersonaMoral [contacto=" + contacto + ", fechaCreacion=" + fechaCreacion + ", giro=" + giro + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((contacto == null) ? 0 : contacto.hashCode());
        result = prime * result + ((fechaCreacion == null) ? 0 : fechaCreacion.hashCode());
        result = prime * result + ((giro == null) ? 0 : giro.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        PersonaMoral other = (PersonaMoral) obj;
        if (contacto == null) {
            if (other.contacto != null)
                return false;
        } else if (!contacto.equals(other.contacto))
            return false;
        if (fechaCreacion == null) {
            if (other.fechaCreacion != null)
                return false;
        } else if (!fechaCreacion.equals(other.fechaCreacion))
            return false;
        if (giro == null) {
            if (other.giro != null)
                return false;
        } else if (!giro.equals(other.giro))
            return false;
        return true;
    }

    
    

}
