package www.hw.top.controller;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import www.hw.top.util.ResultResponse;
import io.swagger.annotations.Api; 
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import www.hw.top.pojo.Student;
import www.hw.top.util.ResultResponse;
import www.hw.top.service.StudentService;

import com.github.pagehelper.PageInfo;
@Api(tags = "Student")
@RestController
@Validated
@RequestMapping("/Student")
public class StudentController {

	@Autowired
	public StudentService studentService;
	
	@ApiOperation(value="删除记录")
	@DeleteMapping(value="/del/{id}")
	public ResultResponse<Student> delById(
	@ApiParam(required=true,value="查询编号") @PathVariable Integer id) {
		  studentService.delById(id);
    return new ResultResponse<Student>(0,"删除成功", null);
	}

	@ApiOperation(value="新增记录")
	@PostMapping(value="/add")
	@ApiParam(required = true, value = "添加Student")
	public ResultResponse<Student>  save(@ApiParam(required = true, value = "添加Student")@Valid  @RequestBody Student record) {
	 studentService.save(record);
	 return new ResultResponse<Student>(0,"新增成功", record);
	}

	@ApiOperation(value = "根据ID查询记录") 
	@GetMapping(value = "/get/{id}")
	public ResultResponse<Student> getById(
			@ApiParam(required = true, value = "查询编号")
			@PathVariable Integer id) {
			
			Student record=studentService.getById(id);
		return new ResultResponse<Student>(0,"查询成功", record);
	}

	@ApiParam(required = true , value = "修改内容")
	@PutMapping(value = "/edit") 
	public ResultResponse<Student>  editById(@ApiParam(required=true,value="修改Student") @Valid @RequestBody Student record) {
	
		  studentService.editById(record);
	
		 return  new ResultResponse<Student>(0,"修改成功", record);
	}
 
	
	@ApiOperation(value = "详细列表查询") 
	@PutMapping(value = "/list")
	public  ResultResponse list(@ApiParam(required=true,value="查询Demo")@RequestParam(value = "page", required = false) int page,
			@RequestParam(value = "limit", required = false) int limit) {
	 List<Student> list =   studentService.list((page-1)*limit,limit);
     int count=studentService.getCount();
     return  new ResultResponse (0,count,"查询成功", list);
	}
	
	//用户登录
	@ApiOperation(value = "用户登录")
	@PostMapping("/Studentlogin")
	public Map Studentlogin(@ApiParam(required = true, value = "用户登录")@RequestBody @Valid Student student)
	{
			
		Student Studentlogin = new Student();
		Studentlogin = studentService.loginStudent(student.getSUsername(), student.getSPassword());
		//System.out.println(Studentlogin.getSUsername()+" "+Student.getSPassword());
			
		Map msg=new HashMap();
			
		if(Studentlogin!=null)
	    {
			msg.put("msg",Studentlogin);
	        return msg;
	    }
		else{
			msg.put("msg","登陆失败！请检查用户名或者密码");
		//	System.out.println(Studentlogin.getUser_name());
			return msg;
		}
						
		}


}
