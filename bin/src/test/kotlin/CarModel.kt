import io.cucumber.java.en.Then;

import org.testng.Assert;

import example.model.Car;
import example.service.*

class CarModel {
  @Then("Car model should be test")
  fun checkModel() {
    val service = CarServiceImpl();
    val car = service.createCar();
     Assert.assertEquals(car.model, "test");
  }
}
