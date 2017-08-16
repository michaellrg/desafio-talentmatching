/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.br.talentmatching.desafio.controller;

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
public class ImovelControllerIT {
    
    public ImovelControllerIT() {
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
     * Test of consulta method, of class ImovelController.
     */
    @Test
    public void testConsulta() throws Exception {
        System.out.println("consulta");
        Integer id = null;
        ImovelController instance = new ImovelController();
        Imovel expResult = null;
        Imovel result = instance.consulta(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleta method, of class ImovelController.
     */
    @Test
    public void testDeleta() throws Exception {
        System.out.println("deleta");
        Integer id = null;
        ImovelController instance = new ImovelController();
        String expResult = "";
        String result = instance.deleta(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of atualiza method, of class ImovelController.
     */
    @Test
    public void testAtualiza() throws Exception {
        System.out.println("atualiza");
        Imovel imovel = null;
        ImovelController instance = new ImovelController();
        String expResult = "";
        String result = instance.atualiza(imovel);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Adiciona method, of class ImovelController.
     */
    @Test
    public void testAdiciona() throws Exception {
        System.out.println("Adiciona");
        Imovel imovel = null;
        ImovelController instance = new ImovelController();
        String expResult = "";
        String result = instance.Adiciona(imovel);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
