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

/**Class*/
public class Class implements Serializable {
	/***/
	private Integer id;
	
	/***/
	@Size(min=1, max=255)
	@Excel(name="",orderNum="1")
	@ApiModelProperty(value = "")
	private String cName;
	
	/***/
	@Size(min=1, max=255)
	@Excel(name="",orderNum="1")
	@ApiModelProperty(value = "")
	private String cPeopel;
	

    private static final long serialVersionUID = 1L;


	public Integer getId () {   
		return id;
	}
		
	public void setId (Integer id) {
		this.id= id ;
	}
    public String getCName () {   
    	 return cName;
    }

    public void setCName (String cName) {
    	 this.cName= cName == null ? null : cName.trim();
    }

    public String getCPeopel () {   
    	 return cPeopel;
    }

    public void setCPeopel (String cPeopel) {
    	 this.cPeopel= cPeopel == null ? null : cPeopel.trim();
    }

}