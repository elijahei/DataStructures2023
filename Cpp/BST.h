#include <iostream>
#include <vector>
using namespace std;

class BST{

    private: 

        struct BSTNode{
            int elem;
            BSTNode* right;
            BSTNode* left;
            BSTNode(int elem_){
                elem = elem_;
                right = nullptr;
                left = nullptr;
            }
        };

        int size;
        BSTNode* root;

       

    public:

       BST(){
        this->root = nullptr;
        size = 0;
       }

       int get_size();

       void insert(int);

       bool find(int);

       bool remove(int);
    
       void insert_helper(BSTNode*, int);

       bool find_helper(BSTNode*, int);


        vector<int> inorder();

};