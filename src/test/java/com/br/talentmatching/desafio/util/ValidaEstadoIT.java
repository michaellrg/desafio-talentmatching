/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.br.talentmatching.desafio.util;

import com.br.talentmatching.desafio.model.Imovel;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Avanxo
 */
public class ValidaEstadoIT {
    
    public ValidaEstadoIT() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of verificaEstado method, of class ValidaEstado.
     */
    @Test
    public void testVerificaEstado() {
        System.out.println("verificaEstado");
        Imovel imovelVelho = null;
        Imovel imovelNovo = null;
        ValidaEstado instance = new ValidaEstado();
        boolean expResult = false;
        boolean result = instance.verificaEstado(imovelVelho, imovelNovo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
