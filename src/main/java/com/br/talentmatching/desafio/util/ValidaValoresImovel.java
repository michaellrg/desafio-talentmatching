/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.br.talentmatching.desafio.util;

import com.br.talentmatching.desafio.model.Estado;
import com.br.talentmatching.desafio.model.Imovel;

/**
 *
 * @author Avanxo
 */
public class ValidaValoresImovel {
public boolean Valida (Imovel imovel){

if ((imovel.getValorAluguel()==null && (imovel.getEstado() == Estado.Vender ||imovel.getEstado() == Estado.Vendido))
        || (imovel.getValorVenda()== null &&(imovel.getEstado() == Estado.Alugar ||imovel.getEstado() == Estado.Alugado)))    
return false;
else
return true;
}    
}
