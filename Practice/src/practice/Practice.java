/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;

/**
 *
 * @author adria
 */
public class Practice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Solution solution = new Solution();
        MinStack minStack = new MinStack();
        
        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);
        System.out.println(minStack.getMin());   
        minStack.pop();
        System.out.println(minStack.top());      
        System.out.println(minStack.getMin());
    } 
}
