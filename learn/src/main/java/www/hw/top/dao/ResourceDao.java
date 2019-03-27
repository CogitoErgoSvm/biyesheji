package www.hw.top.dao;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import www.hw.top.pojo.Resource;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Options;
import com.github.pagehelper.PageInfo;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface ResourceDao {

/**
根据id删除Resource
*/
 //@Delete("delete from resource where id = #{id,jdbcType=INTEGER}")
    int delById(Integer id);
/**

根据新增Resource,id自增
*/
	@Options(useGeneratedKeys = true, keyProperty = "id")
    int save(Resource record);
    
/**
根据id查询Resource
*/   
    Resource getById(Integer id);

/**
查询数量
*/ 
    int getCount();
    

/**
根据id更新Resource
*/ 
    int editById(Resource record);

/**
查询所有Resource
*/    
    List<Resource> list();
 /**
分页查询查询所有Resource
*/    
   List<Resource> list(@Param("page") int page,@Param("limit") int limit);
     
}