<?php
class Driver extends Account {
  public $documentCar;
  public function __construct($name, $email, $password, $documentCar)
  {
    parent::__construct($name, $email, $password);
    $this->documentCar = $documentCar;
  }
  public function printDataAccount()
  {
    echo $this->name . " " . $this->email . " " . $this->documentCar;
  }
}