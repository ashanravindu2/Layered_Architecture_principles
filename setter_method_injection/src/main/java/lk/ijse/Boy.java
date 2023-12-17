package lk.ijse;

public class Boy {
    Agrement agrement;

  public void chatWithGirl(){
        agrement.chat();
  }

  public void setter(Agrement a){ //setter method inject
      this.agrement=a;
  }

    public static void main(String[] args) {
        Boy boy = new Boy();
        boy.setter(new Girl());
        boy.chatWithGirl();
    }
}

