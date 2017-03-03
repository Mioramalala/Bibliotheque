/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s6.bibliotheque.test;

import java.util.Iterator;
import java.util.List;
import s6.bibliotheque.dao.CategorieDao;
import s6.bibliotheque.modele.Categorie;

/**
 *
 * @author itu
 */
public class Test {
    public static void main(String[] args)throws Exception
    {
        Categorie cat = new Categorie();
        CategorieDao catDao = new CategorieDao();
        Categorie ca = catDao.finbyIdCategorie(1);
        System.out.println(cat);
        List<Categorie> liste = catDao.findAllCategorie();
        for (Iterator<Categorie> it = liste.iterator(); it.hasNext();) {
            cat = it.next();
            System.out.println(cat.getCodecategorie());
        }
        //System.out.println(cat.getCodecategorie());
    }
}
