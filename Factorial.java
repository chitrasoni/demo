import java.util.Scanner;
class Factorial{
public static void main(String args[]){
int  fact=1,n;
Scanner sc=new Scanner(System.in);
n=sc.nextInt();

for(int i=1;i<=n;i++){
fact=fact*i;

}
System.out.println(fact);
}



}