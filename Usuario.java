import java.util.Scanner;

public class Usuario {
  Scanner teclado  = new Scanner(System.in);
  private String usu = "MAG";
  private String pass = "123";
  
  public void usuario() {
    System.out.println("Ingrese el nombre de usuario");
    String usuario = teclado.nextLine();
    
    if (usu.equals(usuario)) {
      System.out.println("Usuario ingresado correctamente");
      System.out.println("Ingrese la contraseÃ±a por favor");
      String contrasena = teclado.nextLine();
      
      if (pass.equals(contrasena)) {
        System.out.println("Contraseña ingresada correctamente");  
      } else {
        System.out.println("Contraseña ingresada incorrecta, ingrese datos nuevamente.");
        usuario();
      }
          
    }else {
      System.out.println("Usuario ingresado incorrecto, intente nuevamente.");
      usuario();
    }

  }
     
}