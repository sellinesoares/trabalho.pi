package models;

import java.util.Date;
import javax.persistence.Entity;
import play.db.jpa.Model;

@Entity
public class Postagem extends Model{
	public String titulo;
	public String conteudo;
	public String autor;
	public Date data;

	public Postagem (String  titulo, String conteudo, String autor, Date data ){
		this.titulo = titulo;
		this.conteudo = conteudo;
		this.autor = autor;
		this.data = data;
	}

}
