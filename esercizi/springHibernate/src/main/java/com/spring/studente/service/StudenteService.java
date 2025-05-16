package com.spring.studente.service;

import com.spring.studente.dto.StudenteDTO;

public interface StudenteService {

    public boolean Immatricola(StudenteDTO dto);
    public StudenteDTO cerca(Integer matricola);
}
