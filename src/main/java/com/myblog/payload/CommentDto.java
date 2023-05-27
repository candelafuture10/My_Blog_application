package com.myblog.payload;

import com.myblog.entity.Post;
import lombok.Data;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Data
public class CommentDto {

    @NotEmpty
    @Size(min = 2, message = "Name Should be at lest 2 characters")
    private long id;
    private String name;
    @NotEmpty
    @Email
    private String email;
    @NotEmpty
    @Size(min = 5,message = "message : Name Should be at least 5 characters")
    private String body;




}
