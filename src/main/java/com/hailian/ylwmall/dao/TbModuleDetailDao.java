package com.hailian.ylwmall.dao;

import com.hailian.ylwmall.dto.GoodsQueryDto;
import com.hailian.ylwmall.dto.GoodsSimpleDto;
import com.hailian.ylwmall.dto.ModuleDetailRes;
import com.hailian.ylwmall.entity.TbModuleDetail;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author 19012964
 * @since 2020-04-23
 */
public interface TbModuleDetailDao extends BaseMapper<TbModuleDetail> {
    int getModuleDetailCount(Map map);

    List<ModuleDetailRes> getModuleDetailList(Map map);

    List<ModuleDetailRes>  getAllModule();

    List<GoodsSimpleDto> getSimpleGoods(@Param("dto") GoodsQueryDto dto);
}
