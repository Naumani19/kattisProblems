/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sameer Naumani
 */
//required to get input from user
import java.util.Scanner;
//required for Array<List>
import java.util.*;

public class Modulo {
    int [] num;
    int j;
    
    //constructor
    public Modulo(int [] nums){
        this.num = nums;
    }

   public void mod(){
        ArrayList<Integer> list = new ArrayList<>();
        for (int i=0; i<10; i++){
            j = num[i] % 42;
            //if j has not already appeared, then add it to the list of distinct outputs
            if(!list.contains(j))
                list.add(j);
            
            }    
       //return the number of unique outputs
        System.out.println(list.size());   
        
   }
                        
           
 
    public static void main(String[] args) {
       
        Scanner input = new Scanner(System.in);  // Reading from System.in
        int [] nums = new int[10];
        
        //takes input
        for(int i=0; i<nums.length; i++){
           nums[i] = input.nextInt();
        }
                    
        Modulo m = new Modulo(nums);
        m.mod();
           
    }
    
}