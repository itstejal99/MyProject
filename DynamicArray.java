import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;
    
public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

    int nS =sc.nextInt(); 
    int nQ =sc.nextInt();
        List<Integer>[] seqList = new ArrayList[nS];    
    int lastAnwer = 0;
    List<Integer> result= new ArrayList<>();

    while(nQ-- > 0){
    int type  =  sc.nextInt();     
    int x =  sc.nextInt();
    int y= sc.nextInt();
    int  index   =  (x ^ lastAnwer) % nS;

    if(type==1){
            if(seqList[index]==null){
                List<Integer> mylist=  new ArrayList<Integer>();
                mylist.add(y);
                seqList[index]=mylist; 

            }
            else{
                seqList[index].add(y);
            }

        }else if(type ==2){


        lastAnwer = seqList[index].get(y % seqList[index].size());
          System.out.println(lastAnwer);
        
       }

    }
    
    }
}


/*
2 5
1 0 5
1 1 7
1 0 3
2 1 0
2 1 1

Output 
7
3
*/