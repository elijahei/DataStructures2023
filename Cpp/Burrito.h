#include <iostream>

namespace tacobell{

    class Burrito{
        private:
            double price;
            bool is_vegan;

        public:
            Burrito(double, bool);
            void print_burr();
            double get_price();
            void set_price(double);
    };

}
