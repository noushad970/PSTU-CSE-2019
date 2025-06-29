#include <iostream>
#include<math.h>
#include <iomanip>
#include<vector>
using namespace std;
bool isanswer;
int loopCount=0;
void storeValue(float x){
    static vector<float> v;
    v.push_back(x);
    int f=0;
    for(int i=0;i<v.size()-1;i++){


         if(fabs(v[i] - x) < 0.01){
             f++;
         }
        if(f>0){
            isanswer=true;
            break;
        }
    }
    loopCount++;
    if(isanswer){
        return;
    }
}
float function_fx(float x){
    float fx=3*x-cos(x)-1;
    return fx;
}
int main() {

    float a=-10, b=-9, c=0;
    int breakpoint=0;
    cout << fixed << setprecision(2);

    while (true)
    {

        if(function_fx(a)*function_fx(b)<0){
            break;
        }else if(breakpoint<20){
            a+=1;
            b+=1;
            breakpoint++;
        }else
        {
            cout<<"Cannot possible to find answer";
            c=-1;
            break;
        }

    }
    if(c==-1){
        return 0;
    }
    int it=20;
    for(int i=0;i<it;i++)
    {
        c=(a+b)/2;
        
        if(function_fx(a)*function_fx(c)>0){
            a=c;
        }else{
            b=c;
        }
        storeValue(c);
        if(isanswer){
            cout<<"Answer is : "<<c<<endl;
            cout<<"Total Loop Count: "<<loopCount<<endl;
            return 0;
        }

    }

    cout<<"No answer"<<endl;

}


