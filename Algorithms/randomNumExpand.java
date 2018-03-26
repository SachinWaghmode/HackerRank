/*
Expand a random range from 0-5 to 0-7. 
Given a function rand5() that returns a random float in the range [0,5] with a uniform distribution, 
write a function that returns a random float in the range [0,7] using only rand5() and keeping a uniform distribution.
*/

public class Solution{
  public static float expandRange(){
  float num = rand5();
  return ((num/5.0f)*7.0f);
}
