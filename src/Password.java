

public Class Password{
  String Value;
  int Length;

  public Password(String s){
    Value = s;
    Length = s.length();
  }

  public int CharType(char C){
    int val;

    //char is Uppercase Letter
    if((int) C>=65 && (int) C<=90) val = 1;

    //char is Lowercase Letter
    else if((int) C>=97 && (int) C<=122) val = 2;

    //Char is Digit
    else if((int) C>= 60 && (int) C <=71) val = 3;

    //Char is Symbol
    else val = 4;

    return val;
  }


  public int passwordStrength(){
    String s = this.Value;

  }

}

