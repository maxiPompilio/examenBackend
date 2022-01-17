package com.example.examenBackend.api.users.service.impl;

import com.example.examenBackend.api.users.mapper.UsersMapper;
import com.example.examenBackend.api.users.service.UsersService;
import com.example.examenBackend.api.users.to.UsersTO;
import com.example.examenBackend.domain.entity.UsersDE;
import com.example.examenBackend.domain.repository.UsersRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UsersServiceImpl implements UsersService {

    private final UsersRepository usersRepository;

    @Override
    public UsersTO getUsersById(Long idUser) {
        return UsersMapper.fromUsersDE(this.usersRepository.getUsersById(idUser));
    }

    @Override
    public UsersTO addUsers(UsersTO usersTO) {
        UsersDE usersDE = this.usersRepository.save(UsersMapper.fromUsersTO(usersTO));
        return UsersMapper.fromUsersDE(usersDE);
    }

    @Override
    public void deleteUsersById(Long idUser) {
        UsersDE usersDE = this.usersRepository.getUsersById(idUser);
        this.usersRepository.delete(usersDE);
    }
}
