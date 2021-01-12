package com.banday.controller;

import com.banday.pojo.Image;
import com.banday.service.ImageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.Part;
import java.io.File;
import java.io.IOException;

@Controller
public class UploadController {
    @Autowired
    ImageService imageService;

    @PostMapping("/upload")
    public String upload(HttpServletRequest request) {
        Part file = null;
        try {
            file = request.getPart("image");
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ServletException e) {
            e.printStackTrace();
        }
        //创建格式化路径，创建文件夹
        String realPath = request.getServletContext().getRealPath("/WEB-INF");
        String imgPath = realPath+"\\images\\";
        System.out.println(imgPath);
        File fileDir = new File(imgPath);
        if (!fileDir.exists()){
            fileDir.mkdir();
        }
        String filePath = imgPath + file.getSubmittedFileName();
        try {
            file.write(filePath);
            //保存数据
            Image image = new Image();
            image.setUrl(filePath);
            imageService.add(image);
            return "success";
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "error";

    }

    @GetMapping("/upload/page")
    public String upload(){
        return "upload";
    }
}
