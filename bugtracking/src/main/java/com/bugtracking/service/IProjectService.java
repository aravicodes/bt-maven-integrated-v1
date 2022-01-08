package com.bugtracking.service;

import java.util.List;

import com.bugtracking.bean.Project;
import com.bugtracking.dto.ProjectDto;

public interface IProjectService {

	List<Project> getall();

	Project getproject(long projId);

	Project deleteproject(long projId);

	Project createproject(Project project);

	Project updateproject(long projId, Project p);

}
