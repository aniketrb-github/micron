package com.micron.service;

import com.micron.dto.CommentResponseDto;

import java.util.List;

public interface ICommentService {
    public List<CommentResponseDto> getAllComments();

    public CommentResponseDto getCommentById(Integer id);

    public List<CommentResponseDto> getCommentsByPostId(Integer postId);
}
