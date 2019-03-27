package www.hw.top.service;

import www.hw.top.pojo.Teacher;

import java.util.List;

import com.github.pagehelper.PageInfo;

import org.apache.ibatis.annotations.Param;
import org.springframework.transaction.annotation.Transactional;
public interface TeacherService {


/**
根据id删除Teacher
支持回滚
*/
@Transactional
	int delById(Integer id);

/**
根据新增Teacher，id自增
支持回滚
*/
@Transactional
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
支持回滚
*/ 
@Transactional
    int editById(Teacher record);

/**
查询所有Teacher
*/ 
    List<Teacher> list(int page, int limit);
    
    /**
     * 登录
     */
    public Teacher loginTeacher(@Param("tUsername")String t0,@Param("tPassword")String t1);
}