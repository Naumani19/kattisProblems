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

public class Wizard {
     
    public static void magic(int n){
        for(int i=1; i<=n; i++)
            System.out.println(""+i+" "+"Abracadabra");
       
    }
    
    public static void main(String[] args) {
          
    Scanner reader = new Scanner(System.in);  // Reading from System.in
    //System.out.println("Enter a number: "); //Asks for user input. However, for this problem this is not needed since the computer inputs a number automatically.
    int n = reader.nextInt();
      magic(n);
    }
}
