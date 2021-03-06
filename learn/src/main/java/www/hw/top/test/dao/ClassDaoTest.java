package www.hw.top.test.dao;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import www.hw.top.pojo.Class;
import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;
import www.hw.top.pojo.Class;
import www.hw.top.dao.ClassDao;


@RunWith(SpringJUnit4ClassRunner.class) 
@SpringBootTest
public class ClassDaoTest {
 @Autowired
   ClassDao testObject; 
   
	@Test
	@Transactional
	/**测试查询所有数据,支持回滚*/
	public void testList() {
		List<Class> list = testObject.list(); 
    	System.out.println(list.size());
    	for(Class  Class : list)
		{
			System.out.println("Id:"+ Class.getId());
		}
	}
	@Test
	@Transactional
	/**测试新增数据,支持回滚*/
	public void testadd()
	{
		Class Class=new Class();
		testObject.save(Class);
	}
	@Test
	@Transactional
	/**测试查询数据,支持回滚*/ 
	public void pagelist()
	{
		List<Class> list = testObject.list(0,3);
		System.out.println(list.size());
		for(Class Class : list)
		{
			System.out.println("Id:"+Class.getId());
		}
	}
	@Test
	@Transactional
	/**测试根据id查询数据,支持回滚*/
	public void TestgetById()
	{
		Class Class=testObject.getById(4);
		if (Class!=null) {
			System.out.println("Id:"+Class.getId());
		}
		else
		{
			System.err.println("null");
		}
	}
	
	@Test
	@Transactional
	/**测试编辑数据,支持回滚*/ 
	public void TestUpdata()
	{
		Class Class=testObject.getById(5);
		testObject.editById(Class);
	} 
}