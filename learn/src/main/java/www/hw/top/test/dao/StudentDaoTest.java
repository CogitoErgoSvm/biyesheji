package www.hw.top.test.dao;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import www.hw.top.pojo.Student;
import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;
import www.hw.top.pojo.Student;
import www.hw.top.dao.StudentDao;


@RunWith(SpringJUnit4ClassRunner.class) 
@SpringBootTest
public class StudentDaoTest {
 @Autowired
   StudentDao testObject; 
   
	@Test
	@Transactional
	/**测试查询所有数据,支持回滚*/
	public void testList() {
		List<Student> list = testObject.list(); 
    	System.out.println(list.size());
    	for(Student  Student : list)
		{
			System.out.println("Id:"+ Student.getId());
		}
	}
	@Test
	@Transactional
	/**测试新增数据,支持回滚*/
	public void testadd()
	{
		Student Student=new Student();
		testObject.save(Student);
	}
	@Test
	@Transactional
	/**测试查询数据,支持回滚*/ 
	public void pagelist()
	{
		List<Student> list = testObject.list(0,3);
		System.out.println(list.size());
		for(Student Student : list)
		{
			System.out.println("Id:"+Student.getId());
		}
	}
	@Test
	@Transactional
	/**测试根据id查询数据,支持回滚*/
	public void TestgetById()
	{
		Student Student=testObject.getById(4);
		if (Student!=null) {
			System.out.println("Id:"+Student.getId());
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
		Student Student=testObject.getById(5);
		testObject.editById(Student);
	} 
}