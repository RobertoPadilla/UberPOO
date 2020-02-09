<?php

class Account {
  public $id;
  public $name;
  public $document;
  public $email;
  public $password;
  public function __construct($name, $email, $password)
  {
    $this->name = $name;
    $this->email = $email;
    $this->password = $password;
  }
  public function printDataAccount(){
    echo $this->name . " " . $this->email;
  }
}