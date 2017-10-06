/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reformas;

import java.util.Objects;

/**
 *
 * @author DAM
 */
public class Cliente {
    private String nombre;
    private String apellido;
    private int telefono;
    private boolean vip;

    public Cliente() {
    }

    public Cliente(int telefono) {
        this.telefono = telefono;
    }

    public Cliente(String nombre, String apellido, int telefono, boolean vip) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.vip = vip;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public boolean isVip() {
        return vip;
    }

    public void setVip(boolean vip) {
        this.vip = vip;
    }

    @Override
    public String toString() {
        return "cliente{" + "nombre=" + nombre + ", apellido=" + apellido + ", telefono=" + telefono + ", vip=" + vip + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Cliente other = (Cliente) obj;
        if (this.telefono != other.telefono) {
            return false;
        }
        if (this.vip != other.vip) {
            return false;
        }
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        if (!Objects.equals(this.apellido, other.apellido)) {
            return false;
        }
        return true;
    }
    
     
}
