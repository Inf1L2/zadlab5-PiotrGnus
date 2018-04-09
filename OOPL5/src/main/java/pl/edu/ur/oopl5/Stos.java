
package pl.edu.ur.oopl5;
import java.util.Scanner;
/**
 *
 * @author Petro
 */
public class Stos {
     Scanner scanner = new Scanner(System.in);
    int size = 0;
    int[] stos ;
    int top=-1;

    public Stos(int size) {
        this.size = size;
        stos = new int[size];
        top=-1;
    }

    public void push(int elem){
        int i = ++top;
        if(i<size){
            stos[i]=elem;
            System.out.println("Element dodany ");
        } else {
            System.out.println("Stos pelny ");
        }
    }

    public int pop(){
        if(top==-1){
            System.out.println("Stos pusty ");
            return 0;
        } else {
            return stos[top--];
        }
    }

    public void showStos(){
        int k=0;
        if(top==-1){
            System.out.println("Stos pusty ");
        } else {
            System.out.println("Stos ma "+(top+1)+" element ");
            for (k = top; k>=0; k--){
                System.out.println(stos[k]);
            }
        }
    }

    public void showSize(){
        System.out.println(size);
    }
}
