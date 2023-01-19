//before Liskov Substitution Principle
class Avatar {
  void benderAir() {
    System.out.println("I'm bending air");
  }

  void benderWater() {
    System.out.println("I'm bending water");
  }

  void benderFire() {
    System.out.println("I'm bending fire");
  }

  void benderEarth() {
    System.out.println("I'm bending earth");
  }
}

class Aang extends Avatar {
}

class Toph extends Avatar {
  void benderAir() {
    throw new Error("Cannot be implemented");
  }

  void benderWater() {
    throw new Error("Cannot be implemented");
  }

  void benderFire() {
    throw new Error("Cannot be implemented");
  }

  void benderEarth() {
    System.out.println("I'm bending earth");
  }
}

class Katara extends Avatar {
  void benderAir() {
    throw new Error("Cannot be implemented");
  }

  void benderWater() {
    System.out.println("I'm bending water");
  }

  void benderFire() {
    throw new Error("Cannot be implemented");
  }

  void benderEarth() {
    System.out.println("Cannot be implemented");
  }
}

class Zuko extends Avatar {
  void benderAir() {
    throw new Error("Cannot be implemented");
  }

  void benderWater() {
    throw new Error("Cannot be implemented");
  }

  void benderFire() {
    System.out.println("I'm bending fire");
  }

  void benderEarth() {
    System.out.println("Cannot be implemented");
  }
}

class BenderMoves {

  public void showBending(Avatar bender) {
    bender.benderAir();
    bender.benderWater();
    bender.benderFire();
    bender.benderEarth();
  }
}

class BenderShow {
  BenderMoves benderMoves = new BenderMoves();
  
  void show() {
    benderMoves.showBending(new Aang()); // the method will work ok, methods from Avatar fits with Aang
    benderMoves.showBending(new Toph()); // Toph will throw error for all bendings are not about earth
    benderMoves.showBending(new Zuko()); // Zuko will throw error for all bendings are not about fire
    benderMoves.showBending(new Katara()); // Katara will throw error for all bendings are not about water
  }
}

// We tried to use subclass instead its superclass, but neither all them are avatar.
// so all benders can't be apllied to everyone

// after LSP

class FireBender {
  void benderFire() {
    System.out.println("I'm bending fire");
  }
}
class WaterBender {
  void benderWater() {
    System.out.println("I'm bending water");
  }
}
class EarthBender {
  void benderEarth() {
    System.out.println("I'm bending earth");
  }
}

class ZukoLSP extends FireBender {
}

class TophLSP extends EarthBender {
}

class KataraLSP extends WaterBender {
}

class BenderMovesLSP {

  public void showAvatarBending(Avatar bender) {
    bender.benderAir();
    bender.benderWater();
    bender.benderFire();
    bender.benderEarth();
  }

  public void showEarthBending(EarthBender bender) {
    bender.benderEarth();
  }

  public void showWaterBending(WaterBender bender) {
    bender.benderWater();
  }

  public void showFireBending(FireBender bender) {
    bender.benderFire();
  }
}

class BenderShowLSP {
  BenderMovesLSP benderMoves = new BenderMovesLSP();
  
  void show() {
    benderMoves.showAvatarBending(new Aang()); // the method will work ok, methods from Avatar fits with Aang
    benderMoves.showWaterBending(new KataraLSP()); // the method will work ok, methods from WaterBender fits with Katara
    benderMoves.showEarthBending(new TophLSP()); // the method will work ok, methods from EarthBender fits with Toph
    benderMoves.showFireBending(new ZukoLSP()); // the method will work ok, methods from FireBender fits with Zuko
  }
}