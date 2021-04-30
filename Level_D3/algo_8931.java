package algo_D3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

class algo_8931 {

    // Pushing element on the top of the stack 
    static void stack_push(Stack<Integer> stack) 
    { 
        for(int i = 0; i < 5; i++) 
        { 
            stack.push(i); 
        } 
    } 
      
    // Popping element from the top of the stack 
    static void stack_pop(Stack<Integer> stack) 
    { 
        System.out.println("Pop :"); 
  
        for(int i = 0; i < 5; i++) 
        { 
            Integer y = (Integer) stack.pop(); 
            System.out.println(y); 
        } 
    } 
  
    // Displaying element on the top of the stack 
    static void stack_peek(Stack<Integer> stack) 
    { 
        Integer element = (Integer) stack.peek(); 
        System.out.println("Element on stack top : " + element); 
    } 
      
    // Searching element in the stack 
    static void stack_search(Stack<Integer> stack, int element) 
    { 
        Integer pos = (Integer) stack.search(element); 
  
        if(pos == -1) 
            System.out.println("Element not found"); 
        else
            System.out.println("Element is found at position " + pos); 
    } 
  
  
    public static void main(String[] args) throws IOException 
    { 
    	BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));		
		int test = Integer.parseInt(bf.readLine());
		
		for(int i=1 ; i<=test ; i++) {
	    	Stack<Integer> stack = new Stack<Integer>(); 
			
	    	int size = Integer.parseInt(bf.readLine());
			int num, sum=0;
			
			for(int j=0 ; j<size ; j++) {
				num = Integer.parseInt(bf.readLine());
				if(num != 0) {
					stack.push(num);
					sum += num;
				}
				else {
					num = stack.pop();
					sum -= num;
				}
			}
	    	
			System.out.println("#" + i + " " + sum);
		}
  
    } 
}
