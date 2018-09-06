package com.chenliwu.filesystem.demo.service.impl;


import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.chenliwu.filesystem.demo.entity.AttachmentEntity;
import com.chenliwu.filesystem.demo.mapper.AttachmentMapper;
import com.chenliwu.filesystem.demo.service.IAttachmentService;
import org.springframework.stereotype.Service;

/**
 *
 */
@Service
public class AttachmentServiceImpl extends ServiceImpl<AttachmentMapper, AttachmentEntity> implements IAttachmentService {

}
