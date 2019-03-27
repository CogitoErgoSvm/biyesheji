package www.hw.top.dao;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import www.hw.top.pojo.Curriculum;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Options;
import com.github.pagehelper.PageInfo;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface CurriculumDao {

/**
根据id删除Curriculum
*/
 //@Delete("delete from curriculum where id = #{id,jdbcType=INTEGER}")
    int delById(Integer id);
/**

根据新增Curriculum,id自增
*/
	@Options(useGeneratedKeys = true, keyProperty = "id")
    int save(Curriculum record);
    
/**
根据id查询Curriculum
*/   
    Curriculum getById(Integer id);

/**
查询数量
*/ 
    int getCount();
    

/**
根据id更新Curriculum
*/ 
    int editById(Curriculum record);

/**
查询所有Curriculum
*/    
    List<Curriculum> list();
 /**
分页查询查询所有Curriculum
*/    
   List<Curriculum> list(@Param("page") int page,@Param("limit") int limit);
     
}