package www.hw.top.service;

import www.hw.top.pojo.Project;
import java.util.List;
import com.github.pagehelper.PageInfo;
import org.springframework.transaction.annotation.Transactional;
public interface ProjectService {


/**
根据id删除Project
支持回滚
*/
@Transactional
	int delById(Integer id);

/**
根据新增Project，id自增
支持回滚
*/
@Transactional
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
支持回滚
*/ 
@Transactional
    int editById(Project record);

/**
查询所有Project
*/ 
    List<Project> list(int page, int limit);
}