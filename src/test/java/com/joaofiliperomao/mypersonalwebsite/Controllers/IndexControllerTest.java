package com.joaofiliperomao.mypersonalwebsite.Controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

//import org.junit.jupiter.api
public class IndexControllerTest {
    IndexController indexController;

    @BeforeEach
    void setUp() {
         indexController = new IndexController();
    }

    @Test
    public void indexTest1() {
        assertEquals("Welcome to my Java Spring Boot App!",indexController.index());
    }

    @Test
    public void indexTest2() {
        assertEquals("Welcome to my Java Spring Boot App!",indexController.index());
    }

    @Test
    public void indexTest3() {
        assertNotEquals("Welcome",indexController.index());
    }
}
