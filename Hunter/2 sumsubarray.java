import java.util.*;
class subarr{
     
     public static void main(String aa[]){
         int nm;
         Scanner s=new Scanner(System.in);
         nm=s.nextInt();
         String y="";
         String o="";
         int z=0;
         int u=0;
         ArrayList<Integer>x=new ArrayList<Integer>();
         int a[]=new int[nm];
         for(int i=0;i<nm;i++){
             a[i]=s.nextInt();
              o=String.valueOf(a[i]);
             y=y+o;
         }
        
         for(int i=0;i<y.length();i++){
             for(int j=i+1;j<y.length();j++){
             String d=y.substring(i,j);
             char ss[]=d.toCharArray();
             
             for(int k=0;k<ss.length;k++){
                 int zz=Character.getNumericValue(ss[k]);
                 u=u+zz;
                 
             }
             
              x.add(u);
              u=0;
             ss=null;
             }
         }
         System.out.println(Collections.max(x));
        
         }
     }
