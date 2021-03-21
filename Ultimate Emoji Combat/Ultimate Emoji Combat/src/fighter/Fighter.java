package fighter;

public class Fighter {

//	ATRIBUTOS
	private String name, nacionality, category;
	private int years, victory, defeat;
	private float height, weight;

//	CONSTRUTOR
	public Fighter(String name) {
		
		super();
		this.setName(name);
		
		this.createFighters();
		
	}
	
//	MÉTODO PRIVADO PARA CRIAÇÃO DOS 3 LUTADORES
	private void createFighters() {
		switch(name) {
			case "Wellyngson Elias":
				this.setNacionality("Brasil");
				this.setYears(21);
				this.setHeight(1.75f);
				this.setWeight(67f);
				this.setVictory(9);
				this.setDefeat(1);   
				
				break;
				
			case "Wallyngson Eliezer":
				this.setNacionality("Inglaterra");
				this.setYears(23);
				this.setHeight(1.68f);
				this.setWeight(72f);
				this.setVictory(6);
				this.setDefeat(0);   
				
				break;
				
			case "Gabriel Vinicius":
				this.setNacionality("Brasil");
				this.setYears(16);
				this.setHeight(1.65f);
				this.setWeight(55f);
				this.setVictory(8);
				this.setDefeat(0);   
				
				break;
			
			case "Victor Emanuel":
				this.setNacionality("Brasil");
				this.setYears(16);
				this.setHeight(1.65f);
				this.setWeight(77f);
				this.setVictory(7);
				this.setDefeat(1);   
				
				break;
				
			case "Eliezer Ferreira":
				this.setNacionality("Brasil");
				this.setYears(41);
				this.setHeight(1.65f);
				this.setWeight(82f);
				this.setVictory(8);
				this.setDefeat(0);   
				
				break;
				
			case "Elias Ferreira":
				this.setNacionality("Brasil");
				this.setYears(39);
				this.setHeight(1.65f);
				this.setWeight(72f);
				this.setVictory(8);
				this.setDefeat(0);   
				
				break;
		}
	}
	
//	MÉTODOS PÚBLICOS
	// APRESENTAR
	public void toPresent() {
		System.out.println( "Lutador: " + this.getName() + "\n" +
							"Origem: " + this.getNacionality() + "\n" +
							this.getYears() + " anos \n" +
							this.getHeight() + "m de altura \n" +
							"Peso: " + this.getWeight() + "kg \n" +
							"Total de vitórias: " + this.getVictory() + "\n" +
							"Total de derrotas: " + this.getDefeat() + "\n");
	}
	
	// STATUS
	public void status() {
		System.out.println( this.getName() + "\n" +
							"Peso " + getCategory() + "\n" +
							this.getVictory() + " vitórias \n" +
							this.getDefeat() + " derrotas \n");
	}
	
	// GANHAR LUTA
	public void winFight() {
		this.setVictory(getVictory() + 1);
	}
	
	// PERDER LUTA
	public void loserFight() {
		this.setDefeat(getDefeat() + 1);
	}
	
//	MÉTODOS ESPECIAIS
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNacionality() {
		return nacionality;
	}

	public void setNacionality(String nacionality) {
		this.nacionality = nacionality;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory() {
		if(this.getWeight() < 52 || this.getWeight() > 100) {
			this.category = "Invalido";
		} else if(this.getWeight() < 70) {
			this.category = "leve";
		} else if(this.getWeight() < 85) {
			this.category = "médio";
		} else {
			this.category = "pesado";
		}
	}

	public int getYears() {
		return years;
	}

	public void setYears(int years) {
		this.years = years;
	}

	public int getVictory() {
		return victory;
	}

	public void setVictory(int victory) {
		this.victory = victory;
	}

	public int getDefeat() {
		return defeat;
	}

	public void setDefeat(int defeat) {
		this.defeat = defeat;
	}

	public float getHeight() {
		return height;
	}

	public void setHeight(float height) {
		this.height = height;
	}

	public float getWeight() {
		return weight;
	}

	public void setWeight(float weight) {
		this.weight = weight;
		this.setCategory();
	}
	
}
