/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.practicab;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.*;
/**
 *
 * @author HP
 */
public class PracticaB {
    public static Scanner src = new Scanner (System.in);
    public static Form interfaz=new Form();
    public static int incomingStream[], n, fr[], frames, fs[], index, k, l, flag1 = 0, flag2 =  0, pf = 0, framesize = 3, i, j,menu;
    //framesize = 3
    //m=frames, p=incomingStream
    //fr,sr colas de marcos
    //n tam cadena
    
    public static void display ()
    {
      System.out.println ("\n");
      for (i = 0; i < frames; i++)
        {
          if (fr[i] == -1)
            System.out.println ("[   ]");
          else
            System.out.println ("[" + fr[i] + "]");
        }
    }
    public static void display (int col)
    {
      System.out.println ("\n");
      for (i = 0; i < frames; i++)
        {
          if (fr[i] == -1)
            System.out.println ("[   ]");
          else{
            System.out.println ("[" + fr[i] + "]");
            interfaz.modelo.setValueAt(Integer.toString(fr[i]),i+1,col);
          }
        }
    }
    
  public static void lru ()
  {
      pf=0;
    for (i = 0; i < frames; i++)
      {
	fr[i] = -1;     //un -1 en la cola fr implica un hueco
      }
    
    for (j = 0; j < n; j++)
      {
	flag1 = 0;
	flag2 = 0;
	for (i = 0; i < frames; i++)
	  {
	    if (fr[i] == incomingStream[j])

	      {
		flag1 = 1;
		flag2 = 1;      //FLAG1 && FLAG2==TRUE IMPLICA QUE LA PAGINA YA ESTA EN LA COLA
		break;
	      }
	  }
        
	if (flag1 == 0)
	  {
            
	    for (i = 0; i < frames; i++)

	      {
		if (fr[i] == -1)

		  {
		    fr[i] = incomingStream[j];
		    flag2 = 1;
                    pf=pf+1;
                    interfaz.modelo.setValueAt("X",frames+1,j+1);
		    break;
		  }
	      }

	  }
        
	if (flag2 == 0)     //SI LA NUEVA PAGINA NO ESTABA EN LA COLA Y NO HABIA HUECOS
	  {
	    for (i = 0; i < frames; i++)
	      fs[i] = -1;
            /*
	    for (k = j - 1, l = 1; l <= frames - 1; l++, k--)
	      {
		for (i = 0; i < frames; i++)
		  {
		    if (fr[i] == incomingStream[k])
		      fs[i] = 1;
		  }
	      }
            
	    for (i = 0; i < frames; i++)
	      {
		if (fs[i] == 0)
		  index = i;
	      }
	    fr[index] = incomingStream[j];
            */
                
            for(i = 0; i < frames-1; i++)
                fs[i] = fr[i+1];
            
            fr=fs;
            fs = new int[frames];
            for (i = 0; i < frames; i++)
	      {
		if (fr[i] == -1)

		  {
		    fr[i] = incomingStream[j];
		    //flag2 = 1;
		    break;
		  }
	      }

	    pf++;
            interfaz.modelo.setValueAt("X",frames+1,j+1);
            interfaz.modelo.setValueAt("("+interfaz.modelo.getValueAt(1,j)+")",1,j);
	  }
        
        if ((flag2 == 1) &&(flag1==1)){
            int aux=0;
            
            for (i = 0; i < frames; i++)
	      fs[i] = -1;
            
            for (i = 0; i < frames-1; i++)
                if(fr[i]==incomingStream[j]){
                    aux=fr[i];
                    fr[i]=fr[i+1];
                    fr[i+1]=aux;
                }
                    
        }    
	System.out.print ("\nPage   :   " + incomingStream[j]);
	display (j+1);
      }
    System.out.println ("\n   Number of page fault:" + pf+ "\n");
    System.out.println("Razon de fallos: " + (double) pf/n);
    interfaz.lbRazon.setText(Double.toString((double) pf/n));
    double r=(double)1-(double)pf/n;
    System.out.println("Rendimiento: " + r);
    interfaz.lbRendimiento.setText(r+" ");
  }
    ///END LRU
    
    
    static int pageFaults(int incomingStream[], int n, int frames)
    {
        System.out.println("Incoming \t Pages");
        // Using Hashset to quickly check if a given
        // incoming stream item in set or not
        HashSet s = new HashSet<>(frames);

        // Queue created to store pages in FIFO manner
        // since set will not store order or entry
        // we will use queue to note order of entry of incoming page
        Queue queue = new LinkedList<>();

        int page_faults = 0;

        for (int i=0; i < n; i++)
        {
            // if set has lesser item than frames
            if (s.size() < frames)
            {
                // If incoming item is not present, add to set
                if (!s.contains(incomingStream[i]))
                {
                    s.add(incomingStream[i]);
                    page_faults++;
                        interfaz.modelo.setValueAt("X",frames+1,i+1);
                        
                    // Push the incoming page into the queue
                    queue.add(incomingStream[i]);


                }
            }

            // If the set is full then we need to do page replacement
            // in FIFO manner that is remove first item from both
            // set and queue then insert incoming page
            else
            {
                // If incoming item is not present
                if (!s.contains(incomingStream[i]))
                {
                    // remove the first page from the queue
                    int val = (int) queue.peek();

                    // remove from queue
                    queue.poll();

                    // Remove from set
                    s.remove(val);

                    // insert incoming page to set
                    s.add(incomingStream[i]);
                    
                    // push incoming page to queue
                    queue.add(incomingStream[i]);
                    page_faults++;
                    interfaz.modelo.setValueAt("X",frames+1,i+1);
                    interfaz.modelo.setValueAt("("+interfaz.modelo.getValueAt(1,i)+")",1,i);

                }
            }
            // printing happens here
            
            System.out.print(incomingStream[i] + "\t");
            System.out.print(queue + " \n");
            int k=0;
            for(Object x:queue){
                k++;
                interfaz.modelo.setValueAt(x, k, i+1);
            }
        }


        return page_faults;
    }

    public static void main(String args[])
    {
        interfaz=new Form();
        interfaz.setVisible(true);
        

        
    }
    
    public static void fifoG(int[] cadR,int nMarcos){
        n=cadR.length;  
        frames=nMarcos;
        incomingStream=cadR;
        fr = new int[frames];
        fs = new int[frames];
        interfaz.setVisible(true);
        
        interfaz.setDim(n,frames);
        for (i = 0; i < n; i++){
            interfaz.modelo.setValueAt(incomingStream[i], 0,i+1);
        }
        
        int len = incomingStream.length;
                    int pageFaults = pageFaults(incomingStream, len, frames);
                    int hit = len - pageFaults;
                    System.out.println("Page faults: " + pageFaults);
                    System.out.println("Page fault Ratio: " + (double) pageFaults/len);
                    interfaz.lbRazon.setText(Double.toString((double) pageFaults/len));
                    double r=(double)1-(double)pageFaults/len;
                    System.out.println("Hits: " + hit);
                    System.out.println("Hit Ratio : " + (double) hit/len);
                    System.out.println("Rendimiento: " + r);
                    interfaz.lbRendimiento.setText(r+" ");
    }
    
    public static void lruG(int[] cadR,int nMarcos){
        n=cadR.length;  
        frames=nMarcos;
        incomingStream=cadR;
        fr = new int[frames];
        fs = new int[frames];
        interfaz.setVisible(true);
        interfaz.setDim(n,frames);
        for (i = 0; i < n; i++){
            interfaz.modelo.setValueAt(incomingStream[i], 0,i+1);
        }
        
        lru();
        display();
    
    }
}
