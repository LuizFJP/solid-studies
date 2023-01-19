//before Interface Segregation Principle
interface Car {
  void turnOn();

  void turnOff();

  void fuelWithGasoline();

  void chargeWithEletricity();
}

class MariaTurbo implements Car {

  @Override
  public void chargeWithEletricity() {
    throw new Error("Cannot be implemented");
  }

  public void fuelWithGasoline() {
    System.out.println("Fueling...");
  }

  @Override
  public void turnOff() {
    System.out.println("Turning off...");
  }

  @Override
  public void turnOn() {
    System.out.println("Turning on...");
  }
}

class GurgelX2 implements Car {

  @Override
  public void chargeWithEletricity() {
    System.out.println("Fueling...");    
  }

  @Override
  public void fuelWithGasoline() {
    throw new Error("Cannot be implemented");    
  }

  @Override
  public void turnOff() {
    System.out.println("Turning off...");    
  }

  @Override
  public void turnOn() {
    System.out.println("Turning on...");    
  }
  
}

// We can't implement interfaces in classes with methods won't be used.

// after ISP

interface CarISP {
  void turnOn();

  void turnOff();
}

interface EletricCar extends CarISP {
  void chargeWithEletricity();
}

interface GasolineCar extends CarISP {
  void fuelWithGasoline();
}

class FuscaItamar implements GasolineCar {

  @Override
  public void fuelWithGasoline() {
    System.out.println("Fueling...");        
  }

  @Override
  public void turnOff() {
    System.out.println("Turning off...");        
  }

  @Override
  public void turnOn() {
    System.out.println("Turning on...");            
  }
  
}

class GurgelItaipu implements EletricCar {

  @Override
  public void chargeWithEletricity() {
    System.out.println("Charging...");            
  }

  @Override
  public void turnOff() {
    System.out.println("Turning off...");    
  }

  @Override
  public void turnOn() {
    System.out.println("Turning on...");                
  }
  
}
