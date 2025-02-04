package controllers;

import java.util.List;

import models.Postagem;
import play.mvc.Controller;

public class Postagens extends Controller{
	
	public static void listar() {
		   List<Postagem> postagens = Postagem.findAll();
		   render(postagens);
		}

	public static void salvar(Postagem p){
		p.save();
		listar();
	}
	
	public static void form(){
		render();
	}

	public static void remover(Long id){
		Postagem postagem = Postagem.findById(id);
		if (postagem != null){
			postagem.delete();
		}
		listar();
	}

}
