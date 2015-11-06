package calculadora;
import java.util.*;
public class DadosMatriz {



	Scanner input = new Scanner(System.in);

void ImprimirMatriz(int matriz[][], int l, int c){
    int i, j;
    for(i=0;i<l;i++)
    {
        for(j=0;j<c;j++)
            System.out.print(matriz[i][j] + "\t");
        System.out.println("");
    }
}


void InserirMatrizInt(int[][] matriz, int l, int c){
    int i, j;
    for(i=0;i<l;i++){
        System.out.println("DIGITE O VALOR DA LINHA" + i);
        for(j=0;j<c;j++){
        	matriz[i][j] = input.nextInt();
        }
        System.out.println("");
    }
}

int calculando(int cont){
    int repet = 0;
    System.out.println("\n\n");
    System.out.println("DESEJA CALCULAR NOVAMENTE??\n 1 PARA SIM \nOU\n 0 PARA NAO");
    repet = input.nextInt();
    
    if(repet!=0&&repet!=1){
    	System.out.println("\n\nPOR FAVOR DIGITE 1 OU 0");
        calculando(cont);
    }
    else{
        switch (repet){
        case 1:
            cont=0;
            break;
            default:
                cont=5;
        }
    }
    return cont;
}

void zerando(int[][] matriz11,int[][] matriz22,int[][] matriz33, int l, int c){
	int i, j;
    for(i=0;i<l;i++)
        for(j=0;j<c;j++)
        	matriz33[i][j] = matriz22[i][j] = matriz11[i][j] = 0;        
}


}

