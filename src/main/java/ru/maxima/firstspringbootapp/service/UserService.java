package ru.maxima.firstspringbootapp.service;

import java.util.List;
import ru.maxima.firstspringbootapp.entity.User;

public interface UserService {
  User getById(Long id);
  List<User> findAll();
  User save(User user);
  User update(User user);
  void deleteById(Long id);
}
