package grade;
import students.Students;
public class Grade extends Students{
public Grade(String nm, int rn, int mar){
super(nm,rn,mar);}
public void getgrade(){
if (marks>90){System.out.println("A");}
else if(marks>50 && marks<91){System.out.println("P");}
else{System.out.println("F");}
}}