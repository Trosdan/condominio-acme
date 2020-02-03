/**
 * 
 */
package br.com.acme.responsavel;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import br.com.acme.reclamacao.Reclamacao;
import br.com.acme.reserva.Reserva;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author carlosfilho
 *
 */
@Entity
@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode
@Table(name = "tb_responsavel")
public class Responsavel implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	private String nome;
	
	private String email;
	
	private String telefone;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "responsavelReserva",  fetch = FetchType.LAZY)
	 @JsonManagedReference
	private Set<Reserva> reservas;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "responsavelReclamacao",  fetch = FetchType.LAZY)
	@JsonManagedReference
	private Set<Reclamacao> reclamacoes;
}
