package www.hw.top.dao;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import www.hw.top.pojo.Teacher;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Options;
import com.github.pagehelper.PageInfo;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface TeacherDao {

/**
根据id删除Teacher
*/
 //@Delete("delete from teacher where id = #{id,jdbcType=INTEGER}")
    int delById(Integer id);
/**

根据新增Teacher,id自增
*/
	@Options(useGeneratedKeys = true, keyProperty = "id")
    int save(Teacher record);
    
/**
根据id查询Teacher
*/   
    Teacher getById(Integer id);

/**
查询数量
*/ 
    int getCount();
    

/**
根据id更新Teacher
*/ 
    int editById(Teacher record);

/**
查询所有Teacher
*/    
    List<Teacher> list();
 /**
分页查询查询所有Teacher
*/    
   List<Teacher> list(@Param("page") int page,@Param("limit") int limit);

   /**
    * 登录
    */
   public Teacher loginTeacher(@Param("tUsername")String t0,@Param("tPassword")String t1);
}