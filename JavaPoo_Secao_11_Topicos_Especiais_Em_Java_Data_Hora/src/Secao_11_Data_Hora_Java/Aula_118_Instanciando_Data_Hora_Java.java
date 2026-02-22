package Secao_11_Data_Hora_Java;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class Aula_118_Instanciando_Data_Hora_Java {

	public static void main(String[] args) {
		
		//Em DateTimeFormatter da oracle temos todos os formatos possiveis de Data e hora
		
		//Data-hora local
		System.out.println("Data-hora local:");
		LocalDate d01 = LocalDate.now();
		LocalDateTime d02 = LocalDateTime.now();
		System.out.println(d01);
		System.out.println(d02);		
		System.out.println("============================================");
		
		//Data-hora global
		System.out.println("Data-hora global, fuso horário de Londres:");
		//A letra "Z" que aparece na impressão, indica que é uma data no formato GMT, Fuso horário de Londres.
		Instant d03 = Instant.now();
		System.out.println(d03);
		System.out.println("============================================");
		
		//Pegar um texto ISO 8601 e converter para uma data-hora 
		System.out.println("Pegar um texto ISO 8601 e converter para uma data-hora:");
		System.out.println("Data em formato de texto:");
		LocalDate d04 = LocalDate.parse("2026-02-22");
		System.out.println(d04);
		System.out.println();
		
		System.out.println("Data-Hora em formato de texto");
		LocalDateTime d05 = LocalDateTime.parse("2026-02-22T01:30:26");
		System.out.println(d05);
		System.out.println();
		
		System.out.println("Data-Hora fuso horário Londres em formato de texto");
		Instant d06 = Instant.parse("2026-02-22T01:30:26Z");
		System.out.println(d06);
		
	}

}
