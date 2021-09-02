package com.projet.gestionVente.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projet.gestionVente.model.Produit_Stock;
import com.projet.gestionVente.service.ProduitSService;

@RestController
@RequestMapping("/produitsS")
public class ProduitSController {

		@Autowired
	private ProduitSService produit_SService;
		
		
		@GetMapping("/get")
		public List<Produit_Stock> find(){
			return produit_SService.find();
		}
		@PostMapping("/save")
		public void save(Produit_Stock produit_Stock) {
			 produit_SService.save(produit_Stock);
		}

        @GetMapping("/get/{id}")
		public Produit_Stock get(long id) {
			return produit_SService.get(id);
		}
    	@DeleteMapping("/delete")
		public void delete(long id) {
			produit_SService.delete(id);
		}

	
	
	
	
	
	
	
}
