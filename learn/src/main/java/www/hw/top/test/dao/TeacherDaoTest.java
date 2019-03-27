package www.hw.top.test.dao;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import www.hw.top.pojo.Teacher;
import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;
import www.hw.top.pojo.Teacher;
import www.hw.top.dao.TeacherDao;


@RunWith(SpringJUnit4ClassRunner.class) 
@SpringBootTest
public class TeacherDaoTest {
 @Autowired
   TeacherDao testObject; 
	@Test
	@Transactional
	/**测试查询所有数据,支持回滚*/
	public void testList() {
		List<Teacher> list = testObject.list(); 
    	System.out.println(list.size());
    	for(Teacher  Teacher : list)
		{
			System.out.println("Id:"+ Teacher.getId());
		}
	}
	@Test
	@Transactional
	/**测试新增数据,支持回滚*/
	public void testadd()
	{
		Teacher Teacher=new Teacher();
		testObject.save(Teacher);
	}
	@Test
	@Transactional
	/**测试查询数据,支持回滚*/ 
	public void pagelist()
	{
		List<Teacher> list = testObject.list(0,3);
		System.out.println(list.size());
		for(Teacher Teacher : list)
		{
			System.out.println("Id:"+Teacher.getId());
		}
	}
	@Test
	@Transactional
	/**测试根据id查询数据,支持回滚*/
	public void TestgetById()
	{
		Teacher Teacher=testObject.getById(4);
		if (Teacher!=null) {
			System.out.println("Id:"+Teacher.getId());
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
		Teacher Teacher=testObject.getById(5);
		testObject.editById(Teacher);
	} 
}