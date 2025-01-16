package com.marlei.imageliteapi.impl;

import com.marlei.imageliteapi.domain.entity.Image;
import com.marlei.imageliteapi.repository.ImageRepository;
import com.marlei.imageliteapi.service.ImageService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class ImageServiceImpl implements ImageService {

    private final ImageRepository imageRepository;

    @Override
    @Transactional
    public Image save(Image image) {
        return imageRepository.save(image);
    }
}
