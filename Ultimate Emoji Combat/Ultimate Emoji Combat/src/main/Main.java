package main;
import fighter.Fighter;
import fight.Fight;

public class Main {

		public static void main(String[] args) {

			// CRIANDO O VETOR PARA AGRUPAR TODOS OS 6 LUTADORES
			Fighter allFighter[] = new Fighter[6];
			
			// CRIANDO OS LUTADORES E COLOCANDO DENTRO DE CADA POSIÇÃO DO VETOR			
			Fighter fighter01 = new Fighter("Wellyngson Elias");
			allFighter[0] = fighter01;
			
			Fighter fighter02 = new Fighter("Wallyngson Eliezer");
			allFighter[1] = fighter02;
			
			Fighter fighter03 = new Fighter("Gabriel Vinicius");
			allFighter[2] = fighter03;
			
			Fighter fighter04 = new Fighter("Victor Emanuel");
			allFighter[3] = fighter04;
			
			Fighter fighter05 = new Fighter("Eliezer Ferreira");
			allFighter[4] = fighter05;
			
			Fighter fighter06 = new Fighter("Elias Ferreira");
			allFighter[5] = fighter06;

			// CRIANDO A LUTA
			Fight UEC01 = new Fight();
			
			// UTILIZANDO OS MÉTODOS PARA TESTAR UMA LUTA E REALIZA-LA
			UEC01.markFight(fighter01, fighter03);
			UEC01.toFight();

		}
}