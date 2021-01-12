package com.banday.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Image {
    private Integer id;
    private String url;
    private LocalDateTime createdTime;
    private LocalDateTime updatedTime;
    private Boolean isDelete;
}
