package fight;
import fighter.Fighter;
import java.util.Random;

public class Fight {

//	ATRIBUTOS
	private Fighter challenged, challenging; // Challenged - desafiado // Challenging - desafiante
	private int rounds;
	private boolean approvedFight;
	
//	MÉTODOS MARCAR LUTA E LUTAR
	public void markFight(Fighter challenged, Fighter challenging) {
		if (challenging.getCategory().equals(challenged.getCategory()) 
				&& challenging != challenged) {
			
			this.setApprovedFight(true);
			this.challenged = challenged;
			this.challenging = challenging;
			
			System.out.println("### SUA LUTA FOI APROVADA ### \n");
			
		} else {
			this.challenged = null;
			this.challenging = null;
			
			System.out.println("Não é possível marcar essa luta, pois os atletas são de pesos diferentes");
		}
	}
	
	public void toFight() {
		if (this.approvedFight) {
			System.out.println("### DESAFIADO ###");
			this.challenged.toPresent();
			System.out.println("### DESAFIANTE ###");
			this.challenging.toPresent();
			
			// GERAR NÚMERO RANDÔMICO PARA O SORTEIO DO ATLETA VENCEDOR
			Random generator = new Random();
			int generatorRandom = generator.nextInt(2);
			
			System.out.println("====== RESULTADO =======");
			
			switch (generatorRandom) {
				case 0 : // Vencedor: Desafiado (Challenged)
					challenged.winFight();
					challenging.loserFight();
					System.out.println( "VITÓRIA DE " + this.challenged.getName().toUpperCase() + "\n" +
										"Total de vitórias: " + this.challenged.getVictory());
					
					break;

				case 1: // Vencedor: Desafiante (Challenging)
					challenging.winFight();
					challenged.loserFight();
					System.out.println( "VITÓRIA DE " + this.challenging.getName().toUpperCase() + "\n" +
							"Total de vitórias: " + this.challenging.getVictory());
					
					break;
			}
			
			System.out.println("======================== \n");
			
		} else {
			
			System.out.println("SUA LUTA NÃO FOI APROVADA!");
		}
	}

	
//	MÉTODOS ESPECIAIS GETTERS E SETTERS
	public Fighter getChallenged() {
		return challenged;
	}

	public void setChallenged(Fighter challenged) {
		this.challenged = challenged;
	}

	public Fighter getChallenging() {
		return challenging;
	}

	public void setChallenging(Fighter challenging) {
		this.challenging = challenging;
	}

	public int getRounds() {
		return rounds;
	}

	public void setRounds(int rounds) {
		this.rounds = rounds;
	}

	public boolean isApprovedFight() {
		return approvedFight;
	}

	public void setApprovedFight(boolean approvedFight) {
		this.approvedFight = approvedFight;
	}	
	
}
