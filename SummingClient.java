/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * Author      : Brian Klein
////// * Date        : 
 * Description : 
 */
public class SummingClient {
    public static void main(String args[]) {
        int[] array = {17, 170000000, 240000000, 400000000, 800000000, 2147483647, 10};
        PossiblyThrow thrower = new PossiblyThrow();
        int sumCheck;
        Summing object = new Summing();
        
        sumCheck = object.sum(array, thrower);
        
        System.out.println("Max Value: " + Integer.MAX_VALUE);
        System.out.println("Min Value: " + Integer.MIN_VALUE);
        System.out.println("sumCheck: " + sumCheck);
    }
}
