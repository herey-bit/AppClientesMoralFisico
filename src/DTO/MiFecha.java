package DTO;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author herey
 * @version 12.01
 * @see PruebaMiFecha
 * 
 */
public class MiFecha {

    private int eDia, eMes, eAnio;

    //
    public MiFecha(int eDia, int eMes, int eAnio) {
        this.eDia = eDia;
        this.eMes = eMes;
        this.eAnio = eAnio;
    }

    public MiFecha(MiFecha MiFecha) {
        this.eDia = MiFecha.geteDia();
        this.eMes = MiFecha.geteMes();
        this.eAnio = MiFecha.geteAnio();
    }

    public MiFecha agregar(int eMasDias) {
        MiFecha m = new MiFecha(this);
        m.seteDia(eMasDias + m.geteDia());
        return m;
    }

    /**
     * @deprecated Este metodo no es aceptable
     */
    @Deprecated
    public void escribir() {
        System.out.println(geteAnio() + " " + geteDia() + " " + geteMes());
    }

    /**
     * 
     * @param args @exception
     */
    public static void main(String[] args) {

        try {
            MiFecha m = new MiFecha(12, 10, 2020);
            MiFecha n = m.agregar(12);
            System.out.println(n.geteDia());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
    }

    /**
     * @return the eDia
     */
    public int geteDia() {
        return eDia;
    }

    /**
     * @param eDia the eDia to set
     */
    public void seteDia(int eDia) {
        this.eDia = eDia;
    }

    /**
     * @return the eMes
     */
    public int geteMes() {
        return eMes;
    }

    /**
     * @param eMes the eMes to set
     */
    public void seteMes(int eMes) {
        this.eMes = eMes;
    }

    /**
     * @return the eAnio
     */
    public int geteAnio() {
        return eAnio;
    }

    /**
     * @param eAnio the eAnio to set
     */
    public void seteAnio(int eAnio) {
        this.eAnio = eAnio;
    }
    
}
