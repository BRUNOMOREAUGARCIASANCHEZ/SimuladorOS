package com.mycompany.sim2;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
import java.util.Scanner;
/**
 *
 * @author HP
 */
public class SIM2 {
    public static Scanner scanner = new Scanner(System.in);
    public static int memoria;
    public static FormSIM2 interfaz;
    
    
    public static void memoriaContigua(){
        int[] a = new int[100];
        int[] s = new int[10];
        int[] l = new int[10];
        
        System.out.print("Enter the total memory you want: ");
        int m = scanner.nextInt();
        
        System.out.print("Enter the total number of files: ");
        int n = scanner.nextInt();
        
        for (int i = 0; i < m; i++) {
            a[i] = -1;
        }
        
        for (int i = 0; i < n; i++) {
            System.out.printf("Enter the starting block of file %d: ", (i + 1));
            s[i] = scanner.nextInt();
            System.out.printf("Enter the length of the file %d: ", (i + 1));
            l[i] = scanner.nextInt();
        }
        
        for (int i = 0; i < n; i++) {
            int c = 0;
            for (int k = s[i], j = 0; j < l[i]; j++, k++) {
                if (a[k] == -1) {
                    c = 0;
                } else {
                    c = 1;
                    break;
                }
            }
            if (c == 1) {
                System.out.printf("This block was already filled by file %d%n", (a[s[i]] + 1));
            }
            if (c == 0) {
                for (int k = s[i], j = 0; j < l[i]; j++, k++) {
                    a[k] = i;
                }
                System.out.printf("The file %d is filled from %d to %d%n", (i + 1), s[i], (s[i] + l[i] - 1));
            }
        }
    }
    
    public static void main(String[] args) {
        int menu=0;
        
        interfaz=new FormSIM2();
        interfaz.setVisible(true);
        
        System.out.println("INGRESE EL TOTAL DE MEMORIA");
        memoria=scanner.nextInt();
        
        //interfaz.inicializar(memoria);
        do{
            Menu();
            menu=scanner.nextInt();
            switch(menu){
                case 1: 
                    memoriaContigua();
                    break;

                case 2: 
                    //memoriaEnlazada();
                    break;

                case 3: 
                    //memoriaIndexada();
                    break;

                case 4: 
                    break;
            }
        }while(menu!=5);
        
        
        
        //scanner.close();
    
    }
    
    public static void Menu(){
        System.out.println("ELIJA UNA OPCION");
        System.out.println("1) AGREGAR ARCHIVO CON ASIGNACION CONTIGUA");
        System.out.println("2) AGREGAR ARCHIVO CON ASIGNACION CONTIGUA");
        System.out.println("3) AGREGAR ARCHIVO CON ASIGNACION CONTIGUA");
        System.out.println("4) ELIMINAR ARCHIVO");
        System.out.println("5) TERMINAR");
        
    }
}


