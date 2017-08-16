/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.br.talentmatching.desafio.repository;

import com.br.talentmatching.desafio.model.Imovel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Avanxo
 */
@Repository
public interface ImovelRepository extends JpaRepository<Imovel, Integer>{
    
}
