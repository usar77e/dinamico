package com.dinamica.backend.service;

import com.dinamica.backend.repository.CocheRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
public class CocheService {

    @Autowired
    CocheRepository cocheRepository;


}
