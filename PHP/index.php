<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Programación Orientada a Objetos con PHP</title>
</head>
<body>
  <?php
    require "./Car.php";
    require_once "./UberX.php";
    require_once "./UberPool.php";
    require "./Account.php";
    $uberX = new UberX("CVE123", new Account("Andres Herrera", "ASD123"), "Chevrolet", "Spark");
    $uberX->printDataCar();
    $uberPool = new UberPool("CVD123", new Account("Andrea Herrera", "AGD123"), "Dodge", "Attitude");
    echo "<br>";
    $uberPool->printDataCar();
    // $car = new Car("amd123", new Account("Alfonso Herrera", "OIU123"));
    // print_r($car);
    // echo "<br><br>";
    // print_r($car->driver);
  ?>
</body>
</html>