package com.parfait.icecreamupgraded.dao;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface IcecreamDao {
    public List<Map<String, String>> test();
}
