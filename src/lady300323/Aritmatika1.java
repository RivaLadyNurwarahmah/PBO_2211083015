/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lady300323;
/**
 *
 * @author User
 */
public class Aritmatika1 {
    public int tambah(int a, int b)
    {
        return (a+b);
    }
    
    public boolean cekGanjil(int c)
    {
        return (c%2 != 0);  
    }
    
    public int BilanganGanjil(int a)
    {
    //int bilGanjil;
    int counter = 0;
    for (int i = 1; counter < a; i += 2)
    {
            System.out.print(i+", ");
            counter++;
    }
    
        System.out.println();
        return 0;
    }
    
    public boolean isPrima(int n)
    {
        if (n <= 1){
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++){
        if (n % i == 0){
            return false;
        }
    }
    return true;
    }

    public int BilanganPrima(int a)
    {
        int counter = 0;
        for (int i = 2; counter < a; i++){
            if (isPrima(i)){
                System.out.print(i + " ");
                counter++;
            }
        }
        System.out.println();
        return 0;
    }
}