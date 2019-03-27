package www.hw.top.service;

import www.hw.top.pojo.Class;
import java.util.List;
import com.github.pagehelper.PageInfo;
import org.springframework.transaction.annotation.Transactional;
public interface ClassService {


/**
根据id删除Class
支持回滚
*/
@Transactional
	int delById(Integer id);

/**
根据新增Class，id自增
支持回滚
*/
@Transactional
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
支持回滚
*/ 
@Transactional
    int editById(Class record);

/**
查询所有Class
*/ 
    List<Class> list(int page, int limit);
}