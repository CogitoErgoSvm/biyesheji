package www.hw.top.test.dao;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import www.hw.top.pojo.Project;
import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;
import www.hw.top.pojo.Project;
import www.hw.top.dao.ProjectDao;


@RunWith(SpringJUnit4ClassRunner.class) 
@SpringBootTest
public class ProjectDaoTest {
 @Autowired
   ProjectDao testObject; 
   
	@Test
	@Transactional
	/**测试查询所有数据,支持回滚*/
	public void testList() {
		List<Project> list = testObject.list(); 
    	System.out.println(list.size());
    	for(Project  Project : list)
		{
			System.out.println("Id:"+ Project.getId());
		}
	}
	@Test
	@Transactional
	/**测试新增数据,支持回滚*/
	public void testadd()
	{
		Project Project=new Project();
		testObject.save(Project);
	}
	@Test
	@Transactional
	/**测试查询数据,支持回滚*/ 
	public void pagelist()
	{
		List<Project> list = testObject.list(0,3);
		System.out.println(list.size());
		for(Project Project : list)
		{
			System.out.println("Id:"+Project.getId());
		}
	}
	@Test
	@Transactional
	/**测试根据id查询数据,支持回滚*/
	public void TestgetById()
	{
		Project Project=testObject.getById(4);
		if (Project!=null) {
			System.out.println("Id:"+Project.getId());
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
		Project Project=testObject.getById(5);
		testObject.editById(Project);
	} 
}