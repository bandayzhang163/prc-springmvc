package com.banday.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.Part;
import java.io.IOException;

@Controller
public class UploadController {
    @PostMapping("/upload")
    public String upload(HttpServletRequest request) throws IOException, ServletException {
        Part file = request.getPart("image");
        String realPath = request.getServletContext().getRealPath("/WEB-INF");
        file.write(realPath+file.getSubmittedFileName());
        return "success";
    }

    @GetMapping("/upload/page")
    public String upload(){
        return "upload";
    }
}
