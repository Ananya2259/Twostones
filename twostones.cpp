#include <iostream>
using namespace std;
int main()
{
  int N;
  cin>>N;
  if(N <=10000000 && N >= 1)
  {
    if(N%2==0)
      cout<<"bob";
    else
      cout<<"Alice";
  }
}