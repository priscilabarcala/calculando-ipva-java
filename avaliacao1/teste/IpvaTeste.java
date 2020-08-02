package br.com.serratec.avaliacao1.teste;

import br.com.serratec.avaliacao1.Ipva;

	public class IpvaTeste {

	public static void main(String[] args) {
		Ipva veiculo1 = new Ipva("Sandero", "lcv-5430", "gás", 55000.0, 125.0);
		veiculo1.calculaIpva();
		System.out.println(veiculo1);
		
		System.out.println("-------------------------------------------------------------------------------------------------------------------------------------");
		Ipva veiculo2 = new Ipva("Fiesta", "Mvc-1212", "flex", 40000.0, 140.0);
		veiculo2.calculaIpva();
		System.out.println(veiculo2);
		
	}
}
