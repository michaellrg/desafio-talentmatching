/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.br.talentmatching.desafio.service;

import com.br.talentmatching.desafio.model.Imovel;
import java.util.Collection;
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
public class ImovelServiceIT {
    
    public ImovelServiceIT() {
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
     * Test of cadastrar method, of class ImovelService.
     */
    @Test
    public void testCadastrar() throws Exception {
        System.out.println("cadastrar");
        Imovel imovel = null;
        ImovelService instance = new ImovelService();
        String expResult = "";
        String result = instance.cadastrar(imovel);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of buscarTodos method, of class ImovelService.
     */
    @Test
    public void testBuscarTodos() {
        System.out.println("buscarTodos");
        ImovelService instance = new ImovelService();
        Collection<Imovel> expResult = null;
        Collection<Imovel> result = instance.buscarTodos();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of excluir method, of class ImovelService.
     */
    @Test
    public void testExcluir() throws Exception {
        System.out.println("excluir");
        Imovel imovel = null;
        ImovelService instance = new ImovelService();
        String expResult = "";
        String result = instance.excluir(imovel);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of buscarPorId method, of class ImovelService.
     */
    @Test
    public void testBuscarPorId() throws Exception {
        System.out.println("buscarPorId");
        Integer id = null;
        ImovelService instance = new ImovelService();
        Imovel expResult = null;
        Imovel result = instance.buscarPorId(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of alterar method, of class ImovelService.
     */
    @Test
    public void testAlterar() throws Exception {
        System.out.println("alterar");
        Imovel imovel = null;
        ImovelService instance = new ImovelService();
        String expResult = "";
        String result = instance.alterar(imovel);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
