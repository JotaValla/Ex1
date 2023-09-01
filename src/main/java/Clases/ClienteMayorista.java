package Clases;

import java.sql.Timestamp;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ClienteMayorista {

    private String nroID, tipoID, nombres, apellidos, direccion, correo, telf, prefProd, tipoCliente, nomLocal, telfLocal, dirLocal;
    private Timestamp fecha; // Cambio en el tipo de dato
    private boolean estadoCliente; // Cambio en el tipo de dato

    public ClienteMayorista() {
    }

    public ClienteMayorista(String nroID, String tipoID, String nombres, String apellidos, String direccion, String correo, String telf, String prefProd, String tipoCliente, String nomLocal, String telfLocal, String dirLocal, Timestamp fecha, boolean estadoCliente) {
        this.nroID = nroID;
        this.tipoID = tipoID;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.direccion = direccion;
        this.correo = correo;
        this.telf = telf;
        this.prefProd = prefProd;
        this.tipoCliente = tipoCliente;
        this.nomLocal = nomLocal;
        this.telfLocal = telfLocal;
        this.dirLocal = dirLocal;
        this.fecha = fecha;
        this.estadoCliente = true;
    }

 
    public String getNomLocal() {
        return nomLocal;
    }

    public void setNomLocal(String nomLocal) {
        this.nomLocal = nomLocal;
    }

    public String getTelfLocal() {
        return telfLocal;
    }

    public void setTelfLocal(String telfLocal) {
        this.telfLocal = telfLocal;
    }

    public String getDirLocal() {
        return dirLocal;
    }

    public void setDirLocal(String dirLocal) {
        this.dirLocal = dirLocal;
    }
    
    

    public boolean isEstadoCliente() {
        return estadoCliente;
    }
    
    public void setEstadoCliente(boolean estadoCliente) {
        this.estadoCliente = estadoCliente;
    }

    public Timestamp getFecha() {
        return fecha;
    }

    public void setFecha(Timestamp fecha) {
        this.fecha = fecha;
    }

    


    public String getTipoID() {
        return tipoID;
    }

    public void setTipoID(String tipoID) {
        this.tipoID = tipoID;
    }

    public String getNroID() {
        return nroID;
    }

    public void setNroID(String nroID) {
        this.nroID = nroID;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTelf() {
        return telf;
    }

    public void setTelf(String telf) {
        this.telf = telf;
    }

    public String getPrefProd() {
        return prefProd;
    }

    public void setPrefProd(String prefProd) {
        this.prefProd = prefProd;
    }

    public String getTipoCliente() {
        return tipoCliente;
    }

    public void setTipoCliente(String tipoCliente) {
        this.tipoCliente = tipoCliente;
    }

    public boolean validadorDeCedula(String cedula) {
        boolean cedulaCorrecta = false;

        try {

            if (cedula.length() == 10) // ConstantesApp.LongitudCedula
            {
                int tercerDigito = Integer.parseInt(cedula.substring(2, 3));
                if (tercerDigito < 6) {
                    int[] coefValCedula = {2, 1, 2, 1, 2, 1, 2, 1, 2};
                    int verificador = Integer.parseInt(cedula.substring(9, 10));
                    int suma = 0;
                    int digito = 0;
                    for (int i = 0; i < (cedula.length() - 1); i++) {
                        digito = Integer.parseInt(cedula.substring(i, i + 1)) * coefValCedula[i];
                        suma += ((digito % 10) + (digito / 10));
                    }

                    if ((suma % 10 == 0) && (suma % 10 == verificador)) {
                        cedulaCorrecta = true;
                    } else if ((10 - (suma % 10)) == verificador) {
                        cedulaCorrecta = true;
                    } else {
                        cedulaCorrecta = false;
                    }
                } else {
                    cedulaCorrecta = false;
                }
            } else {
                cedulaCorrecta = false;
            }
        } catch (NumberFormatException nfe) {
            cedulaCorrecta = false;
        } catch (Exception err) {
            cedulaCorrecta = false;
        }
        return cedulaCorrecta;
    }

    public boolean ValidarMail(String email) {
        // Patron para validar el email
        Pattern pattern = Pattern.compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");

        Matcher mather = pattern.matcher(email);
        return mather.find();
    }

    public boolean ValidarTele(String num) {
        // Patron para validar el email
        Pattern pattern = Pattern.compile("^09\\d{8}$");

        Matcher mather = pattern.matcher(num);
        return mather.find();
    }

}
