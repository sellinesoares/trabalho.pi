package controllers;

import java.util.List;

import models.Postagem;
import play.mvc.Controller;

public class Postagens extends Controller{
	
	public static void listar() {
		   List<Postagem> postagens = Postagem.findAll();
		   //render(Postagens);
		}

}
