package util.csv;

import enums.RentalType;
import junit.framework.TestCase;
import models.rent.House;

import java.util.UUID;

public class FileCSVDaoTest extends TestCase {
    private static final String DATA_HOUSE_CSV = "src/main/java/data/HouseByCSV.csv";
    FileCSVDao<House> fileCSVDao = new FileCSVDao<>(DATA_HOUSE_CSV, House.class);

    public void testAddNewService() {

        House house1 = new House(UUID.randomUUID().toString(),"house 1",1,12,3,RentalType.DAY,"tot","mota house 1", 3);
        House house2 = new House(UUID.randomUUID().toString(),"house 1",1,12,3,RentalType.DAY,"tot","mota house 1", 3);
        House house3 = new House(UUID.randomUUID().toString(),"house 2",1,12,3,RentalType.DAY,"tot","mota house 1", 3);
        House house4 = new House(UUID.randomUUID().toString(),"house 3",1,12,3,RentalType.DAY,"tot","mota house 1", 3);

        fileCSVDao.save(house1);
        fileCSVDao.save(house1);
        fileCSVDao.save(house2);
        fileCSVDao.save(house3);

        CsvUtilImpl csvUtil = new CsvUtilImpl();
        String header = csvUtil.writeHeader(house2);
        System.out.println("header = " + header);
    }

    public void testSave() {
    }

    public void testShowList() {
        fileCSVDao.showList();
    }
}