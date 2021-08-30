package com.micron.service;

import com.micron.dto.AlbumResponseDto;

import java.util.List;

public interface IAlbumService {
    public List<AlbumResponseDto> getAlbums();

    public List<AlbumResponseDto> getAlbumsByUserId(Integer userId);

    public AlbumResponseDto getAlbumById(Integer id);
}
