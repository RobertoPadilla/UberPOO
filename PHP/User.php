<?php

class User extends Account {
  public function __construct($name, $email, $password)
  {
    parent::__construct($name, $email, $password);
  }
}