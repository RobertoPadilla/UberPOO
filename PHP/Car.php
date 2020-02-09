<?php

class Car {
  public $id;
  public $license;
  public $driver;
  public $passenger;
  public function __construct($license, $driver)
  {
    $this->license = $license;
    $this->driver = $driver;
  }
  public function printDataCar(){
    print_r($this->driver);
    echo $this->driver->name;
    echo $this->driver->document;
  }
}