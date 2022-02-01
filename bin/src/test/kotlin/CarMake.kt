import io.cucumber.java.en.Then;

import org.testng.Assert;

import example.model.Car;
import example.service.*

class CarMake {
  @Then("Car make should be test")
  fun checkMake() {
    val service = CarServiceImpl();
    val car = service.createCar();
    Assert.assertEquals(car.make, "test");
  }
}
