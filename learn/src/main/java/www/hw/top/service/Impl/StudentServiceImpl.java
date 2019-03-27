package www.hw.top.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import www.hw.top.dao.StudentDao;
import www.hw.top.pojo.Student;
import www.hw.top.service.StudentService;
@Service
public class StudentServiceImpl implements StudentService{

	@Autowired
	public StudentDao studentdao;
	@Override
	public int delById(Integer id) {
		return studentdao.delById(id);
	}

	@Override
	public int save(Student record) {
		return studentdao.save(record);
	}
	
	@Override
	public int getCount () {
		return studentdao.getCount();
	}

	@Override
	public Student getById(Integer id) {
		return studentdao.getById(id);
	}


	@Override
	public int editById(Student record) {
		return studentdao.editById(record);
	}

	@Override
	public List<Student> list(int page, int limit) {
		return  studentdao.list(page, limit);
	}

	@Override
	public Student loginStudent(String t0, String t1) {
		// TODO Auto-generated method stub
		return studentdao.loginStudent(t0, t1);
	}

}
