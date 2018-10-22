/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sameer Naumani
 */
import java.util.Scanner;

public class ABC {
    int [] arr;
    int A;
    int B;
    int C;
    
    
    
    public ABC(int [] a){
       this.arr=a;
    }
    
    public int max(int [] arr){
        int maxA = arr[0];
        
        for(int i=0; i<arr.length;i++)
            if(arr[i]>maxA){
                maxA=arr[i];
             
            }
        return maxA;
    }
    
    public int min(int[] arr){
        int minA = arr[0];
        
        for(int i=0; i<arr.length; i++)
            if(arr[i]<minA){
                minA=arr[i];
            }
        return minA;
    }
    
    public int mid(int [] arr){
        int a = min(arr);//calling method within another method
        int c = max(arr);
        int midA = arr[0];
        
        for(int i=0; i<arr.length; i++)
            if(arr[i] != a && arr[i] != c){
                midA = arr[i];
            }
        return midA;
    }
        
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);//Reading from System in
        Scanner letters = new Scanner(System.in);
        int [] arr = new int[3];
        String [] letter = new String [3];
        
        //takes input
        for(int i=0; i<arr.length; i++)
           arr[i] = input.nextInt();
        for(int j=0; j<letter.length; j++)
           letter[j] = letters.nextLine();
        
        
        
        
        ABC a = new ABC(arr);
        int C = a.max(arr);
        int A = a.min(arr);
        int B = a.mid(arr);
        
        
        
  
        
  
        
    }
    
}
