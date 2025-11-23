package com.skillmentor.service.services.impl;

import com.skillmentor.service.entities.Mentor;
import com.skillmentor.service.services.MentorService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class MentorServiceImpl implements MentorService {

    private final List<Mentor> mentors = new ArrayList<>();

    @Override
    public List<Mentor> getAllMentors(){
        return mentors;
    }

    @Override
    public Mentor getMentorById(String id){
        return mentors.get(id);
    }

    @Override
    public Mentor createMentor(Mentor mentor) {
        mentors.add(mentor);
        return mentor;
    }
}
