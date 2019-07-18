package aplicacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entidades.Empregado;
import entidades.EmpregadoTerceirizado;

public class Main {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);		
		List<Empregado> list = new ArrayList();
		System.out.println("Digite o numero de empregados: ");
		int numeroEmpregados =  teclado.nextInt();
		
		for(int i = 0; i <= numeroEmpregados; i++) {
			System.out.println();
			System.out.println("Empregado #1" + i + " data: ");
			System.out.print("O empregado é terceirizado (y/n)? ");
			char ch =  teclado.next().charAt(0);
			System.out.print("Nome: ");
			teclado.nextLine();
			String nome = teclado.nextLine();
			System.out.print("Horas: ");
			int horas = teclado.nextInt();
			System.out.print("Valor por hora: ");
			double valorPorHora =  teclado.nextDouble();
			if(ch == 'y') {
				System.out.print(" Salario Adicional: ");
				double adicionalSalario = teclado.nextDouble();
				Empregado empregado = new EmpregadoTerceirizado(nome, horas, valorPorHora, adicionalSalario);
				list.add(empregado);
			}
			else {
				Empregado empregado = new Empregado(nome, horas, valorPorHora);
				list.add(empregado);
			}
			
			System.out.println();
			System.out.println("Pagamentos: ");
			
			for(Empregado emp: list) {
				System.out.println(emp.getNome() + " - R$" + String.format("%.2f", emp.pagamento()));
			}
			
		}
		
		teclado.close();
	}

}
