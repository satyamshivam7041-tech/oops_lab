import java.util.*;
class Ran{
public static void main(String args[]){
Scanner add = new Scanner(System.in);
System.out.println("enter number of students");
int nu= add.nextInt();
int n = 0;
int tot= 0;
while(nu > n){
System.out.println("enter for stundent"+n);
int mar=add.nextInt();
n= n+1;
 tot = tot+mar;
}
System.out.println(tot);
}}

