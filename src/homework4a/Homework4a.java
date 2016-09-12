/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework4a;

/**
 *
 * @author Robyn
 */
public class Homework4a {

    /**
     * @param args the command line arguments
     */
    //Answer to question 4.15 a
    public static void main(String[] args) {
        int Age = 50;
        { if (Age >= 65)
		System.out.println("Age is greater than or equal to 65");
	   else
		System.out.println("Age is less than 65");
        }
  
        // Answer to question 4.15 b
        int x = 1, total = 0;
	    while (x <= 10)
	   {
       total += x;
       ++x;
    }
         
    //Answer to letter c
    
    while (x <= 100)
    { total += x;
        ++x;
    }
        
    
    //Answer to letter d int y;
    int y = 0;
    while (y > 0)
{
     System.out.println(y);
    --y;
}
    }
    
}

// Good job.  Thanks for reading ahead.
