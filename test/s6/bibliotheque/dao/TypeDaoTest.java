/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s6.bibliotheque.dao;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import s6.bibliotheque.modele.Categorie;
import s6.bibliotheque.modele.Type;

/**
 *
 * @author itu
 */
public class TypeDaoTest {
    
    public TypeDaoTest() {
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
     * Test of saveType method, of class TypeDao.
     */
    @Test
    public void testSaveType() throws Exception {
        System.out.println("saveType");
        Type type = new Type("Membre");
        TypeDao instance = new TypeDao();
        instance.saveType(type);
    }

    /**
     * Test of deleteType method, of class TypeDao.
     */
    @Test
    public void testDeleteType() throws Exception {
        System.out.println("deleteType");
        Type type = new Type(1,"Membre");
        TypeDao instance = new TypeDao();
        instance.deleteType(type);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of findAllType method, of class TypeDao.
     */
    @Test
    public void testFindAllType() throws Exception {
        System.out.println("findAllType");
        TypeDao instance = new TypeDao();
        List<Type> liste = new ArrayList<>();
        Type t = new Type();
        Type t1 = new Type();
        Type type1 = new Type(2,"Admin");
        Type type2 = new Type(3,"Membre");
        liste.add(type1);
        liste.add(type2);
        List<Type> expResult = liste;
        List<Type> result = instance.findAllType();
        for (Iterator<Type> it = expResult.iterator(); it.hasNext();) {
            t = it.next();
        }
        for (Iterator<Type> it2 = result.iterator(); it2.hasNext();) {
            t1 = it2.next();
        }
        assertEquals(t.getLibelletype(), t1.getLibelletype());
    }

    /**
     * Test of finbyIdType method, of class TypeDao.
     */
    @Test
    public void testFinbyIdType() throws Exception {
        System.out.println("finbyIdType");
        int id = 2;
        TypeDao instance = new TypeDao();
        Type expResult = new Type(2,"Admin");
        Type result = instance.finbyIdType(id);
        assertEquals(expResult.getLibelletype(), result.getLibelletype());
    }
    
}
