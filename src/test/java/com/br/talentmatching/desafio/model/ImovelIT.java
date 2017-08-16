/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.br.talentmatching.desafio.model;

import java.math.BigDecimal;
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
public class ImovelIT {
    
    public ImovelIT() {
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
     * Test of getEstado method, of class Imovel.
     */
    @Test
    public void testGetEstado() {
        System.out.println("getEstado");
        Imovel instance = new Imovel();
        Estado expResult = null;
        Estado result = instance.getEstado();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEstado method, of class Imovel.
     */
    @Test
    public void testSetEstado() {
        System.out.println("setEstado");
        Estado estado = null;
        Imovel instance = new Imovel();
        instance.setEstado(estado);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getId method, of class Imovel.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        Imovel instance = new Imovel();
        Integer expResult = null;
        Integer result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setId method, of class Imovel.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        Integer id = null;
        Imovel instance = new Imovel();
        instance.setId(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getArea method, of class Imovel.
     */
    @Test
    public void testGetArea() {
        System.out.println("getArea");
        Imovel instance = new Imovel();
        double expResult = 0.0;
        double result = instance.getArea();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setArea method, of class Imovel.
     */
    @Test
    public void testSetArea() {
        System.out.println("setArea");
        double area = 0.0;
        Imovel instance = new Imovel();
        instance.setArea(area);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCep method, of class Imovel.
     */
    @Test
    public void testGetCep() {
        System.out.println("getCep");
        Imovel instance = new Imovel();
        String expResult = "";
        String result = instance.getCep();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCep method, of class Imovel.
     */
    @Test
    public void testSetCep() {
        System.out.println("setCep");
        String cep = "";
        Imovel instance = new Imovel();
        instance.setCep(cep);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLogradouro method, of class Imovel.
     */
    @Test
    public void testGetLogradouro() {
        System.out.println("getLogradouro");
        Imovel instance = new Imovel();
        String expResult = "";
        String result = instance.getLogradouro();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLogradouro method, of class Imovel.
     */
    @Test
    public void testSetLogradouro() {
        System.out.println("setLogradouro");
        String logradouro = "";
        Imovel instance = new Imovel();
        instance.setLogradouro(logradouro);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNumero method, of class Imovel.
     */
    @Test
    public void testGetNumero() {
        System.out.println("getNumero");
        Imovel instance = new Imovel();
        String expResult = "";
        String result = instance.getNumero();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNumero method, of class Imovel.
     */
    @Test
    public void testSetNumero() {
        System.out.println("setNumero");
        String numero = "";
        Imovel instance = new Imovel();
        instance.setNumero(numero);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBairro method, of class Imovel.
     */
    @Test
    public void testGetBairro() {
        System.out.println("getBairro");
        Imovel instance = new Imovel();
        String expResult = "";
        String result = instance.getBairro();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setBairro method, of class Imovel.
     */
    @Test
    public void testSetBairro() {
        System.out.println("setBairro");
        String bairro = "";
        Imovel instance = new Imovel();
        instance.setBairro(bairro);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getComplemento method, of class Imovel.
     */
    @Test
    public void testGetComplemento() {
        System.out.println("getComplemento");
        Imovel instance = new Imovel();
        String expResult = "";
        String result = instance.getComplemento();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setComplemento method, of class Imovel.
     */
    @Test
    public void testSetComplemento() {
        System.out.println("setComplemento");
        String complemento = "";
        Imovel instance = new Imovel();
        instance.setComplemento(complemento);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCidade method, of class Imovel.
     */
    @Test
    public void testGetCidade() {
        System.out.println("getCidade");
        Imovel instance = new Imovel();
        String expResult = "";
        String result = instance.getCidade();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCidade method, of class Imovel.
     */
    @Test
    public void testSetCidade() {
        System.out.println("setCidade");
        String cidade = "";
        Imovel instance = new Imovel();
        instance.setCidade(cidade);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getUf method, of class Imovel.
     */
    @Test
    public void testGetUf() {
        System.out.println("getUf");
        Imovel instance = new Imovel();
        String expResult = "";
        String result = instance.getUf();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setUf method, of class Imovel.
     */
    @Test
    public void testSetUf() {
        System.out.println("setUf");
        String uf = "";
        Imovel instance = new Imovel();
        instance.setUf(uf);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getValorVenda method, of class Imovel.
     */
    @Test
    public void testGetValorVenda() {
        System.out.println("getValorVenda");
        Imovel instance = new Imovel();
        BigDecimal expResult = null;
        BigDecimal result = instance.getValorVenda();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setValorVenda method, of class Imovel.
     */
    @Test
    public void testSetValorVenda() {
        System.out.println("setValorVenda");
        BigDecimal valorVenda = null;
        Imovel instance = new Imovel();
        instance.setValorVenda(valorVenda);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getValorAluguel method, of class Imovel.
     */
    @Test
    public void testGetValorAluguel() {
        System.out.println("getValorAluguel");
        Imovel instance = new Imovel();
        BigDecimal expResult = null;
        BigDecimal result = instance.getValorAluguel();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setValorAluguel method, of class Imovel.
     */
    @Test
    public void testSetValorAluguel() {
        System.out.println("setValorAluguel");
        BigDecimal valorAluguel = null;
        Imovel instance = new Imovel();
        instance.setValorAluguel(valorAluguel);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
