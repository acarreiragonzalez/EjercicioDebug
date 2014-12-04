
package examencod;

public class ExamenCOD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
 int iN = 11;
            	if (metodoMio(iN))
System.out.println("Es numero primo");
else
 System.out.println("NO es numero primo");           	 
          	 
for (int x=2;x<1000;x++) {
if (metodoMio(x))
System.out.print(x + " ");                         	 
}         	 
	}
    
    // O valor da variable 'aux' para variable=16 y j=2 é false, poñendo un punto de ruptura en int j=2 e avanzando con f8 hasta o while,e ahí darlle eses valores .
    //facendo o debug no if podemos ver que j=21 é desigual a variable=22, polo tanto a variable "aux" colle o valor de TRUE
public static boolean metodoMio(int variable){
int j = 2;
boolean aux=true;
while ((aux) && (j!=variable)){
if (variable % j == 0)
aux = false;
j++;
}
return aux;
  } 	 
    
}
