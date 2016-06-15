/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package horasyplata;

import java.util.Scanner;

/**
 *
 * @author alum.fial7
 */
public class mas_sueldos {
    
    public static double[] leerhoras(int h)
    {
        double [] arreglo = new double[h];
         for(int i=0;i<=h-1;i=i+1)
      {
          System.out.println("Ingrese una hora: ");
          arreglo[i]=teclado.nextDouble();
      }//Después de n-1 iteraciones el arreglo queda lleno
      //Devolver el arreglo:
      return arreglo;
    }
  public static   Scanner teclado= new Scanner (System.in);
    public static void main(String[] args) 
    {
    int numerodetrabajadores=0;
    int ganan_menos=0;
    double [] horasnormales, horasextras,sueldo,sueldopromedio;
     System.out.println("ingresa el numero de trabajadores de la empresa: ");
     numerodetrabajadores=teclado.nextInt();
    horasnormales=leerhoras( numerodetrabajadores);
    horasextras=leerhoras(numerodetrabajadores);
    sueldo=calcularsueldo(horasnormales,horasextras,numerodetrabajadores);
    }
    public static double[] calcularsueldo(double [] horas1, double[] horas2,int h)
    {
        int i = 0;
        double [] sueldito= new double[h];
        while ( i <= h-1); 
        {
            sueldito[i]=((horasnormales[i]*50.00)+(horasextras[i]*60.00))/2;
            i++;
        }
        
        return sueldito;
    }
    public static void imprimirplanilla()
    {
        
    }
   
 
}
