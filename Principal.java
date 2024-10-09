package Agregação;


public class Principal {

	public static void main(String[] args) {
		Motor tipo = new Motor ("RAPIDO");
		Carro carro = new Carro ("fusca", tipo);
		
		System.out.println("carro "+carro.getModelo()+"/tipo "+tipo.getmotor());
		
	}

}
