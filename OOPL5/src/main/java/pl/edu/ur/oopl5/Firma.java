
package pl.edu.ur.oopl5;

/**
 *
 * @author Petro
 */
public class Firma {
     Pracownik[] pracownicy = new Pracownik[100];
    int a=0;
    int size = 100;
    int top=-1;

    public Firma( ) { }

    public void newWorking(Pracownik pracownik){
        int a = ++top;
        if(a<100){
            pracownicy[a]=pracownik;
            System.out.println("Pracownik dodany ");
        } else {
            System.out.println("Nie ma miejsca na firmie ");
        }
    }

    public void showWorking(){
        int b=top;
        if(b==-1){
            System.out.println("Nie ma pracownikow ");
        } else {
            System.out.println("Na firmie sa "+(top+1)+" pracownikow ");
            for (b =top;b>=0;b--){
                System.out.println(pracownicy[b]);
            }
        }
    }
}
