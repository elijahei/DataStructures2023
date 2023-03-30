#include <iostream>
#include "Burrito.h"

using namespace std;


tacobell::Burrito::Burrito(double price, bool is_vegan) : price(price), is_vegan(is_vegan){}


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

tacobell::Burrito
tacobell::Burrito::operator+(const Burrito& other){
    tacobell::Burrito res_burr((this->price+other.price),(this->is_vegan&&other.is_vegan));
    return res_burr;
}


int main(){

   
    tacobell::Burrito burr1(12.5, false);
    tacobell::Burrito burr2(9.25, true);


    tacobell::Burrito burr3 = burr1 + burr2;
    burr3.print_burr();

    return -1;
}

