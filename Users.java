package com.example.accessingdatamysql;

import javax.persistence.*;
// ------------------------ User ------------------------
@Entity
public class Users {
  @Id
  @GeneratedValue(strategy=GenerationType.AUTO)
  private Integer user_id;

  private String email;

  private String userName;

  private String password;

  /*
  //----- Join 'user_roles' table to 'users' table -----
  @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
  @JoinTable(
    name = "user_roles",
    joinColumns = @JoinColumn(name = "user_id"),
    inverseJoinColumns = @JoinColumn(name = "role_id")
  )*/

  //----- Get and Set -----
  public Integer getId() {
    return user_id;
  }

  public void setId(Integer user_id) {
    this.user_id = user_id;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }
}