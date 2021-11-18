
package encriptadorb.pkg64;

import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.Scanner;

/**
 *
 * @author Daniel Hernandez
 */
public class EncriptadorB64 {


    public static void main(String[] args) {
       
        String cadena,encriptada,desencriptada;
        int opcion;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite 1 si desea encriptar una palabra o frase y 2 si desea desencriptar \n");
        opcion = sc.nextInt();
        
        switch(opcion){
            case 1 :
                Base64.Encoder encoder = Base64.getEncoder();
                System.out.println("Esciba la cadena a encriptar: ");
                cadena = sc.next();
                
                encriptada = encoder.encodeToString(cadena.getBytes(StandardCharsets.UTF_8));
                
                System.out.println("Cadena Original: " + cadena);
                System.out.println("Cadena Encriptada: " + encriptada);
            break;
            case 2 :
                Base64.Decoder decoder = Base64.getDecoder();
                System.out.println("Escriba la cadena a desencriptar recuerde que debe de ser Base64 UTF-8");
                cadena = sc.next();
                
                byte[] decodifica = decoder.decode(cadena);
                desencriptada = new String(decodifica);
                
                System.out.println("Cadena a Desencriptar: " + cadena);
                System.out.println("Cadena Desencriptada: " + desencriptada);
            break;
        }
        
    }
    
}
