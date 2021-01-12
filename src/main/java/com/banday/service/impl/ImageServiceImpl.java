package com.banday.service.impl;

import com.banday.mapper.ImageMapper;
import com.banday.pojo.Image;
import com.banday.pojo.User;
import com.banday.service.ImageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ImageServiceImpl implements ImageService {
    @Autowired
    ImageMapper imageMapper;

    @Override
    public int add(Image image) {
        return imageMapper.add(image);
    }

    @Override
    public int delete(int id) {
        return imageMapper.delete(id);
    }

    @Override
    public int update(Image image) {
        return imageMapper.update(image);
    }

    @Override
    public List<Image> listImage() {
        return imageMapper.listImage();
    }

    @Override
    public Image getImage(int id) {
        return imageMapper.getImage(id);
    }
}
