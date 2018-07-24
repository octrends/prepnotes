package com.prepzone.notes.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.prepzone.notes.model.Note;

/**
 * Created by PrepZone on 1/6/18.
 */

@Repository
public interface NoteRepository extends JpaRepository<Note, Long> {

}
