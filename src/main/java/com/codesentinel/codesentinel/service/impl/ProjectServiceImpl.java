package com.codesentinel.codesentinel.service.impl;

import com.codesentinel.codesentinel.dto.ProjectCreateRequest;
import com.codesentinel.codesentinel.dto.ProjectResponse;
import com.codesentinel.codesentinel.entity.ProjectEntity;
import com.codesentinel.codesentinel.exception.DuplicateResourceException;
import com.codesentinel.codesentinel.mapper.ProjectMapper;
import com.codesentinel.codesentinel.repository.ProjectRepository;
import com.codesentinel.codesentinel.service.ProjectService;
import java.time.Instant;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class ProjectServiceImpl implements ProjectService {

    private final ProjectRepository projectRepository;
    private final ProjectMapper projectMapper;

    @Override
    @Transactional
    public ProjectResponse create(ProjectCreateRequest request) {
        projectRepository.findByName(request.name())
                .ifPresent(existing -> {
                    throw new DuplicateResourceException("Project with name '" + request.name() + "' already exists");
                });

        ProjectEntity entity = projectMapper.toEntity(request);
        Instant now = Instant.now();
        entity.setCreatedAt(now);
        entity.setUpdatedAt(now);

        return projectMapper.toResponse(projectRepository.save(entity));
    }

    @Override
    @Transactional(readOnly = true)
    public List<ProjectResponse> findAll() {
        return projectRepository.findAll().stream()
                .map(projectMapper::toResponse)
                .toList();
    }
}
