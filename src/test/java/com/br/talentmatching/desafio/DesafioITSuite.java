/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.br.talentmatching.desafio;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author Avanxo
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({com.br.talentmatching.desafio.DesafioApplicationIT.class, com.br.talentmatching.desafio.service.ServiceITSuite.class, com.br.talentmatching.desafio.util.UtilITSuite.class, com.br.talentmatching.desafio.controller.ControllerITSuite.class, com.br.talentmatching.desafio.model.ModelITSuite.class, com.br.talentmatching.desafio.repository.RepositoryITSuite.class})
public class DesafioITSuite {

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }
    
}
