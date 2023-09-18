package com.backend.services;

import com.backend.entity.UserEntity;
import com.backend.repository.UserRepository;
import org.apache.commons.collections4.IterableUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Transactional
    public void save(UserEntity userEntity){
        userRepository.save(userEntity);
    }

    public List<UserEntity> read(){
        return IterableUtils.toList(userRepository.findAll());
    }

    @Transactional
    public void update(Long id, String username, String password){
        userRepository.update(id, username, password);
    }

    @Transactional
    public void delete(Long id){
        userRepository.deleteById(id);
    }
}
