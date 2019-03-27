package www.hw.top.test.dao;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import www.hw.top.pojo.Curriculum;
import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;
import www.hw.top.pojo.Curriculum;
import www.hw.top.dao.CurriculumDao;


@RunWith(SpringJUnit4ClassRunner.class) 
@SpringBootTest
public class CurriculumDaoTest {
 @Autowired
   CurriculumDao testObject; 
   
	@Test
	@Transactional
	/**测试查询所有数据,支持回滚*/
	public void testList() {
		List<Curriculum> list = testObject.list(); 
    	System.out.println(list.size());
    	for(Curriculum  Curriculum : list)
		{
			System.out.println("Id:"+ Curriculum.getId());
		}
	}
	@Test
	@Transactional
	/**测试新增数据,支持回滚*/
	public void testadd()
	{
		Curriculum Curriculum=new Curriculum();
		testObject.save(Curriculum);
	}
	@Test
	@Transactional
	/**测试查询数据,支持回滚*/ 
	public void pagelist()
	{
		List<Curriculum> list = testObject.list(0,3);
		System.out.println(list.size());
		for(Curriculum Curriculum : list)
		{
			System.out.println("Id:"+Curriculum.getId());
		}
	}
	@Test
	@Transactional
	/**测试根据id查询数据,支持回滚*/
	public void TestgetById()
	{
		Curriculum Curriculum=testObject.getById(4);
		if (Curriculum!=null) {
			System.out.println("Id:"+Curriculum.getId());
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
		Curriculum Curriculum=testObject.getById(5);
		testObject.editById(Curriculum);
	} 
}