

/** THIS CODE IS A OLDER FORM TO CREATE CLASSES */
// function Car() {
//   this.id;
//   this.license;
//   this.driver;
//   this.passenger;
// }

class Car {
  constructor(license, driver){
    this.id;
    this.license = license;
    this.driver = driver;
    this.passenger;
  }
  printDataCar(){
    console.log(this.driver);
    console.log(this.driver.name);
    console.log(this.driver.document);
  }
}
