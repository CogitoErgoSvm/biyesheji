package www.hw.top.service;

import www.hw.top.pojo.Student;

import java.util.List;

import com.github.pagehelper.PageInfo;

import org.apache.ibatis.annotations.Param;
import org.springframework.transaction.annotation.Transactional;
public interface StudentService {


/**
根据id删除Student
支持回滚
*/
@Transactional
	int delById(Integer id);

/**
根据新增Student，id自增
支持回滚
*/
@Transactional
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
支持回滚
*/ 
@Transactional
    int editById(Student record);

/**
查询所有Student
*/ 
    List<Student> list(int page, int limit);
/**
 * 登录
 *  
 * @param t0
 * @param t1
 * @return
 */
    public Student loginStudent(@Param("sUsername")String t0 ,@Param("sPassword")String t1);
}