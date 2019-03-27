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

/**Teacher*/
public class Teacher implements Serializable {
	/***/
	private Integer id;
	
	/***/
	@Size(min=1, max=255)
	@Excel(name="",orderNum="1")
	@ApiModelProperty(value = "")
	private String tName;
	
	/***/
	@Size(min=1, max=255)
	@Excel(name="",orderNum="1")
	@ApiModelProperty(value = "")
	private String tUsername;
	
	/***/
	@Size(min=1, max=255)
	@Excel(name="",orderNum="1")
	@ApiModelProperty(value = "")
	private String tPassword;
	
	/***/
	@Size(min=1, max=255)
	@Excel(name="",orderNum="1")
	@ApiModelProperty(value = "")
	private String tSex;
	
	/***/
	@Size(min=1, max=255)
	@Excel(name="",orderNum="1")
	@ApiModelProperty(value = "")
	private String tTelephone;
	

    private static final long serialVersionUID = 1L;


	public Integer getId () {   
		return id;
	}
		
	public void setId (Integer id) {
		this.id= id ;
	}
    public String getTName () {   
    	 return tName;
    }

    public void setTName (String tName) {
    	 this.tName= tName == null ? null : tName.trim();
    }

    public String getTUsername () {   
    	 return tUsername;
    }

    public void setTUsername (String tUsername) {
    	 this.tUsername= tUsername == null ? null : tUsername.trim();
    }

    public String getTPassword () {   
    	 return tPassword;
    }

    public void setTPassword (String tPassword) {
    	 this.tPassword= tPassword == null ? null : tPassword.trim();
    }

    public String getTSex () {   
    	 return tSex;
    }

    public void setTSex (String tSex) {
    	 this.tSex= tSex == null ? null : tSex.trim();
    }

    public String getTTelephone () {   
    	 return tTelephone;
    }

    public void setTTelephone (String tTelephone) {
    	 this.tTelephone= tTelephone == null ? null : tTelephone.trim();
    }

}