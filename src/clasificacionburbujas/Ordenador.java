/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clasificacionburbujas;

/**
 *
 * @author guada
 */
public class Ordenador {
    public void main(int [] array) 
    {
     int aux;
     boolean cambios = false;
     
     while (true)
             {
                 cambios = false;
                 for(int i=1;i<array.length;i++)
                 {
                     if(array[1]<array[i-1])
                     {
                 aux = array[1];
                 array [1] = array [i-1];
                 array [i-1] = aux;
                 cambios = true;
             }
             }
       if(cambios==false)
       break;
}
    }

}