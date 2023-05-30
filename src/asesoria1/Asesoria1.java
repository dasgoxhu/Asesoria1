package asesoria1;

import javax.swing.JOptionPane;

public class Asesoria1 
{  
    public static void main(String[] args) 
    {
        int num1 , num2 , suma;
        num1 = Integer.parseInt(JOptionPane.showInputDialog("ingresa numero 1: "));
        num2 = Integer.parseInt(JOptionPane.showInputDialog("ingresa numero 2: "));
        
        suma = num1 + num2;
        
        JOptionPane.showMessageDialog(null,"el resultado de sumar " + num1 + " con el numero " + num2 + " es: " + suma);
        
         
        if((suma >= 10) && (suma <= 50))
        {
            suma = suma * 2;
        }
        
        JOptionPane.showMessageDialog(null,"el resultado de sumar nuevo es: " + suma);
        
        
        int limite;
        
        limite = Integer.parseInt(JOptionPane.showInputDialog("ingresa el limite de la cadena: "));
        
        for (int x = limite; x >= 1; x--)
        {
             JOptionPane.showMessageDialog(null,x);
        }
            
    }    
}
