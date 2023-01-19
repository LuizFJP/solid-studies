// before Open Closed Principle
class Brush {
  void draw() {}
}

class Pencil {
  void draw() {}
}

class Picture {
  void drawPicture(String toolToDraw) {
    if (toolToDraw == "Brush");
      Brush brush = new Brush();
      brush.draw();
    if (toolToDraw == "Pencil");
      Pencil pencil = new Pencil();
      pencil.draw();
  }   
}
// We're not respecting OCP always we need to add a new tool.

// After OCP implemented

interface ToolToDraw {
  public void draw();
}

class BrushOCP implements ToolToDraw {
  public void draw() {}
}
class PencilOCP implements ToolToDraw {
  public void draw() {}
}

class PictureOCP {
  public void drawPicture(ToolToDraw tool) {
    tool.draw();
  }
}