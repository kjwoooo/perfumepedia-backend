package com.perfumepedia.perfumepedia.domain.note.repository;

import com.perfumepedia.perfumepedia.domain.note.entity.Note;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NoteRepository extends JpaRepository<Note, Long> {
}
