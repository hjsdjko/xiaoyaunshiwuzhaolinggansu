package com.dao;

import com.entity.JubaofankuiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.JubaofankuiView;

/**
 * 举报反馈 Dao 接口
 *
 * @author 
 */
public interface JubaofankuiDao extends BaseMapper<JubaofankuiEntity> {

   List<JubaofankuiView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
