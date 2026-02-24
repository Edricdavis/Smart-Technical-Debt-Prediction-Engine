package com.codesentinel.codesentinel.mapper;

import com.codesentinel.codesentinel.dto.ProjectCreateRequest;
import com.codesentinel.codesentinel.dto.ProjectResponse;
import com.codesentinel.codesentinel.entity.ProjectEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface ProjectMapper {

    ProjectResponse toResponse(ProjectEntity entity);

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "createdAt", ignore = true)
    @Mapping(target = "updatedAt", ignore = true)
    ProjectEntity toEntity(ProjectCreateRequest request);
}
