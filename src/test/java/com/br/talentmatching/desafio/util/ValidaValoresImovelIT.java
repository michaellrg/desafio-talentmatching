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
public class ValidaValoresImovelIT {
    
    public ValidaValoresImovelIT() {
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
     * Test of Valida method, of class ValidaValoresImovel.
     */
    @Test
    public void testValida() {
        System.out.println("Valida");
        Imovel imovel = null;
        ValidaValoresImovel instance = new ValidaValoresImovel();
        boolean expResult = false;
        boolean result = instance.Valida(imovel);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
