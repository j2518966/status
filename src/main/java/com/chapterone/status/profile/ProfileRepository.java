package com.chapterone.status.profile;

import com.chapterone.status.status.Status;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProfileRepository extends JpaRepository<Profile, Long> {
}
