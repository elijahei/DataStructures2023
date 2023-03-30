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

       int get_size();

       void insert(int);

       bool search(int);

       bool remove(int);
    
        void insert_helper(BSTNode*, int);


        vector<int> inorder();

};