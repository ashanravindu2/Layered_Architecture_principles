package lk.ijse;

public class Boy {
    Agrement agrement = new Girl(); // property inject

  public void chatWithGirl(){
        agrement.chat();
  }

  public void test(){
      agrement.chat();
  }

    public static void main(String[] args) {
        Boy boy = new Boy();
        boy.chatWithGirl();
        boy.test();
    }
}

