package com.webshop.backend.repository;

import com.webshop.backend.model.Note;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by rajeevkumarsingh on 27/06/17.
 */

@Repository
public interface NoteRepository extends JpaRepository<Note, Long> {

}
