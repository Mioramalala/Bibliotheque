/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s6.bibliotheque.dao;

import java.util.ArrayList;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import s6.bibliotheque.modele.Categorie;

/**
 *
 * @author itu
 */
public class CategorieDaoTest {
    
    public CategorieDaoTest() {
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
     * Test of saveCategorie method, of class CategorieDao.
     
    @Test
    public void testSaveCategorie() throws Exception {
        System.out.println("saveCategorie");
        Categorie cat = new Categorie("Roman",10,20);
        CategorieDao instance = new CategorieDao();
        instance.saveCategorie(cat);
    }*/

    /**
     * Test of deleteCategorie method, of class CategorieDao.
     
    @Test
    public void testDeleteCategorie() throws Exception {
        System.out.println("deleteCategorie");
        Categorie cat = new Categorie(7,"106cat","Etude",14,10);
        CategorieDao instance = new CategorieDao();
        instance.deleteCategorie(cat);
    }*/

    /**
     * Test of findAllCategorie method, of class CategorieDao.
     */
    @Test
    public void testFindAllCategorie() throws Exception {
        System.out.println("findAllCategorie");
        CategorieDao instance = new CategorieDao();
        List<Categorie> liste = new ArrayList<>();
        Categorie cat1 = new Categorie(2,"102cat","Bande dessinees",15,15);
        Categorie cat2 = new Categorie(3,"103cat","Poesi",10,15);
        Categorie cat3 = new Categorie(4,"104cat","Aventure",18,20);
        Categorie cat4 = new Categorie(5,"105cat","Policier",15,20);
        Categorie cat5 = new Categorie(7,"107cat","Etude",14,10);
        Categorie cat6 = new Categorie(8,"108cat","Rompan",10,20);
        liste.add(cat1);
        liste.add(cat2);
        liste.add(cat3);
        liste.add(cat4);
        liste.add(cat5);
        liste.add(cat6);
        List<Categorie> expResult = liste;
        List<Categorie> result = instance.findAllCategorie();
        assertEquals(expResult, result);
    }

    /**
     * Test of finbyIdCategorie method, of class CategorieDao.
     */
    @Test
    public void testFinbyIdCategorie() throws Exception {
        System.out.println("finbyIdCategorie");
        int id = 2;
        CategorieDao instance = new CategorieDao();
        Categorie expResult = new Categorie(2,"102cat","Bande dessinees",15,15);
        Categorie result = instance.finbyIdCategorie(id);
        assertEquals(expResult, result);
    }
    
}
