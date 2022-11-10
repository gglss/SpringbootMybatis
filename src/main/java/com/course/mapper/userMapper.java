package com.course.mapper;

import com.course.entity.user;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @InterfaceName userMapper
 * @Description TODO
 * @Author @0_0
 * @Date 2022/10/28 17:18
 * @Version 1.0
 */
@Mapper
public interface userMapper {
    // 查询所有user信息
    List<user> selectUserMapper();
}
