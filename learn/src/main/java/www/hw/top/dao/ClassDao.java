package www.hw.top.dao;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import www.hw.top.pojo.Class;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Options;
import com.github.pagehelper.PageInfo;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface ClassDao {

/**
根据id删除Class
*/
 //@Delete("delete from class where id = #{id,jdbcType=INTEGER}")
    int delById(Integer id);
/**

根据新增Class,id自增
*/
	@Options(useGeneratedKeys = true, keyProperty = "id")
    int save(Class record);
    
/**
根据id查询Class
*/   
    Class getById(Integer id);

/**
查询数量
*/ 
    int getCount();
    

/**
根据id更新Class
*/ 
    int editById(Class record);

/**
查询所有Class
*/    
    List<Class> list();
 /**
分页查询查询所有Class
*/    
   List<Class> list(@Param("page") int page,@Param("limit") int limit);
     
}