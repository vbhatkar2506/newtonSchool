
#include <bits/stdc++.h> // header file includes every Standard library
using namespace std;

int main() {

	// Your code here

    int n;
    cin>>n;
    vector<int> arr(n);
    for(int i=0;i<n;i++){
        cin>>arr[i];
    }
    sort(arr.begin(),arr.end());
    int i=1,c=1;
    while (i<n){
        if(arr[i]!=arr[i-1]){
            c++;
        }
        i++;
    }
    cout<< c;
    return 0;
}