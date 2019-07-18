package entidades;

public class EmpregadoTerceirizado extends Empregado{
	
	private Double salarioAdicional;
	
	public EmpregadoTerceirizado() {
		super();
	}

	public EmpregadoTerceirizado(String nome, Integer hora, Double valorPorHora, Double salarioAdicional) {
		super(nome, hora, valorPorHora);
		this.salarioAdicional = salarioAdicional;
	}

	public Double getSalarioAdicional() {
		return salarioAdicional;
	}

	public void setSalarioAdicional(Double salarioAdicional) {
		this.salarioAdicional = salarioAdicional;
	}
	
	
	@Override
	public double pagamento() {
		return super.pagamento() + salarioAdicional * 1.1;
	}
	

}
