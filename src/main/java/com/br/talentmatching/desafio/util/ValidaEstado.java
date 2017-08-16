/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.br.talentmatching.desafio.util;

import com.br.talentmatching.desafio.model.Imovel;
import com.br.talentmatching.desafio.model.Estado;
/**
 *
 * @author Avanxo
 */
public class ValidaEstado {
public boolean verificaEstado(Imovel imovelVelho, Imovel imovelNovo){
    if (
            ( imovelVelho.getEstado()== Estado.Alugar
            && imovelNovo.getEstado()== Estado.Alugado) 
            || 
            ( imovelVelho.getEstado()== Estado.Vender 
            && imovelNovo.getEstado()== Estado.Vendido)
        ){
            return true;
         }else{
            return false;
               }
 }    
}
