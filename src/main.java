
public class main {

	public static void main(String[] args) {
		// Declaramos variables
		int num=1;
		int suma=0;
		
		while (num<=50)
		{
			if (num%2==1) // si es impar imprimelo y s�malo
			{
				System.out.println(num);
				suma=suma+num;
			}
			
			num++;
		}
		
		System.out.println("La suma de la n�meros impares es: "+suma);
	}

}
