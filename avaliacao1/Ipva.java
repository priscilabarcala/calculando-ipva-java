package br.com.serratec.avaliacao1;

	public class Ipva extends Veiculo {
		private double valorIpva;
		private double taxaLicenciamento;

	public Ipva(String modelo, String placa, String combustivel, double valorVeiculo, double taxaLicenciamento) {
		super(modelo, placa, combustivel, valorVeiculo);
		this.taxaLicenciamento = taxaLicenciamento;
	}

	public double getValorIpva() {
		return valorIpva;
	}
	
	@Override
	public String toString() {
		return "Modelo: " + modelo + ","
				+ " Placa: " + placa + ","
				+ " Combustível: " + combustivel + "," 
				+ " Valor do veículo: "+ valorVeiculo + ","
				+ " Tx. de Licenciamento: " + taxaLicenciamento + "," 
				+ " Valor do IPVA: " + valorIpva;
	}

	public void calculaIpva() {
		if (combustivel.equalsIgnoreCase("gás")) {
			valorIpva = (valorVeiculo * 0.01) + taxaLicenciamento;
		} else if (combustivel.equalsIgnoreCase("flex")) {
			valorIpva = (valorVeiculo * 0.03) + taxaLicenciamento;
		} else {
			valorIpva = (valorVeiculo * 0.04) + taxaLicenciamento;
		}
	}
}
