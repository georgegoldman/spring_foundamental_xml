package com.genialsata.service;

import com.genialsata.model.Speaker;
import com.genialsata.repository.SpeakerRepository;

import java.util.List;

public class SpeakerServiceImpl implements SpeakerService {

    private SpeakerRepository repository ;

    public SpeakerServiceImpl() {

    }

    public SpeakerServiceImpl(SpeakerRepository repository){
        this.repository = repository;
    }


    public List<Speaker> findAll() {
        return repository.findAll();
    }

    public void setRepository(SpeakerRepository repository) {
        this.repository = repository;
    }
}
