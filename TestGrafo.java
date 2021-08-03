/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ed2.uagrm.grafos.nopesados;
import ed2.uagrm.arboled2.excepciones.ExcepcionAristaYaExiste;

import java.util.Scanner;
/**
 *
 * @author Veronica
 */
public class TestGrafo {
     public static void main(String argumentos[]) throws  ExcepcionAristaYaExiste{
      Grafos g = new Grafos();
     
      g.insertarVertice();
      g.insertarVertice();
      g.insertarVertice();
      g.insertarVertice();
      g.insertarVertice();
      g.insertarVertice();
      g.insertarArista(0, 2);
      g.insertarArista(0, 5);
      g.insertarArista(2, 4);
      g.insertarArista(3, 1);
     // g.insertarArista(4, 2);
     // g.insertarArista(3, 4);
      g.insertarArista(5, 1);
      
      System.out.println(g.toString());
      
     }
}
