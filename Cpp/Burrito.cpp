#include <iostream>
#include "Burrito.h"

using namespace std;


tacobell::Burrito::Burrito(double price, bool is_vegan){
    this->price = price;
    this->is_vegan = is_vegan;
}

void tacobell::Burrito::print_burr(){

    if(this->is_vegan){
        std::cout << "My price is " << this->price << " and I'm a vegan burrito!" << std::endl;
    }
    else{
        std::cout << "My price is " << this->price << " and I'm a meat burrito!" << std::endl;
    }
    
}

double
tacobell::Burrito::get_price(){
    return price;
}

void
tacobell::Burrito::set_price(double price_){
    price = price_;
}



int main(){

   

    return -1;
}

