public final static String e = "2.7182818284590452353602874713526624977572470936999595749669676277240766303535475945713821785251664274274663919320030599218174135966290435";  
public void setup()  
{            
  int t = 0;
  for(int i = 2; i<e.length();i++){
  String digits = e.substring(i,i+11);
  double dNum = Double.parseDouble(digits);
  if(isPrime(dNum)==true){
    t++;
  }
    if(t==4){
      System.out.println(e.substring(i,i+10)+".com");
  }
}
public static boolean isPrime(double dNum)  
{   
 boolean b = false;
   if(dNum < 4&&dNum>1){b = true;}
  for(int i = 2; i <= Math.sqrt(dNum); i++){
   
   if(dNum%i==0){
    b = false;
  }
  else{b = true;}
  }
  return b;
} 
