package com.example.docker.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.docker.bean.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author liukang
 * @since 2021/7/14 下午4:06
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {
}
