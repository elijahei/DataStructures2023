#include <iostream>
#include "BST.h"

using namespace std;



void BST::insert(int elem_){
    //cout << "inside here" << endl;
    if(root == nullptr){
        //cout << "here adding 1 " << endl;
        root = new BSTNode(elem_);
        size += 1;
        return;
    }

    return BST::insert_helper(root, elem_);
}

int BST::get_size(){
    return size;
}


 void BST::insert_helper(BSTNode* curr, int elem_){

            if(elem_ < curr->elem){
                if(curr->left == nullptr){
                    curr->left = new BSTNode(elem_);
                    size += 1;
                    return;
                }
                else   
                    return insert_helper(curr->left, elem_);
            }
            else{ 
                if(curr->right == nullptr){
                    curr->right = new BSTNode(elem_);
                     size += 1;
                    return;
                }
                else   
                    return insert_helper(curr->right, elem_);
            }
 }

bool BST::find(int elem_){

    return BST::find_helper(this->root, elem_);
}


bool BST::find_helper(BSTNode* root, int elem_){

    if(root == nullptr)
        return false;
    
    if(root->elem == elem_)
        return true;
    
    else if(elem_ < root->elem)
        return BST::find_helper(root->left, elem_);
    
    else
        return BST::find_helper(root->right,elem_);
}






int main(){

    BST b;

    b.insert(10);
    b.insert(5);
    b.insert(20);

    cout << b.find(20) << endl;

    return -1;
}