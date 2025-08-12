package Lista2;
import java.util.Scanner;

public class Atividade21 {
    public static void main(String[] args) {
        Scanner en = new Scanner(System.in);
        
        System.out.println("Digite uma data no formato dd/mm/aaaa:");
        String data = en.nextLine();
        
        boolean dataValida = validarData(data);
        
        if(dataValida) {
            System.out.println("Data válida!");
        } else {
            System.out.println("Data inválida!");
        }
        
        en.close();
    }
    
    public static boolean validarData(String data) {
       
        if(data.length() != 10) return false;
        
        
        if(data.charAt(2) != '/' || data.charAt(5) != '/') return false;
        
        try {
            int dia = Integer.parseInt(data.substring(0, 2));
            int mes = Integer.parseInt(data.substring(3, 5));
            int ano = Integer.parseInt(data.substring(6, 10));
            
            
            if(dia < 1 || mes < 1 || mes > 12 || ano < 1) return false;
            
           
            int[] diasPorMes = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
            
            
            if(mes == 2 && ehBissexto(ano)) {
                diasPorMes[1] = 29;
            }
            
            return dia <= diasPorMes[mes-1];
            
        } catch(NumberFormatException e) {
            return false;
        }
    }
    
    public static boolean ehBissexto(int ano) {
        return (ano % 400 == 0) || (ano % 4 == 0 && ano % 100 != 0);
    }
}