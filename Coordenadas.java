package curso_progamacao;

import java.util.Locale;
import java.util.Scanner;

public class Coordenadas {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double x,y;
		
		System.out.println("ESCOLHA O X DA SUA COORDENADA:");
		x= sc.nextDouble();
		System.out.println("ESCOLHA O Y DA SUA COORDENADA:");
		y= sc.nextDouble();
		
		if(x==0&&y==0) {
			System.out.println("LOCALIZAÇÃO: ORIGEM");
		}
		else if(x>0&&y>0) {
			System.out.println("LOCALIZAÇÃO: Q1");
		}
		else if(x<0&&y<0) {
			System.out.println("LOCALIZAÇÃO: Q3");
		}
		else if(x>0&&y<0) {
			System.out.println("LOCALIZAÇÃO: Q4");
		}
		else if(x<0&&y>0) {
			System.out.println("LOCALIZAÇÃO: Q2");
		}
		else if(x==0) {
			System.out.println("LOCALIZAÇÃO: EIXO Y");
		}
		else if(y==0) {
			System.out.println("LOCALIZAÇÃO: EIXO X");
		}
		
		sc.close();

	}

}