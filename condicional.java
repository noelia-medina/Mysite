import java.util.Scanner;
public class condicional 
{
public static void main(String []args)
{
	int n1,n2,n3,medio,xtem;
	Scanner leer = new Scanner (System.in);
	System.out.print("ingresa numero 1");
	n1=Integer.parseInt(leer.next());
	System.out.print("ingresa numero 2");
	n2=Integer.parseInt(leer.next());
	System.out.print("ingresa numero 3");
	n3=Integer.parseInt(leer.next());
	if(n1>n2)
		{medio = n1;
	xtem=n2;
		}else
	{
		medio = n2;
		xtem=n1;
	}
		if(medio >n3)
		{
			medio = n3;
			
		}
		if(medio<xtem)
		{
			medio = xtem;
		}
		System.out.print("EL NUMERO ES "+ medio);
/*
* razones principales
*/

}
}
