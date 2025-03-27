import java.util.Scanner;

public class principal 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        boolean bandera = true;
        int opt = 0;
        while (bandera)
        {
            System.out.println("Binevenidos a Frater!");
            System.out.println("Seleccione Nuestro Menu!");
            System.out.println("1: Hamburguesas");
            System.out.println("2: Perros Caliente");
            System.out.println("3: Salchipapas");
            System.out.println("4:Salir ");
            while (!sc.hasNextInt()) 
            {
                System.out.println("Entrada no valida por favor intente de nuevo");
                sc.next();
            }
            opt = sc.nextInt();
            switch (opt) 
            {
                case 1:
                    
                    break;
                case 2:
                    
                    break;
                case 3:
                    
                    break;
                case 4:
                    
                    break;
            
                default:
                    System.out.println("Pagina en mantenimiento");
                    break;
            }
        }
        


    }
}
