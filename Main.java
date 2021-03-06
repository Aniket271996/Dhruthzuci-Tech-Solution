public class Main
 {
     public static void main(String []args)
       {
         int num1[]={1,2,2,1};
         int num2[]={2,2};
         int i,j;
         
         for(i=0;i<num1.length;i++)
          {
            for(j=0;j<num2.length;j++)
             {
               if(num1[i]==num2[j])
               System.out.println(num2[j]);
             }
           }
       }   
  }