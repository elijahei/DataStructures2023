#include <iostream>


class BST{

    public:

    struct Node{
        int data;
        Node* right;
        Node* left;
        
    };

    Node* root; 
    int size;


    // insert data into this BST
    bool insert(int data){
        //TODO: implement this
        return false;
    }

    // if data exists in this BST, remove it and return data, else return -1 if does not exist
    int remove(int data){
        //TODO: implement this
        return -1;
    }

    // return true if data is in BST, false otherwise
    bool search(int data){
        //TODO: implement this
        return false;
    }

    // return height of thie BST, root's height is 0
    int height(){
        //TODO: implement this
        return 0;
    }

    

    


};

int main(){

    std::cout << "need to implement BST" << std::endl;

    return -1;
}