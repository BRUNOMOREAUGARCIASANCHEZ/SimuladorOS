package com.mycompany.sim2;

import java.util.List;
import java.util.ArrayList;
/**
 *
 * @author HP
 */
public class bloque {
    public int No;
    boolean ocupado;
    public ArrayList<bloque> enlace=new ArrayList<bloque>();
    public int r=1,g=1,b=1;

    public bloque(int No) {
        this.No = No;
        this.ocupado=false;
    }

    public boolean isOcupado() {
        return ocupado;
    }

    public List<bloque> getEnlace() {
        return enlace;
    }

    public void setNo(int No) {
        this.No = No;
    }

    public void setOcupado(boolean ocupado) {
        this.ocupado = ocupado;
    }

    public void setEnlace(bloque b) {
        this.enlace.add(b);
    }
    
    public void setEnlaceMulti(int[] enlaces) {
        
    }
    
    public void setColor(int red,int green, int blue){
        r=red;
        g=green;
        b=blue;
    }
    
    public void reset(){
        this.enlace=new ArrayList<bloque>();
        this.ocupado=false;
        r=1;
        g=1;
        b=1;
    }
    
}
