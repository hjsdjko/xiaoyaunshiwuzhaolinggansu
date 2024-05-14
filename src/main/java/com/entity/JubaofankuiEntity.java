package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;

/**
 * 举报反馈
 *
 * @author 
 * @email
 */
@TableName("jubaofankui")
public class JubaofankuiEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public JubaofankuiEntity() {

	}

	public JubaofankuiEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
    @TableField(value = "id")

    private Integer id;


    /**
     * 用户
     */
    @TableField(value = "yonghu_id")

    private Integer yonghuId;


    /**
     * 举报标题
     */
    @TableField(value = "jubaofankui_name")

    private String jubaofankuiName;


    /**
     * 举报用户
     */
    @TableField(value = "yonghu_name")

    private String yonghuName;


    /**
     * 举报内容
     */
    @TableField(value = "jubaofankui_text")

    private String jubaofankuiText;


    /**
     * 举报时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "insert_time",fill = FieldFill.INSERT)

    private Date insertTime;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "create_time",fill = FieldFill.INSERT)

    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }
    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：用户
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }
    /**
	 * 获取：用户
	 */

    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 设置：举报标题
	 */
    public String getJubaofankuiName() {
        return jubaofankuiName;
    }
    /**
	 * 获取：举报标题
	 */

    public void setJubaofankuiName(String jubaofankuiName) {
        this.jubaofankuiName = jubaofankuiName;
    }
    /**
	 * 设置：举报用户
	 */
    public String getYonghuName() {
        return yonghuName;
    }
    /**
	 * 获取：举报用户
	 */

    public void setYonghuName(String yonghuName) {
        this.yonghuName = yonghuName;
    }
    /**
	 * 设置：举报内容
	 */
    public String getJubaofankuiText() {
        return jubaofankuiText;
    }
    /**
	 * 获取：举报内容
	 */

    public void setJubaofankuiText(String jubaofankuiText) {
        this.jubaofankuiText = jubaofankuiText;
    }
    /**
	 * 设置：举报时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }
    /**
	 * 获取：举报时间
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 设置：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }
    /**
	 * 获取：创建时间
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Jubaofankui{" +
            "id=" + id +
            ", yonghuId=" + yonghuId +
            ", jubaofankuiName=" + jubaofankuiName +
            ", yonghuName=" + yonghuName +
            ", jubaofankuiText=" + jubaofankuiText +
            ", insertTime=" + insertTime +
            ", createTime=" + createTime +
        "}";
    }
}
