/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cns;

import java.util.Scanner;

/**
 *
 * @author my pc
 */
class pro
{
    char a[]={'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        int i,j,k,l,f,co=0,t;
        String s;
        char max[]=new char[26];
        
        void fun()
        {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the string");
        s = in.nextLine();
        l = s.length();
        char b[]=new char[l];
        b=s.toCharArray();
        int c[]=new int[l];
        char d[] = new char[l];
        f=0;
        for(i=0;i<l;i++)
        {
            if(b[i]=='e')
            {
                co=co+1;
                max[f]='e';
                f++;
            }
            
           // System.out.println(max);
            if(b[i]=='a')
            {
                co=co+1;
                max[f]='a';
                f++;
            }
            //System.out.println(max);
            if(b[i]=='t')
            {
                co=co+1;
                max[f]='t';
                f++;
            }
            //System.out.println(max);
        }
          for(i=0;i<3;i++)
          {
              System.out.println(max[i]);
          }
            for(i=0;i<l;i++)
            {
                for(j=0;j<26;j++)
                {
                    if(b[i]==a[j])
                    {
                        c[i]=j;
                    }
                    else if(b[i]==' ')
                    {
                        c[i]=' ';
                    }
                }
            }
            for(i=0;i<l;i++)
            {
               if(c[i]==' ')
               {
                   d[i]=' ';
               }
               else
               {
               t = (c[i]-k)%26;
               if(t<0)
               {
                   t = t+26;
               }
               d[i]=a[t];
               }
            }
            for(i=0;i<l;i++)
            {
                System.out.print(d[i]);
            }
            
            
        }
}
public class Cns {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        pro obj = new pro();
        obj.fun();
        
    }
    
}
