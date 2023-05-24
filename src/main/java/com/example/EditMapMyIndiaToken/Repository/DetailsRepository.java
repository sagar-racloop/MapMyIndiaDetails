package com.example.EditMapMyIndiaToken.Repository;

import com.example.EditMapMyIndiaToken.Model.MapMyIndiaToken;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DetailsRepository extends JpaRepository<MapMyIndiaToken, String> {
}
