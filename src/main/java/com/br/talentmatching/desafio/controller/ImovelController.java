/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.br.talentmatching.desafio.controller;

import com.br.talentmatching.desafio.model.Imovel;
import com.br.talentmatching.desafio.service.ImovelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Avanxo
 */
@RestController

@RequestMapping("/api/imovel")

public class ImovelController {
    
 @Autowired
 private ImovelService imovelService;   
 
 
 @RequestMapping(value="/{id}",method = RequestMethod.GET)
 public Imovel consulta(@PathVariable Integer id)throws Exception{
     
 return imovelService.buscarPorId(id);
 }

 @RequestMapping(value="/delete/{id}",method = RequestMethod.DELETE)
 public String deleta(@PathVariable Integer id)throws Exception{
      
     return imovelService.excluir(imovelService.buscarPorId(id));
 }
 
@RequestMapping(value="/update",method = RequestMethod.PUT)
 public String atualiza(@RequestBody Imovel imovel)throws Exception{
      
     return imovelService.alterar(imovel);
 }

 @RequestMapping(value="/add",method = RequestMethod.POST)
 public String Adiciona(@RequestBody Imovel imovel)throws Exception{
      
     return imovelService.cadastrar(imovel);
 }

 
}
