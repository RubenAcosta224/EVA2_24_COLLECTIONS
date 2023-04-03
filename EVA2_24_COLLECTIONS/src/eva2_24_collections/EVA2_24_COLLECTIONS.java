/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva2_24_collections;

import java.util.ArrayList;

/**
 *
 * @author invitado
 */
public class EVA2_24_COLLECTIONS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        ArrayList miarreglo=new ArrayList();
        
        miarreglo.add(new Persona());
        
        
        ArrayList<Integer> miarreglo2=new ArrayList<Integer>();
        
        miarreglo2.add(23);
        miarreglo2.add(65);
        miarreglo2.add(254);
        miarreglo2.add(652424);
        
        System.out.println(miarreglo2);
    }
    
}


class Persona{
    
}