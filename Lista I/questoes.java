import java.util.Scanner;

public class questoes {
	
	//Quest�o 1
	public static void questao1 (double numero1, double numero2, double numero3) {

	        double soma = numero1 + numero2 + numero3;
	        double media = soma / 3;

	        System.out.println(
	        		"A soma de " + numero1 + " mais " + numero2 + " mais " 
    				+ numero3 + " � " + soma + " e a m�dia deles � " + media
	        );
	    }
	  
	  //Quest�o 2
	  public static void questao2 (int numeroInteiro) {
		  
		  int numeroSucessor = numeroInteiro + 1;
		  int numeroAntecessor = numeroInteiro - 1;
		  
		  System.out.println(
				  "O n�mero sucessor de " + numeroInteiro 
				  + " � " + numeroSucessor + " e o n�mero antecessor � " + numeroAntecessor
		  );
	  }

	  //Quest�o 3
	  public static void questao3 (double numero1, double numero2, double numero3) {
		  
		  double resultado = (numero1 + numero2) / numero3;
				  
				  System.out.println(
						  "A soma de " + numero1 + " mais " + numero2 
						  + " dividido por " + numero3 + " � igual a " + resultado
		  );
	  }
	  
	  //Quest�o 4
	  public static void questao4 (double nota1, double peso1, double nota2, double peso2, double nota3, double peso3) {
		  
		  double resultado = ((nota1 * peso1) + (nota2 * peso2) + (nota3 * peso3)) / 3;
		  
		  System.out.println("A m�dia ponderada das notas � " + resultado);
	  }
	  
	  //Quest�o 5
	  public static void questao5 (double salarioBase) {
		  
		  double gratificacao = 0.10 * salarioBase;
		  double imposto = (gratificacao + salarioBase) * 0.05 ;
		  double salarioFinal = salarioBase + gratificacao - imposto;
		  
		  System.out.println(
				  "O sal�rio final com gratifica��o de " 
				  + gratificacao + " e com imposto de " + imposto + " � igual a " + salarioFinal
		  );
	  }
	  
	  //Quest�o 6 
	  public static void questao6 (double salarioFixo, double valorVendas) {
		  
		  double comissao = 0.4 * valorVendas;
		  double salarioFinal = salarioFixo + comissao;
		  
		  System.out.println("O sal�rio final com comiss�o de " + comissao + " � " + salarioFinal); 
	  }
	  
	  //Quest�o 7
	  public static void questao7 (double area, double perimetro) {
		  
		  double areaTotal = area * perimetro;
		  
		  System.out.println("A �rea total do ret�ngulo � " + areaTotal);
	  }
	  
	  //Quest�o 8
	  public static void questao8 (double baseMaior, double baseMenor, double altura, double valorMedio) {
		  
		  double area = (baseMaior + baseMenor) * altura / 2;
		  double valorVenda = area * valorMedio;
		  
		  System.out.println("O valor de venda do terreno com �rea total de " + area + " � " + valorVenda);
	  }
	  
	  //Quest�o 9
	  public static void questao9 (double numeroLados) {
		  
		  double resultado = numeroLados*(numeroLados - 3) / 2;
		  
		  System.out.println("O n�mero total de lados � " + resultado);
	  }
	
	  //Quest�o 10
	  public static void questao10 (double valorInicial, int meses, double juros) {
		  
		  double ganho = (valorInicial * (meses * juros)) / 100; 
		  double valorAcumulado = ganho + valorInicial;
		  
		  System.out.println("O valor acumulado ap�s dois anos � " + valorAcumulado);
		  
	  }
	  
	  //Quest�o 11
	  public static void questao11 (double salario, double conta1, double conta2) {
		  
		  double multa1 = (0.2 * conta1) + conta1;
		  double multa2 = (0.2 * conta2) + conta2;
		  double salarioFinal = salario - multa1 - multa2;
		  
		  System.out.println("O sal�rio final � " + salarioFinal);
	  }
	 
	  //Quest�o 12
	  public static void questao12 (double ruaA, double ruaB, double ruaC, double caminho) {
		  
		  double caminhoTotal = ((ruaA + ruaB + ruaC) / caminho) * caminho;
		  
		  System.out.println("O n�mero de voltas a ser percorrido � " + caminhoTotal);
	  }
	  
	  //Quest�o 13
	  public static void questao13 (double anoAtual, double anoInicial) {
		  
		  double totalCopas = (anoAtual - anoInicial - 2) / 4;
		  
		  System.out.println("O n�mero total de copas � de " + totalCopas);		  	  
	  }
	  
	  //Quest�o 14 
	  public static void questao14 (double altura, double base, double potencia) {
		
		  double area = altura * base;
		  double potenciaTotal = area * potencia;
		  
		  System.out.println("A pot�ncia de ilumina��o necess�ria � " + potenciaTotal + " watts para a �rea de " + area);
	  }
	  
	  //Quest�o 15
	  public static void questao15 (double valorPI, double raio) {
		  
		  double raioAoQuadrado = Math.pow(raio, 2);
		  double area = raioAoQuadrado * valorPI;
		  
		  System.out.println("O valor da �rea de circunfer�ncia � " + String.format("%.2f", area));
	  }
	  
	  //Quest�o 16
	  public static void questao16 (int minutos) {
		  
		  int horas = minutos / 60; 
		  int minutosRestantes = minutos % 60;
		  
		  System.out.println(
				  "Os " + minutos + " minutos foram convertidos em " 
				  + horas + " hora e " + minutosRestantes + " minutos "
		  );
	  }
	  
	  //Quest�o 17
	  public static void questao17 (double valor) {
		  
		  int parteInteira = (int)valor;
		  double restante = valor - parteInteira;
		  
		  System.out.println("A parteira inteira � " + parteInteira + " e a parte restante � " + restante);
		  
	  }
	  
	  //Quest�o 18
	  public static void questao18 (double salarioMinimo, double kwPorResidencia) {
		  
		  double valorKw = (salarioMinimo/5) / 100;
		  double valorTotal = valorKw * kwPorResidencia;
		  double valorDesconto = valorTotal - (valorTotal * 0.15);
		  
		  System.out.println(
			  "O valor por quilowatts � " + String.format("%.2f", valorKw)
			  + ". O valor total a ser pago � " + String.format("%.2f", valorTotal) 
			  + ". Com desconto, o valor � " + String.format("%.2f", valorDesconto)
		  );
		  
	  }
	  
	  //Quest�o 19
	  public static void questao19 (double numeroPositivo) {
		  
		  double numeroAoQuadrado = Math.pow(numeroPositivo, 2);
		  double numeroAoCubo = Math.pow(numeroPositivo, 3);
		  double raizQuadrada = Math.sqrt(numeroPositivo);
		  double raizCubica = Math.cbrt(numeroPositivo);
		  
		  System.out.println("O valor do n�mero ao quadraddo � " + numeroAoQuadrado );
		  System.out.println("O valor do n�mero ao cubo  � " + numeroAoCubo);
		  System.out.println("O valor da raiz quadrada � " + raizQuadrada);
		  System.out.println("O valor da raiz c�bica � " + String.format("%.2f", raizCubica));
	  }
	  
	  //Quest�o 20
	  public static void questao20 (double salarioMinimo, double horasTrabalhadas, double horasExtras) {
		  
		  double valorHoraTrabalhada = 0.0125 * salarioMinimo;
		  double valorHoraExtra = 0.025 * salarioMinimo;
		  double salarioBruto = horasTrabalhadas * valorHoraTrabalhada;
		  double valorTotalHoraExtra = horasExtras * valorHoraExtra;
		  double salarioTotal = salarioBruto + valorTotalHoraExtra;
		  
		  System.out.println(
			  "O sal�rio final � " + salarioTotal 
			  + ". O sal�rio bruto � " +  salarioBruto 
			  + ", por hora trabalhada de " + valorHoraTrabalhada 
			  + ". O valor total de hora extra � " + valorTotalHoraExtra 
			  + ", por hora extra de "	+ valorHoraExtra
		  ); 
	  }
	  
	  //Quest�o 21
	  public static void questao21 (double angulo, double altura) {
		  
		  double radianos= Math.toRadians(angulo);
		  double escada = altura / Math.sin(radianos);
		  
		  System.out.println("O tamanho da escada � de " + String.format("%.2f", escada) + " metros");  
	  }
	  
	  //Quest�o 22
	  public static void questao22() {
        Scanner in = new Scanner(System.in);
 
        System.out.println("Digite o primeiro valor:");
        int a = in.nextInt();
        
        System.out.println("Digite o segundo valor:");
        int b = in.nextInt();
        
        int troca = a;
        a = b;
        b = troca;
		
        System.out.println("O primeiro valor � " + a + " o segundo valor � " + b);
	  }
	  
	  
	  //Quest�o 23
	  public static void questao23 (int novelaA, int novelaB, int novelaC, 
			  						int novelaAB, int novelaAC, int novelaBC, int novelaABC, int entrevistados) {
		  
		  int telespectadoresAB = novelaAB - novelaABC;
		  int telespectadoresAC = novelaAC - novelaABC;
		  int telespectadoresBC = novelaBC - novelaABC;
		  int telespectadoresA = novelaA - telespectadoresAB - telespectadoresAC - novelaABC;
		  int telespectadoresB = novelaB - telespectadoresAB - telespectadoresBC - novelaABC;
		  int telespectadoresC = novelaC - telespectadoresAC - telespectadoresBC - novelaABC;
		  int telespectadoresFinal = entrevistados - (telespectadoresA + telespectadoresB + telespectadoresC 
			  						+ telespectadoresAB + telespectadoresBC + telespectadoresAC + novelaABC);
		  
		  System.out.println("O n�mero de telespectadores que nenhuma das novelas os agradam � " + telespectadoresFinal);
	  }
	 
	//Quest�o 24
	  public static void questao24() {
		  	Scanner in = new Scanner(System.in); 
			  
			System.out.println("Digite o primeiro valor:");
	        int a = in.nextInt();
	        
	        System.out.println("Digite o segundo valor:");
	        int b = in.nextInt();
	        
	        System.out.println("Digite o terceiro valor:");
	        int c = in.nextInt();
		  
	        if(a != 0){
	        	
        	double resultado = ((Math.pow(b, 2)) + a + c);
	        double raizQuadrada = (int)Math.sqrt(resultado);     
	  
			System.out.println("O resultado da equa��o � " + raizQuadrada);
	        }
	  
}
