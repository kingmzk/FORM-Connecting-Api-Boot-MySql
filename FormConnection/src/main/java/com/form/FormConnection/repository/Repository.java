package com.form.FormConnection.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import com.form.FormConnection.model.Model;


@org.springframework.stereotype.Repository
public interface Repository extends JpaRepository<Model, Integer>{

}
