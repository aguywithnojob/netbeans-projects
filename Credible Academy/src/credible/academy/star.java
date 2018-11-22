/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package credible.academy;
import java.util.*;
/**
 *
 * @author DELL
 */
public class star {
    public static void main(String[]arg)
    {
        Scanner scan=new Scanner(System.in);
        int i,j,s;
        for(i=1;i<=3;i++)
        {
            System.out.println(" ");
              for(s=2;s>=i;s--)
            System.out.print(" ");
            for(j=1;j<=i;j++)
           System.out.print("*");
           
        }
    }
}
