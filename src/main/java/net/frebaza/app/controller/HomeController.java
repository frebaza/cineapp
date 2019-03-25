package net.frebaza.app.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.LinkedList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import net.frebaza.app.model.Pelicula;

@Controller
public class HomeController {

	@RequestMapping(value="/home", method=RequestMethod.GET)
	public String goHome() {
		return("home");
	}
	
	@RequestMapping(value="/detail",method=RequestMethod.GET)
	public String mostrarDetalle(Model model) 
	{
		String tituloPelicula = "Rapidos y furiosos";
		int duracion =  136;
		double precioEntrada = 50;
		model.addAttribute("titulo", tituloPelicula);
		model.addAttribute("duración", duracion);
		model.addAttribute("precio", precioEntrada);
		return "detalle";
	}
	
	@RequestMapping(value="/",method=RequestMethod.GET)
	public String mostrarPrincipal(Model model) 
	{
		List<Pelicula> peliculas = getLista() ;
		
		model.addAttribute("peliculas", peliculas);
		return "home";
	}
	
	private List<Pelicula> getLista()
	{
		SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
		List<Pelicula> lista =null;
		try 
		{
			lista = new LinkedList<>();
			Pelicula pelicula1 = new Pelicula();
			pelicula1.setId(1);
			pelicula1.setTitulo("Power Rangers");
			pelicula1.setDuracion(120);
			pelicula1.setClasificacion("B");
			pelicula1.setGenero("Aventura");
			pelicula1.setFechaEstreno(formatter.parse("02-04-2019"));
			
			Pelicula pelicula2 = new Pelicula();
			pelicula2.setId(1);
			pelicula2.setTitulo("La bella y la bestia");
			pelicula2.setDuracion(120);
			pelicula2.setClasificacion("B");
			pelicula2.setGenero("Aventura");
			pelicula2.setFechaEstreno(formatter.parse("02-04-2019"));
			
			Pelicula pelicula3 = new Pelicula();
			pelicula3.setId(1);
			pelicula3.setTitulo("Contratiempo");
			pelicula3.setDuracion(120);
			pelicula3.setClasificacion("B");
			pelicula3.setGenero("Aventura");
			pelicula3.setFechaEstreno(formatter.parse("02-04-2019"));	
			
			lista.add(pelicula1);
			lista.add(pelicula2);
			lista.add(pelicula3);
			return lista;
			
		} catch (ParseException e) {
			System.out.println("Error: "+e.getMessage());
			return null;
		}
	}
}
	
//	@RequestMapping(value="/",method=RequestMethod.GET)
	//public String mostrarPrincipal(Model model) 
	//{
		//List<String> peliculas = new LinkedList<>();
		//peliculas.add("Rápidos y furiosos");
		//peliculas.add("El aro 2");
		//peliculas.add("Aliens");
		//model.addAttribute("peliculas", peliculas);
		//return "home";
	//}
