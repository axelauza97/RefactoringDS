/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataClumps;

/**
 *
 * @author Axel
 */
public class DCPersonas {
    private String[] nombres, apellidos;

    public DCPersonas(String[] nombres, String[] apellidos) {
        this.nombres = nombres;
        this.apellidos = apellidos;
    }
    public String[] getNombres() {
        return nombres;
    }

    public void setNombres(String[] nombres) {
        this.nombres = nombres;
    }

    public String[] getApellidos() {
        return apellidos;
    }

    

    public void setApellidos(String[] apellidos) {
        this.apellidos = apellidos;
    }
}
