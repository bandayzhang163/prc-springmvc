package com.banday.service;

import com.banday.pojo.Image;
import com.banday.pojo.User;

import java.util.List;

public interface ImageService {
    /**
     * 添加图片
     */
    int add(Image image);

    /**
     * 删除图片
     */
    int delete(int id);

    /**
     * 修改图片
     */
    int update(Image image);

    /**
     * 查询图片列表
     */
    List<Image> listImage();

    /**
     * 查询图片详情
     */
    Image getImage(int id);
}
