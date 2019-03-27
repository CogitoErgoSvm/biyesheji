package www.hw.top.dao;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import www.hw.top.pojo.Project;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Options;
import com.github.pagehelper.PageInfo;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface ProjectDao {

/**
根据id删除Project
*/
 //@Delete("delete from project where id = #{id,jdbcType=INTEGER}")
    int delById(Integer id);
/**

根据新增Project,id自增
*/
	@Options(useGeneratedKeys = true, keyProperty = "id")
    int save(Project record);
    
/**
根据id查询Project
*/   
    Project getById(Integer id);

/**
查询数量
*/ 
    int getCount();
    

/**
根据id更新Project
*/ 
    int editById(Project record);

/**
查询所有Project
*/    
    List<Project> list();
 /**
分页查询查询所有Project
*/    
   List<Project> list(@Param("page") int page,@Param("limit") int limit);
     
}