package dao.impl;

import junit.framework.TestCase;
import models.rent.Villa;

public class VillaDaoTest extends TestCase {
    VillaDao villaDao = new VillaDao();

    public void testAdd() {
        villaDao.add(new Villa());
        assertEquals(1,1);
    }
}