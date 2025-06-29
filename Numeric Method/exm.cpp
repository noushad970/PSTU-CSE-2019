#include <iostream>
#include<math.h>
#include <iomanip>
#include<vector>
using namespace std;

bool storeValue(float x){
    vector<float> v;
    v.push_back(x);
    int f=0;
    for(float z: v){
        if(z==x){
            f++;
        }
    }
    if(f==2){
        return true;
    }else{
        return false;
    }
}
float function_fx(float x){
    float fx=3*x-cos((x*180)/3.1416)-1;
    return fx;
}
int main() {

    cout<<cos(1)<<endl;
    cout<<cos(1*180/3.1416)<<endl;
}
