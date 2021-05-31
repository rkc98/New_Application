package dao;

import dto.Tests;
import java.util.List;

public interface TestDao {
    public List<Tests> getAllTest();
    public Tests getTestByID(int id);
    public boolean addTest(Tests t);
    public boolean updateTest(Tests t);
    public boolean deleteTest(Tests t);
}
