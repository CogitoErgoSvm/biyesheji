package www.hw.top.service.Impl;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import www.hw.top.dao.TeacherDao;
import www.hw.top.pojo.Teacher;
import www.hw.top.service.TeacherService;
@Service
public class TeacherServiceImpl implements TeacherService{

	@Autowired
	public TeacherDao teacherdao;
	@Override
	public int delById(Integer id) {
		return teacherdao.delById(id);
	}

	@Override
	public int save(Teacher record) {
		return teacherdao.save(record);
	}
	
	@Override
	public int getCount () {
		return teacherdao.getCount();
	}

	@Override
	public Teacher getById(Integer id) {
		return teacherdao.getById(id);
	}


	@Override
	public int editById(Teacher record) {
		return teacherdao.editById(record);
	}

	@Override
	public List<Teacher> list(int page, int limit) {
		return  teacherdao.list(page, limit);
	}

	@Override
	public Teacher loginTeacher(String t0, String t1) {
		// TODO Auto-generated method stub
		return loginTeacher(t0, t1);
	}

	
}
