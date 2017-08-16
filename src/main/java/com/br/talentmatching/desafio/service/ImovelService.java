/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.br.talentmatching.desafio.service;


import com.br.talentmatching.desafio.model.Imovel;

import com.br.talentmatching.desafio.repository.ImovelRepository;
import com.br.talentmatching.desafio.util.ValidaEstado;
import com.br.talentmatching.desafio.util.ValidaValoresImovel;
import java.util.Collection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Avanxo
 */
@Service
public class ImovelService {
    
    @Autowired
    ImovelRepository imovelRepository;
    
    
    public String cadastrar(Imovel imovel) throws Exception{
       try{
           
        ValidaValoresImovel valida = new ValidaValoresImovel();
        if (valida.Valida(imovel)== true){
        imovelRepository.save(imovel);
        return "Cadastro Efetuado";
           }
        else{
        throw new Exception("Impossível cadastrar. Verifique os campos");
        }   
       }catch(Exception e){
        throw new Exception("Impossível cadastrar. Verifique os campos");
       }
    }
   
    public Collection<Imovel> buscarTodos(){
        return imovelRepository.findAll();
    }

    public String excluir(Imovel imovel) throws Exception{
       
       if (buscarPorId(imovel.getId())!= null){
        imovelRepository.delete(imovel);
       return "Imóvel Deletado";
       }
       else{
       throw new Exception("Imóvel inexistente");
       } 
    }

    public Imovel buscarPorId(Integer id) throws Exception {
        if(imovelRepository.findOne(id)  != null)
        return imovelRepository.findOne(id);
        else{
             throw new Exception("Imóvel inexistente");
        }
    }

    public String alterar(Imovel imovel) throws Exception{
      Imovel imovelAux= imovelRepository.findOne(imovel.getId());
      ValidaEstado valida = new ValidaEstado();
      
      boolean  retorno= valida.verificaEstado(imovelAux, imovel);
      ValidaValoresImovel validaValores = new ValidaValoresImovel();
        
      if(retorno==true && validaValores.Valida(imovel)== true){
       imovelRepository.save(imovel);
      return "Alteração Efetuada";
      }
      else{
      throw new Exception ("Erro ao salvar");
      }
    }
    
}
