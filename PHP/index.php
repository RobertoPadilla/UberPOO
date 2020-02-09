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
    require_once './Driver.php';
    require_once 'User.php';
    $driver = new Driver("Andres Herrera", "andresH@gmail.com", "$2y$10souwifhgawe859732403407", "ASD123");
    $driver->printDataAccount();
    echo "<hr>";
    $user = new User("Roberto Padilla", "basshivan981@gmail.com", "23094u34iwqehjqw129");
    $user->printDataAccount();
    echo "<hr>";
    $uberX = new UberX("CVE123", $driver, "Chevrolet", "Spark");
    $uberX->printDataCar();
    // $car = new Car("amd123", new Account("Alfonso Herrera", "OIU123"));
    // print_r($car);
    // echo "<br><br>";
    // print_r($car->driver);
  ?>
</body>
</html>