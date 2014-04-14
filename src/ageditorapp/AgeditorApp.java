/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ageditorapp;

import java.util.Scanner;
import ageditorcontroller.Editor;
import ageditorcontroller.Intro;
/**
 *
 * @author Gloria
 */
public class AgeditorApp {
public static void main(String[] args) {

        Editor editor = new Editor();

        Scanner buffer = new Scanner(System.in);
        Intro intro = new Intro();
        
        String opcion;
        int op;
        
        intro.Inicio();
        opcion = buffer.nextLine();
        op = (Integer.parseInt(opcion));
        if (op == 1) {
            
            intro.Historia();
            opcion = buffer.nextLine();
            op = (Integer.parseInt(opcion));
            if (op == 1){
                editor.createMap();
            }else if (op == 2) {
                System.exit(0);
            }else {
                System.out.println("No es una opción válida");
            }
            
        } else if (op == 2) {
            System.exit(0);
        }else {
            System.out.println("No es una opción válida");
        }
      
    
    }
}
