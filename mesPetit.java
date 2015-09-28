package practicaSubVersion;
import java.util.Scanner;
//Comentari a projecte 1
public class numerosPetit{

	public static void main(String[] args){
		Scanner llegir=new Scanner(System.in);
		int nPetit;
		int[]numeros=new int[10];
		for(int i=0;i<numeros.length;i++){
			System.out.println("Introdueix un numero enter: ");
			numeros[i]=llegir.nextInt();
		}
		nPetit=numeros[0];
		nGran=numeros[0]
		for(int numero:numeros){
			if(numero<nPetit){
				nPetit=numero;
			}
			if(numero>nGran){
				nGran=numero;
			}
		}
		System.out.println("El més petit és: "+nPetit);
		System.out.println("El més gran és: "+nGran);
	}
}
