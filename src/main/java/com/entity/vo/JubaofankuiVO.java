package com.entity.vo;

import com.entity.JubaofankuiEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 举报反馈
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("jubaofankui")
public class JubaofankuiVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

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

    @TableField(value = "insert_time")
    private Date insertTime;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "create_time")
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

}
