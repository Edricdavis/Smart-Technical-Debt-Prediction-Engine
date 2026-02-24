package com.codesentinel.codesentinel.service;

import com.codesentinel.codesentinel.dto.ProjectCreateRequest;
import com.codesentinel.codesentinel.dto.ProjectResponse;
import java.util.List;

public interface ProjectService {

    ProjectResponse create(ProjectCreateRequest request);

    List<ProjectResponse> findAll();
}
