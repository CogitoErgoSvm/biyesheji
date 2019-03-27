package www.hw.top.pojo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Date;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include; 
import cn.afterturn.easypoi.excel.annotation.Excel;
import io.swagger.annotations.ApiModelProperty;
@JsonInclude(Include.NON_NULL)

/**Curriculum*/
public class Curriculum implements Serializable {
	/***/
	private Integer id;
	
	/***/
	@Size(min=1, max=255)
	@Excel(name="",orderNum="1")
	@ApiModelProperty(value = "")
	private String ccName;
	
	/***/
	private Integer ccTeacherID;
	
	/***/
	private Integer ccClassID;
	

    private static final long serialVersionUID = 1L;


	public Integer getId () {   
		return id;
	}
		
	public void setId (Integer id) {
		this.id= id ;
	}
    public String getCcName () {   
    	 return ccName;
    }

    public void setCcName (String ccName) {
    	 this.ccName= ccName == null ? null : ccName.trim();
    }


	public Integer getCcTeacherID () {   
		  return ccTeacherID;
	}
	
	public void setCcTeacherID (Integer ccTeacherID) {
		  this.ccTeacherID= ccTeacherID ;
	}

	public Integer getCcClassID () {   
		  return ccClassID;
	}
	
	public void setCcClassID (Integer ccClassID) {
		  this.ccClassID= ccClassID ;
	}
}