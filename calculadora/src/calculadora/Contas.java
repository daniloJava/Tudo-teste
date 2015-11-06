package calculadora;
import java.util.*;

public class Contas extends DadosMatriz{

	private int dl=0, dc=0, i=0, j=0, k=0, dl2=0, dc2=0, cont=0;
	Scanner input = new Scanner(System.in);
	
	void somaMatriz(){
		
		
		
	System.out.print("====SOMANDO MATRIZES====\n\n");
	System.out.print("DIGITE A DIMENSAO DAS MATRIZES\n");
    System.out.print("QUANTIDADE DE LINHAS\n");
    dl = input.nextInt();
    System.out.print("QUANTIDADE DE COLUNAS\n");
    dc = input.nextInt();
    //TESTAR SE AS DIMENÇÕES ESTÃO CORRETAS.
    if(dl<=0||dc<=0){
    	System.out.print("\nNAO PODE NUMERO ZERO OU NEGATIVO\n");
        cont = calculando(cont);
        
    }
    else{
        if(dl!=dc){
        	System.out.print("\nAS DIMENSOES PRECISAM SER IGUAIS\n");
            cont = calculando(cont);
           
        }
    }
    int[][] matriz1 = new int[dl][dc];
    int[][] matriz2 = new int[dl][dc]; 
    int[][] matrizR = new int[dl][dc];
    //INCERIR OS VALORES DAS MATRIZES.)
    zerando(matriz1,matriz2,matrizR, dl, dc);
    System.out.println("PRIMEIRA MATRIZ");
    InserirMatrizInt(matriz1, dl, dc);
    
    
    //IMPREÇÃO DAS MATRIZES 1.
    System.out.println("PRIMEIRA MATRIZ");
    ImprimirMatriz(matriz1, dl, dc);
    System.out.print("\n\n");

    //INCERIR OS VALORES DA MATRIZ 2.
    System.out.println("SEGUNDA MATRIZ");
    InserirMatrizInt(matriz2, dl, dc);
   
    //IMPREÇÃO DAS MATRIZES 1.
    System.out.println("PRIMEIRA MATRIZ");
    ImprimirMatriz(matriz1, dl, dc);
    System.out.print("\n\n");

    //IMPREÇÃO DAS MATRIZES 2.
    System.out.print("SEGUNDA MATRIZ\n");
    ImprimirMatriz(matriz2, dl, dc);
    System.out.print("\n\n");

    //SOMA DAS MATRIZES.
    for(i=0;i<dl;i++)
        for(j=0;j<dc;j++)
            matrizR[i][j]=matriz1[i][j]+matriz2[i][j];
    System.out.print("RESULTADO\n");
    ImprimirMatriz(matrizR, dl, dc);
    System.out.print("\n\n");
    //cont = calculando(cont);
    
	}	


void subtrairMatriz(){
	
	
	System.out.print("====SOMANDO MATRIZES====\n\n");
	System.out.print("DIGITE A DIMENSAO DAS MATRIZES\n");
    System.out.print("QUANTIDADE DE LINHAS\n");
    dl = input.nextInt();
    System.out.print("QUANTIDADE DE COLUNAS\n");
    dc = input.nextInt();
    //TESTAR SE AS DIMENÇÕES ESTÃO CORRETAS.
    if(dl<=0||dc<=0){
    	System.out.print("\nNAO PODE NUMERO ZERO OU NEGATIVO\n");
        //cont = calculando(cont);
        
    }
    else{
        if(dl!=dc){
        	System.out.print("\nAS DIMENSOES PRECISAM SER IGUAIS\n");
          //  cont = calculando(cont);
           
        }
    }
    int[][] matriz1 = new int[dl][dc];
    int[][] matriz2 = new int[dl][dc]; 
    int[][] matrizR = new int[dl][dc];
    //INCERIR OS VALORES DAS MATRIZES.)
    zerando(matriz1,matriz2,matrizR, dl, dc);
    System.out.println("PRIMEIRA MATRIZ");
    System.out.println("\n");
    InserirMatrizInt(matriz1, dl, dc);
 
    
    
    //IMPREÇÃO DAS MATRIZES 1.
    System.out.println("PRIMEIRA MATRIZ");
    ImprimirMatriz(matriz1, dl, dc);
    System.out.print("\n\n");

    //INCERIR OS VALORES DA MATRIZ 2.
    System.out.println("SEGUNDA MATRIZ");
    System.out.println("");
    InserirMatrizInt(matriz2, dl, dc);
   
    //IMPREÇÃO DAS MATRIZES 1.
    System.out.println("PRIMEIRA MATRIZ");

    ImprimirMatriz(matriz1, dl, dc);
    System.out.print("\n\n");

    //IMPREÇÃO DAS MATRIZES 2.
    System.out.print("SEGUNDA MATRIZ\n");
    ImprimirMatriz(matriz2, dl, dc);
    System.out.print("\n\n");

    //SOMA DAS MATRIZES.
    for(i=0;i<dl;i++)
        for(j=0;j<dc;j++)
            matrizR[i][j]=matriz1[i][j]-matriz2[i][j];
    System.out.print("RESULTADO\n");
    ImprimirMatriz(matrizR, dl, dc);
    System.out.print("\n\n");
    //cont = calculando(cont);
    
}	
void mupliMatriz(){
	System.out.print("====MULTIPLICANDO MATRIZES====\n\n");
	System.out.print("DIGITE A DIMENSAO DA PRIMEIRA MATRIZES\n");
    System.out.print("QUANTIDADE DE LINHAS\n");
    dl = input.nextInt();
    System.out.print("QUANTIDADE DE COLUNAS\n");
    dc = input.nextInt();
	//DIMENÇÃO DA SEGUNDA MATRIZ
    System.out.print("\n\n\n");
		System.out.print("DIGITE A DIMENSAO DA PRIMEIRA MATRIZES\n");
	    System.out.print("QUANTIDADE DE LINHAS\n");
	    dl2 = input.nextInt();
	    System.out.print("QUANTIDADE DE COLUNAS\n");
	    dc2 = input.nextInt();
		
		//TESTE DAS DIMENSOES DAS MATRIZES.
		if(dc!=dl2){
			System.out.print("\n");
		    System.out.print("SUAS DIMENSOES ESTAO INCORRETAS.!!\n\n");
		    cont = calculando(cont);
		}
		int[][] matriz1 = new int[dl][dc];
	    int[][] matriz2 = new int[dl2][dc2]; 
	    int[][] matrizR = new int[dl][dc];
	    
	    zerando(matriz1, matriz2, matrizR, dl, dc);
	    
		//INCERIR OS VALORES DAS MATRIZES.
		System.out.print("PRIMEIRA MATRIZ\n");
		System.out.print("\n");
		InserirMatrizInt(matriz1, dl,dc);
		
		//IMPRESSÃO DAS MATRIZES 1.
		System.out.print("PRIMEIRA MATRIZ\n");
		ImprimirMatriz(matriz1, dl, dc);
		System.out.print("\n\n");
		
		//INCERIR OS VALORES DA MATRIZ 2.)
		System.out.print("SEGUNDA MATRIZ\n");
		System.out.print("\n");
		InserirMatrizInt(matriz2, dl,dc);
		
		
		//IMPREÇÃO DAS MATRIZES 1.
		System.out.print("PRIMEIRA MATRIZ\n");
		ImprimirMatriz(matriz1, dl, dc);
		System.out.print("\n\n");
		
		//IMPREÇÃO DAS MATRIZES 2.
		System.out.print("SEGUNDA MATRIZ\n");
		ImprimirMatriz(matriz2, dl, dc);
		System.out.print("\n\n");
		
		//MULTIPLICAÇÃO DAS MATRIZES.
		for(i=0;i<dl;i++)
		    for(j=0;j<dl;j++)
		            for(k=0;k<dc;k++)
		                matrizR[i][j]=matrizR[i][j]+(matriz1[i][k]*matriz2[k][j]);
		System.out.print("RESULTADO\n");
		System.out.print("\n");
		for(i=0;i<dl;i++){
		    for(j=0;j<dc2;j++)
		    	System.out.print(matrizR[i][j]);
		System.out.print("\n");
		}
		

}
void tranp(){		
		System.out.print("====TRANSPONDO MATRIZES====\n\n");
		System.out.print("DIGITE A DIMENSAO DAS MATRIZES\n");
		System.out.print("QUANTIDADE DE LINHAS\n");
		dl = input.nextInt();
		System.out.print("QUANTIDADE DE COLUNAS\n");
		dc = input.nextInt();
		//TESTAR SE AS DIMENÇÕES ESTÃO CORRETAS.
		if(dl<=0||dc<=0){
			System.out.print("NAO PODE NUMERO ZERO OU NEGATIVO\n");
		    //cont = calculando(cont);
		    
		}
		System.out.print("\n\n");
		int[][] matriz1 = new int[dl][dc];
	    
		//INCERIR OS VALORES DAS MATRIZES.){
		System.out.print("DIGITE OS VALORES DA MATRIZ\n");
		InserirMatrizInt(matriz1, dl, dc);
		
		    //IMPREÇÃO DAS MATRIZES 1.
		System.out.print("SUA MATRIZ\n");
		for(i=0;i<dl;i++){
		    for(j=0;j<dc;j++)
		    	System.out.print(matriz1[i][j] + "\t");
		    System.out.println("");
		}
		System.out.print("\n\n");
		 //MATRIZ TRANSPOSTA.
		System.out.print("SUA MATRIZ TRANSPOSTA\n");
		for(i=0;i<dc;i++){
		    for(j=0;j<dl;j++){
		    	System.out.print(matriz1[j][i] + "\t");
		    }
		    System.out.print("\n");
		}
		System.out.print("\n\n");
		//cont = calculando(cont);
}
	void matrizInversa(){
		int numero=1, i, j, diagonalP, diagonalS, det;
		int[][] matriz = new int[3][3];
		int[][] Acof = new int[3][3];
		int[][] Acoft = new int[3][3];
		int[][] Acofi = new int[3][3];
		System.out.print("====CALCULANDO MATRIZ INVERSA====\n\n");
		for(i=0;i<3;i++){
			System.out.print("DIGITE O VALOR DA %d LINHA\n" + numero);
		    for(j=0;j<3;j++){
		        matriz[i][j] = input.nextInt();
		    }
		    numero++;
		    System.out.print("\n");
		}
		diagonalP=((matriz[0][0]*matriz[1][1]*matriz[2][2])+
		           (matriz[0][1]*matriz[1][2]*matriz[2][0])+
		           (matriz[0][2]*matriz[1][0]*matriz[2][1]));
		
		diagonalS=((matriz[0][2]*matriz[1][1]*matriz[2][0])+
		           (matriz[0][0]*matriz[1][2]*matriz[2][1])+
		           (matriz[0][1]*matriz[1][0]*matriz[2][2]));
		
		det=diagonalP-diagonalS;
		if(det==0){
			System.out.print("SEU SISTEMA EH IMPOSSIVEL\n OU\nSISTEMA POSSIVEL E INDETERMINADO\n");
		    //cont=calculando(cont);
		    
		}
		else{
		    Acof[0][0]=((matriz[1][1]*matriz[2][2])-(matriz[1][2]*matriz[2][1]));
		    Acof[0][1]=((matriz[1][0]*matriz[2][2])-(matriz[1][2]*matriz[2][0]));
		    Acof[0][1]=-1*Acof[0][1];
		    Acof[0][2]=((matriz[1][0]*matriz[2][1])-(matriz[1][1]*matriz[2][0]));
		    Acof[1][0]=((matriz[0][1]*matriz[2][2])-(matriz[0][2]*matriz[2][1]));
		    Acof[1][0]=-1*Acof[1][0];
		    Acof[1][1]=((matriz[0][0]*matriz[2][2])-(matriz[0][2]*matriz[2][0]));
		    Acof[1][2]=((matriz[0][0]*matriz[2][1])-(matriz[0][1]*matriz[2][0]));
		    Acof[1][2]=-1*Acof[1][2];
		    Acof[2][0]=((matriz[0][1]*matriz[1][2])-(matriz[0][2]*matriz[1][1]));
		    Acof[2][1]=((matriz[0][0]*matriz[1][2])-(matriz[1][0]*matriz[0][2]));
		    Acof[2][1]=-1*Acof[2][1];
		    Acof[2][2]=((matriz[0][0]*matriz[1][1])-(matriz[0][1]*matriz[1][0]));
		    
		    System.out.print("SUA MATRIZ");
		    System.out.print("\n\n");
		
		    for(i=0;i<3;i++){
		        for(j=0;j<3;j++)
		        	System.out.print("\t" + matriz[i][j]);
		        System.out.print("\n");
		    }
		    System.out.print("\n\n");
		    System.out.print("COFATOR DA MATRIZ \n");
		    for(i=0;i<3;i++){
		        for(j=0;j<3;j++){
		        	System.out.print(Acof[i][j] + "\t");
		            Acoft[j][i]=Acof[i][j];
		        }
		        System.out.print("\n");
		    }
		    System.out.print("\n\n");
		    System.out.print("COFATOR TRANSPOSTA DA MATRIZ  \n");
		    for(i=0;i<3;i++){
		        for(j=0;j<3;j++){
		        	System.out.print(Acoft[i][j] + "\t");
		            Acofi[i][j]=Acoft[i][j]/det;
		        }
		        System.out.print("\n");
		    }
		    System.out.print("\n\n");
		    System.out.print("SUA MATRIZ INVERSA\n");
		    for(i=0;i<3;i++){
		        for(j=0;j<3;j++){
		            if(Acoft[i][j]%det==0)
		            	System.out.print("\t" + Acofi[i][j]);
		            else
		            	System.out.print(Acoft[i][j] + "/" + det + "\t");
		        }
		        System.out.print("\n");
		    }
		}
		//cont=calculando(cont);
		
}
}

	