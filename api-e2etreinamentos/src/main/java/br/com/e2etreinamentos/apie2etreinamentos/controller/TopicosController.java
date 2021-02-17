package br.com.e2etreinamentos.apie2etreinamentos.controller;

import java.util.Arrays;
import java.util.List;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import br.com.e2etreinamentos.apie2etreinamentos.controller.dto.TopicoDto;
import br.com.e2etreinamentos.forum.modelo.Curso;
import br.com.e2etreinamentos.forum.modelo.Topico;

@RestController
public class TopicosController {
	
	@RequestMapping(value = "/topicos" , method = RequestMethod.GET)
	public List<TopicoDto> lista(){
		
		Topico testes = new Topico("Dúvida", "Como atuar com testes de API", new Curso("Automação de Testes","Postman"));
		Topico desenvolvimento = new Topico("Dúvida", "Qual linguagem aprender primeiro", new Curso("Desenvolvimento","Java"));
		Topico devops = new Topico("Dúvida", "O que é DevOps", new Curso("Desenvolvimento","Cultura e Ferramentas"));
		return TopicoDto.converter(Arrays.asList(testes, desenvolvimento, devops));
		
	}

}
