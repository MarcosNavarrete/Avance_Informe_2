import java.util.ArrayList;
import java.util.Scanner;
public class Main {
	private ArrayList<Cliente> clientes = new ArrayList<Cliente>();// dentro de este existe el arrayList cotizacion
	private ArrayList<Usuario> usuarios = new ArrayList<Usuario>();
        Validar val = new Validar();
	public static void main(String[] args) {
            Main main = new Main();
            main.ingresar();
            main.menu();
	}
       
        public void ingresar(){
             Usuario usu = new Usuario();
             usu.usuario();
        }
        
        public void menu(){
            Scanner teclado = new Scanner(System.in);
            System.out.println("1: Nuevo Cliente");
            System.out.println("2: Nueva Cotizacion");
            System.out.println("3: Buscar cotizacion");
            System.out.println("4: Buscar Cliente");
            System.out.println("5: Buscar por Patente");
            System.out.println("6: Buscar por Rut");
            System.out.println("7: Salir");
           
            int opcn = val.validacion();
            seleccion(opcn);
        }
        
        public void seleccion(int opcn){
        int opcion= 0;
        Validar val = new Validar();
  
        switch(opcn){
            case 1: añadirCliente();
                    menu();
            break;
            
            case 2: añadirCotizacion();
                    menu();
            break;
            
            case 3: buscarCotizacion();
                    menu();
            break;
            
            case 4: buscarCliente();
                    menu();
            break;
            
            case 5: buscarPatente();
                    menu();
            break;
            
            case 6: buscarRut();
                   
                    menu();
            break;
            
            case 7: System.exit(0);
            break;
            
            default: menu();
            break;
          
        }
      }
        
        public void añadirCliente(){
            Cliente e = new Cliente(); // el constructor de la clase es quien pide los datos
            this.clientes.add(e);
            
           // ahora la idea es cambiar el nombre del objeto del ArrayList por el nombre del usuario para poder trabajar el ArrayList con sus nombres
        }
        
        public void mostrarCliente(){
          for(int i=0; i<clientes.size();i++){
            System.out.println("Datos cliente ");
            System.out.println(clientes.get(i).getNombre());
            System.out.println(clientes.get(i).getRut());
            System.out.println(clientes.get(i).getContacto());
          }
        }
        
        public  void añadirCotizacion(){
            Scanner sc = new Scanner(System.in);
            System.out.println("ingrese el cliente");// se crea una cotizacion en el arraylist Cotizacion contenido en el ArrayList clientes
            String usuario = sc.nextLine();
            buscarCliente();
            
        }
        
        public  void buscarCotizacion(){
        }
        
        public void buscarCliente(){
            System.out.println("ingrese nombre");
            /*
            se necesita un iterador que recorra el arraylist clientes y preguntarle a cada uno si existe o no el nombre
            */
        }
        
        public void buscarPatente(){
        //un iterador parecido al de buscarCliente pero que busque en el arrayList de cotizaciones, dentro del arrayList de clientes
        }
        
        public void buscarRut(){
            //igual al iterador de buscarCliente
        }
}