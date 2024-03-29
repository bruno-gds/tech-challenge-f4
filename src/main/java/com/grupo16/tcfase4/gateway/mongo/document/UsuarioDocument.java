package com.grupo16.tcfase4.gateway.mongo.document;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.grupo16.tcfase4.domain.Usuario;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Document(collection = "usuario")
@Getter
@Builder
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class UsuarioDocument {
	
	@Id
	private String id;
	private String nome;

	public Usuario mapperDocumentToDomain() {
		return Usuario.builder()
				.id(id)
				.nome(nome)
				.build();
	}
}
