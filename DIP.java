// before Dependency Invertion Principle
class OnlinePlayer {
  void attack() {}
}

class Game {
  OnlinePlayer player = new OnlinePlayer();
  
  public void play() {
    player.attack();
  }
}

// but if we would like to add an offline player or even test this class? We're strongly tied to OnlinePlayer

// after DIP

interface Player {
  void attack();
}

class OnlinePlayerDIP implements Player {
  public void attack() {}
}
class OfflinePlayerDIP implements Player {
  public void attack() {}
}

class GameDIP {
  public void play(Player player) {
    player.attack();
  }
}