package pcd.lab04.gui3_mvc_deadlock;

public class TestGUI {
  static public void main(String[] args){
	  
	MyModel model = new MyModel();
	MyController controller = new MyController(model);
    MyView view = new MyView(controller);
    model.addObserver(view);    
    view.display();
    
    new MyAgent(model).start();

  }
  
}
