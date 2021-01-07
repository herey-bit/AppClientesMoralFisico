package DTO;

public class PersonaFisica extends Persona {

    private String apellidoPaterno;
    private String apellidoMaterno;
    private MiFecha fechaNacimiento;

    public PersonaFisica(String nombre, String apellidoPaterno, String apellidoMaterno, MiFecha fechaNacimiento) {
        super(nombre);
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.fechaNacimiento = fechaNacimiento;
    }

    public PersonaFisica(){}

    @Override
    public String getNombre(){
        return super.getNombre();
    }

    public String getAapellidoPaterno() {
        return apellidoPaterno;
    }

    public void setAapellidoPaterno(String aapellidoPaterno) {
        this.apellidoPaterno = aapellidoPaterno;
    }

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }

    public MiFecha getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(MiFecha fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    @Override
    public String toString() {
        return super.toString() + ", apellidoPaterno=" + apellidoPaterno + ", apellidoMaterno=" + apellidoMaterno
                + ", fechaNacimiento=" + fechaNacimiento + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((apellidoMaterno == null) ? 0 : apellidoMaterno.hashCode());
        result = prime * result + ((apellidoPaterno == null) ? 0 : apellidoPaterno.hashCode());
        result = prime * result + ((fechaNacimiento == null) ? 0 : fechaNacimiento.hashCode());
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
        PersonaFisica other = (PersonaFisica) obj;
        if (apellidoMaterno == null) {
            if (other.apellidoMaterno != null)
                return false;
        } else if (!apellidoMaterno.equals(other.apellidoMaterno))
            return false;
        if (apellidoPaterno == null) {
            if (other.apellidoPaterno != null)
                return false;
        } else if (!apellidoPaterno.equals(other.apellidoPaterno))
            return false;
        if (fechaNacimiento == null) {
            if (other.fechaNacimiento != null)
                return false;
        } else if (!fechaNacimiento.equals(other.fechaNacimiento))
            return false;
        return true;
    }
    
    

    

   

}
