package www.hw.top.test.dao;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import www.hw.top.pojo.Resource;
import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;
import www.hw.top.pojo.Resource;
import www.hw.top.dao.ResourceDao;


@RunWith(SpringJUnit4ClassRunner.class) 
@SpringBootTest
public class ResourceDaoTest {
 @Autowired
   ResourceDao testObject; 
   
	@Test
	@Transactional
	/**测试查询所有数据,支持回滚*/
	public void testList() {
		List<Resource> list = testObject.list(); 
    	System.out.println(list.size());
    	for(Resource  Resource : list)
		{
			System.out.println("Id:"+ Resource.getId());
		}
	}
	@Test
	@Transactional
	/**测试新增数据,支持回滚*/
	public void testadd()
	{
		Resource Resource=new Resource();
		testObject.save(Resource);
	}
	@Test
	@Transactional
	/**测试查询数据,支持回滚*/ 
	public void pagelist()
	{
		List<Resource> list = testObject.list(0,3);
		System.out.println(list.size());
		for(Resource Resource : list)
		{
			System.out.println("Id:"+Resource.getId());
		}
	}
	@Test
	@Transactional
	/**测试根据id查询数据,支持回滚*/
	public void TestgetById()
	{
		Resource Resource=testObject.getById(4);
		if (Resource!=null) {
			System.out.println("Id:"+Resource.getId());
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
		Resource Resource=testObject.getById(5);
		testObject.editById(Resource);
	} 
}