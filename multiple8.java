import java.util.*;
 class multi{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        for(int i=0;i<x;i++){
            int n=sc.nextInt();
            if((n&7)==0){
                System.out.println("MUltiple of 8");            
            }
            else{
                System.out.println("Not multiple of 8");
            }
        }
    }

        }