package dao.impl;

import com.google.gson.Gson;
import dao.ServiceDao;
import models.rent.Villa;
import util.WriterUtil;

import java.util.List;

public class VillaDao extends ServiceDao<Villa> {
    private final String PATH = "src/main/java/data/Villa.csv";
    private final Gson gson = new Gson();
    @Override
    public Villa add(Villa villa) {
        WriterUtil.writeAppend(gson.toJson(villa), PATH);
        return null;
    }

    @Override
    public Villa getDetail(String id) {
        return null;
    }

    @Override
    public List<Villa> showList() {
        return null;
    }

    @Override
    public Villa update(Villa villa) {
        return null;
    }

    @Override
    public void delete(String id) {

    }

    @Override
    protected List<Villa> showAllNameNotDuplicate() {
        return null;
    }
}
