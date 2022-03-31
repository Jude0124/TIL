package test01;

public interface FirstJdbcDao {
	int insert(String code, String name , int price, String maker);
	void execute(String sql); //select
	int delete(String name); //delete
}
