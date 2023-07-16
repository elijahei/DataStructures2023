#include <iostream>
#include <string>

using namespace std;


// class Plane{

//     public:
//         bool is_commercial;

//         Plane(bool is_commercial){
//             this->is_commercial = is_commercial;
//         }

//         void set_name(string name){
//             name_ = name;
//         }

//         void set_ceiling(int ceiling_alt){
//             ceiling_alt_ = ceiling_alt;
//         }   

//         string get_name(){
//             return name_;
//         }

//         int get_ceiline(){
//             return ceiling_alt_;
//         }

//         void print_plane(){
//             if(!is_commercial){
//                 cout << "*** RESTRICTED ***" << endl;
//             }
//             else{
//                 cout << "Plane: " << name_ << ", Ceiling Altitude: " << ceiling_alt_ << " Ft" << endl;
//             }
//         }

    
//     private: 
//         string name_;
//         int ceiling_alt_;

    
    

    
        

// };


bool binary_search(int arr[], int target, int left, int right){

    cout << "BINARY SEARCH" << endl;

    int n = left + right + 1;
    int mid = n/2;
    if(arr[mid] == target)
        return true;
    if(left >= right)
        return false;
    else if(arr[mid] < target){
        left = mid + 1;
        return binary_search(arr, target, left, right);
    }
    else{
        right = mid - 1;
        return binary_search(arr, target, left, right);
    }
    return false;
}

int main(){

   


    return -1;

}