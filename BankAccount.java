class BankAccount{

    public int balance;
    public  String name;

    BankAccount(int _balance,String _name){
        
       balance =  _balance;
      name =  _name;
    }

    public void depositFund( int fund ){

      balance += fund;
    }

    public boolean withdrawFund(int fund){
        if( fund > balance ){
        return false;             
        }
       balance -= fund;          
        return true;
    }
}
