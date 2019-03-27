package www.hw.top.service;

import www.hw.top.pojo.Resource;
import java.util.List;
import com.github.pagehelper.PageInfo;
import org.springframework.transaction.annotation.Transactional;
public interface ResourceService {


/**
根据id删除Resource
支持回滚
*/
@Transactional
	int delById(Integer id);

/**
根据新增Resource，id自增
支持回滚
*/
@Transactional
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
支持回滚
*/ 
@Transactional
    int editById(Resource record);

/**
查询所有Resource
*/ 
    List<Resource> list(int page, int limit);
}