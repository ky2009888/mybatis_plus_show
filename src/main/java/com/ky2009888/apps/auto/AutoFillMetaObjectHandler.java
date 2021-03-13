package com.ky2009888.apps.auto;

import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;
import org.apache.ibatis.reflection.MetaObject;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * @Author ky2009666
 * @Description 实现字段自动填充的功能, 只要使用注解@Component,便可启用.
 * @Date 2021/3/13
 **/
@Component
public class AutoFillMetaObjectHandler implements MetaObjectHandler {
    /**
     * 实现数据库在添加的时候，自动填充.
     *
     * @param metaObject 元数据.
     */
    @Override
    public void insertFill(MetaObject metaObject) {
        this.setFieldValByName("createTime", new Date(), metaObject);
        this.setFieldValByName("updateTime", new Date(), metaObject);
    }

    /**
     * 实现数据库在更新的时候，自动填充.
     *
     * @param metaObject 元数据.
     */
    @Override
    public void updateFill(MetaObject metaObject) {
        this.setFieldValByName("updateTime", new Date(), metaObject);
    }
}
