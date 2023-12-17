package lk.ijse;

public class Boy {
    Agrement agrement;

  public void chatWithGirl(){
        agrement.chat();
  }

  public Boy(Agrement a){  // contructor inject
      this.agrement=a;       // contructor inject
  }

    public static void main(String[] args) {
        Boy boy = new Boy( new Girl());
        boy.chatWithGirl();
    }
}

