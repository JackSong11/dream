package com.song.dream.web.conf;

import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;
import org.apache.ibatis.reflection.MetaObject;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * @ClassName MyMetaHandler
 * @Description
 * @Author songzhiquana
 * @Date 22:23 2023/9/18
 * @Version 1.0
 **/
@Component
public class MyMetaHandler implements MetaObjectHandler {
    @Override
    public void insertFill(MetaObject metaObject) {
        this.setFieldValByName("createdTime", new Date(), metaObject);
        this.setFieldValByName("updatedTime", new Date(), metaObject);
    }

    @Override
    public void updateFill(MetaObject metaObject) {
        this.setFieldValByName("updatedTime", new Date(), metaObject);
    }
}
