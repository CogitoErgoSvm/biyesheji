package www.hw.top.dao;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import www.hw.top.pojo.Student;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Options;
import com.github.pagehelper.PageInfo;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface StudentDao {

/**
根据id删除Student
*/
 //@Delete("delete from student where id = #{id,jdbcType=INTEGER}")
    int delById(Integer id);
/**

根据新增Student,id自增
*/
	@Options(useGeneratedKeys = true, keyProperty = "id")
    int save(Student record);
    
/**
根据id查询Student
*/   
    Student getById(Integer id);

/**
查询数量
*/ 
    int getCount();
    

/**
根据id更新Student
*/ 
    int editById(Student record);

/**
查询所有Student
*/    
    List<Student> list();
 /**
分页查询查询所有Student
*/    
   List<Student> list(@Param("page") int page,@Param("limit") int limit);
     
/**
 登录查询
*/
   //public Student findbyuser_nameandpassword(@Param("user_name")String t0 ,@Param("password")String t1);
   public Student loginStudent(@Param("sUsername")String t0 ,@Param("sPassword")String t1);
}