package com.app.webappnotes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.app.webappnotes.models.Folder;

public interface FolderRepository extends CrudRepository<Folder, Integer>{
}
