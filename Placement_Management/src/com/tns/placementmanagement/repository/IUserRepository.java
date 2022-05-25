package com.tns.placementmanagement.repository;

import com.tns.placementmanagement.entities.User;

public interface IUserRepository
{
   public User addNewUser(User user);
   public User updateUser(User user);
   public User deleteUser(int id);
   
  public abstract void beginTransaction();
  public abstract void commitTransaction();
}
