package www.hw.top.service;

import www.hw.top.pojo.Curriculum;
import java.util.List;
import com.github.pagehelper.PageInfo;
import org.springframework.transaction.annotation.Transactional;
public interface CurriculumService {


/**
根据id删除Curriculum
支持回滚
*/
@Transactional
	int delById(Integer id);

/**
根据新增Curriculum，id自增
支持回滚
*/
@Transactional
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
支持回滚
*/ 
@Transactional
    int editById(Curriculum record);

/**
查询所有Curriculum
*/ 
    List<Curriculum> list(int page, int limit);
}