package com.company;
import java.util.*;
public class Main {

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.println("please enter the text!");
            String s1 = input.nextLine();
            if(s1.length()>1000)
                System.out.println("the characters allowed in the string are 1000 at max");
            else{
                int count=0;

                HashTableArray<Character> h1 = new HashTableArray<Character>(s1.length());
                for(int i=1 ; i<s1.length()+1;i++)
                {
                    Character c1 = s1.charAt(i-1);
                    h1.put(i, c1);
                    //System.out.println(h1.get(i));
                }


                HashTableArray<Integer> h2 = new HashTableArray<Integer>(h1.Size);
                for(int i=0 ; i<h1.Size ;i++)
                {
                    for(int j=0 ; j<h1.Size;j++)
                    {
                        if(h1.get(i)==h1.get(j))
                            count++;



                    }

                    h2.put(i, count);
                    count=0;
                }
//            for(int i=0 ; i<h2.Size  ;i++)
//            {
//                System.out.println(h2.get(i));
//            }
//             int max=0;
//           for(int i=0 ; i<h2.Size ; i++)
//           {
//               if(max<h2.get(i)||max==h2.get(i))
//                   max=h2.get(i);
//
//           }
//            System.out.println(max);
//
//

            }
        }
//    public static int freq(HashTableArray arr)
//    {
//        int mostfreq=0;
//        int c1=0;
//        for(int i=0 ; i<arr.Size ; i++)
//        {
//            c1=arr.get(i);
//            for(int j=0; j<arr.Size ; j++)
//            {
//                if(arr.get(i)==arr.get(j)){
//                    c1++;}
//                else{
//                    continue;
//                    }
//            }
//
//        }
//        if(c1>=mostfreq)
//            mostfreq=c1;
//        c1=0;
//        return c1;
//    }
    }







